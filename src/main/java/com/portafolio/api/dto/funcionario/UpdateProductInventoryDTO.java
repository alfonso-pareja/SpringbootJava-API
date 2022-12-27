package com.portafolio.api.dto.funcionario;

public class UpdateProductInventoryDTO {
    private Integer id;
    private String respuesta;

    public UpdateProductInventoryDTO(Integer id, String respuesta) {
        this.id = id;
        this.respuesta = respuesta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

}
