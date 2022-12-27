package com.portafolio.api.dto;

import java.util.Date;

public class EditarMantencionDTO {

    private int id;
    private Date fecha_inicio;
    private String descripcion;
    private String nombre;
    private int usuario_id;

    public EditarMantencionDTO(int id, Date fecha_inicio, String descripcion, String nombre, int usuario_id) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.usuario_id = usuario_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }
}
