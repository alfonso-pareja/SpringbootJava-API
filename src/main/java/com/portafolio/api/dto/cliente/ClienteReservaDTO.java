package com.portafolio.api.dto.cliente;

import java.util.Date;

public class ClienteReservaDTO {
    private Integer reserva;
    private Integer reserva_boleta;
    private String edificio;
    private Date inicio;
    private Date termino;
    private Integer anticipo;
    private Integer costo;
    private Integer tour_id;
    private String tour;
    private Integer depto_numero;
    private String depto_direccion;
    private String estado;
    private Boolean transporte;
    private Integer multa_id;
    private String multa_nombre;
    private Integer multa_valor;
    private Integer multa_boleta;


    public ClienteReservaDTO(Integer reserva, Integer reserva_boleta, String edificio, Date inicio, Date termino, Integer anticipo, Integer costo, Integer tour_id, String tour, Integer depto_numero, String depto_direccion, String estado, Boolean transporte, Integer multa_id, String multa_nombre, Integer multa_valor, Integer multa_boleta) {
        this.reserva = reserva;
        this.reserva_boleta = reserva_boleta;
        this.edificio = edificio;
        this.inicio = inicio;
        this.termino = termino;
        this.anticipo = anticipo;
        this.costo = costo;
        this.tour_id = tour_id;
        this.tour = tour;
        this.depto_numero = depto_numero;
        this.depto_direccion = depto_direccion;
        this.estado = estado;
        this.transporte = transporte;
        this.multa_id = multa_id;
        this.multa_nombre = multa_nombre;
        this.multa_valor = multa_valor;
        this.multa_boleta = multa_boleta;
    }

    public Integer getReserva() {
        return reserva;
    }

    public void setReserva(Integer reserva) {
        this.reserva = reserva;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getTermino() {
        return termino;
    }

    public void setTermino(Date termino) {
        this.termino = termino;
    }

    public Integer getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(Integer anticipo) {
        this.anticipo = anticipo;
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

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    public Integer getDepto_numero() {
        return depto_numero;
    }

    public void setDepto_numero(Integer depto_numero) {
        this.depto_numero = depto_numero;
    }

    public String getDepto_direccion() {
        return depto_direccion;
    }

    public void setDepto_direccion(String depto_direccion) {
        this.depto_direccion = depto_direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getTransporte() {
        return transporte;
    }

    public void setTransporte(Boolean transporte) {
        this.transporte = transporte;
    }

    public Integer getMulta_id() {
        return multa_id;
    }

    public void setMulta_id(Integer multa_id) {
        this.multa_id = multa_id;
    }

    public String getMulta_nombre() {
        return multa_nombre;
    }

    public void setMulta_nombre(String multa_nombre) {
        this.multa_nombre = multa_nombre;
    }

    public Integer getMulta_valor() {
        return multa_valor;
    }

    public void setMulta_valor(Integer multa_valor) {
        this.multa_valor = multa_valor;
    }

    public Integer getMulta_boleta() {
        return multa_boleta;
    }

    public void setMulta_boleta(Integer multa_boleta) {
        this.multa_boleta = multa_boleta;
    }

    public Integer getReserva_boleta() {
        return reserva_boleta;
    }

    public void setReserva_boleta(Integer reserva_boleta) {
        this.reserva_boleta = reserva_boleta;
    }
}
