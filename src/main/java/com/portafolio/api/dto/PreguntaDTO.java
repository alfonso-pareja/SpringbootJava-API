package com.portafolio.api.dto;

public class PreguntaDTO {

    private int id;
    private String nombre_edificio;
    private int numero;
    private  String nombre;
    private  String pregunta;

    public PreguntaDTO(int id, String nombre_edificio, int numero, String nombre, String pregunta) {
        this.id = id;
        this.nombre_edificio = nombre_edificio;
        this.numero = numero;
        this.nombre = nombre;
        this.pregunta = pregunta;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}
