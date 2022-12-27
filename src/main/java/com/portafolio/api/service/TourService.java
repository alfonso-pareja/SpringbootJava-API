package com.portafolio.api.service;

import com.portafolio.api.dto.TourDTO;
import com.portafolio.api.dto.cliente.TourClienteDTO;
import com.portafolio.api.dto.cliente.TourComunaDTO;
import com.portafolio.api.dto.FiltrarTourCiudadDTO;
import com.portafolio.api.dto.FiltrarTourIdDTO;
import com.portafolio.api.dto.filtros.CiudadDTO;
import com.portafolio.api.dto.filtros.ComunasDTO;
import com.portafolio.api.entity.Tour;

import java.util.List;
import java.util.Map;

public interface TourService {

    /**
     * Retorna una lista de tours
     * @return
     */
    List<Tour> Tours();

    /**
     * Retorna un tour por id
     * @param id
     * @return
     */
    List<Map<String, FiltrarTourIdDTO>> GetTourById(int id);

    /**
     * Ingresa un nuevo tour
     * @param tour
     */
    void SaveTour(Tour tour);

    /**
     * Actualiza un tour
     * @param tour
     * @return
     */
    Boolean UpdateTour(Tour tour);

    /**
     * Elimina un tour
     * @param id
     */
    void DeleteTour(int id);

    /**
     * Tour por comuna
     * @param id
     * @return
     */
    List<Map<String, TourComunaDTO>> comunaTour(int id);

    /**
     *
     * @return
     */
    List<Map<String, TourClienteDTO>>  clienteTours();

    /**
     * Filtra tour por ciudad
     * @param id
     * @return
     */
    List<Map<String, FiltrarTourCiudadDTO>>  GetTourByCity(int id);

    /**
     * Agregar tour
     * @param tour
     * @return
     */
    void addTours(TourDTO tour);


    /**
     * Actualizar un tour
     * @param tour
     */
    void updateTour(TourDTO tour);

    /**
     * Obtener ciudades
     * @return
     */
    List<Map<String, CiudadDTO>> getCiudades();


    /**
     * Obtiene las comunas
     * @return
     */
    List<Map<String, ComunasDTO>> getComunas();
}
