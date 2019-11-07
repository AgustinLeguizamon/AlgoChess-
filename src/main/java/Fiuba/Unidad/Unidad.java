package Fiuba.Unidad;

import Fiuba.Excepciones.UnidadEstaMuertaException;
import Fiuba.AlgoChess.Alianza;

import java.util.ArrayList;

public abstract class Unidad {

    protected int vida;
    protected int costo;
    protected int danioCuerpoACuerpo;
    protected int danioADistancia;
    protected String simbolo;

    protected Alianza alianza;
    protected int tFila;
    protected int tColumna;

    protected ArrayList<Unidad> unidadesContiguas;

    public Unidad(){
        unidadesContiguas = new ArrayList<>();
    }

    public int getPuntosDeVida(){
        return vida;
    }

    public int getCosto(){
        return costo;
    }

    public void perderVida(int danio){

        if (vida < 0){
            throw (new UnidadEstaMuertaException());
        }
        else{
            vida -= danio;
        }
    }

    public abstract void atacar(int distancia, Unidad unidadObjetivo);

    public Alianza getAlianza() {
        return alianza;
    }

    public abstract Unidad copiar();

    public void setPosicion(int fila, int columna){
        tFila = fila;
        tColumna = columna;
    }

    public int getFila() {
        return tFila;
    }

    public int getColumna() {
        return tColumna;
    }

    public void setAlianza(Alianza alianza) {

        this.alianza = alianza;
    }

    public boolean esMovible(){
        return true;
    }

    public String getSimbolo(){
        return simbolo;
    }

    public void agregarUnidadesContiguas(Unidad unidadContigua){
        unidadesContiguas.add(unidadContigua);
    }

    public ArrayList<Unidad> getUnidadesContiguas(){
        return unidadesContiguas;
    }
}