package com.portafolio.api.dto;

import java.util.Date;

public class ListaInventarioDTO {
    private Integer id;
    private Integer codigo;
    private String nombre_inventario;
    private String nombre_funcionario;
    private Date fecha_inicio;
    private Date fecha_termino;
    private String observacion;
    private String descripcion;
    private Integer numero;
    private Integer depto_id;
    private String nombre_edificio;
    private String estadoNombre;
    private String estadoAlias;

    public ListaInventarioDTO(Integer id, Integer codigo, String nombre_inventario, String nombre_funcionario, Date fecha_inicio, Date fecha_termino, String observacion, String descripcion, Integer numero, String nombre_edificio, String estadoNombre, String estadoAlias, Integer depto_id) {
        this.id = id;
        this.codigo = codigo;
        this.nombre_inventario = nombre_inventario;
        this.nombre_funcionario = nombre_funcionario;
        this.fecha_inicio = fecha_inicio;
        this.fecha_termino = fecha_termino;
        this.observacion = observacion;
        this.descripcion = descripcion;
        this.numero = numero;
        this.nombre_edificio = nombre_edificio;
        this.estadoNombre = estadoNombre;
        this.estadoAlias = estadoAlias;
        this.depto_id = depto_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre_inventario() {
        return nombre_inventario;
    }

    public void setNombre_inventario(String nombre_inventario) {
        this.nombre_inventario = nombre_inventario;
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
        return observacion;
    }

    public void setObservaciones(String observaciones) {
        this.observacion = observaciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getEstadoNombre() {
        return estadoNombre;
    }

    public void setEstadoNombre(String estadoNombre) {
        this.estadoNombre = estadoNombre;
    }

    public String getEstadoAlias() {
        return estadoAlias;
    }

    public void setEstadoAlias(String estadoAlias) {
        this.estadoAlias = estadoAlias;
    }

    public Integer getDepto_id() {
        return depto_id;
    }

    public void setDepto_id(Integer depto_id) {
        this.depto_id = depto_id;
    }
}
