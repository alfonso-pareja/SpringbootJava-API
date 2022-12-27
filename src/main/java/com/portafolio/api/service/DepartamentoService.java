package com.portafolio.api.service;

import com.portafolio.api.dto.*;
import com.portafolio.api.dto.cliente.ClienteMultaDTO;
import com.portafolio.api.dto.cliente.DepartamentosDTO;
import com.portafolio.api.entity.Departamento;

import java.util.List;
import java.util.Map;

public interface DepartamentoService {

    /**
     * Agregar departamento
     * @param departamento
     */
    void addDepartament(DepartamentoDTO departamento);

    /**
     * Actualizar departamento
     * @param departamento
     */
    void updateDepartment(DepartamentoDTO departamento);

    /**
     * Retorna una lista de departamentos
     * @return
     */
    List<Departamento> Deparments();

    /**
     * Retorna el departamento solicitado por id
     * @param id
     * @return
     */
    Departamento GetDepartmentById(int id);

    /**
     * Agrega un registro de departamento
     * @param dept
     */
    void SaveDepartment(Departamento dept);

    /**
     * Actualiza un registro de departamento
     * @param dept
     * @return
     */
    Boolean UpdateDepartment(Departamento dept);

    /**
     * Elimina un departamento por id
     * @param id
     * @return
     */
    Boolean DeleteDepartment(int id);

    /**
     *
     * @return
     */
    TipoDepartamentoDTO TypeDepartment();

///////

    /**
     * Retorna una lista de checkins
     * @return
     */
    List<Map<String, DeptoCheckinDTO>> Checkins();


    /**
     * Retorna una lista de checkouts
     * @return
     */
    List<Map<String, DeptoCheckoutDTO>> Checkouts();


    /**
     * Retorna el checklist del checkin
     * @param id
     * @return
     */

    List<Map<String, PreguntaDTO>> GetChecklistCiById(int id);

    /**
     * Retorna el checklist del checkout
     * @param id
     * @return
     */

    List<Map<String, PreguntaDTO>> GetChecklistCoById(int id);

    /**
     * Retorna los inventarios del departamento
     * @param id
     * @return
     */

     List<Map<String, DeptoInventarioDTO>> GetInventario(int id);

    /**
     * Retorna el detalle del inventario
     * @param id
     * @param id2
     * @return
     */

    List<Map<String, InventarioDetalleDTO>> InventarioDetail(int id, int id2);

    /**
     * Retorna la mantencion del departamento
     * @param id
     * @return
     */

    List<Map<String, DeptoMantencionDTO>> Mantencion(int id);

    /**
     * Retorna el detalle de la mantencion
     * @param id
     * @param id2
     * @return
     */

    List<Map<String, MantencionDetalleDTO>> MantencionDetail(int id, int id2);

    /**
     * Agregar preguntas checklist al departamento
     * @param pregunta
     */

    void SaveQuestionsDept(CrearPreguntaDTO pregunta);

    /**
     * Retorna productos del departamento
     * @param id
     * @return
     */

    List<Map<String, ProductoDTO>> GetProductByDeptId(int id);

    /**
     * Retorna preguntas y respuestas del departamento por reserva
     * @param id , int reserva_id
     * @return
     */
    List<Map<String, DeptoPreguntaDTO>> GetQuestionByDeptId(int id);


    /**
     * Retorna preguntas del departamento
     * @param id
     * @return
     */
    List<Map<String, DeptoPreguntaDTO>> GetQuestionsByDeptId(int id);




    /**
     * Elimina una pregunta por id
     * @param id
     * @return
     */
    Boolean DeleteQuestion(int id);

    /**
     * Editar asignacion de inventario
     * @param inventario
     */
    void UpdateInventario(EditarInventarioDTO inventario);

    /**
     * Editar asignacion de mantencion
     * @param mantencion
     * @return
     */
    Boolean UpdateMantencion(EditarMantencionDTO mantencion);

    /**
     * Editar asignacion de mantencion
     * @param estado
     * @return
     */
    Boolean UpdateEstadoMantencion(EstadoMantencionDTO estado);


    /**
     * Elimina un producto por id
     * @param id
     * @param id2
     * @return
     */
    Boolean DeleteProductByDept(int id, int id2);

    /**
     * Agregar preguntas checklist al departamento
     * @param inventario
     */
    void SaveInventoryDept(CrearInventarioDTO inventario);

    /**
     * Agregar preguntas checklist al departamento
     * @param mantencion
     */

    void SaveMaintenanceDept(CrearMantencionDTO mantencion);

    /**
     * Agregar productos por departamento
     * @param producto
     */

    void SaveProductByDept(ProductoDeptoDTO producto);

    /**
     * Retorna una lista de funcionarios
     * @param
     * @return
     */

    List<Map<String, EstadoInventarioDTO>> getInventarios();


    /**
     * Retorna una lista de productos
     * @param
     * @return
     */

    List<Map<String, ProductoDTO>> getProductos();


    /**
     * Retorna porcentaje ocupacion
     * @param id
     * @return
     */
    List<Map<String, DepartamentoDetalleDTO>> getDetalleDepto(int id);


    /**
     * Lista de departamentos
     * @return
     */
    List<Map<String, DepartamentosDTO>> departamentos();

    /**
     * Multas asociadas a un departamento
     * @param id
     * @return
     */
    List<Map<String, ClienteMultaDTO>> multas(int id);

    /**
     * Detalle de un departamento
     * @param id
     * @return
     */
    List<Map<String, DepartamentosDTO>> departamento(int id);

}
