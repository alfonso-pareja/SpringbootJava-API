package com.portafolio.api.dto;

import java.util.Date;

public class CrearInventarioDTO {

    private Integer id;
    private String nombre;
    private Date fecha_inicio;
    private String descripcion;
    private Integer usuario_id;
    private Integer estado_inventario_id;
    private Integer depto;

    public CrearInventarioDTO(Integer id, String nombre, Date fecha_inicio, String descripcion, Integer usuario_id, Integer estado_inventario_id, Integer depto) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.descripcion = descripcion;
        this.usuario_id = usuario_id;
        this.estado_inventario_id = estado_inventario_id;
        this.depto = depto;
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

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Integer getEstado_inventario_id() {
        return estado_inventario_id;
    }

    public void setEstado_inventario_id(Integer estado_inventario_id) {
        this.estado_inventario_id = estado_inventario_id;
    }

    public Integer getDepto() {
        return depto;
    }

    public void setDepto(Integer depto) {
        this.depto = depto;
    }
}
