package com.portafolio.api.dto;

import java.util.Date;

public class DashboardTransporteDTO {
    private Integer id;
    private String origen;
    private String destino;
    private String conductor;
    private String vehiculo;
    private String patente;
    private Integer costo;
    private Date fecha;
    private Integer usuario_id;
    private Integer reserva;
    private String estado;

    public DashboardTransporteDTO(Integer id, String origen, String destino, String conductor, String vehiculo, String patente, Integer costo, Date fecha, Integer usuario_id, Integer reserva, String estado) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.conductor = conductor;
        this.vehiculo = vehiculo;
        this.patente = patente;
        this.costo = costo;
        this.fecha = fecha;
        this.usuario_id = usuario_id;
        this.reserva = reserva;
        this.estado = estado;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
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
}
