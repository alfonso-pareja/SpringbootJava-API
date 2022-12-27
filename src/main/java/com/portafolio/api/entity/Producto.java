package com.portafolio.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "PRODUCTO")
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NOMBRE", nullable = false, length = 30)
    private String nombre;

    @Column(name = "CODIGO", nullable = false, precision=10, scale=0)
    private Long codigo;

    @Column(name = "DESCRIPCION", length = 300)
    private String descripcion;

    @Column(name = "FECHA_INGRESO")
    private LocalDate fechaIngreso;

    @Column(name = "VALOR", nullable = false, precision=10, scale=0)
    private Long valor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "CATEGORIAPRODUCTO_ID", nullable = false)
    private CategoriaProducto categoriaproducto;

    public CategoriaProducto getCategoriaproducto() {
        return categoriaproducto;
    }

    public void setCategoriaproducto(CategoriaProducto categoriaproducto) {
        this.categoriaproducto = categoriaproducto;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}