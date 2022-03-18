package lab9p2_juanoliva_gabrielgiron;

import java.util.ArrayList;

public class Examen {
    private int codigoExamen;
    private ArrayList<Pregunta> listaPregunta = new ArrayList<Pregunta>();
    private int codigoClase;

    public Examen() {
    }

    public Examen(int codigoExamen, int codigoClase) {
        this.codigoExamen = codigoExamen;
        this.codigoClase = codigoClase;
    }

    public int getCodigoExamen() {
        return codigoExamen;
    }

    public void setCodigoExamen(int codigoExamen) {
        this.codigoExamen = codigoExamen;
    }

    public ArrayList<Pregunta> getListaPregunta() {
        return listaPregunta;
    }

    public void setListaPregunta(ArrayList<Pregunta> listaPregunta) {
        this.listaPregunta = listaPregunta;
    }

    public int getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(int codigoClase) {
        this.codigoClase = codigoClase;
    }

    @Override
    public String toString() {
        return String.valueOf(codigoClase);
    }
}
