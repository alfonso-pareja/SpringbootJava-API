package com.portafolio.api.dto.funcionario;

import java.util.Date;

public class UpdateInventoryDTO {
    private Integer estado_id;
    private Integer id;
    private Date fecha_termino;
    private String observacion;

    public UpdateInventoryDTO(Integer estado_id, Integer id, Date fecha_termino, String observacion) {
        this.estado_id = estado_id;
        this.id = id;
        this.fecha_termino = fecha_termino;
        this.observacion = observacion;
    }

    public Integer getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(Integer estado_id) {
        this.estado_id = estado_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_termino() {
        return fecha_termino;
    }

    public void setFecha_termino(Date fecha_termino) {
        this.fecha_termino = fecha_termino;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
