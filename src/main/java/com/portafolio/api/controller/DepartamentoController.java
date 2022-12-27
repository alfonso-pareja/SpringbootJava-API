package com.portafolio.api.controller;

import com.portafolio.api.dto.*;
import com.portafolio.api.dto.cliente.ClienteMultaDTO;
import com.portafolio.api.dto.cliente.DepartamentosDTO;
import com.portafolio.api.entity.Departamento;
import com.portafolio.api.entity.Producto;
import com.portafolio.api.model.ResponseHandler;
import com.portafolio.api.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;


    @GetMapping({ "/departamento" })
    public ResponseEntity<Object> getDepartment(){
        List<Departamento> depart = departamentoService.Deparments();
        return ResponseHandler.send("Lista de departamentos", HttpStatus.OK, depart);
    }


    @GetMapping({ "/departamento/{departmentid}" })
    public ResponseEntity<Object> getDepartment(@PathVariable("departmentid") int departmentid){
        try{
            Departamento depa = departamentoService.GetDepartmentById(departmentid);
            if(depa == null){
                return ResponseHandler.send("Departamento no encontrado", HttpStatus.BAD_REQUEST, null);
            }
            return ResponseHandler.send("OK", HttpStatus.OK, depa);
        } catch (Exception ex){
            return ResponseHandler.send("Departamento no encontrado", HttpStatus.OK, null);
        }
    }


    @PostMapping({ "/departamento" })
    public ResponseEntity<Object> saveDepartament(@RequestBody Departamento departamento){
        departamentoService.SaveDepartment(departamento);
        return ResponseHandler.send("Departamento ingresado", HttpStatus.OK, null);
    }


    @PostMapping({ "/departamento/add" })
    public ResponseEntity<Object> addDepartament(@RequestBody DepartamentoDTO departamento){
        departamentoService.addDepartament(departamento);
        return ResponseHandler.send("Departamento ingresado", HttpStatus.OK, null);
    }


    @PostMapping({ "/departamento/update" })
    public ResponseEntity<Object> updateDepartment(@RequestBody DepartamentoDTO departamento){
        departamentoService.updateDepartment(departamento);
        return ResponseHandler.send("Departamento Actualizado!", HttpStatus.OK, null);
    }


    @PutMapping({ "/departamento" })
    public ResponseEntity<Object> updateDepartament(@RequestBody Departamento departamento){
        try{
            boolean update = departamentoService.UpdateDepartment(departamento);
            if(update){
                return ResponseHandler.send("Departamento Actualizado!", HttpStatus.OK, null);
            }
            return ResponseHandler.send("Departamento no existe!", HttpStatus.OK, null);
        }catch (Exception ex){
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }

    @GetMapping({ "/departamento/rm/{departmentid}" })
    public ResponseEntity<Object> deleteDepartment(@PathVariable("departmentid") int departmentid){
        Boolean delete = departamentoService.DeleteDepartment(departmentid);
        if(delete){
            return ResponseHandler.send("Departamento Eliminado!", HttpStatus.OK, null);
        }
        return ResponseHandler.send("Departamento no existe!", HttpStatus.OK, null);
    }


    @GetMapping({ "/departamento/checkins" })
    public ResponseEntity<Object> getCheckins() {
        List<Map<String, DeptoCheckinDTO>> checkins = departamentoService.Checkins();
        return ResponseHandler.send("Lista de Checkins",HttpStatus.OK, checkins);
    }

    @GetMapping({ "/departamento/checkouts" })
    public ResponseEntity<Object> getCheckouts() {
        List<Map<String, DeptoCheckoutDTO>> checkouts = departamentoService.Checkouts();
        return ResponseHandler.send("Lista de Checkouts",HttpStatus.OK, checkouts);
    }

    @GetMapping({ "/departamento/checkins/checklist/{checkinid}" })
    public ResponseEntity<Object> getChecklistCi(@PathVariable("checkinid") int checkinid){
        try{
            List<Map<String, PreguntaDTO>> check = departamentoService.GetChecklistCiById(checkinid);
            if(check == null){
                return ResponseHandler.send("Checklist no encontrado", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, check);

        } catch (Exception ex){
            return ResponseHandler.send("Checklist no encontrado", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/departamento/checkouts/checklist/{checkoutid}" })
    public ResponseEntity<Object> getChecklistCo(@PathVariable("checkoutid") int checkoutid){
        try{
            List<Map<String, PreguntaDTO>> check = departamentoService.GetChecklistCoById(checkoutid);

            if(check == null){
                return ResponseHandler.send("Checklist no encontrado", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, check);

        } catch (Exception ex){
            return ResponseHandler.send("Checklist no encontrado", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/departamento/{id}/inventarios" })
    public ResponseEntity<Object> getInventario(@PathVariable("id") int id){
        try{
            List<Map<String, DeptoInventarioDTO>> inventario = departamentoService.GetInventario(id);

            if(inventario == null){
                return ResponseHandler.send("Sin inventarios registrados", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, inventario);

        } catch (Exception ex){
            return ResponseHandler.send("Sin inventarios registrados", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/departamento/{departmentid}/inventario/{inventoryid}" })
    public ResponseEntity<Object> getDetalleInventario(@PathVariable("departmentid") int id, @PathVariable("inventoryid") int id2){
        try{
            List<Map<String, InventarioDetalleDTO>> inventario = departamentoService.InventarioDetail(id, id2);

            if(inventario == null){
                return ResponseHandler.send("Inventario no encontrado", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, inventario);

        } catch (Exception ex){
            return ResponseHandler.send("Inventario no encontrado", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/departamento/{id}/mantenciones" })
    public ResponseEntity<Object> getMantencion(@PathVariable("id") int id){
        try{
            List<Map<String, DeptoMantencionDTO>> mantencion = departamentoService.Mantencion(id);

            if(mantencion == null){
                return ResponseHandler.send("Inventario no encontrado", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, mantencion);

        } catch (Exception ex){
            return ResponseHandler.send("Inventario no encontrado", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/departamento/{departmentid}/mantencion/{maintanceid}" })
    public ResponseEntity<Object> getDetalleMantencion(@PathVariable("departmentid") int id, @PathVariable("maintanceid")int id2){
        try{
            List<Map<String, MantencionDetalleDTO>> mantencion = departamentoService.MantencionDetail(id, id2);

            if(mantencion == null){
                return ResponseHandler.send("Mantencion no registrada", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, mantencion);

        } catch (Exception ex){
            return ResponseHandler.send("Mantencion no registrada", HttpStatus.OK, null);
        }
    }

    @PostMapping({ "/departamento/checklist/agregar" })
    public ResponseEntity<Object> saveQuestionDept(@RequestBody CrearPreguntaDTO pregunta){
        departamentoService.SaveQuestionsDept (pregunta);
        return ResponseHandler.send("pregunta ingresada", HttpStatus.OK, null);
    }


    @GetMapping({ "/departamento/{id}/productos" })
    public ResponseEntity<Object> getProductos(@PathVariable("id") int id){
        try{
            List<Map<String, ProductoDTO>> producto = departamentoService.GetProductByDeptId(id);
            if(producto == null){
                return ResponseHandler.send("Sin productos registrados", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, producto);

        } catch (Exception ex){
            return ResponseHandler.send("Sin productos registrados", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/departamento/{id}/preguntas" })
    public ResponseEntity<Object> getPreguntasDepto(@PathVariable("id") int id){
        try{
            List<Map<String, DeptoPreguntaDTO>> preguntas = departamentoService.GetQuestionsByDeptId(id);
            if(preguntas == null)
                return ResponseHandler.send("Sin preguntas registrados", HttpStatus.BAD_REQUEST, null);

            return ResponseHandler.send("OK", HttpStatus.OK, preguntas);

        } catch (Exception ex){
            return ResponseHandler.send("Sin preguntas registrados", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/departamento/{id}/reserva/{reserva_id}/preguntas" })
    public ResponseEntity<Object> getPreguntas(@PathVariable("id") int id, @PathVariable("reserva_id") int reserva_id){
        try{
            List<Map<String, DeptoPreguntaDTO>> pregunta = departamentoService.GetQuestionByDeptId(id);

            if(pregunta == null){
                return ResponseHandler.send("Sin productos registrados", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, pregunta);

        } catch (Exception ex){
            return ResponseHandler.send("Sin productos registrados", HttpStatus.OK, null);
        }
    }


    @DeleteMapping({ "/departamento/pregunta/{preguntaid}" })
    public ResponseEntity<Object> deleteQuestion(@PathVariable("preguntaid") int preguntaid){
        Boolean delete = departamentoService.DeleteQuestion(preguntaid);
        if(delete){
            return ResponseHandler.send("Pregunta Eliminada!", HttpStatus.OK, null);
        }

        return ResponseHandler.send("Pregunta no existe!", HttpStatus.OK, null);
    }


    @PutMapping({ "/departamento/inventario" })
    public ResponseEntity<Object> updateInventory(@RequestBody EditarInventarioDTO inventario){
        try{
            departamentoService.UpdateInventario(inventario);
            return ResponseHandler.send("Asignacion de inventario Actualizada!", HttpStatus.OK, null);

        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }


    @PutMapping({ "/departamento/mantencion" })
    public ResponseEntity<Object> updateMaintenance(@RequestBody EditarMantencionDTO mantencion){
        try{
            boolean update = departamentoService.UpdateMantencion(mantencion);
            if(update){
                return ResponseHandler.send("Asignacion de mantencion Actualizada!", HttpStatus.OK, null);
            }

            return ResponseHandler.send("Mantencion no existe!", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }


    @PutMapping({ "/departamento/mantencion/editar" })
    public ResponseEntity<Object> updateEstadoMaintenance(@RequestBody EstadoMantencionDTO estado){
        try{
            boolean update = departamentoService.UpdateEstadoMantencion(estado);
            if(update){
                return ResponseHandler.send("Mantencion cancelada!", HttpStatus.OK, null);
            }

            return ResponseHandler.send("Mantencion no existe!", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }


    @DeleteMapping({ "/departamento/{deptoid}/producto/{productoid}" })
    public ResponseEntity<Object> deleteProduct(@PathVariable("deptoid") int deptoid, @PathVariable("productoid")int productoid){
        Boolean delete = departamentoService.DeleteProductByDept(deptoid,productoid);
        if(delete){
            return ResponseHandler.send("Producto Eliminado!", HttpStatus.OK, null);
        }

        return ResponseHandler.send("Producto no existe!", HttpStatus.OK, null);
    }


    @PostMapping({ "/departamento/inventario/agregar" })
    public ResponseEntity<Object> saveInventarioDept(@RequestBody CrearInventarioDTO inventario){
        departamentoService.SaveInventoryDept (inventario);
        return ResponseHandler.send("inventario ingresado", HttpStatus.OK, null);
    }


    @PostMapping({ "/departamento/mantencion/agregar" })
    public ResponseEntity<Object> saveMantencionDept(@RequestBody CrearMantencionDTO mantencion){
        departamentoService.SaveMaintenanceDept(mantencion);
        return ResponseHandler.send("mantencion ingresada", HttpStatus.OK, null);
    }


    @PostMapping({ "/departamento/producto/agregar" })
    public ResponseEntity<Object> saveProductDept(@RequestBody ProductoDeptoDTO producto){
        departamentoService.SaveProductByDept (producto);
        return ResponseHandler.send("producto ingresado", HttpStatus.OK, null);
    }


    @GetMapping({ "/departamento/estadoinventario" })
    public ResponseEntity<Object> getEstados(){
        List<Map<String, EstadoInventarioDTO>> states = departamentoService.getInventarios();
        return ResponseHandler.send("Lista de inventarios", HttpStatus.OK, states);
    }


    @GetMapping({ "/departamento/productos" })
    public ResponseEntity<Object> getProductos(){
        List<Map<String, ProductoDTO>> prod = departamentoService.getProductos();
        return ResponseHandler.send("Lista de productos", HttpStatus.OK, prod);
    }


    @GetMapping({ "/departamento/{id}/detalle" })
    public ResponseEntity<Object> getDetalleDepto(@PathVariable("id") int id){
        try{
            List<Map<String, DepartamentoDetalleDTO>> detalle = departamentoService.getDetalleDepto(id);

            if(detalle == null){
                return ResponseHandler.send("Departamento no registrado", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, detalle);

        } catch (Exception ex){
            return ResponseHandler.send("Departamento no encontrado", HttpStatus.OK, null);
        }
    }


    @GetMapping({"/cliente/departamentos"})
    public ResponseEntity<Object> Departamentos(){
        List<Map<String, DepartamentosDTO>> depto = departamentoService.departamentos();
        return ResponseHandler.send("OK", HttpStatus.OK, depto);
    }

    @GetMapping({"/cliente/{cliente_id}/multas"})
    public ResponseEntity<Object> MultasCliente(@PathVariable("cliente_id") int cliente_id){
        List<Map<String, ClienteMultaDTO>> multa = departamentoService.multas(cliente_id);
        return ResponseHandler.send("OK", HttpStatus.OK, multa);
    }


    @GetMapping({"/cliente/departamento/{departmentid}"})
    public ResponseEntity<Object> Departamento(@PathVariable("departmentid") int id){
        List<Map<String, DepartamentosDTO>> depto = departamentoService.departamento(id);
        return ResponseHandler.send("OK", HttpStatus.OK, depto);
    }


}
