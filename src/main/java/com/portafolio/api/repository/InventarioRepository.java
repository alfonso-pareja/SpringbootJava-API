package com.portafolio.api.repository;

import com.portafolio.api.dto.funcionario.EstadoInventarioDTO;
import com.portafolio.api.dto.funcionario.InventoryDTO;
import com.portafolio.api.dto.funcionario.ProductsInventoryDTO;
import com.portafolio.api.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public interface InventarioRepository extends JpaRepository<Inventory, Integer> {


    @Query(value =
            "SELECT  " +
                    "    I.ID, " +
                    "    I.NOMBRE, " +
                    "    I.OBSERVACIONES as OBSERVACION, " +
                    "    EI.NOMBRE ESTADO,  " +
                    "    EI.ALIAS, " +
                    "    EI.ID ESTADOID " +
                    "FROM INVENTARIO I " +
                    "LEFT JOIN ESTADO_INVENTARIO EI ON I.ESTADO_INVENTARIO_ID = EI.ID " +
                    "WHERE I.ID = :inventario_id", nativeQuery = true)
    List<Map<String, InventoryDTO>> Inventory(
            @Param("inventario_id") int inventario_id
    );

    @Query(value =
            "SELECT  " +
            "    IP.ID,  " +
            "    IP.INVENTARIO_ID, " +
            "    IP.RESPUESTA,  " +
            "    P.NOMBRE, " +
            "    PD.CANTIDAD " +
            "FROM INVENTARIO_PRODUCTO IP " +
            "INNER JOIN PRODUCTO P ON IP.PRODUCTO_ID = P.ID " +
            " INNER JOIN PRODUCTO_DEPARTAMENTO PD ON P.ID = PD.PRODUCTO_ID " +
            "WHERE " +
            "   IP.INVENTARIO_ID = :inventario_id AND " +
            "   PD.DEPARTAMENTO_ID = :departamento_id ", nativeQuery = true)
    List<Map<String, ProductsInventoryDTO>> ListProducts(
            @Param("inventario_id") int inventario_id,
            @Param("departamento_id") int departamento_id
    );

    @Query(value = "SELECT ID, NOMBRE, ALIAS FROM ESTADO_INVENTARIO", nativeQuery = true)
    List<Map<String, EstadoInventarioDTO>> EstadoInventario();

    @Transactional
    @Modifying
    @Query(value =
            "UPDATE " +
                "INVENTARIO_PRODUCTO " +
            "SET RESPUESTA = :respuesta " +
            "WHERE ID = :id", nativeQuery = true)
    void UpdateProducts(
            @Param("respuesta") String respuesta,
            @Param("id") int id
    );

    @Transactional
    @Modifying
    @Query(value =
            "UPDATE " +
                "INVENTARIO " +
            "SET ESTADO_INVENTARIO_ID = :estado_id, " +
                "FECHA_TERMINO = :fecha_termino, " +
                "OBSERVACIONES = :observacion " +
            "WHERE ID = :id", nativeQuery = true)
    void UpdateInventory(
            @Param("estado_id") int estado_id,
            @Param("fecha_termino") Date fecha_termino,
            @Param("observacion") String observacion,
            @Param("id") int id
    );

}
