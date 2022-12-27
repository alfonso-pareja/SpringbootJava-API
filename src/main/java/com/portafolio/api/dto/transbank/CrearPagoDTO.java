package com.portafolio.api.dto.transbank;

public class CrearPagoDTO {
    private String orden;
    private String sessionId;
    private Integer monto;
    private String returnUrl;

    public CrearPagoDTO(String orden, String sessionId, Integer monto, String returnUrl) {
        this.orden = orden;
        this.sessionId = sessionId;
        this.monto = monto;
        this.returnUrl = returnUrl;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }
}
