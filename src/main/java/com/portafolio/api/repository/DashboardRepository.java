package com.portafolio.api.repository;

import com.portafolio.api.dto.*;
import com.portafolio.api.entity.Dashboard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface DashboardRepository extends CrudRepository<Dashboard, Integer> {

    //TOTAL RESERVAS
    @Query(value = "SELECT count(id) as total_reservas FROM reserva", nativeQuery = true)
    List<Map<String, TotalReservasDTO>> getReservas();

    //COSTO MANTENCION
    @Query(value =
            "SELECT " +
            "    sum(CASE WHEN COSTO IS NULL THEN 0 ELSE COSTO END) as costo_mantencion  " +
            "FROM mantencion", nativeQuery = true)
    List<Map<String, CostoMantencionDTO>> getMantenciones();

    //PORCENTAJE OCUPACION
    @Query(value = "SELECT COUNT(CASE WHEN estadodepartamento_id = 1 THEN 1 END) as disponibles,COUNT(CASE WHEN estadodepartamento_id = 2 THEN 1 END) as reservados FROM DEPARTAMENTO", nativeQuery = true)
    List<Map<String, OcupacionDTO>> getOcupacion();
    
    //RESERVAS EN CURSO
    @Query(value = 
                "SELECT  " +
                "    count(R.id) as reservas_activas  " +
                "FROM reserva R " +
                "INNER JOIN DEPARTAMENTO D ON R.DEPARTAMENTO_ID = D.ID " +
                "WHERE  " +
                "    D.estadodepartamento_id = 2 ", nativeQuery = true)
    List<Map<String, ReservaActivaDTO>> getReservasActivas();

    //CLIENTES REGISTRADOS
    @Query(value = "SELECT count(id) as clientes_registrados FROM usuario WHERE rol_id = :rol_id", nativeQuery = true)
    List<Map<String, TotalClientesDTO>> getClientesRegistrados(@Param("rol_id")Integer rol_id);

    //5 DEPTO MÁS VISITADOS
    @Query(value = "SELECT COUNT (R.DEPARTAMENTO_ID) as reservas, R.DEPARTAMENTO_ID, D.NUMERO, D.NOMBRE_EDIFICIO, D.DIRECCION FROM RESERVA R INNER JOIN DEPARTAMENTO D ON R.DEPARTAMENTO_ID = D.ID GROUP BY R.DEPARTAMENTO_ID,  D.NUMERO, D.NOMBRE_EDIFICIO, D.DIRECCION ORDER BY reservas DESC FETCH FIRST 5 ROW ONLY", nativeQuery = true)
    List<Map<String, TopDepartamentoDTO>> getTopDepto();


    @Query(value = 
            "SELECT " +
            "    (SELECT SUM(CASE WHEN total IS NULL THEN 0 ELSE total END) FROM RESERVA) resarva, " +
            "    (SELECT SUM(CASE WHEN COSTO IS NULL THEN 0 ELSE COSTO END) FROM MANTENCION) mantencion, " +
            "    (SELECT SUM(CASE WHEN COSTO IS NULL THEN 0 ELSE COSTO END) FROM COORDTRANSPORTE) transporte " +
            "FROM DUAL", nativeQuery = true)
    List<Map<String, DashboardGraphDTO>> getGraph();


    @Query(value =
            "SELECT  " +
            "    R.ID, " +
            "    R.BOLETA_ID, " +
            "    R.CLIENTE_ID, " +
            "    R.DEPARTAMENTO_ID, " +
            "    R.CREATED_AT, " +
            "    R.ESTADO, " +
            "    R.FECHA_INICIO, " +
            "    R.FECHA_TERMINO, " +
            "    R.CANTIDAD_ADULTOS, " +
            "    R.CANTIDAD_NINOS, " +
            "    R.ORIGEN, " +
            "    R.COSTO, " +
            "    R.TOUR TOUR_ID, " +
            "    T.NOMBRE TOUR_NOMBRE " +
            "FROM RESERVA R " +
            "LEFT JOIN TOUR T ON R.TOUR = T.ID " +
            "ORDER BY R.ID DESC", nativeQuery = true)
    List<Map<String, DashboardReservaDTO>> reservas();

    //DashboardMantencionDTO
           // DashboardTransporteDTO
    @Query(value =
            "SELECT  " +
            "    ID, " +
            "    NOMBRE, " +
            "    DESCRIPCION, " +
            "    FECHA_INICIO, " +
            "    FECHA_TERMINO, " +
            "    OBSERVACIONES, " +
            "    COSTO, " +
            "    ESTADO, " +
            "    USUARIO_ID, " +
            "    FLAG_DEPTO DEPARTAMENTO " +
            "FROM MANTENCION " +
            "ORDER BY ID DESC", nativeQuery = true)
    List<Map<String, DashboardMantencionDTO>> mantenciones();


    @Query(value =
            "SELECT  " +
            "    ID, " +
            "    ORIGEN, " +
            "    DESTINO, " +
            "    CONDUCTOR, " +
            "    VEHICULO, " +
            "    PATENTE, " +
            "    COSTO, " +
            "    FECHA, " +
            "    USUARIO_ID, " +
            "    FLAG_RESERVA RESERVA, " +
            "    ESTADO " +
            "FROM COORDTRANSPORTE " +
            "ORDER BY ID DESC", nativeQuery = true)
    List<Map<String, DashboardTransporteDTO>> transporte();

}
