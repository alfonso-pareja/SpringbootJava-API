package com.portafolio.api.dto;

public class EditarObservacionCheckinDTO {
   private int id;
   private String observacion;

    public EditarObservacionCheckinDTO(int id,  String observacion) {
        this.id = id;
        this.observacion = observacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
