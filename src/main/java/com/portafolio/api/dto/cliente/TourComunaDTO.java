package com.portafolio.api.dto.cliente;

import java.util.Date;

public class TourComunaDTO {

    private Integer ID;
    private String NOMBRE;
    private String DESCRIPCION;
    private String UBICACION;
    private Integer VALOR;
    private Date FECHA_INICIO;
    private Date FECHA_TERMINO;

    public TourComunaDTO(Integer ID, String NOMBRE, String DESCRIPCION, String UBICACION, Integer VALOR, Date FECHA_INICIO, Date FECHA_TERMINO) {
        this.ID = ID;
        this.NOMBRE = NOMBRE;
        this.DESCRIPCION = DESCRIPCION;
        this.UBICACION = UBICACION;
        this.VALOR = VALOR;
        this.FECHA_INICIO = FECHA_INICIO;
        this.FECHA_TERMINO = FECHA_TERMINO;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getUBICACION() {
        return UBICACION;
    }

    public void setUBICACION(String UBICACION) {
        this.UBICACION = UBICACION;
    }

    public Integer getVALOR() {
        return VALOR;
    }

    public void setVALOR(Integer VALOR) {
        this.VALOR = VALOR;
    }

    public Date getFECHA_INICIO() {
        return FECHA_INICIO;
    }

    public void setFECHA_INICIO(Date FECHA_INICIO) {
        this.FECHA_INICIO = FECHA_INICIO;
    }

    public Date getFECHA_TERMINO() {
        return FECHA_TERMINO;
    }

    public void setFECHA_TERMINO(Date FECHA_TERMINO) {
        this.FECHA_TERMINO = FECHA_TERMINO;
    }
}
