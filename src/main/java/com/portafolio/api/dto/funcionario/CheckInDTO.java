package com.portafolio.api.dto.funcionario;

import java.util.Date;

public class CheckInDTO {
    private Integer departamento_id;
    private String boleta_id;
    private Integer reserva_id;
    private Integer usuario_id;
    private String observacion;
    private Date fecha;


    public CheckInDTO(Integer departamento_id, String boleta_id, Integer reserva_id, Integer usuario_id, String observacion, Date fecha) {
        this.departamento_id = departamento_id;
        this.boleta_id = boleta_id;
        this.reserva_id = reserva_id;
        this.usuario_id = usuario_id;
        this.observacion = observacion;
        this.fecha = fecha;
    }

    public Integer getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(Integer departamento_id) {
        this.departamento_id = departamento_id;
    }

    public String getBoleta_id() {
        return boleta_id;
    }

    public void setBoleta_id(String boleta_id) {
        this.boleta_id = boleta_id;
    }

    public Integer getReserva_id() {
        return reserva_id;
    }

    public void setReserva_id(Integer reserva_id) {
        this.reserva_id = reserva_id;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}

