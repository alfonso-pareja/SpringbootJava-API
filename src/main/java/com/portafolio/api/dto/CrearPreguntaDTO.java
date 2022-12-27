package com.portafolio.api.dto;

public class CrearPreguntaDTO {

    private int id;
    private String pregunta;
    private String observacion;
    private int checkin_id;
    private int checkout_id;
    private String respuesta_ci;
    private String respuesta_co;
    private int cantidad;
    private int flag_depto;

    public CrearPreguntaDTO(int id, String pregunta, String observacion, int checkin_id, int checkout_id, String respuesta_ci, String respuesta_co, int cantidad, int flad_depto) {
        this.id = id;
        this.pregunta = pregunta;
        this.observacion = observacion;
        this.checkin_id = checkin_id;
        this.checkout_id = checkout_id;
        this.respuesta_ci = respuesta_ci;
        this.respuesta_co = respuesta_co;
        this.cantidad = cantidad;
        this.flag_depto = flag_depto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getCheckin_id() {
        return checkin_id;
    }

    public void setCheckin_id(int checkin_id) {
        this.checkin_id = checkin_id;
    }

    public int getCheckout_id() {
        return checkout_id;
    }

    public void setCheckout_id(int checkout_id) {
        this.checkout_id = checkout_id;
    }

    public String getRespuesta_ci() {
        return respuesta_ci;
    }

    public void setRespuesta_ci(String respuesta_ci) {
        this.respuesta_ci = respuesta_ci;
    }

    public String getRespuesta_co() {
        return respuesta_co;
    }

    public void setRespuesta_co(String respuesta_co) {
        this.respuesta_co = respuesta_co;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getFlag_depto() {
        return flag_depto;
    }

    public void setFlag_depto(int flad_depto) {
        this.flag_depto = flad_depto;
    }
}
