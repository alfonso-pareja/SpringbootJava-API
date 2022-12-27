package com.portafolio.api.service.impl;

import com.portafolio.api.dto.*;
import com.portafolio.api.dto.cliente.TourClienteDTO;
import com.portafolio.api.dto.cliente.TourComunaDTO;
import com.portafolio.api.dto.filtros.CiudadDTO;
import com.portafolio.api.dto.filtros.ComunasDTO;
import com.portafolio.api.entity.Tour;
import com.portafolio.api.repository.TourRepository;
import com.portafolio.api.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class TourServiceImpl implements TourService {

    @Autowired
    public TourRepository tourRepository;

    @Override
    public List<Tour> Tours() {
        return (List<Tour>) tourRepository.findAll();
    }


    @Override
    public  List<Map<String, FiltrarTourIdDTO>> GetTourById(int id){
        return tourRepository.findTourById(id);
    }

    @Override
    public void SaveTour(Tour tour) {
        tourRepository.save(tour);
    }

    @Override
    public Boolean UpdateTour(Tour tour) {
        boolean exists = tourRepository.existsById(tour.getId());
        if(!exists)
            return false;

        tourRepository.save(tour);
        return true;
    }

    @Override
    public void DeleteTour(int id) {
        tourRepository.DeleteTour(id);
    }

    @Override
    public List<Map<String, TourComunaDTO>> comunaTour(int id) {
        return tourRepository.tourComuna(id);
    }

    @Override
    public List<Map<String, TourClienteDTO>> clienteTours() {
        return tourRepository.toursCliente();

    }
    
    public List<Map<String, FiltrarTourCiudadDTO>> GetTourByCity(int id) {
        List<Map<String, FiltrarTourCiudadDTO>> lista = tourRepository.findTourByCity(id);
        return lista;
    }

    @Override
    public void addTours(TourDTO tour) {
        tourRepository.addTours(
                tour.getNombre(),
                tour.getDescripcion(),
                tour.getUbicacion(),
                tour.getValor(),
                tour.getFecha_inicio(),
                tour.getFecha_termino(),
                tour.getComuna_id(),
                tour.getImage(),
                tour.getImage2(),
                tour.getImage3()
        );
    }

    @Override
    public void updateTour(TourDTO tour) {
        tourRepository.updateTour(
                tour.getId(),
                tour.getNombre(),
                tour.getDescripcion(),
                tour.getUbicacion(),
                tour.getValor(),
                tour.getFecha_inicio(),
                tour.getFecha_termino(),
                tour.getComuna_id(),
                tour.getImage(),
                tour.getImage2(),
                tour.getImage3()
        );
    }

    @Override
    public List<Map<String, CiudadDTO>> getCiudades() {
        return tourRepository.getCiudades();
    }

    @Override
    public List<Map<String, ComunasDTO>> getComunas() {
        return tourRepository.getComunas();
    }
}
