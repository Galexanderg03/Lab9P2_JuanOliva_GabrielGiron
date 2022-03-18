package lab9p2_juanoliva_gabrielgiron;
public class Maestro {
    private String nombreMaestro;
    private int codigoRRHH;

    public Maestro() {
    }

    public Maestro(String nombreMaestro, int codigoRRHH) {
        this.nombreMaestro = nombreMaestro;
        this.codigoRRHH = codigoRRHH;
    }

    public String getNombreMaestro() {
        return nombreMaestro;
    }

    public void setNombreMaestro(String nombreMaestro) {
        this.nombreMaestro = nombreMaestro;
    }

    public int getCodigoRRHH() {
        return codigoRRHH;
    }

    public void setCodigoRRHH(int codigoRRHH) {
        this.codigoRRHH = codigoRRHH;
    }

    @Override
    public String toString() {
        return nombreMaestro;
    }
}
