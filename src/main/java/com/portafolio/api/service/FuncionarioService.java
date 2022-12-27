package com.portafolio.api.service;

import com.portafolio.api.dto.*;
import com.portafolio.api.dto.funcionario.*;

import java.util.List;
import java.util.Map;

public interface FuncionarioService {


    /**
     * Obtiene una mantencion desde el id entregado
     * @param id
     * @return
     */
    List<Map<String, ListaMantencionDTO>>  GetMaintenanceByUser(int id);

    /**
     * Matencion por id
     * @param id
     * @return
     */
    List<Map<String, MantencionDetailDTO>> findMaintenanceByid(int id);

    /**
     * Obtiene una mantencion desde el id entregado
     * @param id
     * @return
     */

    List<Map<String, ListaMantencionIdDTO>>  GetLastMaintenance(int id);



    /**
     * Obtiene un inventario desde el id entregado
     * @param id
     * @return
     */

    List<Map<String, ListaInventarioDTO>>  GetInventoryByUser(int id);

    /**
     * Obtiene 5 ultimos inventarioS desde el id entregado
     * @param id
     * @return
     */

    List<Map<String, ListaInventarioIdDTO>>  GetLastInventoryByUser(int id);

    /**
     * Obtiene el detalle del departamento junto con los detalles de quien reserva
     * @param id
     * @param id2
     * @return
     */

    List<Map<String, DeptoCheckinDetalleDTO>>  GetDetailDepto(int id, int id2);

    /**
     * Actualiza la observacion de un inventario
     * @param inventario
     * @return
     */

    Boolean UpdateInventarioobservacion(EditarInventarioObservacionDTO inventario);

    /**
     * Actualiza la descripcion de un inventario
     * @param inventario
     * @return
     */

    Boolean UpdateInventariodescripcion(EditarInventarioDescripcionDTO inventario);

    /**
     * Actualiza la observacion de una mantencion
     * @param mantencion
     * @return
     */

    Boolean UpdateMantencionobservacion(EditarMantencionObservacionDTO mantencion);



    /**
     * Obtiene la lista de las reservaciones
     * @param id
     * @return
     */

    List<Map<String, ListaReservacionFuncionarioDTO>>  GetReservationByUser(int id);

    /**
     * Atualiza el costo de la mantencion
     * @param costo
     * @return
     */

    Boolean UpdateMantencionCosto(EditarMantencionCostoDTO costo);

    /**
     * Actualizar una mantencion
     * @param mantencion
     */
    void updateMantencion(updateMantencionDTO mantencion);

    /**
     * Atualiza la observacion del checkin
     * @param observacion
     * @return
     */

    Boolean UpdateCheckinObservacion(EditarObservacionCheckinDTO observacion);

    /**
     * Atualiza la respuesta checkin
     * @param res
     * @return
     */

    Boolean UpdateRespuestaCheckin(EditarRespuestaCheckinDTO res);

    /**
     * Atualiza la respuesta checkout
     * @param out
     * @return
     */
    Boolean UpdateRespuestaCheckout(EditarRespuestaCheckoutDTO out);


    /**
     *
     * @return
     */
    List<Map<String, transporteDTO>> transportes(int id);

    /**
     *
     * @param update
     */
    void UpdateEstadoTransporte(UpdateTransporteDTO update);

    /**
     * Ultimos inventarios
     * @return
     */
    List<Map<String, LastInventoryDTO>> lastInventory(int id);

    /**
     * Ultimas mantenciones
     * @return
     */
    List<Map<String, LastMantencionDTO>> lastMantencion(int id);

}
