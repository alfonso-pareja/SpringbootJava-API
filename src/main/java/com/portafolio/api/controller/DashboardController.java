package com.portafolio.api.controller;

import com.portafolio.api.dto.*;
import com.portafolio.api.model.ResponseHandler;
import com.portafolio.api.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping({ "/dashboard/totalreservas" })
    public ResponseEntity<Object> getReservas(){

        List<Map<String, TotalReservasDTO>> reservas = dashboardService.getReservas();

        return ResponseHandler.send("total reservas", HttpStatus.OK, reservas);
    }

    @GetMapping({ "/dashboard/costomantencion" })
    public ResponseEntity<Object> getCostoMantencion(){

        List<Map<String, CostoMantencionDTO>> costos = dashboardService.getMantenciones();

        return ResponseHandler.send("total costo mantencion", HttpStatus.OK, costos);
    }

    @GetMapping({ "/dashboard/reservasactivas" })
    public ResponseEntity<Object> getReservasActivas(String estado){
        List<Map<String, ReservaActivaDTO>> reservas = dashboardService.getReservasActivas();
        return ResponseHandler.send("total reservas activas", HttpStatus.OK, reservas);
    }

    @GetMapping({ "/dashboard/totalclientes" })
    public ResponseEntity<Object> getTotalClientes(Integer rol_id){
        List<Map<String, TotalClientesDTO>> clientes = dashboardService.getClientes(2);
        return ResponseHandler.send("total clientes", HttpStatus.OK, clientes);
    }

    @GetMapping({ "/dashboard/top5" })
    public ResponseEntity<Object> getTopDepartamentos(){
        List<Map<String, TopDepartamentoDTO>> top = dashboardService.getTopDeptos();
        return ResponseHandler.send("top 5 departamentos", HttpStatus.OK, top);
    }

    @GetMapping({ "/dashboard/ocupacion" })
    public ResponseEntity<Object> getOcupacion(){
        List<Map<String, OcupacionDTO>> porc = dashboardService.getOcupacion();
        return ResponseHandler.send("disponibles vs reservados", HttpStatus.OK, porc);
    }

    @GetMapping({ "/dashboard/graph" })
    public ResponseEntity<Object> getGraph(){
        List<Map<String, DashboardGraphDTO>> graph = dashboardService.getGraph();
        return ResponseHandler.send("Ok", HttpStatus.OK, graph);
    }

    @GetMapping({ "/dashboard/reservas" })
    public ResponseEntity<Object> getReservasb(){
        List<Map<String, DashboardReservaDTO>> reservas = dashboardService.reservas();
        return ResponseHandler.send("Ok", HttpStatus.OK, reservas);
    }

    @GetMapping({ "/dashboard/mantencion" })
    public ResponseEntity<Object> getMantencion(){
        List<Map<String, DashboardMantencionDTO>> mantencion = dashboardService.mantenciones();
        return ResponseHandler.send("Ok", HttpStatus.OK, mantencion);
    }

    @GetMapping({ "/dashboard/transporte" })
    public ResponseEntity<Object> getTransporte(){
        List<Map<String, DashboardTransporteDTO>> transporte = dashboardService.transporte();
        return ResponseHandler.send("Ok", HttpStatus.OK, transporte);
    }


}
