package com.portafolio.api.dto;

public class TotalClientesDTO {

    private int id;
    private Integer rol_id;

    public TotalClientesDTO(int id, Integer rol_id) {

        this.id = id;
        this.rol_id = rol_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getRol_id() {
        return rol_id;
    }

    public void setRol_id(Integer rol_id) {
        this.rol_id = rol_id;
    }
}
