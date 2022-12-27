package com.portafolio.api.dto.funcionario;

public class MultaDTO {

    private String motivo;
    private Integer valor;
    private Integer reserva_id;

    public MultaDTO(String motivo, Integer valor, Integer reserva_id) {
        this.motivo = motivo;
        this.valor = valor;
        this.reserva_id = reserva_id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getReserva_id() {
        return reserva_id;
    }

    public void setReserva_id(Integer reserva_id) {
        this.reserva_id = reserva_id;
    }
}
