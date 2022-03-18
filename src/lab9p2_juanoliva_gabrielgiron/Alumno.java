package lab9p2_juanoliva_gabrielgiron;

import java.util.ArrayList;

public class Alumno {
    private String nombreAlumno;
    private String numeroCuenta;
    private String carrera;
    private ArrayList<Clase> listaClases = new ArrayList<Clase>();

    public Alumno() {
    }

    public Alumno(String nombreAlumno, String numeroCuenta, String carrera) {
        this.nombreAlumno = nombreAlumno;
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }

    public void setListaClases(ArrayList<Clase> listaClases) {
        this.listaClases = listaClases;
    }

    @Override
    public String toString() {
        return nombreAlumno;
    }
    
    
}
