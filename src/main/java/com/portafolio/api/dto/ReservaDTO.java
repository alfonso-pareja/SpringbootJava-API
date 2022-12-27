package com.portafolio.api.dto;

import java.sql.Date;

public class ReservaDTO {

    private Integer id;
    private String nombre_edificio;
    private Integer numero;
    private String nombre;
    private Date fecha_creacion;
    private Integer reserva_id;
    private Integer reserva;
    private String estado;
    private String origen;
    private String destino;
    private Boolean requiereTransporte;

    public ReservaDTO(Integer id, String nombre_edificio, Integer numero, String nombre, Date fecha_creacion, Integer reserva_id, Integer reserva, String estado, String origen, String destino, Boolean requiereTransporte) {
        this.id = id;
        this.nombre_edificio = nombre_edificio;
        this.numero = numero;
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.reserva_id = reserva_id;
        this.reserva = reserva;
        this.estado = estado;
        this.origen = origen;
        this.destino = destino;
        this.requiereTransporte = requiereTransporte;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Integer getReserva_id() {
        return reserva_id;
    }

    public void setReserva_id(Integer reserva_id) {
        this.reserva_id = reserva_id;
    }

    public Integer getReserva() {
        return reserva;
    }

    public void setReserva(Integer reserva) {
        this.reserva = reserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Boolean getRequiereTransporte() {
        return requiereTransporte;
    }

    public void setRequiereTransporte(Boolean requiereTransporte) {
        this.requiereTransporte = requiereTransporte;
    }
}
