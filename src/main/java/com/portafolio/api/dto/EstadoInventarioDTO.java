package com.portafolio.api.dto;

public class EstadoInventarioDTO {

    private  int id;
    private  String nombre;

    public EstadoInventarioDTO(int id, String estado) {
        this.id = id;
        this.nombre = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void getNombre(String estado) {
        this.nombre = estado;
    }
}
