package com.portafolio.api.dto.funcionario;

public class updateMantencionDTO {
    private Integer id;
    private String estado;
    private Integer costo;
    private String observaciones;

    public updateMantencionDTO(Integer id, String estado, Integer costo, String observaciones) {
        this.id = id;
        this.estado = estado;
        this.costo = costo;
        this.observaciones = observaciones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
