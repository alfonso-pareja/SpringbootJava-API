package com.portafolio.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "INVENTARIO")
@Entity
public class Inventory {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;
}
