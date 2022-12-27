package com.portafolio.api.dto;

public class EditarMantencionObservacionDTO {
    private int id;
    private int usuario_id;
    private String observaciones;

    public EditarMantencionObservacionDTO(int id, int usuario_id, String observaciones) {
        this.id = id;
        this.usuario_id = usuario_id;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
