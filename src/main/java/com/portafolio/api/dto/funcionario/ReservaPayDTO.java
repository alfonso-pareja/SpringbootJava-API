package com.portafolio.api.dto.funcionario;

public class ReservaPayDTO {
    private Integer id;
    private String boleta_id;

    public ReservaPayDTO(Integer id, String boleta_id) {
        this.id = id;
        this.boleta_id = boleta_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBoleta_id() {
        return boleta_id;
    }

    public void setBoleta_id(String boleta_id) {
        this.boleta_id = boleta_id;
    }
}
