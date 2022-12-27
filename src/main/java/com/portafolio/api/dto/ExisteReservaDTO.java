package com.portafolio.api.dto;

public class ExisteReservaDTO {
    private Integer existe;

    public ExisteReservaDTO(Integer existe) {
        this.existe = existe;
    }

    public Integer getExiste() {
        return existe;
    }

    public void setExiste(Integer existe) {
        this.existe = existe;
    }
}
