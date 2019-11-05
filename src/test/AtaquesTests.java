package test;

import Fiuba.TP3.*;
import Fiuba.TP3.Jugador.JugadorAzul;
import Fiuba.TP3.Jugador.JugadorRojo;
import Fiuba.TP3.Tablero.Tablero;
import Fiuba.TP3.Unidad.Soldado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public
class AtaquesTests {

    @Test
    public void testSoldadoAtacaAOtroSoldadoQueEstaEnDistanciaCercanaYLeQuita10PuntosDeVida(){

        Soldado soldado = new Soldado();
        Soldado soldadoEnemigo = new Soldado();

        soldado.atacar(2,soldadoEnemigo);

        Assertions.assertEquals(90, soldadoEnemigo.getPuntosDeVida());
    }


    @Test
    public void testSoldadoAtacaAOtroSoldadoQueNoEstaEnDistanciaCercanaYNoLeQuitaVida(){

        Soldado soldado = new Soldado();
        Soldado soldadoEnemigo = new Soldado();

        Assertions.assertEquals(100, soldadoEnemigo.getPuntosDeVida());
        Assertions.assertThrows(ObjetivoFueraDeRangoException.class, () -> soldado.atacar(3,soldadoEnemigo));
    }


    @Test
    public void testSoldadoAzulAtacaAUnSoldadoRojoQueEstaEnDistanciaCercanaYLeQuita10PuntosDeVida(){

        Tablero tablero = new Tablero();
        JugadorAzul jugadorAzul = new JugadorAzul("agus",tablero);
        JugadorRojo jugadorRojo = new JugadorRojo("lego",tablero);

        jugadorAzul.comprarUnidad("soldado",11,5);
        jugadorRojo.comprarUnidad("soldado",10,5);
        jugadorAzul.unidadAliadaEnPosicionAtacarUnidadEnemigaEnPosicion(11,5,10,5);

        Assertions.assertEquals(90, tablero.getPuntosDeVidaUnidadEnPosicion(10,5));
    }


    @Test
    public void testSoldadoRojoAtacaAUnSoldadoAzulQueNoEstaEnDistanciaCercanaYNoLeQuitaVida(){

        Tablero tablero = new Tablero();
        JugadorAzul jugadorAzul = new JugadorAzul("agus",tablero);
        JugadorRojo jugadorRojo = new JugadorRojo("lego",tablero);

        jugadorRojo.comprarUnidad("soldado",4,10);
        jugadorAzul.comprarUnidad("soldado",12,5);

        Assertions.assertThrows(ObjetivoFueraDeRangoException.class, () -> tablero.unidadAliadaEnPosicionAtacarUnidadEnemigaEnPosicion(12,5,4,10));
        Assertions.assertEquals(100, tablero.getPuntosDeVidaUnidadEnPosicion(12,5));
    }

    @Test
    public void testJineteAzulAtacaAUnSoldadoRojoQueEstaEnDistanciaMedianaYLeQuita15PuntosDeVida(){

        Tablero tablero = new Tablero();
        JugadorAzul jugadorAzul = new JugadorAzul("agus",tablero);
        JugadorRojo jugadorRojo = new JugadorRojo("lego",tablero);

        jugadorAzul.comprarUnidad("jinete",10,12);
        jugadorRojo.comprarUnidad("jinete",6,14);
        jugadorAzul.unidadAliadaEnPosicionAtacarUnidadEnemigaEnPosicion(10,12,6,14);

        Assertions.assertEquals(85, tablero.getPuntosDeVidaUnidadEnPosicion(6,14));
    }


    @Test
    public void testCuranderoAzulCuraAUnSoldadoAliadoQueEstaEnDistanciaCercanaYLeDa15PuntosDeVida(){

        Tablero tablero = new Tablero();
        JugadorAzul jugadorAzul = new JugadorAzul("agus",tablero);

        jugadorAzul.comprarUnidad("curandero",18,12);
        jugadorAzul.comprarUnidad("soldado",17,14);
        jugadorAzul.unidadAliadaEnPosicionAtacarUnidadEnemigaEnPosicion(18,12,17,14);

        Assertions.assertEquals(115, tablero.getPuntosDeVidaUnidadEnPosicion(17,14));
    }

    @Test
    public void testCuranderoAzulNoPuedeCurarAUnaCatapultaAzul(){

        Tablero tablero = new Tablero();
        JugadorAzul jugadorAzul = new JugadorAzul("agus",tablero);

        jugadorAzul.comprarUnidad("curandero",18,12);
        jugadorAzul.comprarUnidad("catapulta",17,14);

        Assertions.assertThrows(NoSePuedenCurarUnidadesNoOrganicasException.class, () -> tablero.unidadAliadaEnPosicionAtacarUnidadEnemigaEnPosicion(18,12,17,14));
    }

}
