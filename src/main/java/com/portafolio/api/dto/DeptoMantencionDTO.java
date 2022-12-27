package com.portafolio.api.dto;

import java.util.Date;

public class DeptoMantencionDTO {

    private Integer id;
    private String nombre;
    private Date fecha_inicio;
    private Date fecha_termino;
    private String funcionario;
    private String estado;
    private Integer costo;


    public DeptoMantencionDTO(Integer id, String nombre, Date fecha_inicio, Date fecha_termino, String funcionario, String estado, Integer costo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_termino = fecha_termino;
        this.funcionario = funcionario;
        this.estado = estado;
        this.costo = costo;
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

    public String getEstado() {return estado;}

    public void setEstado(String estado) {this.estado = estado;}

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }
}
