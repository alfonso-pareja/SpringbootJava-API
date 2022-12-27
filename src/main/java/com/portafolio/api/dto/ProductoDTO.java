package com.portafolio.api.dto;

import javax.persistence.criteria.CriteriaBuilder;

public class ProductoDTO {

    private Integer id;
    private Integer nombre;
    private String cantidad;

    public ProductoDTO(Integer id, Integer nombre, String cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
