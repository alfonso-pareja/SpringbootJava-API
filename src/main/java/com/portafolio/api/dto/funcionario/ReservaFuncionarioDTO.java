package com.portafolio.api.dto.funcionario;

import java.util.Date;

public class ReservaFuncionarioDTO {

    private Integer reservaId;
    private Date reservaInicio;
    private Date reservaTermino;
    private Integer cantidadAdultos;
    private Integer cantidadNinos;
    private Integer reservaCosto;
    private Integer reservaTotal;
    private Integer diferencia;
    private String nombre_edificio;
    private Integer numero;
    private String direccion;
    private Integer valor_arriendo;
    private Integer porc_anticipo;
    private String nombre;
    private String apellidos;
    private Integer valor;
    private String observacion_ci;
    private String observacion_co;
    private Integer multa_id;
    private String nombreMulta;
    private String pagoMulta;
    private Integer valorMulta;

    public ReservaFuncionarioDTO(Integer reservaId, Date reservaInicio, Date reservaTermino, Integer cantidadAdultos, Integer cantidadNinos, Integer reservaCosto, Integer reservaTotal, String nombre_edificio, Integer numero, String direccion, Integer valor_arriendo, Integer porc_anticipo, String nombre, String apellidos, Integer valor, String observacion_ci, String observacion_co, Integer multa_id, String nombreMulta, String pagoMulta, Integer valorMulta,Integer diferencia) {
        this.reservaId = reservaId;
        this.reservaInicio = reservaInicio;
        this.reservaTermino = reservaTermino;
        this.cantidadAdultos = cantidadAdultos;
        this.cantidadNinos = cantidadNinos;
        this.reservaCosto = reservaCosto;
        this.reservaTotal = reservaTotal;
        this.nombre_edificio = nombre_edificio;
        this.numero = numero;
        this.direccion = direccion;
        this.valor_arriendo = valor_arriendo;
        this.porc_anticipo = porc_anticipo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.valor = valor;
        this.observacion_ci = observacion_ci;
        this.observacion_co = observacion_co;
        this.multa_id = multa_id;
        this.nombreMulta = nombreMulta;
        this.pagoMulta = pagoMulta;
        this.valorMulta = valorMulta;
        this.diferencia = diferencia;
    }

    public Integer getReservaId() {
        return reservaId;
    }

    public void setReservaId(Integer reservaId) {
        this.reservaId = reservaId;
    }

    public Date getReservaInicio() {
        return reservaInicio;
    }

    public void setReservaInicio(Date reservaInicio) {
        this.reservaInicio = reservaInicio;
    }

    public Date getReservaTermino() {
        return reservaTermino;
    }

    public void setReservaTermino(Date reservaTermino) {
        this.reservaTermino = reservaTermino;
    }

    public Integer getCantidadAdultos() {
        return cantidadAdultos;
    }

    public void setCantidadAdultos(Integer cantidadAdultos) {
        this.cantidadAdultos = cantidadAdultos;
    }

    public Integer getCantidadNinos() {
        return cantidadNinos;
    }

    public void setCantidadNinos(Integer cantidadNinos) {
        this.cantidadNinos = cantidadNinos;
    }

    public Integer getReservaCosto() {
        return reservaCosto;
    }

    public void setReservaCosto(Integer reservaCosto) {
        this.reservaCosto = reservaCosto;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getValor_arriendo() {
        return valor_arriendo;
    }

    public void setValor_arriendo(Integer valor_arriendo) {
        this.valor_arriendo = valor_arriendo;
    }

    public Integer getPorc_anticipo() {
        return porc_anticipo;
    }

    public void setPorc_anticipo(Integer porc_anticipo) {
        this.porc_anticipo = porc_anticipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getObservacion_ci() {
        return observacion_ci;
    }

    public void setObservacion_ci(String observacion_ci) {
        this.observacion_ci = observacion_ci;
    }

    public String getObservacion_co() {
        return observacion_co;
    }

    public void setObservacion_co(String observacion_co) {
        this.observacion_co = observacion_co;
    }

    public Integer getMulta_id() {
        return multa_id;
    }

    public void setMulta_id(Integer multa_id) {
        this.multa_id = multa_id;
    }

    public String getnombreMulta() {
        return nombreMulta;
    }

    public void setnombreMulta(String nombreMulta) {
        this.nombreMulta = nombreMulta;
    }

    public String getPagoMulta() {
        return pagoMulta;
    }

    public void setPagoMulta(String pagoMulta) {
        this.pagoMulta = pagoMulta;
    }

    public Integer getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Integer valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Integer getReservaTotal() {
        return reservaTotal;
    }

    public void setReservaTotal(Integer reservaTotal) {
        this.reservaTotal = reservaTotal;
    }

    public String getNombreMulta() {
        return nombreMulta;
    }

    public void setNombreMulta(String nombreMulta) {
        this.nombreMulta = nombreMulta;
    }

    public Integer getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(Integer diferencia) {
        this.diferencia = diferencia;
    }
}
