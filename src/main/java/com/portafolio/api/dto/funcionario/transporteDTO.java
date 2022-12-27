package com.portafolio.api.dto.funcionario;

public class transporteDTO {
    private Integer id;
    private String origen;
    private String destino;
    private String vehiculo;
    private String patente;
    private String estado;
    private Integer reserva;

    public transporteDTO(Integer id, String origen, String destino, String vehiculo, String patente, String estado, Integer reserva) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.patente = patente;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getReserva() {
        return reserva;
    }

    public void setReserva(Integer reserva) {
        this.reserva = reserva;
    }
}
