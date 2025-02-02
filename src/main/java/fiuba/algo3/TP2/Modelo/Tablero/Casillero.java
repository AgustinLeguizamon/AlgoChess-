package fiuba.algo3.TP2.Modelo.Tablero;

import fiuba.algo3.TP2.Modelo.AlgoChess.EstadoAliado;
import fiuba.algo3.TP2.Modelo.AlgoChess.EstadoAlianzas;
import fiuba.algo3.TP2.Modelo.AlgoChess.EstadoEnemigo;
import fiuba.algo3.TP2.Modelo.Subject;
import fiuba.algo3.TP2.Modelo.Unidad.Unidad;
import fiuba.algo3.TP2.Modelo.Unidad.UnidadNull;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import static java.lang.Math.abs;
import static java.lang.Math.max;

public class Casillero extends Subject {

    private Unidad unidad;
    private EstadoCasillero estado;
    private EstadoAlianzas estadoAlianzas;
    private int fila;
    private int columna;
    private ArrayList<Casillero> adyacentes;
    private boolean resaltado;
    private String simboloPintura;


    public Casillero(int fil, int col){
        fila = fil;
        columna = col;
        this.unidad = new UnidadNull(fil, col);
        this.estado = new EstadoCasilleroVacio();
        this.estadoAlianzas = new EstadoAliado();
        this.adyacentes = new ArrayList<Casillero>();
        resaltado = false;
    }
    
    public void setUnidad(Unidad unaUnidad) {
    	estadoAlianzas.setUnidad();
    	estado.puedeColocar();
    	unidad = unaUnidad;
    	estado = new EstadoCasilleroOcupado();
        //notificarObservers();
        unidad.setPosicion(fila,columna);

    }


    public void recibirUnidad(Unidad unaUnidad, Casillero CasilleroAnterior){
        estado.agregarUnidad(unaUnidad, this, CasilleroAnterior);
    }


    private void recibirUnidadBatallon(Unidad unaUnidad) {
        estado.agregarUnidadBatallon(unaUnidad,this);
    }

    public void ocuparUnidad(Unidad unaUnidad){
        unidad = unaUnidad;
        estado = new EstadoCasilleroOcupado();
        //notificarObservers();
        unidad.setPosicion(fila,columna);
    }

    public void quitarUnidad(){
        unidad = new UnidadNull(fila,columna);
        estado = new EstadoCasilleroVacio();
    }


    public void matarUnidad() {
        unidad.setPosicion(-1,-1);
        unidad = new UnidadNull(fila,columna);
        estado = new EstadoCasilleroVacio();
    }

    public void cambiarEstadoAlianzas(){
       estadoAlianzas = estadoAlianzas.cambiarEstadoAlianzas();
       unidad.cambiarEstadoAlianzas();
    }

    public void iniciarZonaAliada(){
        estadoAlianzas = new EstadoAliado();
    }

    public void iniciarZonaEnemiga(){
        estadoAlianzas = new EstadoEnemigo();
    }

    public int calcularCostoAtaque(int costo){
        return estadoAlianzas.calcularCostoCasillero(costo);
    }
    
    public int getFila() {
    	return fila;
    }
    
    public int getColumna() {
    	return columna;
    }

    public int calcularDistancia(Casillero otroCasillero){
        int otraFila = otroCasillero.getFila();
        int otraColumna = otroCasillero.getColumna();
        int distancia = max(abs(fila - otraFila), abs(columna - otraColumna));
        return distancia;
    }

    public void moverUnidad(int orientacion) {
        unidad.seMovioEnEsteTurno();
        unidad.moveteA(this, orientacion);
    }

    public void moverUnidadBatallon(Unidad unidad, int orientacion) {
        adyacentes.get(orientacion).recibirUnidadBatallon(unidad);
    }


    public Unidad getUnidad(){
        return unidad;
    }
    
    public boolean estaOcupado() {
    	return estado.estaOcupado();
    }

    public void agregarCasillerosAlBatallon(List<Casillero> batallon, int i) {
    	
    	Casillero casilleroAdyacente;
        Iterator<Casillero> iterador = adyacentes.iterator();
        
        while(iterador.hasNext() && batallon.size() < 3) {
        	
        	casilleroAdyacente = iterador.next();
        	
        	if(!batallon.contains(casilleroAdyacente)) {
        		casilleroAdyacente.getUnidad().agregarUnCasilleroAlBatallon(batallon, casilleroAdyacente);
        	}
        }
        
        if(batallon.size() > i){
                batallon.get(i).agregarCasillerosAlBatallon(batallon, i+1);
        }
        
    }

    public void agregarAdyacente(Casillero adyacente) {
        adyacentes.add(adyacente);
    }

    public Casillero getAdyacente(int orientacion) {
        return adyacentes.get(orientacion);
    }

    public String getSimbolo() {
        return this.unidad.getSimbolo();
    }

    public ArrayList<Casillero> getCasillerosConUnidadesAdyacentes(){
        ArrayList<Casillero> casilleros = new ArrayList<>();
        for(Casillero casillero: this.adyacentes){
            if(casillero.getUnidad().getSimbolo() != "-"){
                casilleros.add(casillero);
            }
        }
        return casilleros;
    }

    public void unirABatallon(ArrayList<Casillero> batallon) {
        unidad.unirABatallon(batallon);
    }

    public void resaltar() {
        this.resaltado = true;
        notificarObservers();
    }

    public boolean estaResaltado() {
        return resaltado;
    }

    public void desResaltarCasillero() {
        this.resaltado = false;
        notificarObservers();
    }

    public void setSimboloPintura(String simbolo) {
        this.simboloPintura = simbolo;
    }

    public String getSimboloPintura() {
        return simboloPintura;
    }

}