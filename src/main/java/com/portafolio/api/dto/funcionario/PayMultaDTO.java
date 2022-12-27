package com.portafolio.api.dto.funcionario;

public class PayMultaDTO {
    private String boleta_id;
    private Integer multa_id;

    public PayMultaDTO(String boleta_id, Integer multa_id) {
        this.boleta_id = boleta_id;
        this.multa_id = multa_id;
    }

    public String getBoleta_id() {
        return boleta_id;
    }

    public void setBoleta_id(String boleta_id) {
        this.boleta_id = boleta_id;
    }

    public Integer getMulta_id() {
        return multa_id;
    }

    public void setMulta_id(Integer multa_id) {
        this.multa_id = multa_id;
    }
}
