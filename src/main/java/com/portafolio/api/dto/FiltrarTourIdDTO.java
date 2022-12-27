package com.portafolio.api.dto;

import java.util.Date;

public class FiltrarTourIdDTO {
    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer valor;
    private String ubicacion;
    private Date fecha_inicio;
    private Date fecha_termino;
    private Integer comuna_id;
    private String image;
    private String image2;
    private String image3;

    public FiltrarTourIdDTO(Integer id, String nombre, String descripcion, Integer valor, String ubicacion, Date fecha_inicio, Date fecha_termino, Integer comuna_id, String image, String image2, String image3) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.ubicacion = ubicacion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_termino = fecha_termino;
        this.comuna_id = comuna_id;
        this.image = image;
        this.image2 = image2;
        this.image3 = image3;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_termino() {
        return fecha_termino;
    }

    public void setFecha_termino(Date fecha_termino) {
        this.fecha_termino = fecha_termino;
    }

    public Integer getComuna_id() {
        return comuna_id;
    }

    public void setComuna_id(Integer comuna_id) {
        this.comuna_id = comuna_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }
}
