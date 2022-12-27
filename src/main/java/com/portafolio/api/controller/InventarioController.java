package com.portafolio.api.controller;

import com.portafolio.api.dto.EditarInventarioDescripcionDTO;
import com.portafolio.api.dto.EditarInventarioObservacionDTO;
import com.portafolio.api.dto.ListaInventarioDTO;
import com.portafolio.api.dto.ListaInventarioIdDTO;
import com.portafolio.api.dto.funcionario.*;
import com.portafolio.api.model.ResponseHandler;
import com.portafolio.api.service.FuncionarioService;
import com.portafolio.api.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class InventarioController {

    @Autowired
    private InventoryService inventoryService;
    @Autowired
    private FuncionarioService funcionarioService;



    @GetMapping({ "/funcionario/inventario/{inventario_id}" })
    public ResponseEntity<Object> getInventory(@PathVariable("inventario_id") int inventario_id){
        try{
            List<Map<String, InventoryDTO>> inv = inventoryService.GetInventory(inventario_id);
            return ResponseHandler.send("OK", HttpStatus.OK, inv);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se logro obtener los datos", HttpStatus.OK, null);
        }
    }

    @GetMapping({ "/funcionario/inventario/{inventario_id}/departamento/{departamento_id}/productos" })
    public ResponseEntity<Object> getInventoryProducts(@PathVariable("inventario_id") int inventario_id, @PathVariable("departamento_id") int departamento_id){
        try{
            List<Map<String, ProductsInventoryDTO>> inv = inventoryService.GetInventoryProducts(inventario_id, departamento_id);
            return ResponseHandler.send("OK", HttpStatus.OK, inv);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se logro obtener los datos", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/funcionario/{funcionarioid}/inventario" })
    public ResponseEntity<Object> GetLastInventoryByUser(@PathVariable("funcionarioid") int id){
        try{
            List<Map<String, ListaInventarioIdDTO>> inventario = funcionarioService.GetLastInventoryByUser(id);

            if(inventario == null){
                return ResponseHandler.send("Inventario no encontrado", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, inventario);

        } catch (Exception ex){
            return ResponseHandler.send("Inventario no encontrado", HttpStatus.OK, null);
        }
    }


    @GetMapping({ "/funcionario/{funcionarioid}/asignacion/inventario" })
    public ResponseEntity<Object> GetInventoryByUser(@PathVariable("funcionarioid")  int id){
        try{
            List<Map<String, ListaInventarioDTO>> inv = funcionarioService.GetInventoryByUser(id);

            if(inv == null){
                return ResponseHandler.send("Inventario no encontrado", HttpStatus.BAD_REQUEST, null);
            }

            return ResponseHandler.send("OK", HttpStatus.OK, inv);

        } catch (Exception ex){
            return ResponseHandler.send("Inventario no encontrado", HttpStatus.OK, null);
        }
    }


    @PutMapping({ "/funcionario/asignacion/inventario/observacion" })
    public ResponseEntity<Object> updateinventarioobservacion(@RequestBody EditarInventarioObservacionDTO inventario){
        try{
            boolean update = funcionarioService.UpdateInventarioobservacion(inventario);
            if(update){
                return ResponseHandler.send("Inventario cancelado!", HttpStatus.OK, null);
            }

            return ResponseHandler.send("Inventario no existe!", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }


    @PutMapping({ "/funcionario/asignacion/inventario/descripcion" })
    public ResponseEntity<Object> updateinventariodescripcion(@RequestBody EditarInventarioDescripcionDTO inven){
        try{
            boolean update = funcionarioService.UpdateInventariodescripcion(inven);
            if(update){
                return ResponseHandler.send("Inventario cancelado!", HttpStatus.OK, null);
            }

            return ResponseHandler.send("Inventario no existe!", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }


    @GetMapping({ "/funcionario/inventario/estados" })
    public ResponseEntity<Object> EstadosInventario(){
        try{
            List<Map<String, EstadoInventarioDTO>> inv = inventoryService.EstadoInventario();
            return ResponseHandler.send("OK", HttpStatus.OK, inv);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se logro obtener los datos", HttpStatus.OK, null);
        }
    }


    @PostMapping({ "/funcionario/inventario/productos" })
    public ResponseEntity<Object> updateQuestionCheckOut(@RequestBody List<UpdateProductInventoryDTO> productos ){
        try{
            inventoryService.UpdateProducts(productos);
            return ResponseHandler.send("OK", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se lograron actualizar las preguntas", HttpStatus.OK, null);
        }
    }


    @PostMapping({ "/funcionario/inventario" })
    public ResponseEntity<Object> updateQuestionCheckOut(@RequestBody UpdateInventoryDTO inventario ){
        try{
            inventoryService.UpdateInventory(inventario);
            return ResponseHandler.send("OK", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se lograron actualizar las preguntas", HttpStatus.OK, null);
        }
    }

}
