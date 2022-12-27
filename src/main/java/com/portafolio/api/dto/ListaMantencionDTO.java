package com.portafolio.api.dto;

import java.util.Date;

public class ListaMantencionDTO {

    private Integer codigo;
    private String nombre_funcionario;
    private Date fecha_inicio;
    private Date fecha_termino;
    private String observaciones;
    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer depto_id;
    private Integer numero;
    private String nombre_edificio;
    private String direccion;


    public ListaMantencionDTO(Integer codigo, String nombre_funcionario, Date fecha_inicio, Date fecha_termino, String observaciones, Integer id, String nombre, String descripcion, Integer depto_id, Integer numero, String nombre_edificio, String direccion) {
        this.codigo = codigo;
        this.nombre_funcionario = nombre_funcionario;
        this.fecha_inicio = fecha_inicio;
        this.fecha_termino = fecha_termino;
        this.observaciones = observaciones;
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.depto_id = depto_id;
        this.numero = numero;
        this.nombre_edificio = nombre_edificio;
        this.direccion = direccion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre_funcionario() {
        return nombre_funcionario;
    }

    public void setNombre_funcionario(String nombre_funcionario) {
        this.nombre_funcionario = nombre_funcionario;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public Integer getDepto_id() {
        return depto_id;
    }

    public void setDepto_id(Integer depto_id) {
        this.depto_id = depto_id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre_edificio() {
        return nombre_edificio;
    }

    public void setNombre_edificio(String nombre_edificio) {
        this.nombre_edificio = nombre_edificio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
