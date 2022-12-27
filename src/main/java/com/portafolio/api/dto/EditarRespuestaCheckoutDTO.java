package com.portafolio.api.dto;

public class EditarRespuestaCheckoutDTO {

    private int id;
    private String respuesta_co;

    public EditarRespuestaCheckoutDTO(int id,  String observacion, String respuesta_co) {
        this.id = id;
        this.respuesta_co = respuesta_co;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRespuesta_co() {
        return respuesta_co;
    }

    public void setRespuesta_co(String respuesta_co) {
        this.respuesta_co = respuesta_co;
    }
}
