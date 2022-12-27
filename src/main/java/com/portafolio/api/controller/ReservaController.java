package com.portafolio.api.controller;


import com.portafolio.api.dto.*;
import com.portafolio.api.dto.cliente.ClienteReservaDTO;
import com.portafolio.api.dto.cliente.ReservaDepartamentoDTO;
import com.portafolio.api.dto.funcionario.ReservaPayDTO;
import com.portafolio.api.entity.Reserva;
import com.portafolio.api.model.ResponseHandler;
import com.portafolio.api.service.ClienteReservaService;
import com.portafolio.api.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ReservaController {

    @Autowired
    private ReservaService reservaService;
    @Autowired
    private ClienteReservaService clienteReservaService;


    @GetMapping({ "/reserva" })
    public ResponseEntity<Object> getReservation(String estado){

        List<Map<String, ReservaDTO>> reserva = reservaService.Reservations("CANCELADO");

        return ResponseHandler.send("Lista de reservas", HttpStatus.OK, reserva);

    }


    @GetMapping({ "/reserva/{reservationid}" })
    public ResponseEntity<Object> getReservation(@PathVariable("reservationid") int reservationid){
        try{
            List<Map<String, EstadoReservaDTO>> res = reservaService.GetReservationById(reservationid);

            System.out.println(res);
            if(res == null){

                return ResponseHandler.send("Reserva no encontrada", HttpStatus.BAD_REQUEST,null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, res);

        }catch (Exception ex){
            return ResponseHandler.send("Reserva no encontrada", HttpStatus.OK, null);
        }
    }


    @PutMapping({ "/reserva" })
    public ResponseEntity<Object> updateReserva(@RequestBody EstadoReservaDTO estado){
        try{
            boolean update = reservaService.UpdateReservation(estado);
            if(update){
                return ResponseHandler.send("Reserva Actualizada!", HttpStatus.OK, null);
            }

            return ResponseHandler.send("Reserva no existe!", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }


    @PutMapping({ "/reserva/transporte/editar" })
    public ResponseEntity<Object> updateTransporte(@RequestBody EditarTransporteDTO transporte){
        try{
            boolean update = reservaService.UpdateTransporte(transporte);
            if(update){
                return ResponseHandler.send("Transporte Actualizado!", HttpStatus.OK, null);
            }

            return ResponseHandler.send("Reserva no existe!", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, ex);
        }

    }


    @PostMapping({ "/reserva/transporte/agregar" })
    public ResponseEntity<Object> saveTransporteReserva(@RequestBody CrearCoordTransporteDTO transporte){
        reservaService.SaveTransportReserva(transporte);
        return ResponseHandler.send("Transporte ingresado", HttpStatus.OK, null);
    }


    @PostMapping({ "/reserva" })
    public ResponseEntity<Object> saveBooking(@RequestBody CrearReservaDTO reserva){
        reservaService.SaveBookig (reserva);
        return ResponseHandler.send("Reserva ingresada", HttpStatus.OK, null);
    }


    @GetMapping({ "/reserva/transporte/{reservationid}" })
    public ResponseEntity<Object> getTransport(@PathVariable("reservationid") int reservationid){
        try{
            List<Map<String, CrearCoordTransporteDTO>> res = reservaService.GetCoordTranport(reservationid);

            if(res == null){

                return ResponseHandler.send("Transporte no encontrada", HttpStatus.BAD_REQUEST,null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, res);

        }catch (Exception ex){
            return ResponseHandler.send("Transporte no encontrado", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/reserva/funcionario" })
    public ResponseEntity<Object> getUsers(Integer rol_id){
        List<Map<String, FuncionarioDTO>> user = reservaService.getFuncionarios(3);
        return ResponseHandler.send("Lista de funcionarios", HttpStatus.OK, user);
    }


    @PutMapping({ "/reserva/pago" })
    public ResponseEntity<Object> setReservationPay(@RequestBody ReservaPayDTO pay){
        try{
            reservaService.setReservationPay(pay);
            return ResponseHandler.send("Reserva realizada!", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }


    @GetMapping({"/cliente/reserva/departamento/{departmentid}"})
    public ResponseEntity<Object> reservaDepartamento(@PathVariable("departmentid") int id){
        List<Map<String, ReservaDepartamentoDTO>> depto = clienteReservaService.reservaDepartamento(id);

        return ResponseHandler.send("OK", HttpStatus.OK, depto);
    }


    @GetMapping({"/cliente/reserva/{usuarioId}"})
    public ResponseEntity<Object> reservasByUser(@PathVariable("usuarioId") int id){
        List<Map<String, ClienteReservaDTO>> reserva = reservaService.findReservationByUser(id);
        return ResponseHandler.send("OK", HttpStatus.OK, reserva);
    }


    @PostMapping({ "/cliente/reserva/cancelar" })
    public ResponseEntity<Object> updateReservaCliente(@RequestBody EstadoReservaDTO estado){
        try{
            boolean update = reservaService.UpdateReservation(estado);
            if(update){
                return ResponseHandler.send("Reserva Cancelada!", HttpStatus.OK, null);
            }

            return ResponseHandler.send("Reserva no existe!", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }
    }


}
