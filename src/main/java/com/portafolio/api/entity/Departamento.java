package com.portafolio.api.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "DEPARTAMENTO")
@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "DORMITORIOS")
    private Integer dormitorios;

    @Column(name = "MT2")
    private Integer mt2;

    @Column(name = "NUMERO")
    private Integer numero;

    @Column(name = "BANOS")
    private Integer banos;

    @Column(name = "PISO")
    private Integer piso;

    @Column(name = "FECHA_CONSTRUCCION")
    private LocalDate fechaConstruccion;

    @Column(name = "EVALUO", nullable = false)
    private Integer evaluo;

    @Column(name = "DIRECCION", nullable = false, length = 50)
    private String direccion;

    @Column(name = "VALOR_ARRIENDO", nullable = false)
    private Integer valorArriendo;

    @Column(name = "PORC_ANTICIPO", nullable = false)
    private Integer porcAnticipo;

    @Column(name = "NOMBRE_EDIFICIO", length = 30)
    private String nombreEdificio;

    @Column(name = "IMAGEN", length = 100)
    private String imagen;

    @Column(name = "IMAGEN2", length = 100)
    private String imagen2;

    @Column(name = "IMAGEN3", length = 100)
    private String imagen3;

    @Column(name = "TRANSPORTE")
    private Boolean transporte;

    @ManyToOne(optional = false)
    @JoinColumn(name = "TIPODEPARTAMENTO_ID", nullable = false)
    private TipoDepartamento tipodepartamento;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ESTADODEPARTAMENTO_ID", nullable = false)
    private EstadoDepartamento estadodepartamento;

    @ManyToOne(optional = false)
    @JoinColumn(name = "COMUNA_ID", nullable = false)
    private Comuna comuna;

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    public EstadoDepartamento getEstadodepartamento() {
        return estadodepartamento;
    }

    public void setEstadodepartamento(EstadoDepartamento estadodepartamento) {
        this.estadodepartamento = estadodepartamento;
    }

    public TipoDepartamento getTipodepartamento() {
        return tipodepartamento;
    }

    public void setTipodepartamento(TipoDepartamento tipodepartamento) {
        this.tipodepartamento = tipodepartamento;
    }

    public Boolean getTransporte() {
        return transporte;
    }

    public void setTransporte(Boolean transporte) {
        this.transporte = transporte;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public Integer getPorcAnticipo() {
        return porcAnticipo;
    }

    public void setPorcAnticipo(Integer porcAnticipo) {
        this.porcAnticipo = porcAnticipo;
    }

    public Integer getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(Integer valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEvaluo() {
        return evaluo;
    }

    public void setEvaluo(Integer evaluo) {
        this.evaluo = evaluo;
    }

    public LocalDate getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(LocalDate fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public Integer getBanos() {
        return banos;
    }

    public void setBanos(Integer banos) {
        this.banos = banos;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getMt2() {
        return mt2;
    }

    public void setMt2(Integer mt2) {
        this.mt2 = mt2;
    }

    public Integer getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(Integer dormitorios) {
        this.dormitorios = dormitorios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getImagen2() {
        return imagen2;
    }

    public void setImagen2(String imagen2) {
        this.imagen2 = imagen2;
    }

    public String getImagen3() {
        return imagen3;
    }

    public void setImagen3(String imagen3) {
        this.imagen3 = imagen3;
    }
}