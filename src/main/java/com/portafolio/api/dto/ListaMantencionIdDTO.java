package com.portafolio.api.dto;

import java.util.Date;

public class ListaMantencionIdDTO {
    private Integer codigo;


    public ListaMantencionIdDTO(Integer codigo, String nombre_funcionario, Date fecha_inicio, Date fecha_termino, String observaciones,  Integer id) {
        this.codigo = codigo;
        this.nombre_funcionario = nombre_funcionario;
        this.fecha_inicio = fecha_inicio;
        this.fecha_termino = fecha_termino;
        this.observaciones = observaciones;
        this.id = id;

    }
    private String nombre_funcionario;
    private Date fecha_inicio;
    private Date fecha_termino;
    private String observaciones;
    private Integer id;

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
}
