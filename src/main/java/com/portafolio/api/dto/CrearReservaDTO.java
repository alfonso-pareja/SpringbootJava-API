package com.portafolio.api.dto;

import java.util.Date;

public class CrearReservaDTO {

    private int id;
    private int boleta_id;
    private int cliente_id;
    private int departamento_id;
    private Date created_at;
    private String estado;
    private Date fecha_inicio;
    private Date fecha_termino;
    private int cantidad_adultos;
    private int cantidad_ninos;
    private String origen;
    private int costo;
    private int total;
    private int tour;
    private boolean transporte;

    public CrearReservaDTO(int id, int boleta_id, int cliente_id, int departamento_id, Date created_at, String estado, Date fecha_inicio, Date fecha_termino, int cantidad_adultos, int cantidad_ninos, String origen, int costo, int total, int tour, boolean transporte) {
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
        this.total = total;
        this.tour = tour;
        this.transporte = transporte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBoleta_id() {
        return boleta_id;
    }

    public void setBoleta_id(int boleta_id) {
        this.boleta_id = boleta_id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(int departamento_id) {
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

    public int getCantidad_adultos() {
        return cantidad_adultos;
    }

    public void setCantidad_adultos(int cantidad_adultos) {
        this.cantidad_adultos = cantidad_adultos;
    }

    public int getCantidad_ninos() {
        return cantidad_ninos;
    }

    public void setCantidad_ninos(int cantidad_ninos) {
        this.cantidad_ninos = cantidad_ninos;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTour() {
        return tour;
    }

    public void setTour(int tour) {
        this.tour = tour;
    }

    public boolean isTransporte() {
        return transporte;
    }

    public void setTransporte(boolean transporte) {
        this.transporte = transporte;
    }
}
