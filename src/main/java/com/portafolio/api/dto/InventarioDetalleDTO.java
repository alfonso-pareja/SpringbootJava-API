package com.portafolio.api.dto;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

public class InventarioDetalleDTO {

    private Integer id;
    private String producto;
    private Date fecha_inicio;
    private Date fecha_termino;
    private String pregunta;
    private Integer cantidad;
    private String observaciones;
    private String descripcion;
    private String nombre_edificio;
    private int estado_inventario_id;
    private int usuario_id;
    private String nombre;
    private Integer id2;

    public InventarioDetalleDTO(Integer id, String producto, Date fecha_inicio, Date fecha_termino, String pregunta, Integer cantidad, String observaciones, String descripcion, String nombre_edificio, int estado_inventario_id, int usuario_id, String nombre, Integer id2) {
        this.id = id;
        this.producto = producto;
        this.fecha_inicio = fecha_inicio;
        this.fecha_termino = fecha_termino;
        this.pregunta = pregunta;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
        this.descripcion = descripcion;
        this.nombre_edificio = nombre_edificio;
        this.estado_inventario_id = estado_inventario_id;
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.id2 = id2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
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

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre_edificio() {
        return nombre_edificio;
    }

    public void setNombre_edificio(String nombre_edificio) {
        this.nombre_edificio = nombre_edificio;
    }

    public int getEstado_inventario_id() {
        return estado_inventario_id;
    }

    public void setEstado_inventario_id(int estado_inventario_id) {
        this.estado_inventario_id = estado_inventario_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId2() {
        return id2;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }
}
