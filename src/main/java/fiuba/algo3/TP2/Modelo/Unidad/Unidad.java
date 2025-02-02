package fiuba.algo3.TP2.Modelo.Unidad;
import fiuba.algo3.TP2.Modelo.AlgoChess.EstadoAlianzas;
import fiuba.algo3.TP2.Modelo.Excepciones.LasUnidadesSoloSePuedenMoverUnCasilleroPorTurnoException;
import fiuba.algo3.TP2.Modelo.Excepciones.UnidadSoloPuedeAtacarUnaVezException;
import fiuba.algo3.TP2.Modelo.Subject;
import fiuba.algo3.TP2.Modelo.Tablero.Casillero;
import fiuba.algo3.TP2.Modelo.Unidad.Armas.Arma;

import java.util.*;

public abstract class Unidad extends Subject {

    protected final int DISTANCIA_CERCANA = 2;
    protected final int DISTANCIA_MEDIA = 5;
    protected final int DISTANCIA_LEJANA = 6;

    protected int vida;
    protected int vidaInicial;
    protected int costo;
    protected int danioCuerpoACuerpo;
    protected int danioADistancia;
    protected EstadoAlianzas estadoAlianzas;
    protected String simbolo;
    protected boolean seMovioEnEsteTurno;
    protected boolean atacoEnEsteTurno;

    //Para la vista de la unidad
    protected int fila;
    protected int columna;

    public void cambiarEstadoAlianzas(){
        estadoAlianzas = estadoAlianzas.cambiarEstadoAlianzas();
    }

    public int getPuntosDeVida(){
        return vida;
    }

    public int getCosto(){
        return costo;
    }

    public int calcularCostoUnidad(int costo){
        return estadoAlianzas.calcularCostoUnidad(costo);
    }

    public int calcularCostoCuracion(int costo){
        return estadoAlianzas.calcularCostoCuracion(costo);
    }
    
    public String getSimbolo() {
    	return this.simbolo;
    }
    
    public abstract void agregarUnCasilleroAlBatallon(List<Casillero> batallon, Casillero casillero);
    public abstract Arma seleccionarArmasJinete(Arma armaAnterior);
    public abstract void perderVida(int costoAtaque);
    public abstract int atacar(ArrayList<Casillero> zonasCercanas, int distancia, Casillero unidadDefensa);
    public abstract void moveteA(Casillero zonaInicial, int orientacion);
    protected abstract void dentroRango(int distancia);
    public abstract Unidad copiar();
    public abstract int getDistanciaAtaqueInicial(ArrayList<Casillero> zonasCercanas);
    public abstract int getDistanciaAtaqueFinal(ArrayList<Casillero> zonasCercanas);

    public abstract void unirABatallon(ArrayList<Casillero> batallon);

    //vista unidad
    public void setPosicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        notificarObservers();
        this.seMovioEnEsteTurno = true;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    //vista
    public boolean esAliado() {
        return estadoAlianzas.esAliado();
    }

    public abstract void seMovioEnEsteTurno();

    public void seMovioEnEsteTurno(boolean b) {
        seMovioEnEsteTurno = b;
    }

    public void atacoEnEsteTurno() {
        if (atacoEnEsteTurno){
            throw new UnidadSoloPuedeAtacarUnaVezException();
        }
    }
    

    public void atacoEnEsteTurno(boolean b) {
        atacoEnEsteTurno = b;
    }
    
    public int getAlcanceCorto() {
    	return danioCuerpoACuerpo;
    }
    
    public int getAlcanceADistancia() {
    	return danioADistancia;
    }
    
    public int getVidaInicial() {
    	return vidaInicial;
    }
    
    public boolean realizoAccion() {
    	return atacoEnEsteTurno || seMovioEnEsteTurno;
    }

    public abstract int getDistanciaAtaque(ArrayList<Casillero> zonasCercanas);
}