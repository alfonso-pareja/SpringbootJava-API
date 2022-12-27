package com.portafolio.api.dto;

import java.util.Date;

public class DeptoInventarioDTO {

    private Integer id;
    private String nombre_edificio;
    private Integer numero;
    private String nombre_inventario;
    private Date fecha_inicio;
    private Date fecha_termino;
    private String funcionario;

    public DeptoInventarioDTO(Integer id, String nombre_edificio, Integer numero, String nombre_inventario, Date fecha_inicio, Date fecha_termino, String funcionario) {
        this.id = id;
        this.nombre_edificio = nombre_edificio;
        this.numero = numero;
        this.nombre_inventario = nombre_inventario;
        this.fecha_inicio = fecha_inicio;
        this.fecha_termino = fecha_termino;
        this.funcionario = funcionario;
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

    public String getNombre_inventario() {
        return nombre_inventario;
    }

    public void setNombre_inventario(String nombre_inventario) {
        this.nombre_inventario = nombre_inventario;
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

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }
}
