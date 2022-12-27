package com.portafolio.api.dto;

import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

public class DeptoCheckinDetalleDTO {
    private Integer id;
    private Integer numero;
    private Integer dormitorios;
    private Integer mt2;
    private Integer banos;
    private Integer piso;
    private String nombre;
    private String apellidos;
    private String correo;
    private Integer id2;


    public DeptoCheckinDetalleDTO(Integer id, Integer numero, Integer dormitorios, Integer mt2, Integer banos, Integer piso, String nombre,String apellidos, String correo, Integer id2) {
        this.id = id;
        this.numero = numero;
        this.dormitorios = dormitorios;
        this.mt2 = mt2;
        this.banos = banos;
        this.piso = piso;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.id2 = id2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(Integer dormitorios) {
        this.dormitorios = dormitorios;
    }

    public Integer getMt2() {
        return mt2;
    }

    public void setMt2(Integer mt2) {
        this.mt2 = mt2;
    }

    public Integer getBanos() {
        return banos;
    }

    public void setBanos(Integer banos) {
        this.banos = banos;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getId2() {
        return id2;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }
}
