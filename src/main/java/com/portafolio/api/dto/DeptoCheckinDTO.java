package com.portafolio.api.dto;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

public class DeptoCheckinDTO {

    private Integer id;
    private String nombre_edificio;
    private Integer numero;
    private String nombre;
    private Date created_at;


    public DeptoCheckinDTO(Integer id, String nombre_edificio, Integer numero, String nombre, Date created_at) {
        this.id = id;
        this.nombre_edificio = nombre_edificio;
        this.numero = numero;
        this.nombre = nombre;
        this.created_at = created_at;
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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }






}
