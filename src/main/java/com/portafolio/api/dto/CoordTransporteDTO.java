package com.portafolio.api.dto;

import java.awt.print.PrinterGraphics;
import java.sql.DatabaseMetaData;
import java.sql.Date;

public class CoordTransporteDTO {

    private Integer id;
    private String origen;
    private String destino;
    private String conductor;
    private String vehiculo;
    private String patente;
    private Integer costo;
    private Date fecha;
    private Integer usuario;
    private Integer reserva;

    public CoordTransporteDTO(Integer id, String origen, String destino, String conductor, String vehiculo, String patente, Integer costo, Date fecha, Integer usuario, Integer reserva) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.conductor = conductor;
        this.vehiculo = vehiculo;
        this.patente = patente;
        this.costo = costo;
        this.fecha = fecha;
        this.usuario = usuario;
        this.reserva = reserva;
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

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Integer getReserva() {
        return reserva;
    }

    public void setReserva(Integer reserva) {
        this.reserva = reserva;
    }
}
