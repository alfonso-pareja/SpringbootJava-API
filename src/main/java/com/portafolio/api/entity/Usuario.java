package com.portafolio.api.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Table(name = "USUARIO")
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "RUT", nullable = false, length = 12)
    private String rut;

    @Column(name = "NOMBRE", nullable = false, length = 30)
    private String nombre;

    @Column(name = "APELLIDOS", nullable = false, length = 40)
    private String apellidos;

    @Column(name = "CORREO", length = 40)
    private String correo;

    @Column(name = "CLAVE", length = 60)
    private String clave;

    @Column(name = "FECHA_INGRESO")
    private Date fechaIngreso;

    @Column(name = "DIRECCION", length = 40)
    private String direccion;

    @Column(name = "TELEFONO", length = 12)
    private String telefono;

    @Column(name = "ACTIVO")
    private Boolean activo;

    @Column(name = "LICENCIA", length = 12)
    private String licencia;

    @Column(name = "CHOFER_ACTIVO")
    private Boolean choferActivo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ROL_ID")
    private Rol rol;

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Boolean getChoferActivo() {
        return choferActivo;
    }

    public void setChoferActivo(Boolean choferActivo) {
        this.choferActivo = choferActivo;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}