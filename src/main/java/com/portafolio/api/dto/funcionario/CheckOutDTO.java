package com.portafolio.api.dto.funcionario;

import java.util.Date;

public class CheckOutDTO {

    private Integer checkin_id;
    private String observacion;
    private Integer depto;
    private Date fecha;

    public CheckOutDTO(Integer checkin_id, String observacion, Integer depto, Date fecha) {
        this.checkin_id = checkin_id;
        this.fecha = fecha;
        this.depto = depto;
        this.observacion = observacion;
    }

    public Integer getCheckin_id() {
        return checkin_id;
    }

    public void setCheckin_id(Integer checkin_id) {
        this.checkin_id = checkin_id;
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

    public Integer getDepto() {
        return depto;
    }

    public void setDepto(Integer depto) {
        this.depto = depto;
    }
}
