package com.portafolio.api.dto;

import java.util.Date;

public class addProductoDTO {

    private Integer id;
    private Date fecha_ingreso;
    private Integer categoriaproducto_id;
    private Integer codigo;
    private String descripcion;
    private String nombre;
    private Integer valor;

    public addProductoDTO(Integer id, Date fecha_ingreso, Integer categoriaproducto_id, Integer codigo, String descripcion, String nombre, Integer valor) {
        this.id = id;
        this.fecha_ingreso = fecha_ingreso;
        this.categoriaproducto_id = categoriaproducto_id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Integer getCategoriaproducto_id() {
        return categoriaproducto_id;
    }

    public void setCategoriaproducto_id(Integer categoriaproducto_id) {
        this.categoriaproducto_id = categoriaproducto_id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
