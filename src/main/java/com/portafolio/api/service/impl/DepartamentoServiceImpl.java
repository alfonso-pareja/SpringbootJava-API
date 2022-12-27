package com.portafolio.api.service.impl;

import com.portafolio.api.dto.*;
import com.portafolio.api.dto.cliente.ClienteMultaDTO;
import com.portafolio.api.dto.cliente.DepartamentosDTO;
import com.portafolio.api.entity.Departamento;
import com.portafolio.api.repository.DepartamentoRepository;
import com.portafolio.api.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    public DepartamentoRepository departamentoRepository;


    @Override
    public void addDepartament(DepartamentoDTO departamento) {
        departamentoRepository.addDepartment(
                departamento.getDormitorios(),
                departamento.getMt2(),
                departamento.getNumero(),
                departamento.getBanos(),
                departamento.getPiso(),
                departamento.getFecha_construccion(),
                departamento.getEvaluo(),
                departamento.getDireccion(),
                departamento.getValor_arriendo(),
                departamento.getPorc_anticipo(),
                departamento.getNombre_edificio(),
                departamento.getTipodepartamento_id(),
                departamento.getEstadodepartamento_id(),
                departamento.getComuna_id(),
                departamento.getImagen(),
                departamento.getImagen2(),
                departamento.getImagen3()
        );
    }

    @Override
    public void updateDepartment(DepartamentoDTO departamento) {
        departamentoRepository.updateDepartment(
                departamento.getId(),
                departamento.getDormitorios(),
                departamento.getMt2(),
                departamento.getNumero(),
                departamento.getBanos(),
                departamento.getPiso(),
                departamento.getFecha_construccion(),
                departamento.getEvaluo(),
                departamento.getDireccion(),
                departamento.getValor_arriendo(),
                departamento.getPorc_anticipo(),
                departamento.getNombre_edificio(),
                departamento.getTipodepartamento_id(),
                departamento.getEstadodepartamento_id(),
                departamento.getComuna_id(),
                departamento.getImagen(),
                departamento.getImagen2(),
                departamento.getImagen3()
        );
    }

    @Override
    public List<Departamento> Deparments() {
        return (List<Departamento>) departamentoRepository.findAll();
    }

    @Override
    public Departamento GetDepartmentById(int id) {
        return departamentoRepository.findById(id).get();
    }

    @Override
    public void SaveDepartment(Departamento dept) {
       departamentoRepository.save(dept);
    }

    @Override
    public Boolean UpdateDepartment(Departamento dept) {
        boolean exists = departamentoRepository.existsById(dept.getId());
        if(!exists)
            return false;

        departamentoRepository.save(dept);
        return true;
    }

    @Override
    public Boolean DeleteDepartment(int id) {
        boolean exists = departamentoRepository.existsById(id);
        if(!exists)
            return false;

        departamentoRepository.removeProductoDepartamento(id);
        departamentoRepository.removeInventarioDepartamento(id);
        departamentoRepository.removePreguntaDepartamento(id);
        departamentoRepository.removeMantencionDepartamento(id);
        departamentoRepository.deleteById(id);
        return true;
    }

    @Override
    public TipoDepartamentoDTO TypeDepartment() {
        return null;
    }

    @Override
    public List<Map<String, DeptoCheckinDTO>>Checkins() {
        List<Map<String, DeptoCheckinDTO>> checkins = departamentoRepository.findAllCheckins();
        return checkins;
    }

    @Override
    public List<Map<String, DeptoCheckoutDTO>> Checkouts() {
        List<Map<String, DeptoCheckoutDTO>> checkouts = departamentoRepository.findAllCheckouts();
        return checkouts;
    }

    @Override
    public List<Map<String, PreguntaDTO>> GetChecklistCiById(int id) {
        return departamentoRepository.findChecklistCiById(id);
    }

    @Override
    public List<Map<String, PreguntaDTO>> GetChecklistCoById(int id) {
        return departamentoRepository.findChecklistCoById(id);
    }

    @Override
    public List<Map<String, DeptoInventarioDTO>> GetInventario(int id) {
        return  departamentoRepository.findInventario(id);

    }

    @Override
    public List<Map<String, InventarioDetalleDTO>> InventarioDetail(int id, int id2) {
        List<Map<String, InventarioDetalleDTO>> detalle = departamentoRepository.findAnswersByDeptId(id,id2);
        return detalle;
    }

    @Override
    public List<Map<String, DeptoMantencionDTO>> Mantencion(int id) {
        List<Map<String, DeptoMantencionDTO>> mantencion = departamentoRepository.findMaintenanceByDeptId(id);
        return mantencion;
    }

    @Override
    public List<Map<String, MantencionDetalleDTO>> MantencionDetail(int id, int id2) {
        List<Map<String, MantencionDetalleDTO>> detalle = departamentoRepository.findMantencionDetailByDeptId(id, id2);
        return detalle;
    }

    @Override
    public void SaveQuestionsDept(CrearPreguntaDTO pregunta) {
        departamentoRepository.createQuestionByDept(pregunta.getPregunta(), pregunta.getObservacion(), pregunta.getCantidad(),pregunta.getFlag_depto());
    }

    @Override
    public List<Map<String, ProductoDTO>> GetProductByDeptId(int id) {
        return departamentoRepository.findProductByDeptId(id);
    }

    @Override
    public List<Map<String, DeptoPreguntaDTO>> GetQuestionByDeptId(int id) {
        return departamentoRepository.findQuestionByDeptId(id);
    }

    @Override
    public List<Map<String, DeptoPreguntaDTO>> GetQuestionsByDeptId(int id) {
        return departamentoRepository.findQuestionsByDeptId(id);
    }

    @Override
    public Boolean DeleteQuestion(int id) {
        departamentoRepository.deleteQuestion(id);
        return true;
    }

    @Override
    public void UpdateInventario(EditarInventarioDTO inventario) {
        departamentoRepository.updateAsignacionInventario(
                inventario.getId(),
                inventario.getNombre(),
                inventario.getUsuario_id(),
                inventario.getFecha_inicio(),
                inventario.getDescripcion(),
                inventario.getEstado_inventario_id()
        );
    }

    @Override
    public Boolean UpdateMantencion(EditarMantencionDTO mantencion) {
        departamentoRepository.updateAsignacionMantencion(
                mantencion.getId(),
                mantencion.getFecha_inicio(),
                mantencion.getDescripcion(),
                mantencion.getNombre(),
                mantencion.getUsuario_id()
        );
        return  true;
    }

    @Override
    public Boolean UpdateEstadoMantencion(EstadoMantencionDTO estado) {
        departamentoRepository.updateEstadoMantencion(estado.getId(),estado.getEstado());
        return true;
    }

    @Override
    public Boolean DeleteProductByDept(int id, int id2) {
        departamentoRepository.deleteProductByDept(id, id2);
        return true;
    }

    @Override
    public void SaveInventoryDept(CrearInventarioDTO inventario) {
        departamentoRepository.createAsignacionInventario(
                inventario.getNombre(),
                inventario.getFecha_inicio(),
                inventario.getDescripcion(),
                inventario.getUsuario_id(),
                inventario.getEstado_inventario_id(),
                inventario.getDepto()
        );
    }

    @Override
    public void SaveMaintenanceDept(CrearMantencionDTO mantencion) {
        departamentoRepository.insertMantencion(
                mantencion.getNombre(),
                mantencion.getDescripcion(),
                mantencion.getFecha_inicio(),
                mantencion.getEstado(),
                mantencion.getUsuario_id(),
                mantencion.getDepto()
        );
    }

    @Override
    public void SaveProductByDept(ProductoDeptoDTO producto) {
        departamentoRepository.insertProductByDept(producto.getDepartamento_id(),producto.getProducto_id(), producto.getCantidad());
    }

    @Override
    public List<Map<String, EstadoInventarioDTO>> getInventarios() {
        return departamentoRepository.getEstadosInventario();
    }

    @Override
    public List<Map<String, ProductoDTO>> getProductos() {
        return  departamentoRepository.getListaProducto();
    }

    @Override
    public List<Map<String, DepartamentoDetalleDTO>> getDetalleDepto(int id) {
        return departamentoRepository.getDepartamentoDetalle(id);
    }

    @Override
    public List<Map<String, DepartamentosDTO>> departamentos() {
        return departamentoRepository.clienteDepartamentos();
    }

    @Override
    public List<Map<String, ClienteMultaDTO>> multas(int id) {
        return departamentoRepository.clienteMultas(id);
    }

    @Override
    public List<Map<String, DepartamentosDTO>> departamento(int id) {
        return departamentoRepository.clienteDepartamento(id);
    }


}
