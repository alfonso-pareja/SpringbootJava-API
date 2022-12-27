package com.portafolio.api.dto;

import java.util.Date;

public class MantencionDetalleDTO {

    private Integer id;
    private String nombre;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_termino;
    private String nombre_edificio;
    private String numero;
    private String observaciones;
    private String funcionario;
    private String nombrefuncionario;
    private String apellidofuncionario;
    private Integer costo;
    private Boolean estado;

    public MantencionDetalleDTO(Integer id, String nombre, String descripcion, Date fecha_inicio, Date fecha_termino, String nombre_edificio, String numero, String observaciones, String funcionario, String nombrefuncionario, String apellidofuncionario, Integer costo, Boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_termino = fecha_termino;
        this.nombre_edificio = nombre_edificio;
        this.numero = numero;
        this.observaciones = observaciones;
        this.funcionario = funcionario;
        this.nombrefuncionario = nombrefuncionario;
        this.apellidofuncionario = apellidofuncionario;
        this.costo = costo;
        this.estado = estado;
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

    public String getNombre_edificio() {
        return nombre_edificio;
    }

    public void setNombre_edificio(String nombre_edificio) {
        this.nombre_edificio = nombre_edificio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getNombrefuncionario() {
        return nombrefuncionario;
    }

    public void setNombrefuncionario(String nombrefuncionario) {
        this.nombrefuncionario = nombrefuncionario;
    }

    public String getApellidofuncionario() {
        return apellidofuncionario;
    }

    public void setApellidofuncionario(String apellidofuncionario) {
        this.apellidofuncionario = apellidofuncionario;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
