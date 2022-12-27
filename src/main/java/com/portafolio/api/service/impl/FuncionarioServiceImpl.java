package com.portafolio.api.service.impl;

import com.portafolio.api.dto.*;
import com.portafolio.api.dto.funcionario.*;
import com.portafolio.api.repository.FuncionarioRepository;
import com.portafolio.api.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    public FuncionarioRepository funcionarioRepository;

    @Override
    public List<Map<String, ListaMantencionDTO>> GetMaintenanceByUser(int id) {
        List<Map<String, ListaMantencionDTO>> listaM = funcionarioRepository.findMaintenanceByUser(id);
        return listaM;
    }

    @Override
    public List<Map<String, MantencionDetailDTO>> findMaintenanceByid(int id) {
        return funcionarioRepository.findMaintenanceByid(id);
    }

    @Override
    public List<Map<String, ListaMantencionIdDTO>> GetLastMaintenance(int id) {
        List<Map<String, ListaMantencionIdDTO>> listaM = funcionarioRepository.findLastMaintenance(id);
        return listaM;
    }


    @Override
    public  List<Map<String, ListaInventarioDTO>> GetInventoryByUser(int id){
        List<Map<String, ListaInventarioDTO>> list = funcionarioRepository.findInventoryByUser(id);
        return list;
    }

    @Override
    public List<Map<String, ListaInventarioIdDTO>> GetLastInventoryByUser(int id) {
        List<Map<String, ListaInventarioIdDTO>> lista = funcionarioRepository.findLastInventoryByUser(id);
        return lista;
    }

    @Override
    public List<Map<String, DeptoCheckinDetalleDTO>> GetDetailDepto(int id, int id2) {
        List<Map<String, DeptoCheckinDetalleDTO>> lista = funcionarioRepository.DeptoDetail(id, id2);
        return lista;
    }

    @Override
    public Boolean UpdateInventarioobservacion(EditarInventarioObservacionDTO inventario) {
        funcionarioRepository.updateInventarioObservacion(inventario.getId(),inventario.getObservaciones());
        return true;
    }

    @Override
    public Boolean UpdateInventariodescripcion(EditarInventarioDescripcionDTO inventario) {
        funcionarioRepository.updateInventarioDescripcion(inventario.getId(),inventario.getDescripcion());
        return true;
    }

    @Override
    public Boolean UpdateMantencionobservacion(EditarMantencionObservacionDTO mantencion) {
        funcionarioRepository.updateMantencionObservaciones(mantencion.getId(),mantencion.getObservaciones());
        return true;
    }


    @Override
    public List<Map<String, ListaReservacionFuncionarioDTO>> GetReservationByUser(int id) {
        List<Map<String, ListaReservacionFuncionarioDTO>> reservacion = funcionarioRepository.findReservationByUser(id);
        return reservacion;
    }

    @Override
    public  Boolean UpdateMantencionCosto(EditarMantencionCostoDTO costo){
        funcionarioRepository.updateMantecionCosto(costo.getId(),costo.getCosto());
        return true;
    }

    @Override
    public void updateMantencion(updateMantencionDTO mantencion) {
        funcionarioRepository.updateMantencion(mantencion.getId(), mantencion.getEstado(), mantencion.getCosto(), mantencion.getObservaciones());
    }

    @Override
    public  Boolean UpdateCheckinObservacion(EditarObservacionCheckinDTO obs){
        funcionarioRepository.updateObservacionCheckin(obs.getId(),obs.getObservacion());
        return true;
    }

    @Override
    public  Boolean UpdateRespuestaCheckin(EditarRespuestaCheckinDTO res){
        funcionarioRepository.updateRespuestaCheckin(res.getId(),res.getRespuesta_ci());
        return true;
    }

    @Override
    public  Boolean UpdateRespuestaCheckout(EditarRespuestaCheckoutDTO out){
        funcionarioRepository.updateRespuestaCheckout(out.getId(),out.getRespuesta_co());
        return true;
    }

    @Override
    public List<Map<String, transporteDTO>> transportes(int id) {
        return funcionarioRepository.transportes(id);
    }

    @Override
    public void UpdateEstadoTransporte(UpdateTransporteDTO update) {
        funcionarioRepository.updateEstadoTransporte(update.getId(), update.getEstado());
    }

    @Override
    public List<Map<String, LastInventoryDTO>> lastInventory(int id) {
        return funcionarioRepository.lastInventory(id);
    }

    @Override
    public List<Map<String, LastMantencionDTO>> lastMantencion(int id) {
        return funcionarioRepository.lastMantencion(id);
    }
}
