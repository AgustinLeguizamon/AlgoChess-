
package fiuba.algo3.TP2.Modelo.Unidad.Armas;

import fiuba.algo3.TP2.Modelo.Excepciones.NoEstanDadasLasCondicionesDeAtaqueException;

public class ArmaNull implements Arma {
	
	@Override
	public int atacar(int distancia, int costoCuerpoACuerpo, int costoADistancia) {
		throw new NoEstanDadasLasCondicionesDeAtaqueException();
	}
	
	
	@Override
	public Arma cambiarArmaSoldado() {
		return new ArcoInamovible();
	}
	
	@Override
	public Arma cambiarArmaOtraUnidad() {
		return this;
	}
	
	@Override 
	public Arma cambiarArmaEnemiga() {
		return this;
	}
	
	public Arma cambiarArmaNull() {
		return this;
	}
	
	@Override
	public int getRangoAtaque(int costoCuerpoACuerpo, int costoADistancia) {
		return 0;
	}
	
	@Override 
	public int getRangoAtaqueInicial(int opcion1, int opcion2) {
		return 0;
	}
	
	@Override
	public int getRangoAtaqueFinal(int opcion1, int opcion2) {
		return 0;
	}
}
