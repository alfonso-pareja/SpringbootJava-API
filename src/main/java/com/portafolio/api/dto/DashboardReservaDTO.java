package com.portafolio.api.dto;

import java.util.Date;

public class DashboardReservaDTO {
    private Integer id;
    private Integer boleta_id;
    private Integer cliente_id;
    private Integer departamento_id;
    private Date created_at;
    private String estado;
    private Date fecha_inicio;
    private Date fecha_termino;
    private Integer cantidad_adultos;
    private Integer cantidad_ninos;
    private String origen;
    private Integer costo;
    private Integer tour_id;
    private String tour_nombre;

    public DashboardReservaDTO(Integer id, Integer boleta_id, Integer cliente_id, Integer departamento_id, Date created_at, String estado, Date fecha_inicio, Date fecha_termino, Integer cantidad_adultos, Integer cantidad_ninos, String origen, Integer costo, Integer tour_id, String tour_nombre) {
        this.id = id;
        this.boleta_id = boleta_id;
        this.cliente_id = cliente_id;
        this.departamento_id = departamento_id;
        this.created_at = created_at;
        this.estado = estado;
        this.fecha_inicio = fecha_inicio;
        this.fecha_termino = fecha_termino;
        this.cantidad_adultos = cantidad_adultos;
        this.cantidad_ninos = cantidad_ninos;
        this.origen = origen;
        this.costo = costo;
        this.tour_id = tour_id;
        this.tour_nombre = tour_nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBoleta_id() {
        return boleta_id;
    }

    public void setBoleta_id(Integer boleta_id) {
        this.boleta_id = boleta_id;
    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Integer getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(Integer departamento_id) {
        this.departamento_id = departamento_id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public Integer getCantidad_adultos() {
        return cantidad_adultos;
    }

    public void setCantidad_adultos(Integer cantidad_adultos) {
        this.cantidad_adultos = cantidad_adultos;
    }

    public Integer getCantidad_ninos() {
        return cantidad_ninos;
    }

    public void setCantidad_ninos(Integer cantidad_ninos) {
        this.cantidad_ninos = cantidad_ninos;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Integer getTour_id() {
        return tour_id;
    }

    public void setTour_id(Integer tour_id) {
        this.tour_id = tour_id;
    }

    public String getTour_nombre() {
        return tour_nombre;
    }

    public void setTour_nombre(String tour_nombre) {
        this.tour_nombre = tour_nombre;
    }
}
