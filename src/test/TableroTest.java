import Fiuba.AlgoChess.*;
import Fiuba.Tablero.Tablero;
import Fiuba.Excepciones.*;
import Fiuba.Unidad.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Fiuba.AlgoChess.Alianza.AZUL;
import static Fiuba.AlgoChess.Alianza.ROJO;


public
class TableroTest {


    @Test
    public void testTableroTieneUnTamanioDe20Por20(){

        Tablero tablero = new Tablero();

        Assertions.assertEquals(20*20, tablero.getTamanio());
    }

    /**Posicion y movimientos*/

    /*Instancia jugador pq es necesario saber de que color es*/
    @Test
    public void testJugadorAzulColocaUnSoldadoEnUnCasilleroVacioDelSectorAliadoConExito() {

        Tablero tablero = new Tablero();
        JugadorAzul jugadorAzul = new JugadorAzul("agus",tablero);

        jugadorAzul.comprarUnidad("soldado",2,2);

        Assertions.assertFalse(tablero.estaVacio(2, 2));

    }

    @Test
    public void testJugadorAzulNoPuedeColocarUnSoldadoEnUnCasilleroDelSectorEnemigo() {

        Tablero tablero = new Tablero();
        JugadorAzul jugadorAzul = new JugadorAzul("agus",tablero);

        Assertions.assertThrows(NoSePuedeColocarUnidadEnSectorEnemigoException.class, () -> jugadorAzul.comprarUnidad("soldado",15,15));

    }


    @Test
    public void testJugadorRojoColocaUnSoldadoEnUnCasilleroDelSectorAliadoConExito() {

        Tablero tablero = new Tablero();
        JugadorRojo jugadorRojo = new JugadorRojo("agus",tablero);

        jugadorRojo.comprarUnidad("soldado",15,15);

        Assertions.assertFalse(tablero.estaVacio(15,15));
    }

    @Test
    public void testJugadorRojoNoPuedeColocarUnSoldadoEnUnCasilleroDelSectorEnemigo() {

        Tablero tablero = new Tablero();
        JugadorRojo jugadorRojo = new JugadorRojo("agus",tablero);

        Assertions.assertThrows(NoSePuedeColocarUnidadEnSectorEnemigoException.class, () -> jugadorRojo.comprarUnidad("soldado",7,7));
    }

    /*Fin test sectores*/

    @Test
    public void testAlColocarUnSoldadoEnUnCasilleroEstePasaAEstarOcupadoYNoSePuedeColocarOtraUnidadEncima(){

        Tablero tablero = new Tablero();
        JugadorRojo jugadorRojo = new JugadorRojo("agus",tablero);

        jugadorRojo.comprarUnidad("soldado",15,15);

        Assertions.assertThrows(CasilleroEstaOcupadoException.class, () -> jugadorRojo.comprarUnidad("soldado",15,15));
    }

    @Test
    public void testSoldadoSeMueveUnCasilleroAlNorteYLoOcupa(){


        Tablero tablero = new Tablero();
        JugadorRojo jugadorRojo = new JugadorRojo("agus",tablero);

        jugadorRojo.comprarUnidad("soldado",15,15);
        tablero.moverUnidad(15,15,Movimiento.OFFSET_COORDENADAS_MOVIMIENTO[0]);

        Assertions.assertTrue(tablero.estaVacio(15,15));
        Assertions.assertFalse(tablero.estaVacio(14,15));



    }

    @Test
    public void testSoldadoSeMueveUnCasilleroAlEsteYLoOcupa(){

        Tablero tablero = new Tablero();
        JugadorRojo jugadorRojo = new JugadorRojo("agus",tablero);

        jugadorRojo.comprarUnidad("soldado",15,15);
        tablero.moverUnidad(15,15,Movimiento.OFFSET_COORDENADAS_MOVIMIENTO[2]);

        Assertions.assertTrue(tablero.estaVacio(15,15));
        Assertions.assertFalse(tablero.estaVacio(15,16));

    }

    @Test
    public void testSoldadoSeMueveUnCasilleroAlSurYLoOcupa(){

        Tablero tablero = new Tablero();
        JugadorRojo jugadorRojo = new JugadorRojo("agus",tablero);

        jugadorRojo.comprarUnidad("soldado",15,15);
        tablero.moverUnidad(15,15,Movimiento.OFFSET_COORDENADAS_MOVIMIENTO[4]);

        Assertions.assertTrue(tablero.estaVacio(15,15));
        Assertions.assertFalse(tablero.estaVacio(16,15));
    }


    @Test
    public void testSoldadoSeMueveUnCasilleroAlOesteYLoOcupa(){

        Tablero tablero = new Tablero();
        JugadorRojo jugadorRojo = new JugadorRojo("agus",tablero);

        jugadorRojo.comprarUnidad("soldado",15,15);
        tablero.moverUnidad(15,15,Movimiento.OFFSET_COORDENADAS_MOVIMIENTO[6]);

        Assertions.assertTrue(tablero.estaVacio(15,15));
        Assertions.assertFalse(tablero.estaVacio(15,14));
    }

    @Test
    public void testSoldadoNoSePuedeMoverAlEstePorqueElCasilleroEstaOcupado(){

        Tablero tablero = new Tablero();
        JugadorRojo jugadorRojo = new JugadorRojo("agus",tablero);

        jugadorRojo.comprarUnidad("soldado",15,15);
        jugadorRojo.comprarUnidad("soldado",15,16);
        Assertions.assertThrows(CasilleroEstaOcupadoException.class, () -> tablero.moverUnidad(15,15,Movimiento.OFFSET_COORDENADAS_MOVIMIENTO[2]));

    }
    @Test
    public void testCantidadDeUnidadesCatapultaAlrrededorEsCorrecta(){

        Tablero tablero = new Tablero();
        JugadorAzul jugadorAzul = new JugadorAzul("pedro", tablero);
        jugadorAzul.comprarUnidad("catapulta", 3,1);
        jugadorAzul.comprarUnidad("catapulta", 3,3);
        jugadorAzul.comprarUnidad("catapulta", 5, 2);
        Assertions.assertTrue(tablero.cantidadDeUnidadesAlrrededor(4,2, "CT") == 3);
    }

    @Test
    public void testCorrectaInicializacionTableroAzul(){

        Tablero tablero = new Tablero();
        Unidad unidadAzul = new Soldado();
        unidadAzul.setAlianza(AZUL);
        int i,j;
        for ( i = 0; i < 20 ; i++) {
            for (j = 0; j < 10 ; j++) {
                Assertions.assertTrue(tablero.esTerritorioAliado(i,j,unidadAzul));
            }
        }
    }

    @Test
    public void testCorrectaInicializacionTableroRojo(){

        Tablero tablero = new Tablero();
        Unidad unidadRoja = new Soldado();
        unidadRoja.setAlianza(ROJO);
        int i,j;
        for ( i = 0; i < 20 ; i++) {
            for (j = 10; j < 20 ; j++) {
                Assertions.assertTrue(tablero.esTerritorioAliado(i,j,unidadRoja));
            }
        }
    }


}