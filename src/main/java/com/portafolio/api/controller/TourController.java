package com.portafolio.api.controller;

import com.portafolio.api.dto.FiltrarTourCiudadDTO;
import com.portafolio.api.dto.FiltrarTourIdDTO;
import com.portafolio.api.dto.ListaMantencionDTO;
import com.portafolio.api.dto.TourDTO;
import com.portafolio.api.dto.cliente.TourClienteDTO;
import com.portafolio.api.dto.cliente.TourComunaDTO;
import com.portafolio.api.dto.filtros.CiudadDTO;
import com.portafolio.api.dto.filtros.ComunasDTO;
import com.portafolio.api.entity.Tour;
import com.portafolio.api.entity.Usuario;
import com.portafolio.api.model.ResponseHandler;
import com.portafolio.api.repository.TourRepository;
import com.portafolio.api.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class TourController {

    @Autowired
    private TourService tourService;


    @GetMapping({ "/tour" })
    public ResponseEntity<Object> getTours(){
        List<Tour> tours = tourService.Tours();
        return ResponseHandler.send("Lista de tours", HttpStatus.OK, tours);
    }


    @GetMapping({ "/tour/{tourid}" })
    public ResponseEntity<Object> GetTourById(@PathVariable("tourid") int id){
        try{
            List<Map<String, FiltrarTourIdDTO>> tour = tourService.GetTourById(id);

            return ResponseHandler.send("OK", HttpStatus.OK, tour);

        } catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Tour no encontrado", HttpStatus.OK, null);
        }
    }


    @PostMapping({ "/tour/add" })
    public ResponseEntity<Object> addTour(@RequestBody TourDTO tour){
        tourService.addTours(tour);
        return ResponseHandler.send("Tour Guardado!", HttpStatus.OK, null);
    }


    @PostMapping({ "/tour/update" })
    public ResponseEntity<Object> updateTour(@RequestBody TourDTO tour){
        tourService.updateTour(tour);
        return ResponseHandler.send("Tour Guardado!", HttpStatus.OK, null);
    }


    @PostMapping({ "/tour" })
    public ResponseEntity<Object> saveTour(@RequestBody Tour tour){
        tourService.SaveTour(tour);
        return ResponseHandler.send("Tour Guardado!", HttpStatus.OK, null);
    }


    @PutMapping({ "/tour" })
    public ResponseEntity<Object> updateTour(@RequestBody Tour tour){
        try{
            boolean update = tourService.UpdateTour(tour);
            if(update){
                return ResponseHandler.send("Tour Actualizado!", HttpStatus.OK, null);
            }

            return ResponseHandler.send("Tour no existe!", HttpStatus.OK, null);
        }catch (org.springframework.dao.InvalidDataAccessApiUsageException ex){
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }


    @DeleteMapping({ "/tour/{tourid}" })
    public ResponseEntity<Object> deleteTour(@PathVariable("tourid") int tourid){
        tourService.DeleteTour(tourid);
        return ResponseHandler.send("Tour Eliminado!", HttpStatus.OK, null);
    }


    @GetMapping({ "/tour/city/{cityid}" })
    public ResponseEntity<Object> GetTourByCity(@PathVariable("cityid") int id){
        try{
            List<Map<String, FiltrarTourCiudadDTO>> man = tourService.GetTourByCity(id);

            if(man == null){
                return ResponseHandler.send("Tour no encontrado", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, man);

        } catch (Exception ex){
            return ResponseHandler.send("Tour no encontrado", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/tour/comunas" })
    public ResponseEntity<Object> getComunas(){
        try{
            List<Map<String, ComunasDTO>>  comunas = tourService.getComunas();
            return ResponseHandler.send("OK", HttpStatus.OK, comunas);

        } catch (Exception ex){
            return ResponseHandler.send("Error", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/tour/ciudades" })
    public ResponseEntity<Object> getCiudades(){
        try{
            List<Map<String, CiudadDTO>>  ciudades = tourService.getCiudades();
            return ResponseHandler.send("OK", HttpStatus.OK, ciudades);

        } catch (Exception ex){
            return ResponseHandler.send("Error", HttpStatus.OK, null);
        }
    }

    @GetMapping({ "/cliente/tours" })
    public ResponseEntity<Object> getToursCliente(){
        List<Map<String, TourClienteDTO>> tours = tourService.clienteTours();
        return ResponseHandler.send("Lista de tours", HttpStatus.OK, tours);
    }


    @GetMapping({"/cliente/tour/comuna/{comunaId}"})
    public ResponseEntity<Object> Departamentos(@PathVariable("comunaId") int id){
        List<Map<String, TourComunaDTO>> tour = tourService.comunaTour(id);

        return ResponseHandler.send("OK", HttpStatus.OK, tour);
    }
}
