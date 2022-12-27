package com.portafolio.api.dto.cliente;

public class ClienteMultaDTO {
    private Integer ID;
    private String NOMBRE;
    private Integer VALOR;
    private Integer RESERVA_ID;

    public ClienteMultaDTO(Integer ID, String NOMBRE, Integer VALOR, Integer RESERVA_ID) {
        this.ID = ID;
        this.NOMBRE = NOMBRE;
        this.VALOR = VALOR;
        this.RESERVA_ID = RESERVA_ID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public Integer getVALOR() {
        return VALOR;
    }

    public void setVALOR(Integer VALOR) {
        this.VALOR = VALOR;
    }

    public Integer getRESERVA_ID() {
        return RESERVA_ID;
    }

    public void setRESERVA_ID(Integer RESERVA_ID) {
        this.RESERVA_ID = RESERVA_ID;
    }
}
