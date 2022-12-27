package com.portafolio.api.dto;

import java.util.Date;

public class ListaReservacionFuncionarioDTO {
    private Integer codigo;


    public ListaReservacionFuncionarioDTO(Integer codigo, String nombre_edificio,Integer numero,String nombre,Date fecha , String nombre_funcionario, Date fecha_inicio, Date fecha_termino, Integer id) {
        this.codigo = codigo;
        this.nombre_edificio = nombre_edificio;
        this.numero = numero;
        this.nombre = nombre;
        this.fecha = fecha;
        this.nombre_funcionario = nombre_funcionario;
        this.fecha_inicio = fecha_inicio;
        this.fecha_termino = fecha_termino;
        this.id = id;

    }
    private String nombre_edificio;
    private Integer numero;
    private String nombre;
    private Date fecha;
    private String nombre_funcionario;
    private Date fecha_inicio;
    private Date fecha_termino;
    private Integer id;


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
