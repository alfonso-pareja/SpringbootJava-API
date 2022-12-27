package com.portafolio.api.dto;

public class EstadoMantencionDTO {

    private  int id;
    private  String estado;

    public EstadoMantencionDTO(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
