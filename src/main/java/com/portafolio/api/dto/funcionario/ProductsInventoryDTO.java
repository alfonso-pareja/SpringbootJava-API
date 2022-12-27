package com.portafolio.api.dto.funcionario;

public class ProductsInventoryDTO {

    private Integer id;
    private Integer inventario_id;
    private String respuesta;
    private String nombre;

    public ProductsInventoryDTO(Integer id, Integer inventario_id, String respuesta, String nombre) {
        this.id = id;
        this.inventario_id = inventario_id;
        this.respuesta = respuesta;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInventario_id() {
        return inventario_id;
    }

    public void setInventario_id(Integer inventario_id) {
        this.inventario_id = inventario_id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

