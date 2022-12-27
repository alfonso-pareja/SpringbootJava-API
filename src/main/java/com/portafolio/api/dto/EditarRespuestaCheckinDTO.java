package com.portafolio.api.dto;

public class EditarRespuestaCheckinDTO {
    private int id;
    private String respuesta_ci;

    public EditarRespuestaCheckinDTO(int id, String respuesta_ci) {
        this.id = id;
        this.respuesta_ci = respuesta_ci;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRespuesta_ci() {
        return respuesta_ci;
    }

    public void setRespuesta_ci(String respuesta_ci) {
        this.respuesta_ci = respuesta_ci;
    }
}
