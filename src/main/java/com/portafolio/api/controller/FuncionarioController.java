package com.portafolio.api.controller;

import com.portafolio.api.dto.*;
import com.portafolio.api.dto.funcionario.*;
import com.portafolio.api.entity.Departamento;
import com.portafolio.api.entity.Usuario;
import com.portafolio.api.model.ResponseHandler;
import com.portafolio.api.service.FuncionarioService;
import com.portafolio.api.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;
    @Autowired
    private ReservaService reservaService;


    @GetMapping({ "/funcionario/{funcionarioid}/mantencion" })
    public ResponseEntity<Object> GetLastMaintenance(@PathVariable("funcionarioid") int id){
        try{
            List<Map<String, ListaMantencionIdDTO>> mantencion = funcionarioService.GetLastMaintenance(id);

            if(mantencion == null){
                return ResponseHandler.send("Mantencion no encontrada", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, mantencion);

        } catch (Exception ex){
            return ResponseHandler.send("Mantencion no encontrada", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/funcionario/{funcionarioid}/depto/{deptoid}" })
    public ResponseEntity<Object> GetDeptoDetail(@PathVariable("funcionarioid") int id2, @PathVariable("deptoid") int id){
        try{
            List<Map<String, DeptoCheckinDetalleDTO>> depto = funcionarioService.GetDetailDepto(id, id2);

            if(depto == null){
                return ResponseHandler.send("Depto no encontrada", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, depto);

        } catch (Exception ex){
            return ResponseHandler.send("Depto no encontrada", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/funcionario/{funcionarioid}/asignacion/mantencion" })
    public ResponseEntity<Object> GetMaintenanceByUser(@PathVariable("funcionarioid") int id){
        try{
            List<Map<String, ListaMantencionDTO>> man = funcionarioService.GetMaintenanceByUser(id);

            if(man == null){
                return ResponseHandler.send("Mantencion no encontrada", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, man);

        } catch (Exception ex){
            return ResponseHandler.send("Mantencion no encontrada", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/funcionario/asignacion/mantencion/{mantencion_id}" })
    public ResponseEntity<Object> updatemantencionobservacion(@PathVariable("mantencion_id") int id){
        try{
            List<Map<String, MantencionDetailDTO>> mantencion =  funcionarioService.findMaintenanceByid(id);
            return ResponseHandler.send("Ok", HttpStatus.OK, mantencion);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Error", HttpStatus.OK, null);
        }

    }


    @PostMapping({ "/funcionario/asignacion/mantencion" })
    public ResponseEntity<Object> updateMantencion(@RequestBody updateMantencionDTO mantencion){
        try{
            funcionarioService.updateMantencion(mantencion);
            return ResponseHandler.send("Ok", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }

    @PutMapping({ "/funcionario/asignacion/mantencion/observacion" })
    public ResponseEntity<Object> updatemantencionobservacion(@RequestBody EditarMantencionObservacionDTO man){
        try{
            boolean update = funcionarioService.UpdateMantencionobservacion(man);
            if(update){
                return ResponseHandler.send("Mantencion cancelada!", HttpStatus.OK, null);
            }

            return ResponseHandler.send("Mantencion no existe!", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }


    @GetMapping({ "/funcionario/{funcionarioid}/reservacion" })
    public ResponseEntity<Object> GetReservationByUser(@PathVariable("funcionarioid") int id){
        try{
            List<Map<String, ListaReservacionFuncionarioDTO>> reservacion = funcionarioService.GetReservationByUser(id);

            if(reservacion == null){
                return ResponseHandler.send("reservacion no encontrada", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, reservacion);

        } catch (Exception ex){
            return ResponseHandler.send("reservacion no encontrado", HttpStatus.OK, null);
        }
    }


    @PutMapping({ "/funcionario/asignacion/mantencion/costo" })
    public ResponseEntity<Object> updatemantencioncosto(@RequestBody EditarMantencionCostoDTO costo){
        try{
            boolean update = funcionarioService.UpdateMantencionCosto(costo);
            if(update){
                return ResponseHandler.send("Mantencion cancelada!", HttpStatus.OK, null);
            }

            return ResponseHandler.send("Mantencion no existe!", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }

    @PutMapping({ "/funcionario/checkin/observacion" })
    public ResponseEntity<Object> updatecheckinobservacion(@RequestBody EditarObservacionCheckinDTO obs){
        try{
            boolean update = funcionarioService.UpdateCheckinObservacion(obs);
            if(update){
                return ResponseHandler.send("Checkin cancelada!", HttpStatus.OK, null);
            }

            return ResponseHandler.send("Checkin no existe!", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }


    @PutMapping({ "/funcionario/checkin/pregunta/respuesta_ci" })
    public ResponseEntity<Object> updaterespuestacheckin(@RequestBody EditarRespuestaCheckinDTO res){
        try{
            boolean update = funcionarioService.UpdateRespuestaCheckin(res);
            if(update){
                return ResponseHandler.send("Checkin cancelada!", HttpStatus.OK, null);
            }

            return ResponseHandler.send("Checkin no existe!", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }


    @PutMapping({ "/funcionario/checkout/pregunta/respuesta_co" })
    public ResponseEntity<Object> updaterespuestacheckout(@RequestBody EditarRespuestaCheckoutDTO out){
        try{
            boolean update = funcionarioService.UpdateRespuestaCheckout(out);
            if(update){
                return ResponseHandler.send("Checkout cancelada!", HttpStatus.OK, null);
            }

            return ResponseHandler.send("Checkout no existe!", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }


    @GetMapping({ "/funcionario/transporte/{userid}" })
    public ResponseEntity<Object> trasnsporte(@PathVariable("userid") int userid){
        try{
            List<Map<String, transporteDTO>>  transporte = funcionarioService.transportes(userid);
            return ResponseHandler.send("OK", HttpStatus.OK, transporte);

        } catch (Exception ex){
            return ResponseHandler.send("Error", HttpStatus.OK, null);
        }
    }


    @PostMapping({ "/funcionario/transporte/estado" })
    public ResponseEntity<Object> updateTrasnsporte(@RequestBody UpdateTransporteDTO update){
        try{
           funcionarioService.UpdateEstadoTransporte(update);
           return ResponseHandler.send("OK", HttpStatus.OK, null);
        } catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Error", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/funcionario/home/inventarios/{userid}" })
    public ResponseEntity<Object> LastInventory(@PathVariable("userid") int userid ){
        try{
            List<Map<String, LastInventoryDTO>> inventory = funcionarioService.lastInventory(userid);
            return ResponseHandler.send("OK", HttpStatus.OK, inventory);

        } catch (Exception ex){
            return ResponseHandler.send("Error", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/funcionario/home/mantenciones/{userid}" })
    public ResponseEntity<Object> LastMaintenance(@PathVariable("userid") int userid){
        try{
            List<Map<String, LastMantencionDTO>> mantencion = funcionarioService.lastMantencion(userid);
            return ResponseHandler.send("OK", HttpStatus.OK, mantencion);

        } catch (Exception ex){
            return ResponseHandler.send("Error", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/funcionario/reserva/{reservationid}" })
    public ResponseEntity<Object> getReservation(@PathVariable("reservationid") int reservationid){
        try{
            List<Map<String, ReservaFuncionarioDTO>> res = reservaService.getFunReservaId(reservationid);

            if(res == null)
                return ResponseHandler.send("Reserva no encontrada", HttpStatus.BAD_REQUEST,null);

            return ResponseHandler.send("OK", HttpStatus.OK, res);

        }catch (Exception ex){
            return ResponseHandler.send("Reserva no encontrada", HttpStatus.OK, null);
        }
    }


}
