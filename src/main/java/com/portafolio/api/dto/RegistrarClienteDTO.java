package com.portafolio.api.dto;

import java.util.Date;

public class RegistrarClienteDTO {

    private int id;
    private String rut;
    private String nombre;
    private String apellidos;
    private String correo;
    private String clave;
    private Date fecha_ingreso;
    private String direccion;
    private String telefono;
    private Boolean chofer_activo;
    private Boolean licencia;
    private int rol_id;

    public RegistrarClienteDTO(int id, String rut, String nombre, String apellidos, String correo, String clave, Date fecha_ingreso, String direccion, String telefono, Boolean chofer_activo, Boolean licencia, int rol_id) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.clave = clave;
        this.fecha_ingreso = fecha_ingreso;
        this.direccion = direccion;
        this.telefono = telefono;
        this.chofer_activo = chofer_activo;
        this.licencia = licencia;
        this.rol_id = rol_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Boolean getChofer_activo() {
        return chofer_activo;
    }

    public void setChofer_activo(Boolean chofer_activo) {
        this.chofer_activo = chofer_activo;
    }

    public Boolean getLicencia() {
        return licencia;
    }

    public void setLicencia(Boolean licencia) {
        this.licencia = licencia;
    }
}
