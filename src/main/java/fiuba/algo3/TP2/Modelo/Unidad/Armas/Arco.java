package fiuba.algo3.TP2.Modelo.Unidad.Armas;

import fiuba.algo3.TP2.Modelo.Excepciones.ObjetivoFueraDeRangoException;

public class Arco implements Arma {
	
	@Override
	public int atacar(int distancia, int costoCuerpoACuerpo, int costoADistancia) {
		if (distancia < 3 | distancia > 6) {
			throw new ObjetivoFueraDeRangoException();
		}
		return costoADistancia;
	}
	
	@Override
	public Arma cambiarArmaSoldado() {
		return new ArcoInamovible();
	}
	
	@Override
	public Arma cambiarArmaOtraUnidad() {
		return new ArcoComun();
	}
	
	@Override 
	public Arma cambiarArmaEnemiga() {
		return new Espada();
	}
	
	public Arma cambiarArmaNull() {
		return this;
	}
	
	@Override
	public int getRangoAtaque(int costoCuerpoACuerpo, int costoADistancia) {
		return costoADistancia;
	}
	
	@Override 
	public int getRangoAtaqueInicial(int opcion1, int opcion2) {
		return opcion2;
	}
	
	@Override
	public int getRangoAtaqueFinal(int opcion1, int opcion2) {
		return opcion2;
	}
	
}
