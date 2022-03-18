package lab9p2_juanoliva_gabrielgiron;
class Pregunta {
    private String pregunta;
    private boolean pauta;
    private boolean respuesta;
    private int codigoClase;

    public Pregunta() {
    }

    public Pregunta(String pregunta, boolean pauta, int codigoClase) {
        this.pregunta = pregunta;
        this.pauta = pauta;
        this.codigoClase = codigoClase;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public boolean isPauta() {
        return pauta;
    }

    public void setPauta(boolean pauta) {
        this.pauta = pauta;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    public int getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(int codigoClase) {
        this.codigoClase = codigoClase;
    }
    
    //MA
    public int revisionRespuesta(){
        return respuesta == pauta ? 5 : 0 ; 
    }
    
}
