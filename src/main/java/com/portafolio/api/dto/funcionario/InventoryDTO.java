package com.portafolio.api.dto.funcionario;

public class InventoryDTO {

    private Integer id;
    private Integer nombre;
    private String observacion;
    private Integer estado;
    private Integer alias;
    private Integer estadoid;

    public InventoryDTO(Integer id, Integer nombre, Integer estado, Integer alias, Integer estadoid) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.alias = alias;
        this.estadoid = estadoid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getAlias() {
        return alias;
    }

    public void setAlias(Integer alias) {
        this.alias = alias;
    }

    public Integer getEstadoid() {
        return estadoid;
    }

    public void setEstadoid(Integer estadoid) {
        this.estadoid = estadoid;
    }
}
