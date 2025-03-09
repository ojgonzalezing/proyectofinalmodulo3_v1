package models;

public class Adivinanza {

    private String pregunta;
    private String respuestaCorrecta;
    private String respuestaErrada;

    public Adivinanza() {
    }

    public Adivinanza(String pregunta, String respuestaCorrecta, String respuestaErrada) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
        this.respuestaErrada = respuestaErrada;
    }


    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getRespuestaErrada() {
        return respuestaErrada;
    }

    public void setRespuestaErrada(String respuestaErrada) {
        this.respuestaErrada = respuestaErrada;
    }
}
