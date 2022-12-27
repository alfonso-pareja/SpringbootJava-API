package com.portafolio.api.dto;

public class FuncionarioDTO {

    private Integer id;
    private String nombre;
    private Integer rol_id;
    private Boolean chofer_activo;

    public FuncionarioDTO(Integer id, String nombre, Integer rol_id, Boolean chofer_activo) {
        this.id = id;
        this.nombre = nombre;
        this.rol_id = rol_id;
        this.chofer_activo = chofer_activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getRol_id() {
        return rol_id;
    }

    public void setRol_id(Integer rol_id) {
        this.rol_id = rol_id;
    }

    public Boolean getChofer_activo() {
        return chofer_activo;
    }

    public void setChofer_activo(Boolean chofer_activo) {
        this.chofer_activo = chofer_activo;
    }
}
