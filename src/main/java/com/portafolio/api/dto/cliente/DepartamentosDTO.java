package com.portafolio.api.dto.cliente;

public class DepartamentosDTO {

    private Integer id;
    private Integer dormitorios;
    private Integer mt2;
    private Integer numero;
    private Integer banos;
    private Integer piso;
    private String nombre_edificio;
    private String direccion;
    private Integer valor_arriendo;
    private Integer porc_anticipo;
    private String imagen;
    private String imagen2;
    private String imagen3;
    private Integer tipo_id;
    private String  tipo;
    private Integer comuna_id;

    public DepartamentosDTO(Integer id, Integer dormitorios, Integer mt2, Integer numero, Integer banos, Integer piso, String nombre_edificio, String direccion, Integer valor_arriendo, Integer porc_anticipo, String imagen, String imagen2, String imagen3, Integer tipo_id, String tipo, Integer comuna_id) {
        this.id = id;
        this.dormitorios = dormitorios;
        this.mt2 = mt2;
        this.numero = numero;
        this.banos = banos;
        this.piso = piso;
        this.nombre_edificio = nombre_edificio;
        this.direccion = direccion;
        this.valor_arriendo = valor_arriendo;
        this.porc_anticipo = porc_anticipo;
        this.imagen = imagen;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
        this.tipo_id = tipo_id;
        this.tipo = tipo;
        this.comuna_id = comuna_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(Integer dormitorios) {
        this.dormitorios = dormitorios;
    }

    public Integer getMt2() {
        return mt2;
    }

    public void setMt2(Integer mt2) {
        this.mt2 = mt2;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getBanos() {
        return banos;
    }

    public void setBanos(Integer banos) {
        this.banos = banos;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getNombre_edificio() {
        return nombre_edificio;
    }

    public void setNombre_edificio(String nombre_edificio) {
        this.nombre_edificio = nombre_edificio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getValor_arriendo() {
        return valor_arriendo;
    }

    public void setValor_arriendo(Integer valor_arriendo) {
        this.valor_arriendo = valor_arriendo;
    }

    public Integer getPorc_anticipo() {
        return porc_anticipo;
    }

    public void setPorc_anticipo(Integer porc_anticipo) {
        this.porc_anticipo = porc_anticipo;
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

    public Integer getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(Integer tipo_id) {
        this.tipo_id = tipo_id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getComuna_id() {
        return comuna_id;
    }

    public void setComuna_id(Integer comuna_id) {
        this.comuna_id = comuna_id;
    }
}
