package com.portafolio.api.dto;

import javax.persistence.criteria.CriteriaBuilder;

public class EditarMantencionCostoDTO {

    private int id;
    private int usuario_id;
    private Integer costo;

    public EditarMantencionCostoDTO(int id, int usuario_id, Integer costo ) {
        this.id = id;
        this.usuario_id = usuario_id;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Integer getCosto () {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }
}
