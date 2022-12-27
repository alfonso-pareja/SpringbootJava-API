package com.portafolio.api.dto;

import javax.swing.*;
import java.util.Date;

public class FiltrarTourCiudadDTO {

    private Integer codigo;


    public FiltrarTourCiudadDTO(Integer codigo, String nombre_tour, String descripcion, Integer valor, String ubicacion, Integer id) {
        this.codigo = codigo;
        this.nombre_tour = nombre_tour;
        this.descripcion = descripcion;
        this.valor = valor;
        this.ubicacion = ubicacion;
        this.id = id;

    }
    private String nombre_tour;
    private String descripcion;
    private Integer valor;
    private String ubicacion;
    private Integer id;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre_tour() {
        return nombre_tour;
    }

    public void setNombre_tour(String nombre_tour) {
        this.nombre_tour = nombre_tour;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
