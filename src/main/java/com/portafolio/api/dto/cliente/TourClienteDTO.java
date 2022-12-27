package com.portafolio.api.dto.cliente;

public class TourClienteDTO {

    private String id;
    private String nombre;
    private String descripcion;
    private String ubicacion;
    private String valor;
    private String fecha_inicio;
    private String fecha_termino;
    private String comuna_id;
    private String transporte;
    private String image;
    private String image2;
    private String image3;
    private String comuna_nombre;
    private String ciudad_nombre;

    public TourClienteDTO(String id, String nombre, String descripcion, String ubicacion, String valor, String fecha_inicio, String fecha_termino, String comuna_id, String transporte, String image, String image2, String image3, String comuna_nombre, String ciudad_nombre) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.valor = valor;
        this.fecha_inicio = fecha_inicio;
        this.fecha_termino = fecha_termino;
        this.comuna_id = comuna_id;
        this.transporte = transporte;
        this.image = image;
        this.image2 = image2;
        this.image3 = image3;
        this.comuna_nombre = comuna_nombre;
        this.ciudad_nombre = ciudad_nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_termino() {
        return fecha_termino;
    }

    public void setFecha_termino(String fecha_termino) {
        this.fecha_termino = fecha_termino;
    }

    public String getComuna_id() {
        return comuna_id;
    }

    public void setComuna_id(String comuna_id) {
        this.comuna_id = comuna_id;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getComuna_nombre() {
        return comuna_nombre;
    }

    public void setComuna_nombre(String comuna_nombre) {
        this.comuna_nombre = comuna_nombre;
    }

    public String getCiudad_nombre() {
        return ciudad_nombre;
    }

    public void setCiudad_nombre(String ciudad_nombre) {
        this.ciudad_nombre = ciudad_nombre;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }
}
