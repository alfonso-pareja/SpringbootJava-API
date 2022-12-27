package com.portafolio.api.repository;

import com.portafolio.api.dto.*;
import com.portafolio.api.dto.funcionario.LastInventoryDTO;
import com.portafolio.api.dto.funcionario.LastMantencionDTO;
import com.portafolio.api.dto.funcionario.MantencionDetailDTO;
import com.portafolio.api.dto.funcionario.transporteDTO;
import com.portafolio.api.entity.Usuario;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface FuncionarioRepository extends CrudRepository<Usuario,Integer> {
    //LIST INVENTORY ASSIGNMENT
    @Query(value=
            "SELECT   " +
            "    i.id as codigo,  " +
            "    i.nombre as nombre_inventario,  " +
            "    u.nombre || ' ' || u.apellidos as nombre_funcionario,  " +
            "    i.fecha_inicio,  " +
            "    i.fecha_termino,  " +
            "    i.observaciones as observacion,  " +
            "    i.descripcion, " +
            "    d.id depto_id, " +
            "    d.numero, " +
            "    d.nombre_edificio, " +
            "    ei.nombre estadoNombre, " +
            "    ei.alias estadoAlias " +
            "FROM USUARIO u  " +
            "INNER JOIN INVENTARIO i on u.id = i.usuario_id   " +
            "INNER JOIN INVENTARIO_DEPARTAMENTO ind ON i.id = ind.INVENTARIO_ID " +
            "INNER JOIN DEPARTAMENTO d ON d.id = ind.DEPARTAMENTO_ID " +
            "LEFT JOIN ESTADO_INVENTARIO ei ON ei.id = i.estado_inventario_id " +
            "WHERE " +
            "   u.ID = :id " +
            "ORDER BY i.ID DESC, ei.alias desc", nativeQuery = true)
    List<Map<String, ListaInventarioDTO>> findInventoryByUser(@Param("id")int id);


    //5 LAST INVENTORY BY ID
    @Query(value="SELECT i.id as codigo, i.nombre as nombre_inventario,u.nombre as nombre_funcionario, i.fecha_inicio, i.fecha_termino, i.observaciones, i.descripcion FROM usuario u INNER JOIN inventario i ON u.id = i.usuario_id where u.id=:id order by fecha_termino DESC FETCH FIRST 5 ROW ONLY", nativeQuery = true)
    List<Map<String, ListaInventarioIdDTO>> findLastInventoryByUser(@Param("id")int id);

    //INVENTORY OBSERVATIONS
    @Modifying
    @Query(value = "UPDATE inventario i SET i.observaciones = :observaciones WHERE i.id = :id", nativeQuery = true)
    int updateInventarioObservacion(@Param("id")int id, @Param("observaciones") String observaciones);

/**
    @Transactional
    @Modifying
    @Query(value = "UPDATE inventario i SET i.usuario_id = :usuario_id, i.fecha_inicio = :fecha_inicio, i.fecha_termino = :fecha_termino, i.observaciones = :observaciones, i.descripcion = :descripcion WHERE i.id = :id",nativeQuery = true)
    void updateAsignacionInventario (@Param("id") int id, @Param("fecha_inicio") Date fecha_inicio, @Param("fecha_termino") Date fecha_termino, @Param("observaciones") String observaciones, @Param("descripcion") String descripcion, @Param("usuario_id") int usuario_id);
 */

    //INVENTORY DESCRIPTION
    @Modifying
    @Query(value = "UPDATE inventario i SET i.descripcion = :descripcion WHERE i.id = :id", nativeQuery = true)
    int updateInventarioDescripcion(@Param("id")int id, @Param("descripcion") String descripcion);

    //LIST MAINTENANCE ASSIGNMENT
    @Query(value=
            "SELECT  " +
            "    m.id as codigo, " +
            "    u.nombre as nombre_funcionario,  " +
            "    m.nombre,  " +
            "    m.descripcion,  " +
            "    m.fecha_inicio,  " +
            "    m.fecha_termino,  " +
            "    m.observaciones,  " +
            "    m.COSTO,  " +
            "    m.ESTADO, " +
            "    d.id depto_id, " +
            "    d.numero, " +
            "    d.nombre_edificio, " +
            "    d.direccion " +
            "FROM USUARIO U  " +
            "inner join MANTENCION m on u.id=m.usuario_id  " +
            "inner join MANTENCION_DEPARTAMENTO mt ON mt.mantencion_id = m.id " +
            "inner join DEPARTAMENTO d ON mt.departamento_id = d.id " +
            "where  " +
            "    u.id = :id", nativeQuery = true)
    List<Map<String, ListaMantencionDTO>> findMaintenanceByUser(@Param("id")int id);

    @Query(value=
            "SELECT " +
            "   ID, " +
            "   NOMBRE,  " +
            "   DESCRIPCION,  " +
            "   FECHA_INICIO, " +
            "   OBSERVACIONES, " +
            "   COSTO, " +
            "   ESTADO " +
            "FROM MANTENCION WHERE ID = :id", nativeQuery = true)
    List<Map<String, MantencionDetailDTO>> findMaintenanceByid(@Param("id")int id);

    @Transactional
    @Modifying
    @Query(value =
            "UPDATE MANTENCION " +
            "SET ESTADO = :estado, " +
            "   COSTO = :costo, " +
            "   OBSERVACIONES = :observaciones " +
            "WHERE ID = :id", nativeQuery = true)
    void updateMantencion(
            @Param("id")int id,
            @Param("estado") String estado,
            @Param("costo") Integer costo,
            @Param("observaciones") String observaciones);

    //5 LAST MAINTENANCE BY ID
    @Query(value="SELECT m.id as codigo, u.nombre as nombre_funcionario, m.fecha_inicio, m.fecha_termino, m.observaciones FROM USUARIO U INNER JOIN MANTENCION M ON U.id = M.USUARIO_id where U.id=:id order by m.fecha_termino DESC FETCH FIRST 5 ROW ONLY", nativeQuery = true)
    List<Map<String, ListaMantencionIdDTO>> findLastMaintenance(@Param("id")int id);

    //MAINTENANCE OBSERVATIONS
    @Modifying
    @Query(value = "UPDATE mantencion m SET m.observaciones = :observaciones WHERE m.id = :id", nativeQuery = true)
    int updateMantencionObservaciones(@Param("id")int id, @Param("observaciones") String observaciones);

    //MAINTENANCE COST
    @Modifying
    @Query(value = "UPDATE mantencion m SET m.costo = :costo WHERE m.id= :id", nativeQuery = true)
    int updateMantecionCosto(@Param("id")int id, @Param("costo") Integer costo);

    //DEPARTMENT DESCRIPTION
    @Query(value="SELECT d.id, d.numero, d.dormitorios, d.mt2, d.banos,d.piso, u.nombre, u.apellidos,u.correo from USUARIO U inner join CHECKIN c on U.id=c.USUARIO_id inner join DEPARTAMENTO D on D.id=c.DEPARTAMENTO_ID WHERE c.usuario_id=:id2", nativeQuery = true)
    List<Map<String, DeptoCheckinDetalleDTO>> DeptoDetail(@Param("id")int id, @Param("id2")int id2);



    //LIST RESERVATION BY USER
    @Query(value="SELECT r.id codigo, d.nombre_edificio, d.numero, c.nombre, r.created_at fecha ,u.NOMBRE as nombre_funcionario, r.FECHA_INICIO, r.FECHA_TERMINO FROM reserva r INNER JOIN departamento d ON d.id = r.departamento_id INNER JOIN cliente c ON r.cliente_id = c.id LEFT JOIN coordreserva cr ON r.id = cr.reserva_id  INNER join  CHECKIN ch on ch.reserva_id=r.ID inner join USUARIO u on ch.USUARIO_id=u.id WHERE u.id=:id", nativeQuery = true)
    List<Map<String, ListaReservacionFuncionarioDTO>> findReservationByUser(@Param("id")int id);

    //CHECK IN OBSERVATIONS
    @Modifying
    @Query(value = "UPDATE  pregunta p set p.observacion = :observacion WHERE p.id=:id", nativeQuery = true)
    int updateObservacionCheckin(@Param("id")int id,  @Param("observacion") String observacion);

    //CHECKIN RESPUESTA_CI
    @Modifying
    @Query(value = "UPDATE  pregunta p set p.respuesta_ci = :respuesta_ci WHERE p.id=:id", nativeQuery = true)
    int updateRespuestaCheckin(@Param("id")int id,  @Param("respuesta_ci") String respuesta_ci);

    //CHECKIN RESPUESTA_CO
    @Modifying
    @Query(value = "UPDATE  pregunta p set p.respuesta_co = :respuesta_co WHERE p.id=:id", nativeQuery = true)
    int updateRespuestaCheckout(@Param("id")int id,  @Param("respuesta_co") String respuesta_co);


    // Transporte

    @Query(value=
            "SELECT " +
            "   ID, " +
            "   ORIGEN, " +
            "   DESTINO, " +
            "   VEHICULO, " +
            "   PATENTE, " +
            "   FECHA, " +
            "   ESTADO, " +
            "   FLAG_RESERVA RESERVA " +
            "FROM COORDTRANSPORTE " +
            "WHERE USUARIO_ID = :id", nativeQuery = true)
    List<Map<String, transporteDTO>> transportes(@Param("id") int id);

    @Transactional
    @Modifying
    @Query(value =
            "UPDATE COORDTRANSPORTE " +
            "   SET ESTADO = :estado " +
            "WHERE ID = :id", nativeQuery = true)
    void updateEstadoTransporte(
            @Param("id") int id,
            @Param("estado") String estado);


    @Query(value=
            "SELECT  " +
            "    I.ID, " +
            "    I.NOMBRE, " +
            "    I.FECHA_INICIO, " +
            "    EI.NOMBRE ESTADO " +
            "FROM INVENTARIO I " +
            "INNER JOIN ESTADO_INVENTARIO EI ON I.ESTADO_INVENTARIO_ID = EI.ID " +
            "WHERE I.ESTADO_INVENTARIO_ID = 1 AND USUARIO_ID = :id " +
            "ORDER BY I.ID DESC FETCH " +
            "FIRST 5 ROW ONLY", nativeQuery = true)
    List<Map<String, LastInventoryDTO>> lastInventory(@Param("id") int id);


    @Query(value=
            "SELECT " +
            "    ID, " +
            "    NOMBRE, " +
            "    FECHA_INICIO, " +
            "    ESTADO " +
            "FROM MANTENCION " +
            "WHERE ESTADO = 'FINALIZADO' AND USUARIO_ID = :id " +
            "ORDER BY ID DESC  " +
            "FETCH FIRST 5 ROW ONLY", nativeQuery = true)
    List<Map<String, LastMantencionDTO>> lastMantencion(@Param("id") int id);

}
