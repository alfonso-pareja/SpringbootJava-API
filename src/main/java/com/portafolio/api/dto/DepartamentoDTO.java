package com.portafolio.api.dto;

import java.util.Date;

public class DepartamentoDTO {
    private Integer id;
    private Integer dormitorios;
    private Integer mt2;
    private Integer numero;
    private Integer banos;
    private Integer piso;
    private Date fecha_construccion;
    private Integer evaluo;
    private String direccion;
    private Integer valor_arriendo;
    private Integer porc_anticipo;
    private String nombre_edificio;
    private Integer tipodepartamento_id;
    private Integer estadodepartamento_id;
    private Integer comuna_id;
    private String imagen;
    private String imagen2;
    private String imagen3;

    public DepartamentoDTO(Integer id, Integer dormitorios, Integer mt2, Integer numero, Integer banos, Integer piso, Date fecha_contruccion, Integer evaluo, String direccion, Integer valor_arriendo, Integer porc_anticipo, String nombre_edificio, Integer tipodepartamento_id, Integer estadodepartamento_id, Integer comuna_id, String imagen, String imagen2, String imagen3) {
        this.id = id;
        this.dormitorios = dormitorios;
        this.mt2 = mt2;
        this.numero = numero;
        this.banos = banos;
        this.piso = piso;
        this.fecha_construccion = fecha_contruccion;
        this.evaluo = evaluo;
        this.direccion = direccion;
        this.valor_arriendo = valor_arriendo;
        this.porc_anticipo = porc_anticipo;
        this.nombre_edificio = nombre_edificio;
        this.tipodepartamento_id = tipodepartamento_id;
        this.estadodepartamento_id = estadodepartamento_id;
        this.comuna_id = comuna_id;
        this.imagen = imagen;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(Integer dormitorios) {
        this.dormitorios = dormitorios;
    }

    public Integer getMt2() {
        return mt2;
    }

    public void setMt2(Integer mt2) {
        this.mt2 = mt2;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getBanos() {
        return banos;
    }

    public void setBanos(Integer banos) {
        this.banos = banos;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public Date getFecha_construccion() {
        return fecha_construccion;
    }

    public void setFecha_construccion(Date fecha_construccion) {
        this.fecha_construccion = fecha_construccion;
    }

    public Integer getEvaluo() {
        return evaluo;
    }

    public void setEvaluo(Integer evaluo) {
        this.evaluo = evaluo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getValor_arriendo() {
        return valor_arriendo;
    }

    public void setValor_arriendo(Integer valor_arriendo) {
        this.valor_arriendo = valor_arriendo;
    }

    public Integer getPorc_anticipo() {
        return porc_anticipo;
    }

    public void setPorc_anticipo(Integer porc_anticipo) {
        this.porc_anticipo = porc_anticipo;
    }

    public String getNombre_edificio() {
        return nombre_edificio;
    }

    public void setNombre_edificio(String nombre_edificio) {
        this.nombre_edificio = nombre_edificio;
    }

    public Integer getTipodepartamento_id() {
        return tipodepartamento_id;
    }

    public void setTipodepartamento_id(Integer tipodepartamento_id) {
        this.tipodepartamento_id = tipodepartamento_id;
    }

    public Integer getEstadodepartamento_id() {
        return estadodepartamento_id;
    }

    public void setEstadodepartamento_id(Integer estadodepartamento_id) {
        this.estadodepartamento_id = estadodepartamento_id;
    }

    public Integer getComuna_id() {
        return comuna_id;
    }

    public void setComuna_id(Integer comuna_id) {
        this.comuna_id = comuna_id;
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
