package com.portafolio.api.repository;

import com.portafolio.api.dto.cliente.ClienteReservaDTO;
import com.portafolio.api.dto.*;
import com.portafolio.api.dto.funcionario.ReservaFuncionarioDTO;
import com.portafolio.api.entity.Reserva;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;


import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ReservaRepository extends CrudRepository<Reserva, Integer>{

    //RESERVATIONS LIST
    @Query(value=
            "SELECT " +
            "    r.id, " +
            "    d.nombre_edificio, " +
            "    d.numero, " +
            "    c.nombre, " +
            "    r.created_at as fecha_creacion, " +
            "    r.fecha_inicio, " +
            "    r.fecha_termino, " +
            "    count(cr.reserva_id) as transporte, " +
            "    r.estado, r.origen, d.direccion as destino, r.transporte requiereTransporte " +
            "FROM reserva r " +
            "INNER JOIN departamento d ON d.id = r.departamento_id " +
            "INNER JOIN usuario c ON r.cliente_id = c.id " +
            "LEFT JOIN coordreserva cr ON r.id = cr.reserva_id " +
            "GROUP BY r.id, d.nombre_edificio, d.numero, c.nombre, r.created_at, r.fecha_inicio, r.fecha_termino, r.ESTADO, r.origen, d.direccion, r.transporte " +
            "ORDER BY r.created_at DESC", nativeQuery = true)
    List<Map<String, ReservaDTO>> findAllReservations(@Param("estado")String estado);

    //RESERVATION DETAIL
    @Query(value=
            "SELECT " +
                "r.id, " +
                "d.nombre_edificio, " +
                "d.numero, " +
                "d.direccion, " +
                "c.nombre, " +
                "d.valor_arriendo, " +
                "d.porc_anticipo, " +
                "m.valor " +
            "FROM reserva r " +
            "INNER JOIN departamento d ON d.id = r.departamento_id " +
            "INNER JOIN usuario c ON r.cliente_id = c.id " +
            "LEFT JOIN checkin ck ON r.id = ck.reserva_id " +
            "LEFT JOIN checkout co ON ck.id = co.checkin_id " +
            "LEFT JOIN multa m ON r.multa_id = m.id " +
            "WHERE r.id = :id",nativeQuery = true)
    List<Map<String, EstadoReservaDTO>> findReservaDetailById(@Param("id")int id);

    //RESERVATION DETAIL Funcionario
    @Query(value=
            "SELECT " +
            "    r.id reservaId, " +
            "    r.fecha_inicio reservaInicio, " +
            "    r.fecha_termino reservaTermino, " +
            "    r.cantidad_adultos cantidadAdultos, " +
            "    r.cantidad_ninos cantidadNinos, " +
            "    r.costo reservaCosto, " +
            "    r.total reservaTotal, " +
            "    (r.total - r.costo) diferencia, " +
            "    r.boleta_id, " +
            "    d.id departamento_id, " +
            "    d.nombre_edificio,  " +
            "    d.numero,  " +
            "    d.direccion,  " +
            "    d.valor_arriendo,  " +
            "    d.porc_anticipo,  " +
            "    c.nombre,  " +
            "    c.apellidos,  " +
            "    m.valor, " +
            "    ck.id checkin_id, " +
            "    ck.observacion observacion_ci, " +
            "    co.observacion observacion_co, " +
            "    co.id checkout_id, " +
            "    r.multa_id, " +
            "    m.nombre nombreMulta, " +
            "    m.boleta_id pagoMulta, " +
            "    m.valor valorMulta " +
            "FROM reserva r  " +
            "INNER JOIN departamento d ON d.id = r.departamento_id  " +
            "INNER JOIN usuario c ON r.cliente_id = c.id  " +
            "LEFT JOIN checkin ck ON r.id = ck.reserva_id  " +
            "LEFT JOIN checkout co ON ck.id = co.checkin_id  " +
            "LEFT JOIN multa m ON r.multa_id = m.id  " +
            "WHERE r.id = :id" , nativeQuery = true)
    List<Map<String, ReservaFuncionarioDTO>> findReservaFuncionarioDetailById(@Param("id")int id);

    //CANCEL RESERVATION
    @Transactional
    @Modifying
    @Query(value = "UPDATE reserva r SET r.estado = :estado WHERE r.id = :id", nativeQuery = true)
    void updateEstadoReserva (@Param("id")int id, @Param("estado")String estado);

    //MODIFY TRANSPORT
    @Transactional
    @Modifying
    @Query(value = "UPDATE coordtransporte ct SET ct.origen = :origen, ct.destino = :destino, ct.conductor = :conductor, ct.vehiculo = :vehiculo, ct.patente = :patente,  ct.costo = :costo, ct.usuario_id = :usuario_id WHERE ct.id = :id", nativeQuery = true)
    void updateTransporte (@Param("origen") String origen, @Param("destino") String destino, @Param("conductor") String conductor, @Param("vehiculo") String vehiculo, @Param("patente") String patente, @Param("costo")int costo, @Param("usuario_id") int usuario_id, @Param("id") int id);

    //CREATE ASSIGN TRANSPORT
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO coordtransporte (id, origen, destino, conductor, vehiculo, patente, costo, fecha, usuario_id, flag_reserva) VALUES (SEQ_COORDTRANSPORTE.nextval, :origen, :destino, :conductor, :vehiculo, :patente, :costo, :fecha, :usuario_id, :flag_reserva)", nativeQuery = true)
    void insertCoordtransporte (@Param("origen")String origen, @Param("destino")String destino, @Param("conductor")String conductor, @Param("vehiculo") String vehiculo, @Param("patente") String patente, @Param("costo")int costo, @Param("fecha")Date fecha, @Param("usuario_id")int usuario_id, @Param("flag_reserva")int flag_reserva);

    //ADD RESERVA
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO reserva (id, boleta_id, cliente_id, departamento_id, created_at, estado, fecha_inicio, fecha_termino, cantidad_adultos, cantidad_ninos, origen, costo, total, tour, transporte) VALUES (SEQ_RESERVA.nextval,:boleta_id, :cliente_id, :departamento_id, :created_at, :estado, :fecha_inicio, :fecha_termino, :cantidad_adultos, :cantidad_ninos, :origen, :costo, :total, :tour, :transporte)", nativeQuery = true)
    void createBooking(@Param("boleta_id") int boleta_id, @Param("cliente_id")int cliente_id, @Param("departamento_id") int departamento_id,@Param("created_at")Date created_at, @Param("estado") String estado, @Param("fecha_inicio")Date fecha_inicio, @Param("fecha_termino")Date fecha_termino, @Param("cantidad_adultos")int cantidad_adultos, @Param("cantidad_ninos")int cantidad_ninos, @Param("origen")String origen, @Param("costo")int costo, @Param("total")int total, @Param("tour") int tour, @Param("transporte")boolean transporte);

    //COORDTRANPORT DETAIL
    @Query(value = "SELECT ct.id, ct.origen, ct.destino, ct.conductor, ct.vehiculo, ct.patente, ct.costo, ct.fecha, ct.usuario_id FROM coordtransporte ct INNER JOIN coordreserva cr ON ct.id = cr.coordtransporte_id INNER JOIN reserva r ON cr.reserva_id = r.id WHERE r.id = :id ORDER BY ct.id desc", nativeQuery = true)
    List<Map<String, CrearCoordTransporteDTO>> getCoordTranport (@Param("id")int id);


    @Query(value="SELECT (CASE WHEN COUNT(id) > 0 THEN 1 ELSE 0 END) existe FROM RESERVA WHERE ID = :id", nativeQuery = true)
    List<Map<String, ExisteReservaDTO>> existReserva(@Param("id") int id);

    // Buscar reserva por cliente_id
    @Query(value =
            "SELECT " +
            "    rs.id reserva, " +
            "    rs.boleta_id reserva_boleta, " +
            "    dp.nombre_edificio edificio, " +
            "    rs.fecha_inicio inicio, " +
            "    rs.fecha_termino termino,  " +
            "    rs.costo anticipo,  " +
            "    rs.total costo,  " +
            "    tr.id tour_id, " +
            "    tr.NOMBRE tour, " +
            "    dp.NUMERO depto_numero, " +
            "    dp.DIRECCION depto_direccion, " +
            "    rs.TRANSPORTE transporte,  " +
            "    rs.estado, " +
            "    M.ID multa_id, " +
            "    M.NOMBRE multa_nombre, " +
            "    M.VALOR multa_valor, " +
            "    M.BOLETA_ID multa_boleta " +
            "FROM RESERVA rs " +
            "INNER JOIN DEPARTAMENTO dp ON rs.DEPARTAMENTO_ID = dp.id " +
            "INNER JOIN USUARIO usr ON usr.id = rs.CLIENTE_ID " +
            "LEFT JOIN COORDRESERVA crs ON crs.RESERVA_ID = rs.ID " +
            "LEFT JOIN TOUR tr ON tr.ID = rs.TOUR " +
            "LEFT JOIN MULTA m ON m.ID = rs.MULTA_ID " +
            "WHERE rs.CLIENTE_ID = :id " +
            "ORDER BY rs.created_at DESC", nativeQuery = true)
    List<Map<String, ClienteReservaDTO>> findReservationByUser (@Param("id") int id);

    //CANCEL RESERVATION
    @Transactional
    @Modifying
    @Query(value = "UPDATE RESERVA SET boleta_id = :boleta_id WHERE id = :id", nativeQuery = true)
    void updateReservationPay(@Param("id")int id, @Param("boleta_id") String boleta_id);

    //USER LIST
    @Query(value = "SELECT id, nombre || ' ' || apellidos as nombre from usuario WHERE rol_id = :rol_id",nativeQuery = true)
    List<Map<String, FuncionarioDTO>> getFuncionarios (@Param("rol_id")Integer rol_id);

}