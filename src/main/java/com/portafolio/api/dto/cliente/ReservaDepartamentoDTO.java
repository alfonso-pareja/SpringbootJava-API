package com.portafolio.api.dto.cliente;

import java.util.Date;

public class ReservaDepartamentoDTO {

    private Integer ID;
    private Integer CLIENTE_ID;
    private String ESTADO;
    private Date FECHA_INICIO;
    private Date FECHA_TERMINO;
    private Date FECHA_CHECKIN;
    private Date FECHA_CHECKOUT;

    public ReservaDepartamentoDTO(Integer ID, Integer CLIENTE_ID, String ESTADO, Date FECHA_INICIO, Date FECHA_TERMINO, Date FECHA_CHECKIN, Date FECHA_CHECKOUT) {
        this.ID = ID;
        this.CLIENTE_ID = CLIENTE_ID;
        this.ESTADO = ESTADO;
        this.FECHA_INICIO = FECHA_INICIO;
        this.FECHA_TERMINO = FECHA_TERMINO;
        this.FECHA_CHECKIN = FECHA_CHECKIN;
        this.FECHA_CHECKOUT = FECHA_CHECKOUT;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getCLIENTE_ID() {
        return CLIENTE_ID;
    }

    public void setCLIENTE_ID(Integer CLIENTE_ID) {
        this.CLIENTE_ID = CLIENTE_ID;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public Date getFECHA_INICIO() {
        return FECHA_INICIO;
    }

    public void setFECHA_INICIO(Date FECHA_INICIO) {
        this.FECHA_INICIO = FECHA_INICIO;
    }

    public Date getFECHA_TERMINO() {
        return FECHA_TERMINO;
    }

    public void setFECHA_TERMINO(Date FECHA_TERMINO) {
        this.FECHA_TERMINO = FECHA_TERMINO;
    }

    public Date getFECHA_CHECKIN() {
        return FECHA_CHECKIN;
    }

    public void setFECHA_CHECKIN(Date FECHA_CHECKIN) {
        this.FECHA_CHECKIN = FECHA_CHECKIN;
    }

    public Date getFECHA_CHECKOUT() {
        return FECHA_CHECKOUT;
    }

    public void setFECHA_CHECKOUT(Date FECHA_CHECKOUT) {
        this.FECHA_CHECKOUT = FECHA_CHECKOUT;
    }
}
