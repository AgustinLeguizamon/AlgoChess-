package fiuba.algo3.TP2;

import fiuba.algo3.TP2.Modelo.AlgoChess.Jugador;
import fiuba.algo3.TP2.Modelo.Excepciones.*;
import fiuba.algo3.TP2.Modelo.Tablero.Tablero;
import fiuba.algo3.TP2.Modelo.Unidad.Soldado;
import fiuba.algo3.TP2.Modelo.Unidad.Unidad;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class MovimientosUnidadesTest {

	/* Norte */

    @Test
    public void testSoldadoEnTableroSeMueveAlNorteYLoOcupaConExito(){

    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("soldado",1,1);
        jugador.resetMovimientoUnidades();

        jugador.moverUnidad(1,1, 0);

        
        Assertions.assertTrue(tablero.estaOcupado(0,1));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testJineteEnTableroSeMueveAlNorteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("jinete",1,1);
        jugador.resetMovimientoUnidades();

        jugador.moverUnidad(1,1, 0);
        
        Assertions.assertTrue(tablero.estaOcupado(0,1));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCuranderoEnTableroSeMueveAlNorteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("curandero",1,1);
        jugador.resetMovimientoUnidades();

        jugador.moverUnidad(1,1,0);
        
        Assertions.assertTrue(tablero.estaOcupado(0,1));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCatapultaNoSeMueveAlNorte() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("catapulta",1,1);
        
        Assertions.assertThrows(UnidadNoMovibleException.class, () -> jugador.moverUnidad(1, 1, 0));
    }
    
/* Este */
    
    @Test
    public void testSoldadoEnTableroSeMueveAlesteYLoOcupaConExito(){

    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("soldado",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1,2);
        
        Assertions.assertTrue(tablero.estaOcupado(1,2));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testJineteEnTableroSeMueveAlesteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("jinete",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1,2);
        
        Assertions.assertTrue(tablero.estaOcupado(1,2));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCuranderoEnTableroSeMueveAlEsteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("curandero",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1,2);
        
        Assertions.assertTrue(tablero.estaOcupado(1,2));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCatapultaNoSeMueveAlEste() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("catapulta",1,1);
        
        Assertions.assertThrows(UnidadNoMovibleException.class,
                () -> jugador.moverUnidad(1, 1, 2));
    
    }
    
/* Sureste */
    
    @Test
    public void testSoldadoEnTableroSeMueveAlSuresteYLoOcupaConExito(){

    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("soldado",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1,3);
        
        Assertions.assertTrue(tablero.estaOcupado(2,2));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testJineteEnTableroSeMueveAlSuresteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("jinete",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1,3);
        
        Assertions.assertTrue(tablero.estaOcupado(2,2));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCuranderoEnTableroSeMueveAlSuresteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("curandero",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1, 3);
        
        Assertions.assertTrue(tablero.estaOcupado(2,2));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCatapultaNoSeMueveAlSureste() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("catapulta",1,1);
        
        Assertions.assertThrows(UnidadNoMovibleException.class,
                () -> jugador.moverUnidad(1, 1, 3));
    
    }
    
    
/* Noreste */
    
    @Test
    public void testSoldadoEnTableroSeMueveAlNoresteYLoOcupaConExito(){

    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("soldado",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1, 1);
        
        Assertions.assertTrue(tablero.estaOcupado(0,2));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testJineteEnTableroSeMueveAlNoresteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("jinete",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1,1);
        
        Assertions.assertTrue(tablero.estaOcupado(0,2));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCuranderoEnTableroSeMueveAlNoresteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("curandero",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1,1);
        
        Assertions.assertTrue(tablero.estaOcupado(0,2));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCatapultaNoSeMueveAlNoreste() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("catapulta",1,1);
        
        Assertions.assertThrows(UnidadNoMovibleException.class,
                () -> jugador.moverUnidad(1, 1, 1));
    
    }
    
/* Sur */
    
    @Test
    public void testSoldadoEnTableroSeMueveAlSurYLoOcupaConExito(){

    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("soldado",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1, 4);
        
        Assertions.assertTrue(tablero.estaOcupado(2,1));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testJineteEnTableroSeMueveAlSurYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("jinete",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1,4);
        
        Assertions.assertTrue(tablero.estaOcupado(2,1));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCuranderoEnTableroSeMueveAlSurYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("curandero",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1, 4);
        
        Assertions.assertTrue(tablero.estaOcupado(2,1));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCatapultaNoSeMueveAlSur() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("catapulta",1,1);
        
        Assertions.assertThrows(UnidadNoMovibleException.class,
                () -> jugador.moverUnidad(1, 1, 4));
    
    }
    
    
/* Suroeste */
    
    @Test
    public void testSoldadoEnTableroSeMueveAlSuroesteYLoOcupaConExito(){

    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("soldado",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1, 5);
        
        Assertions.assertTrue(tablero.estaOcupado(2,0));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testJineteEnTableroSeMueveAlSuroesteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("jinete",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1, 5);
        
        Assertions.assertTrue(tablero.estaOcupado(2,0));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCuranderoEnTableroSeMueveAlSuroesteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("curandero",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1, 5);
        
        Assertions.assertTrue(tablero.estaOcupado(2,0));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCatapultaNoSeMueveAlSuroeste() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("catapulta",1,1);

        Assertions.assertThrows(UnidadNoMovibleException.class,
                () -> jugador.moverUnidad(1, 1, 5));
    
    }
    
    
/* Oeste */
    
    @Test
    public void testSoldadoEnTableroSeMueveAlOesteYLoOcupaConExito(){

    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("soldado",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1, 6);
        
        Assertions.assertTrue(tablero.estaOcupado(1,0));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testJineteEnTableroSeMueveAOesteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("jinete",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1,6);
        
        Assertions.assertTrue(tablero.estaOcupado(1,0));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCuranderoEnTableroSeMueveAlOesteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("curandero",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1, 6);
        
        Assertions.assertTrue(tablero.estaOcupado(1,0));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCatapultaNoSeMueveAlOeste() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("catapulta",1,1);
        
        Assertions.assertThrows(UnidadNoMovibleException.class,
                () -> jugador.moverUnidad(1, 1, 6));
    
    }
    
    
/* NorOeste */
    
    @Test
    public void testSoldadoEnTableroSeMueveAlNorOesteYLoOcupaConExito(){

    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("soldado",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1,7);
        
        Assertions.assertTrue(tablero.estaOcupado(0,0));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testJineteEnTableroSeMueveAlNorOesteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("jinete",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1,7);
        
        Assertions.assertTrue(tablero.estaOcupado(0,0));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCuranderoEnTableroSeMueveAlNorOesteYLoOcupaConExito() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("curandero",1,1);
        jugador.resetMovimientoUnidades();
        jugador.resetMovimientoUnidades();
        jugador.moverUnidad(1,1,7);
        
        Assertions.assertTrue(tablero.estaOcupado(0,0));
        Assertions.assertFalse(tablero.estaOcupado(1,1));
    }
    
    @Test
    public void testCatapultaNoSeMueveAlNoOreste() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("catapulta",1,1);
        
        Assertions.assertThrows(UnidadNoMovibleException.class,
                () -> jugador.moverUnidad(1, 1, 7));
    
    }
    
    @Test
    public void testUnidadNoPuedeMoverseAUnEspacioOcupado() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("jinete",1,1);
        jugador.comprarUnidad("jinete",0,0);
        jugador.resetMovimientoUnidades();
        
        Assertions.assertThrows(CasilleroEstaOcupadoException.class,
                () -> jugador.moverUnidad(1,1,7));
    }
    
    
    @Test
    public void testJugadorAliadoTrataDeMoverUnaUnidadQueNoEstaEnElCasilleroYNoPuede() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("Juan", tablero);
        jugador.comprarUnidad("soldado",1,1);
        jugador.resetMovimientoUnidades();
        Assertions.assertThrows(NoHayUnidadEnCasilleroException.class,
                () -> jugador.moverUnidad(3,3,0));
    }
    
    
    
    
    @Test
    public void testJugadorNoPuedeMoverUnidadEnemiga() {
    	
    	Tablero tablero = new Tablero();
    	Jugador jugador1 = new Jugador("Juan", tablero);
    	Jugador jugador2 = new Jugador("Pedro", tablero);
    	
    	jugador1.comprarUnidad("jinete", 9, 10);
        jugador1.resetMovimientoUnidades();
    	tablero.cambiarEstado();
        jugador1.resetMovimientoUnidades();
        jugador2.comprarUnidad("jinete", 11, 12);
        jugador2.resetMovimientoUnidades();
    	tablero.cambiarEstado();
        jugador2.resetMovimientoUnidades();

        Assertions.assertThrows(CasilleroSeleccionadoNoPoseeNingunaUnidadAliadaException.class,
                () -> jugador1.moverUnidad(11,12,0));
    	
    }
    
    @Test
    public void testJugadorAliadoMueveUnSoldadoQueTieneOtrosDosAdyacentesYLosTresSeMuevenALaVez() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);
        
        jugadorAliado.comprarUnidad("soldado",2,5);
        jugadorAliado.comprarUnidad("soldado",2,6);
        jugadorAliado.comprarUnidad("soldado",2,7);
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.moverUnidad(2,6,0);
        
        Assertions.assertFalse(tablero.estaOcupado(2,5));
        Assertions.assertFalse(tablero.estaOcupado(2,6));
        Assertions.assertFalse(tablero.estaOcupado(2,7));
        Assertions.assertTrue(tablero.estaOcupado(1,5));
        Assertions.assertTrue(tablero.estaOcupado(1,6));
        Assertions.assertTrue(tablero.estaOcupado(1,7));
    }
    
    @Test
    public void testJugadorAliadoMueveUnSoldadoQueTieneSoloUnoAdyacenteYElOtroNoSeMueve() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",2,5);
        jugadorAliado.comprarUnidad("soldado",2,6);
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.moverUnidad(2,5,0);

        Assertions.assertTrue(tablero.estaOcupado(1,5));

        Assertions.assertFalse(tablero.estaOcupado(1,6));
        Assertions.assertTrue(tablero.estaOcupado(2,6));
    }
    
    @Test
    public void testJugadorAliadoMueveUnSoldadoQueTieneUnoSoloAdyacentePeroEsteTieneOtroAdyacentePorLoQueSeMuevenLosTres() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",2,5);
        jugadorAliado.comprarUnidad("soldado",2,6);
        jugadorAliado.comprarUnidad("soldado",2,7);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.resetMovimientoUnidades();

        //tablero.imprimirTablero();
        jugadorAliado.moverUnidad(2,5,0);
        //tablero.imprimirTablero();


        Assertions.assertFalse(tablero.estaOcupado(2,5));
        Assertions.assertFalse(tablero.estaOcupado(2,6));
        Assertions.assertFalse(tablero.estaOcupado(2,7));
        Assertions.assertTrue(tablero.estaOcupado(1,5));
        Assertions.assertTrue(tablero.estaOcupado(1,6));
        Assertions.assertTrue(tablero.estaOcupado(1,7));
    }
    
    @Test
    public void testJugadorAliadoMueveUnBatallonEnColumnaHaciaElNorteYCadaUnoOcupaSuNuevoCasilleroConExito(){

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);
        tablero.cambiarEstado();

        jugadorAliado.comprarUnidad("soldado",14,5);
        jugadorAliado.comprarUnidad("soldado",15,5);
        jugadorAliado.comprarUnidad("soldado",16,5);
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.moverUnidad(14,5,0);

        Assertions.assertFalse(tablero.estaOcupado(16,5));
        Assertions.assertTrue(tablero.estaOcupado(13,5));
        Assertions.assertTrue(tablero.estaOcupado(14,5));
        Assertions.assertTrue(tablero.estaOcupado(15,5));

    }
    
    @Test
    public void testJugadorAliadoMueveUnBatallonEnFilaHaciaElEsteYCadaUnoOcupaSuNuevoCasilleroConExito(){

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);
        tablero.cambiarEstado();

        jugadorAliado.comprarUnidad("soldado",14,5);
        jugadorAliado.comprarUnidad("soldado",14,6);
        jugadorAliado.comprarUnidad("soldado",14,7);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(14,7,2);

        Assertions.assertFalse(tablero.estaOcupado(14,5));
        Assertions.assertTrue(tablero.estaOcupado(14,6));
        Assertions.assertTrue(tablero.estaOcupado(14,7));
        Assertions.assertTrue(tablero.estaOcupado(14,8));

    }
    
    @Test
    public void testJugadorAliadoMueveUnBatallonEnColumnaHaciaElSurYCadaUnoOcupaSuNuevoCasilleroConExito(){

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);
        tablero.cambiarEstado();

        jugadorAliado.comprarUnidad("soldado",14,5);
        jugadorAliado.comprarUnidad("soldado",15,5);
        jugadorAliado.comprarUnidad("soldado",16,5);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(14,5,4);

        Assertions.assertFalse(tablero.estaOcupado(14,5));
        Assertions.assertTrue(tablero.estaOcupado(15,5));
        Assertions.assertTrue(tablero.estaOcupado(16,5));
        Assertions.assertTrue(tablero.estaOcupado(17,5));

    }
    
    @Test
    public void testJugadorAliadoMueveUnBatallonEnFilaHaciaElOesteYCadaUnoOcupaSuNuevoCasilleroConExito(){

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);
        tablero.cambiarEstado();

        jugadorAliado.comprarUnidad("soldado",14,5);
        jugadorAliado.comprarUnidad("soldado",14,6);
        jugadorAliado.comprarUnidad("soldado",14,7);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(14,5,6);

        Assertions.assertFalse(tablero.estaOcupado(14,7));
        Assertions.assertTrue(tablero.estaOcupado(14,4));
        Assertions.assertTrue(tablero.estaOcupado(14,5));
        Assertions.assertTrue(tablero.estaOcupado(14,6));

    }
    
    @Test
    public void testJugadorAliadoMueveUnBatallonHaciaElNoresteYCadaUnoOcupaSuNuevoCasilleroConExito(){

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);
        tablero.cambiarEstado();

        jugadorAliado.comprarUnidad("soldado",14,5);
        jugadorAliado.comprarUnidad("soldado",13,6);
        jugadorAliado.comprarUnidad("soldado",14,7);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(14,5,1);

        Assertions.assertTrue(tablero.estaOcupado(13,6));
        Assertions.assertTrue(tablero.estaOcupado(12,7));
        Assertions.assertTrue(tablero.estaOcupado(13,8));

    }

    @Test
    public void testJugadorAliadoMueveUnBatallonHaciaElSuresteYCadaUnoOcupaSuNuevoCasilleroConExito(){

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);
        tablero.cambiarEstado();

        jugadorAliado.comprarUnidad("soldado",12,5);
        jugadorAliado.comprarUnidad("soldado",11,6);
        jugadorAliado.comprarUnidad("soldado",10,7);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(10,7,3);

        Assertions.assertTrue(tablero.estaOcupado(13,6));
        Assertions.assertTrue(tablero.estaOcupado(12,7));
        Assertions.assertTrue(tablero.estaOcupado(11,8));

    }
    
    @Test
    public void testJugadorAliadoMueveUnBatallonHaciaElSuroesteYCadaUnoOcupaSuNuevoCasilleroConExito(){

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",4,3);
        jugadorAliado.comprarUnidad("soldado",5,4);
        jugadorAliado.comprarUnidad("soldado",6,5);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(4,3,5);

        Assertions.assertTrue(tablero.estaOcupado(5,2));
        Assertions.assertTrue(tablero.estaOcupado(6,3));
        Assertions.assertTrue(tablero.estaOcupado(7,4));

    }
    
    @Test
    public void testJugadorAliadoMueveUnBatallonHaciaElNoroesteYCadaUnoOcupaSuNuevoCasilleroConExito(){

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",7,5);
        jugadorAliado.comprarUnidad("soldado",7,6);
        jugadorAliado.comprarUnidad("soldado",8,7);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(8,7,7);

        Assertions.assertTrue(tablero.estaOcupado(6,4));
        Assertions.assertTrue(tablero.estaOcupado(6,5));
        Assertions.assertTrue(tablero.estaOcupado(7,6));

    }
    
    @Test
    public void testJugadorAliadoMueveUnSoldadoQueNoConformaUnBatallonYLosOtrosSoldadosNoSeMueven(){

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",7,5);
        jugadorAliado.comprarUnidad("soldado",7,7);
        jugadorAliado.comprarUnidad("soldado",9,5);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(7,5,0);

        Assertions.assertTrue(tablero.estaOcupado(6,5));
        Assertions.assertTrue(tablero.estaOcupado(7,7));
        Assertions.assertTrue(tablero.estaOcupado(9,5));

    }


    @Test
    public void testJugadorMueveUnBatallonDeHastaTresSoldadosComoMaximoYElCuartoNoSeMueve() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus", tablero);

        jugadorAliado.comprarUnidad("soldado", 6, 5);
        jugadorAliado.comprarUnidad("soldado", 7, 5);
        jugadorAliado.comprarUnidad("soldado", 8, 6);
        jugadorAliado.comprarUnidad("soldado", 9, 6);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(6, 5, 0);

        Assertions.assertTrue(tablero.estaOcupado(5, 5));
        Assertions.assertTrue(tablero.estaOcupado(6, 5));
        Assertions.assertTrue(tablero.estaOcupado(7, 6));

        Assertions.assertFalse(tablero.estaOcupado(8, 6));
        Assertions.assertTrue(tablero.estaOcupado(7, 6));

    }

    @Test
    public void testJugadorMueveUnSoldadoYSoloLosDosAdyacentesInmediatosSeMueven() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus", tablero);

        jugadorAliado.comprarUnidad("soldado", 6, 4);
        jugadorAliado.comprarUnidad("soldado", 6, 5);
        jugadorAliado.comprarUnidad("soldado", 7, 5);
        jugadorAliado.comprarUnidad("soldado", 7, 6);
        jugadorAliado.comprarUnidad("soldado", 8, 6);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(7, 5, 2);

        Assertions.assertFalse(tablero.estaOcupado(6, 5));
        Assertions.assertTrue(tablero.estaOcupado(6, 6));
        Assertions.assertTrue(tablero.estaOcupado(7, 6));
        Assertions.assertTrue(tablero.estaOcupado(7, 7));
        Assertions.assertFalse(tablero.estaOcupado(8, 7));

    }

    @Test
    public void testJugadorAliadoMueveUnBatallonDeTresSoldadosQueTienenJinetesAdyacentesPeroEstosNoSeMueven() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus", tablero);

        jugadorAliado.comprarUnidad("soldado", 6, 4);
        jugadorAliado.comprarUnidad("soldado", 6, 5);
        jugadorAliado.comprarUnidad("soldado", 7, 5);
        jugadorAliado.comprarUnidad("jinete", 7, 3);
        jugadorAliado.comprarUnidad("jinete", 8, 6);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(6, 4, 2);

        Assertions.assertTrue(tablero.estaOcupado(6, 5));
        Assertions.assertTrue(tablero.estaOcupado(6, 6));
        Assertions.assertTrue(tablero.estaOcupado(7, 6));
        Assertions.assertFalse(tablero.estaOcupado(7, 7));
        Assertions.assertFalse(tablero.estaOcupado(8, 7));

    }


    @Test
    public void testBatallonDeCuatroSoldadosSeMuevenSoloTres() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",7,5);
        jugadorAliado.comprarUnidad("soldado",7,6);
        jugadorAliado.comprarUnidad("soldado",7,7);
        jugadorAliado.comprarUnidad("soldado", 7,8);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(7,6,4);

        Assertions.assertTrue(tablero.estaOcupado(8,5));
        Assertions.assertTrue(tablero.estaOcupado(8,6));
        Assertions.assertTrue(tablero.estaOcupado(8,7));
        Assertions.assertTrue(tablero.estaOcupado(7,8));
    }



    @Test 
    public void testJugadorAliadoMueveUnBatallonConUnObstaculoSeMuevenDosYUnoNo() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",7,6);
        jugadorAliado.comprarUnidad("soldado",7,7);
        jugadorAliado.comprarUnidad("soldado",7,5);
        jugadorAliado.comprarUnidad("jinete", 8,5);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(7,7,4);

        Assertions.assertTrue(tablero.estaOcupado(8,6));
        Assertions.assertTrue(tablero.estaOcupado(8,7));
        Assertions.assertTrue(tablero.estaOcupado(7,5));
        Assertions.assertTrue(tablero.estaOcupado(8,5));
    }


    @Test
    public void testSeDisuelveElBatallonLuegoDeQueUnSoldadoSeTopeConUnObstaculo() {
    	
    	Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",7,6);
        jugadorAliado.comprarUnidad("soldado",7,7);
        jugadorAliado.comprarUnidad("soldado",7,5);
        jugadorAliado.comprarUnidad("jinete", 8,5);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(7,7,4);
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.moverUnidad(8,7,4);
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.moverUnidad(9,7,4);

        Assertions.assertTrue(tablero.estaOcupado(10,7));
        Assertions.assertTrue(tablero.estaOcupado(9,6));
        Assertions.assertTrue(tablero.estaOcupado(8,5));
        Assertions.assertTrue(tablero.estaOcupado(7,5));
    }



    @Test
    public void testCuandoBatallonSeDisuelveSePasaAMoverUnSoloSodado() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",4,6);
        jugadorAliado.comprarUnidad("soldado",5,6);
        jugadorAliado.comprarUnidad("soldado",6,6);
        jugadorAliado.comprarUnidad("catapulta", 5,7);
        jugadorAliado.resetMovimientoUnidades();

     //   tablero.imprimirTablero();
        jugadorAliado.moverUnidad(4,6,2);
        jugadorAliado.resetMovimientoUnidades();
      //  tablero.imprimirTablero();
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.moverUnidad(4,7,2);
        jugadorAliado.resetMovimientoUnidades();
      //  tablero.imprimirTablero();
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.moverUnidad(4,8,2);
       // tablero.imprimirTablero();


        Assertions.assertTrue(tablero.estaOcupado(4,9));
        Assertions.assertTrue(tablero.estaOcupado(5,6));
        Assertions.assertTrue(tablero.estaOcupado(5,7));
        Assertions.assertTrue(tablero.estaOcupado(6,8));

    }


    @Test
    public void testBatallonSeMueveEnLosBorderDelTableroConExito() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",0,0);
        jugadorAliado.comprarUnidad("soldado",0,1);
        jugadorAliado.comprarUnidad("soldado",0,2);
        jugadorAliado.resetMovimientoUnidades();

   //     tablero.imprimirTablero();
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.moverUnidad(0,0,2);
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.moverUnidad(0,2,2);
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.moverUnidad(0,2,2);

        Assertions.assertTrue(tablero.estaOcupado(0,3));
        Assertions.assertTrue(tablero.estaOcupado(0,4));
        Assertions.assertTrue(tablero.estaOcupado(0,5));

    }


    @Test
    public void testBatallonEnFilaSeIntentaMoverAlEstePeroTieneUnObstaculoPorLoQueNingunSoldadoSeMueve() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",4,0);
        jugadorAliado.comprarUnidad("soldado",4,1);
        jugadorAliado.comprarUnidad("soldado",4,2);
        jugadorAliado.comprarUnidad("curandero",4,3);
        jugadorAliado.resetMovimientoUnidades();

        Assertions.assertThrows(BatallonNoSePuedeMoverException.class,
                () -> jugadorAliado.moverUnidad(4,0,2));
        Assertions.assertTrue(tablero.estaOcupado(4,0));
        Assertions.assertTrue(tablero.estaOcupado(4,1));
        Assertions.assertTrue(tablero.estaOcupado(4,2));

    }

    @Test
    public void testBatallonEnColumnaSeIntentaMoverAlSurPeroTieneUnObstaculoPorLoQueNingunSoldadoSeMueve() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",4,2);
        jugadorAliado.comprarUnidad("soldado",5,2);
        jugadorAliado.comprarUnidad("soldado",6,2);
        jugadorAliado.comprarUnidad("soldado",7,2);
        jugadorAliado.comprarUnidad("catapulta",8,2);
        jugadorAliado.resetMovimientoUnidades();

        Assertions.assertThrows(BatallonNoSePuedeMoverException.class,
                () -> jugadorAliado.moverUnidad(4,2,4));

    }


    @Test
    public void testCuandoBatallonSeDisuelveLosSoldadosVuelvenAMoversePorSeparado() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",7,7);
        jugadorAliado.comprarUnidad("soldado",7,6);
        jugadorAliado.comprarUnidad("soldado",7,5);
        jugadorAliado.comprarUnidad("jinete", 8,5);
        jugadorAliado.resetMovimientoUnidades();

 //       tablero.imprimirTablero();
        jugadorAliado.moverUnidad(7,5,4);
        jugadorAliado.resetMovimientoUnidades();
 //       tablero.imprimirTablero();
        jugadorAliado.moverUnidad(8,6,4);
        jugadorAliado.resetMovimientoUnidades();
 //       tablero.imprimirTablero();
        jugadorAliado.moverUnidad(9,7,4);
        jugadorAliado.resetMovimientoUnidades();
//        tablero.imprimirTablero();

        Assertions.assertTrue(tablero.estaOcupado(10,7));
        Assertions.assertTrue(tablero.estaOcupado(9,6));
        Assertions.assertTrue(tablero.estaOcupado(8,5));
        Assertions.assertTrue(tablero.estaOcupado(7,5));
    }


    @Test
    public void testCadaSoldadoDelBatallonTieneUnObstaculoPorLoQueNoSeMueve() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",7,7);
        jugadorAliado.comprarUnidad("soldado",7,6);
        jugadorAliado.comprarUnidad("soldado",7,5);
        jugadorAliado.comprarUnidad("jinete", 8,5);
        jugadorAliado.comprarUnidad("curandero", 8,6);
        jugadorAliado.comprarUnidad("catapulta", 8,7);
        jugadorAliado.resetMovimientoUnidades();

        Assertions.assertThrows(BatallonNoSePuedeMoverException.class,
                () -> jugadorAliado.moverUnidad(7,6,4));

    }


    @Test
    public void testDosSoldadosDelBatallonTienenUnObstaculoPorLoQueSoloUnoSeMueve() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",7,7);
        jugadorAliado.comprarUnidad("soldado",7,6);
        jugadorAliado.comprarUnidad("soldado",7,5);
        jugadorAliado.comprarUnidad("curandero", 8,6);
        jugadorAliado.comprarUnidad("jinete", 8,5);
        jugadorAliado.resetMovimientoUnidades();
  //      tablero.imprimirTablero();
        jugadorAliado.moverUnidad(7,7,4);
//        tablero.imprimirTablero();

        Assertions.assertTrue(tablero.estaOcupado(8,7));

    }


    @Test
    public void testUnSoldadosDelBatallonTienenUnObstaculoPorLoQueSoloDosSeMueven() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",7,7);
        jugadorAliado.comprarUnidad("soldado",7,6);
        jugadorAliado.comprarUnidad("soldado",7,5);
        jugadorAliado.comprarUnidad("jinete", 8,5);
        jugadorAliado.resetMovimientoUnidades();

    //    tablero.imprimirTablero();
        jugadorAliado.moverUnidad(7,7,4);
     //   tablero.imprimirTablero();

        Assertions.assertTrue(tablero.estaOcupado(8,7));
        Assertions.assertTrue(tablero.estaOcupado(8,6));

    }


    @Test
    public void testSoldadoSeMueveSoloHastaJuntarseConOtrosDosYDesdeEsePuntoSeMuevenComoBatallon() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",7,7);
        jugadorAliado.comprarUnidad("soldado",8,4);
        jugadorAliado.comprarUnidad("soldado",9,4);
        jugadorAliado.resetMovimientoUnidades();

        jugadorAliado.moverUnidad(7,7,6);
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.moverUnidad(7,6,6);
        jugadorAliado.resetMovimientoUnidades();
        jugadorAliado.moverUnidad(7,5,6);
        jugadorAliado.resetMovimientoUnidades();

        Assertions.assertTrue(tablero.estaOcupado(7,4));
        Assertions.assertTrue(tablero.estaOcupado(8,3));
        Assertions.assertTrue(tablero.estaOcupado(9,3));

    }


    /* la idea de este test que es los batallones no intercambien soldados
     * pero no se me ocurre como hacer que no pase
     *
     *
    @Test
    public void testUnBatallonAliadoMantieneSusSoldadosAlPasarPorOtrosSoldadosAliados() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",4,2);
        jugadorAliado.comprarUnidad("soldado",5,2);
        jugadorAliado.comprarUnidad("soldado",6,2);
        jugadorAliado.comprarUnidad("soldado",4,4);
        jugadorAliado.comprarUnidad("soldado",5,4);
        jugadorAliado.comprarUnidad("soldado",6,4);
        tablero.imprimirTablero();

        jugadorAliado.moverUnidad(5,2,2);
        tablero.imprimirTablero();
        jugadorAliado.moverUnidad(5,3,6);
        tablero.imprimirTablero();


    }
    */

    @Test
    public void testSoldadoAliadoSeMueveHaciaAlNorteYSeEncuentraConOtrosDosPorLoQueSeMuevenEnBatallon() {

        Tablero tablero = new Tablero();

        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado", 9, 7);
        jugadorAliado.comprarUnidad("soldado", 7, 8);
        jugadorAliado.comprarUnidad("soldado", 7, 9);
        jugadorAliado.resetMovimientoUnidades();

        Unidad soldado1 = tablero.getUnidad(9,7);
        Unidad soldado2 = tablero.getUnidad(7,8);
        Unidad soldado3 = tablero.getUnidad(7,9);

        tablero.moverUnidad(9,7,0);
        jugadorAliado.resetMovimientoUnidades();
        tablero.moverUnidad(8,7,0);
        jugadorAliado.resetMovimientoUnidades();
        tablero.moverUnidad(7,7,0);
        jugadorAliado.resetMovimientoUnidades();

        Assertions.assertSame(tablero.getUnidad(6,7), soldado1);
        Assertions.assertSame(tablero.getUnidad(5,8), soldado2);
        Assertions.assertSame(tablero.getUnidad(5,9), soldado3);

    }


    //vista
    @Test
    public void testJugadorEnModoPasivoHaceQueElSoldadoSeMueva() {

        Tablero tablero = new Tablero();
        Jugador jugadorAliado = new Jugador("agus",tablero);

        jugadorAliado.comprarUnidad("soldado",7,7);
        jugadorAliado.resetMovimientoUnidades();

        int[] posUnidad = new int [2];
        int[] destino = new int [2];
        posUnidad[0] = 7;
        posUnidad[1] = 7;
        destino[0] = 8;
        destino[1] = 8;

        jugadorAliado.realizarAccion(posUnidad,destino);

        Assertions.assertTrue(tablero.estaOcupado(8,8));

    }


}
