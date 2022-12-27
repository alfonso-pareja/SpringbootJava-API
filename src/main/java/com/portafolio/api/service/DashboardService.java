package com.portafolio.api.service;

import com.portafolio.api.dto.*;

import java.util.List;
import java.util.Map;

public interface DashboardService {
    /**
     * Retorna cantidad de reservas
     * @param
     * @return
     */
    List<Map<String, TotalReservasDTO>> getReservas();

    /**
     * Retorna total costo de mantencion
     * @param
     * @return
     */
    List<Map<String, CostoMantencionDTO>> getMantenciones();

    /**
     * Retorna cantidad de reservas
     * @param estado
     * @return
     */
    List<Map<String, ReservaActivaDTO>> getReservasActivas();


    /**
     * Retorna cantidad de clientes
     * @param rol_id
     * @return
     */
    List<Map<String, TotalClientesDTO>> getClientes(Integer rol_id);

    /**
     * Retorna cantidad de clientes
     * @param
     * @return
     */
    List<Map<String, TopDepartamentoDTO>> getTopDeptos();


    /**
     * Retorna porcentaje ocupacion
     * @param
     * @return
     */
    List<Map<String, OcupacionDTO>> getOcupacion();

    /**
     *
     * @return
     */
    List<Map<String, DashboardGraphDTO>> getGraph();


    /**
     *
     * @return
     */
    List<Map<String, DashboardReservaDTO>> reservas();

    /**
     *
     * @return
     */
    List<Map<String, DashboardMantencionDTO>> mantenciones();

    /**
     *
     * @return
     */
    List<Map<String, DashboardTransporteDTO>> transporte();


    PagoDTO pruebaPago();

}
