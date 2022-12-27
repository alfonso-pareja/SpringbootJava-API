package com.portafolio.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ESTADO_DEPARTAMENTO")
@Entity
public class EstadoDepartamento {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}