package com.portafolio.api.dto;

public class TopDepartamentoDTO {

    private int departamento_id;
    private int numero;
    private int nombre_edificio;
    private String direccion;

    public TopDepartamentoDTO(int departamento_id, int numero, int nombre_edificio, String direccion) {
        this.departamento_id = departamento_id;
        this.numero = numero;
        this.nombre_edificio = nombre_edificio;
        this.direccion = direccion;
    }

    public int getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(int departamento_id) {
        this.departamento_id = departamento_id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNombre_edificio() {
        return nombre_edificio;
    }

    public void setNombre_edificio(int nombre_edificio) {
        this.nombre_edificio = nombre_edificio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
