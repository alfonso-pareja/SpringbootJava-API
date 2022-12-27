package com.portafolio.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "CHECKIN")
@Entity
public class Check {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

}
