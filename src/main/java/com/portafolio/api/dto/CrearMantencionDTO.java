package com.portafolio.api.dto;

import java.util.Date;

public class CrearMantencionDTO {

    private Integer id;
    private Date fecha_inicio;
    private String descripcion;
    private String nombre;
    private Integer usuario_id;
    private Integer depto;
    private String estado;


    public CrearMantencionDTO(Integer id, Date fecha_inicio, String descripcion, String nombre, Integer usuario_id, Integer depto, String estado) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.usuario_id = usuario_id;
        this.depto = depto;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Integer getDepto() {
        return depto;
    }

    public void setDepto(Integer depto) {
        this.depto = depto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
