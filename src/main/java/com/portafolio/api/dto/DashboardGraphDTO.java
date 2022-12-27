package com.portafolio.api.dto;

public class DashboardGraphDTO {

    private Integer reserva;
    private Integer mantencion;
    private Integer transporte;

    public DashboardGraphDTO(Integer reserva, Integer mantencion, Integer transporte) {
        this.reserva = reserva;
        this.mantencion = mantencion;
        this.transporte = transporte;
    }

    public Integer getReserva() {
        return reserva;
    }

    public void setReserva(Integer reserva) {
        this.reserva = reserva;
    }

    public Integer getMantencion() {
        return mantencion;
    }

    public void setMantencion(Integer mantencion) {
        this.mantencion = mantencion;
    }

    public Integer getTransporte() {
        return transporte;
    }

    public void setTransporte(Integer transporte) {
        this.transporte = transporte;
    }
}
