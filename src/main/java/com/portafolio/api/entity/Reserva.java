package com.portafolio.api.entity;

import javax.persistence.*;
import java.time.LocalDate;


@Table(name = "RESERVA")
@Entity public class Reserva{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "ESTADO")
    private boolean estado;

    @Column(name = "CREATED_AT")
    private LocalDate created_at;

    @ManyToOne(optional = false)
    @JoinColumn(name = "DEPARTAMENTO_ID", nullable = false)
    private Departamento departamento;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }


}
