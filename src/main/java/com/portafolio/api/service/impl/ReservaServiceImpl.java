package com.portafolio.api.service.impl;

import com.portafolio.api.dto.funcionario.ReservaPayDTO;
import com.portafolio.api.dto.cliente.ClienteReservaDTO;
import com.portafolio.api.dto.*;
import com.portafolio.api.dto.funcionario.ReservaFuncionarioDTO;
import com.portafolio.api.repository.ReservaRepository;
import com.portafolio.api.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    public ReservaRepository reservaRepository;

    @Override
    public List<Map<String, ReservaDTO>> Reservations(String estado) {
        System.out.println(estado);
        return reservaRepository.findAllReservations(estado);

    }

    @Override
    public List<Map<String, EstadoReservaDTO>> GetReservationById(int id) {
        return reservaRepository.findReservaDetailById(id);
    }

    @Override
    public Boolean UpdateReservation(EstadoReservaDTO estado) {
//        List<Map<String, ExisteReservaDTO>> existe = reservaRepository.existReserva(51);
//
//        System.out.println(existe.get(0).get(0).getExiste());
//        System.out.println("AQUI 2");

        reservaRepository.updateEstadoReserva(estado.getId(), estado.getEstado());
        return true;
    }

    @Override
    public Boolean UpdateTransporte(EditarTransporteDTO transporte) {
        reservaRepository.updateTransporte(transporte.getOrigen(),transporte.getDestino(),transporte.getConductor(),transporte.getVehiculo(),transporte.getPatente(), transporte.getCosto(), transporte.getUsuario_id(), transporte.getId());
        return true;
    }

    @Override
    public void SaveTransportReserva(CrearCoordTransporteDTO transporte) {
        reservaRepository.insertCoordtransporte(transporte.getOrigen(),transporte.getDestino(),transporte.getConductor(),transporte.getVehiculo(),transporte.getPatente(),transporte.getCosto(),transporte.getFecha(),transporte.getUsuario_id(),transporte.getFlag_reserva());
    }

    @Override
    public void SaveBookig(CrearReservaDTO reserva) {
        reservaRepository.createBooking(
                reserva.getBoleta_id(),
                reserva.getCliente_id(),
                reserva.getDepartamento_id(),
                reserva.getCreated_at(),
                reserva.getEstado(),
                reserva.getFecha_inicio(),
                reserva.getFecha_termino(),
                reserva.getCantidad_adultos(),
                reserva.getCantidad_ninos(),
                reserva.getOrigen(),
                reserva.getCosto(),
                reserva.getTotal(),
                reserva.getTour(),
                reserva.isTransporte()
        );
    }

    @Override
    public List<Map<String, CrearCoordTransporteDTO>> GetCoordTranport(int id) {
        return reservaRepository.getCoordTranport(id);
    }

    @Override
    public List<Map<String, ClienteReservaDTO>> findReservationByUser(int id) {
        return reservaRepository.findReservationByUser(id);
    }

    @Override
    public List<Map<String, FuncionarioDTO>> getFuncionarios(Integer rol_id) {
        return reservaRepository.getFuncionarios(rol_id);
    }

    @Override
    public void setReservationPay(ReservaPayDTO reservationPay) {
        reservaRepository.updateReservationPay(reservationPay.getId(), reservationPay.getBoleta_id());
    }

    @Override
    public List<Map<String, ReservaFuncionarioDTO>> getFunReservaId(Integer id) {
        return reservaRepository.findReservaFuncionarioDetailById(id);
    }


}