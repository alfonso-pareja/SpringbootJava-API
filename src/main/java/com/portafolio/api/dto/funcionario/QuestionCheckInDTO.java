package com.portafolio.api.dto.funcionario;

public class QuestionCheckInDTO {
    private Integer id;
    private String respuesta_ci;
    private Integer departamento_id;
    private Integer reserva_id;

    public QuestionCheckInDTO(Integer id, String respuesta_ci, Integer departamento_id, Integer reserva_id) {
        this.id = id;
        this.respuesta_ci = respuesta_ci;
        this.departamento_id = departamento_id;
        this.reserva_id = reserva_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRespuesta_ci() {
        return respuesta_ci;
    }

    public void setRespuesta_ci(String respuesta_ci) {
        this.respuesta_ci = respuesta_ci;
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
