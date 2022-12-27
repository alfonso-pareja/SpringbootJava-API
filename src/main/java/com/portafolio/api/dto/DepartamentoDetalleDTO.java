package com.portafolio.api.dto;

import java.util.Date;

public class DepartamentoDetalleDTO {

    private int id;
    private String nombre_edificio;
    private int piso;
    private int valor_arriendo;
    private int dormitorios;
    private int banos;
    private int porc_anticipo;
    private int evaluo;
    private Date fecha_construccion;
    private int numero;
    private String direccion;
    private String imagen;
    private String imagen2;
    private String imagen3;

    public DepartamentoDetalleDTO(int id, String nombre_edificio, int piso, int valor_arriendo, int dormitorios, int banos, int porc_anticipo, int evaluo, Date fecha_construccion, int numero, String direccion, String imagen, String imagen2, String imagen3) {
        this.id = id;
        this.nombre_edificio = nombre_edificio;
        this.piso = piso;
        this.valor_arriendo = valor_arriendo;
        this.dormitorios = dormitorios;
        this.banos = banos;
        this.porc_anticipo = porc_anticipo;
        this.evaluo = evaluo;
        this.fecha_construccion = fecha_construccion;
        this.numero = numero;
        this.direccion = direccion;
        this.imagen = imagen;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_edificio() {
        return nombre_edificio;
    }

    public void setNombre_edificio(String nombre_edificio) {
        this.nombre_edificio = nombre_edificio;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getValor_arriendo() {
        return valor_arriendo;
    }

    public void setValor_arriendo(int valor_arriendo) {
        this.valor_arriendo = valor_arriendo;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public int getPorc_anticipo() {
        return porc_anticipo;
    }

    public void setPorc_anticipo(int porc_anticipo) {
        this.porc_anticipo = porc_anticipo;
    }

    public int getEvaluo() {
        return evaluo;
    }

    public void setEvaluo(int evaluo) {
        this.evaluo = evaluo;
    }

    public Date getFecha_construccion() {
        return fecha_construccion;
    }

    public void setFecha_construccion(Date fecha_construccion) {
        this.fecha_construccion = fecha_construccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getImagen2() {
        return imagen2;
    }

    public void setImagen2(String imagen2) {
        this.imagen2 = imagen2;
    }

    public String getImagen3() {
        return imagen3;
    }

    public void setImagen3(String imagen3) {
        this.imagen3 = imagen3;
    }
}
