package com.portafolio.api.dto.funcionario;

public class QuestionCheckOutDTO {

    private Integer id;
    private String respuesta_co;
    private Integer departamento_id;
    private Integer reserva_id;

    public QuestionCheckOutDTO(Integer id, String respuesta_co, Integer departamento_id, Integer reserva_id) {
        this.id = id;
        this.respuesta_co = respuesta_co;
        this.departamento_id = departamento_id;
        this.reserva_id = reserva_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRespuesta_co() {
        return respuesta_co;
    }

    public void setRespuesta_co(String respuesta_co) {
        this.respuesta_co = respuesta_co;
    }

    public Integer getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(Integer departamento_id) {
        this.departamento_id = departamento_id;
    }

    public Integer getReserva_id() {
        return reserva_id;
    }

    public void setReserva_id(Integer reserva_id) {
        this.reserva_id = reserva_id;
    }
}
