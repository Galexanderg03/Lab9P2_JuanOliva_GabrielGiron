package lab9p2_juanoliva_gabrielgiron;
public class Clase {
    private String nombreClase;
    private int codigoClase;
    private int codiMaestro;
    private int codExamen1;
    private int codExamen2;

    public Clase() {
    }
    
    public Clase(String nombreClase, int codigoClase, int codiMaestro, int codExamen1, int codExamen2) {
        this.nombreClase = nombreClase;
        this.codigoClase = codigoClase;
        this.codiMaestro = codiMaestro;
        this.codExamen1 = codExamen1;
        this.codExamen2 = codExamen2;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public int getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(int codigoClase) {
        this.codigoClase = codigoClase;
    }

    public int getCodiMaestro() {
        return codiMaestro;
    }

    public void setCodiMaestro(int codiMaestro) {
        this.codiMaestro = codiMaestro;
    }

    public int getCodExamen1() {
        return codExamen1;
    }

    public void setCodExamen1(int codExamen1) {
        this.codExamen1 = codExamen1;
    }

    public int getCodExamen2() {
        return codExamen2;
    }

    public void setCodExamen2(int codExamen2) {
        this.codExamen2 = codExamen2;
    }

    @Override
    public String toString() {
        return nombreClase;
    }
    
}
