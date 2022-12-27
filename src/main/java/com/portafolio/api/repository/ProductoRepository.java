package com.portafolio.api.repository;

import com.portafolio.api.entity.Producto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {

    @Transactional
    @Modifying
    @Query(value =
            "INSERT INTO PRODUCTO (id, fecha_ingreso, categoriaproducto_id, codigo, descripcion, nombre, valor) " +
            "VALUES (SEQ_PRODUCTO.nextval, :fecha_ingreso, :categoriaproducto_id, :codigo, :descripcion, :nombre, :valor)", nativeQuery = true)
    void createProduct(
            @Param("fecha_ingreso") Date fecha_ingreso,
            @Param("categoriaproducto_id") int categoriaproducto_id,
            @Param("codigo") int codigo,
            @Param("descripcion") String descripcion,
            @Param("nombre") String nombre,
            @Param("valor") int valor
    );


    @Transactional
    @Modifying
    @Query(value =
            "UPDATE PRODUCTO SET " +
            "    NOMBRE = :nombre, " +
            "    CODIGO = :codigo, " +
            "    DESCRIPCION = :descripcion, " +
            "    FECHA_INGRESO = :fecha_ingreso, " +
            "    VALOR = :valor, " +
            "    CATEGORIAPRODUCTO_ID = :categoriaproducto_id " +
            "WHERE  " +
            "    ID = :id", nativeQuery = true)
    void updateProduct(
            @Param("id") int id,
            @Param("nombre") String nombre,
            @Param("codigo") int codigo,
            @Param("descripcion") String descripcion,
            @Param("fecha_ingreso") Date fecha_ingreso,
            @Param("valor") int valor,
            @Param("categoriaproducto_id") int categoriaproducto_id
    );
    
}
