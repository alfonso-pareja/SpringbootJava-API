package com.portafolio.api.repository;

import com.portafolio.api.dto.cliente.DepartamentosDTO;
import com.portafolio.api.dto.cliente.ReservaDepartamentoDTO;
import com.portafolio.api.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface ClienteReservaRepository extends JpaRepository<Reserva, Integer> {

    @Query(value = 
            "SELECT  " +
            "    R.ID,  " +
            "    R.CLIENTE_ID,  " +
            "    R.ESTADO,  " +
            "    R.FECHA_INICIO,  " +
            "    R.FECHA_TERMINO, " +
            "    CI.CREATED_AT FECHA_CHECKIN, " +
            "    CO.CREATED_AT FECHA_CHECKOUT " +
            "FROM RESERVA R " +
            "LEFT JOIN CHECKIN CI ON CI.RESERVA_ID = R.ID " +
            "LEFT JOIN CHECKOUT CO ON CO.CHECKIN_ID = CI.ID " +
            "WHERE  " +
            "    R.DEPARTAMENTO_ID = :id AND R.ESTADO = 'ACTIVO'  " +
            "ORDER BY FECHA_TERMINO DESC", nativeQuery = true)
    List<Map<String, ReservaDepartamentoDTO>> reservaDepartamento(@Param("id") int id);
}
