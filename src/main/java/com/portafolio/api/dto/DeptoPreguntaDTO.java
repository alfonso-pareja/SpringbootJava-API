package com.portafolio.api.dto;

public class DeptoPreguntaDTO {

    private Integer id;
    private String pregunta;
    private Integer cantidad;
    private String observacion;
    private String respuesta_ci;
    private String respuesta_co;

    public DeptoPreguntaDTO(Integer id, String pregunta, Integer cantidad, String observacion, String respuesta_ci, String respuesta_co) {
        this.id = id;
        this.pregunta = pregunta;
        this.cantidad = cantidad;
        this.observacion = observacion;
        this.respuesta_ci = respuesta_ci;
        this.respuesta_co = respuesta_co;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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
}
