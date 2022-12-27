package com.portafolio.api.dto.funcionario;

import java.util.Date;

public class CheckDetailDTO {

    private Integer CHECKIN_ID;
    private String CHECKIN_OBS;
    private Integer CHECKOUT_ID;
    private String CHECKOUT_OBS;
    private Date FECHA_CHECKIN;
    private Date FECHA_CHECKOUT;
    private Integer RESERVA_ID;
    private Date FECHA_INICIO;
    private Date FECHA_TERMINO;
    private String  PAGO_RESERVA;
    private Integer DEPTO_ID;
    private Integer DEPTO_NUM;
    private String DIRECCION;
    private String NOMBRE_EDIFICIO;
    private Integer CLIENTE_ID;
    private String USUARIO_NOMBRE;
    private String USUARIO_APELLIDOS;
    private Integer VALOR_RESERVA;
    private Integer TIENE_TRANSPORTE;
    private Integer VALOR_TOUR;
    private String MOTIVO_MULTA;
    private Integer VALOR_MULTA;
    private Integer  PAGO_MULTA;

    public CheckDetailDTO(Integer CHECKIN_ID, String CHECKIN_OBS, Integer CHECKOUT_ID, String CHECKOUT_OBS, Date FECHA_CHECKIN, Date FECHA_CHECKOUT, Integer RESERVA_ID, Date FECHA_INICIO, Date FECHA_TERMINO, String PAGO_RESERVA, Integer DEPTO_ID, Integer DEPTO_NUM, String DIRECCION, String NOMBRE_EDIFICIO, Integer CLIENTE_ID, String USUARIO_NOMBRE, String USUARIO_APELLIDOS, Integer VALOR_RESERVA, Integer TIENE_TRANSPORTE, Integer VALOR_TOUR, String MOTIVO_MULTA, Integer VALOR_MULTA, Integer PAGO_MULTA) {
        this.CHECKIN_ID = CHECKIN_ID;
        this.CHECKIN_OBS = CHECKIN_OBS;
        this.CHECKOUT_ID = CHECKOUT_ID;
        this.CHECKOUT_OBS = CHECKOUT_OBS;
        this.FECHA_CHECKIN = FECHA_CHECKIN;
        this.FECHA_CHECKOUT = FECHA_CHECKOUT;
        this.RESERVA_ID = RESERVA_ID;
        this.FECHA_INICIO = FECHA_INICIO;
        this.FECHA_TERMINO = FECHA_TERMINO;
        this.PAGO_RESERVA = PAGO_RESERVA;
        this.DEPTO_ID = DEPTO_ID;
        this.DEPTO_NUM = DEPTO_NUM;
        this.DIRECCION = DIRECCION;
        this.NOMBRE_EDIFICIO = NOMBRE_EDIFICIO;
        this.CLIENTE_ID = CLIENTE_ID;
        this.USUARIO_NOMBRE = USUARIO_NOMBRE;
        this.USUARIO_APELLIDOS = USUARIO_APELLIDOS;
        this.VALOR_RESERVA = VALOR_RESERVA;
        this.TIENE_TRANSPORTE = TIENE_TRANSPORTE;
        this.VALOR_TOUR = VALOR_TOUR;
        this.MOTIVO_MULTA = MOTIVO_MULTA;
        this.VALOR_MULTA = VALOR_MULTA;
        this.PAGO_MULTA = PAGO_MULTA;
    }

    public Integer getCHECKIN_ID() {
        return CHECKIN_ID;
    }

    public void setCHECKIN_ID(Integer CHECKIN_ID) {
        this.CHECKIN_ID = CHECKIN_ID;
    }

    public Integer getCHECKOUT_ID() {
        return CHECKOUT_ID;
    }

    public void setCHECKOUT_ID(Integer CHECKOUT_ID) {
        this.CHECKOUT_ID = CHECKOUT_ID;
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

    public String getPAGO_RESERVA() {
        return   PAGO_RESERVA;
    }

    public void setPAGO_RESERVA(String   PAGO_RESERVA) {
        this.  PAGO_RESERVA =   PAGO_RESERVA;
    }

    public Integer getDEPTO_ID() {
        return DEPTO_ID;
    }

    public void setDEPTO_ID(Integer DEPTO_ID) {
        this.DEPTO_ID = DEPTO_ID;
    }

    public Integer getDEPTO_NUM() {
        return DEPTO_NUM;
    }

    public void setDEPTO_NUM(Integer DEPTO_NUM) {
        this.DEPTO_NUM = DEPTO_NUM;
    }

    public String getNOMBRE_EDIFICIO() {
        return NOMBRE_EDIFICIO;
    }

    public void setNOMBRE_EDIFICIO(String NOMBRE_EDIFICIO) {
        this.NOMBRE_EDIFICIO = NOMBRE_EDIFICIO;
    }

    public Integer getCLIENTE_ID() {
        return CLIENTE_ID;
    }

    public void setCLIENTE_ID(Integer CLIENTE_ID) {
        this.CLIENTE_ID = CLIENTE_ID;
    }

    public String getUSUARIO_NOMBRE() {
        return USUARIO_NOMBRE;
    }

    public void setUSUARIO_NOMBRE(String USUARIO_NOMBRE) {
        this.USUARIO_NOMBRE = USUARIO_NOMBRE;
    }

    public String getUSUARIO_APELLIDOS() {
        return USUARIO_APELLIDOS;
    }

    public void setUSUARIO_APELLIDOS(String USUARIO_APELLIDOS) {
        this.USUARIO_APELLIDOS = USUARIO_APELLIDOS;
    }

    public Integer getVALOR_RESERVA() {
        return VALOR_RESERVA;
    }

    public void setVALOR_RESERVA(Integer VALOR_RESERVA) {
        this.VALOR_RESERVA = VALOR_RESERVA;
    }

    public Integer getTIENE_TRANSPORTE() {
        return TIENE_TRANSPORTE;
    }

    public void setTIENE_TRANSPORTE(Integer TIENE_TRANSPORTE) {
        this.TIENE_TRANSPORTE = TIENE_TRANSPORTE;
    }

    public Integer getVALOR_TOUR() {
        return VALOR_TOUR;
    }

    public void setVALOR_TOUR(Integer VALOR_TOUR) {
        this.VALOR_TOUR = VALOR_TOUR;
    }

    public String getMOTIVO_MULTA() {
        return MOTIVO_MULTA;
    }

    public void setMOTIVO_MULTA(String MOTIVO_MULTA) {
        this.MOTIVO_MULTA = MOTIVO_MULTA;
    }

    public Integer getVALOR_MULTA() {
        return VALOR_MULTA;
    }

    public void setVALOR_MULTA(Integer VALOR_MULTA) {
        this.VALOR_MULTA = VALOR_MULTA;
    }

    public Integer getRESERVA_ID() {
        return RESERVA_ID;
    }

    public void setRESERVA_ID(Integer RESERVA_ID) {
        this.RESERVA_ID = RESERVA_ID;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public Integer getPAGO_MULTA() {
        return PAGO_MULTA;
    }

    public void setPAGO_MULTA(Integer PAGO_MULTA) {
        this.PAGO_MULTA = PAGO_MULTA;
    }

    public String getCHECKIN_OBS() {
        return CHECKIN_OBS;
    }

    public void setCHECKIN_OBS(String CHECKIN_OBS) {
        this.CHECKIN_OBS = CHECKIN_OBS;
    }

    public String getCHECKOUT_OBS() {
        return CHECKOUT_OBS;
    }

    public void setCHECKOUT_OBS(String CHECKOUT_OBS) {
        this.CHECKOUT_OBS = CHECKOUT_OBS;
    }
}
