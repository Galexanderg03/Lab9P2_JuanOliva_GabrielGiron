package lab9p2_juanoliva_gabrielgiron;
public class Rector {
    private String nombreRector;

    public Rector() {
    }

    public Rector(String nombreRector) {
        this.nombreRector = nombreRector;
    }

    public String getNombreRector() {
        return nombreRector;
    }

    public void setNombreRector(String nombreRector) {
        this.nombreRector = nombreRector;
    }

    @Override
    public String toString() {
        return nombreRector;
    }
    
}
