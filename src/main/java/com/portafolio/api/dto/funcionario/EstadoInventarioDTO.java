package com.portafolio.api.dto.funcionario;

public class EstadoInventarioDTO {
    private Integer id;
    private String nombre;
    private String alias;

    public EstadoInventarioDTO(Integer id, String nombre, String alias) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
