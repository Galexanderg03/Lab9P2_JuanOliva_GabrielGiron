package lab9p2_juanoliva_gabrielgiron;
class Pregunta {
    private String pregunta;
    private boolean pauta;
    private boolean respuesta;

    public Pregunta() {
    }

    public Pregunta(String pregunta, boolean pauta) {
        this.pregunta = pregunta;
        this.pauta = pauta;
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
    
    //MA
    public int revisionRespuesta(){
        return respuesta == pauta ? 5 : 0 ; 
    }
    
}
