package com.portafolio.api.dto;

public class ProductoDeptoDTO {

    private int id;
    private int departamento_id;
    private int producto_id;
    private int cantidad;

    public ProductoDeptoDTO(int id, int departamento_id, int producto_id, int cantidad) {
        this.id = id;
        this.departamento_id = departamento_id;
        this.producto_id = producto_id;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(int departamento_id) {
        this.departamento_id = departamento_id;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
