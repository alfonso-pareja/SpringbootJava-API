package com.portafolio.api.dto;

import java.util.Date;

public class DeptoCheckoutDTO {

    private Integer id;
    private String nombre_edificio;
    private Integer numero;
    private String nombre;
    private Date fecha_creacion;

    public DeptoCheckoutDTO(Integer id, String nombre_edificio, Integer numero, String nombre, Date fecha_creacion) {
        this.id = id;
        this.nombre_edificio = nombre_edificio;
        this.numero = numero;
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_edificio() {
        return nombre_edificio;
    }

    public void setNombre_edificio(String nombre_edificio) {
        this.nombre_edificio = nombre_edificio;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}
