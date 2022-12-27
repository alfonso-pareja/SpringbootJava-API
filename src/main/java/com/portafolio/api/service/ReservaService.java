package com.portafolio.api.service;

import com.portafolio.api.dto.funcionario.ReservaPayDTO;
import com.portafolio.api.dto.cliente.ClienteReservaDTO;
import com.portafolio.api.dto.*;
import com.portafolio.api.dto.funcionario.ReservaFuncionarioDTO;

import java.util.List;
import java.util.Map;

public interface ReservaService {

    /**
     * Retorna una lista de reservas
     * @param estado
     * @return
     */

    List<Map<String, ReservaDTO>> Reservations(String estado);

    /**
     * Retorna la reserva solicitada por id
     * @param id
     * @return
     */

    List<Map<String, EstadoReservaDTO>> GetReservationById(int id);


    /**
     * Cancelar una reserva
     * @param estado
     * @return
     */
    Boolean UpdateReservation(EstadoReservaDTO estado);

    /**
     * Editar asignacion de mantencion
     * @param transporte
     * @return
     */
    Boolean UpdateTransporte(EditarTransporteDTO transporte);


    /**
     * Asignar coordinacion de transporte
     * @param transporte
     */
    void SaveTransportReserva(CrearCoordTransporteDTO transporte);

    /**
     * Agregar reserva
     * @param reserva
     */
    void SaveBookig(CrearReservaDTO reserva);

    /**
     * Retorna transporte por id
     * @param id
     * @return
     */
    List<Map<String, CrearCoordTransporteDTO>> GetCoordTranport(int id);

    /**
     * Lista de reservas por usuario
     * @param id
     * @return
     */
    List<Map<String, ClienteReservaDTO>> findReservationByUser(int id);

    /**
     * Retorna una lista de funcionarios
     * @param rol_id
     * @param chofer_activo
     * @return
     */

    List<Map<String, FuncionarioDTO>> getFuncionarios(Integer rol_id);

    /**
     * Actualiza el pago de la reserva
     * @param reservationPay
     */
    void setReservationPay(ReservaPayDTO reservationPay);

    /**
     *
     * @param id
     * @return
     */
    List<Map<String, ReservaFuncionarioDTO>> getFunReservaId(Integer id);
}
