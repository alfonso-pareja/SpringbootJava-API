package com.portafolio.api.controller;

import com.portafolio.api.dto.addProductoDTO;
import com.portafolio.api.entity.Producto;
import com.portafolio.api.model.ResponseHandler;
import com.portafolio.api.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService productoService;



    @GetMapping({ "/producto" })
    public ResponseEntity<Object> getProducto(){
        List<Producto> productos = productoService.Products();
        return ResponseHandler.send("Lista de productos", HttpStatus.OK, productos);
    }


    @GetMapping({ "/producto/{productoid}" })
    public ResponseEntity<Object> getProducto(@PathVariable("productoid") int productoid){
        try{
            Producto producto = productoService.GetProductById(productoid);

            if(producto == null){
                return ResponseHandler.send("Producto no encontrado", HttpStatus.BAD_REQUEST, null);
            }
            return ResponseHandler.send("Ok", HttpStatus.OK, producto);

        } catch (Exception ex){
            return ResponseHandler.send("Producto no encontrado", HttpStatus.OK, null);
        }

    }


    @PostMapping({ "/producto" })
    public ResponseEntity<Object> saveProducto(@RequestBody addProductoDTO producto){
        productoService.AddProduct(producto);
        return ResponseHandler.send("Registro Guardado!", HttpStatus.OK, null);
    }


    @PutMapping({ "/producto" })
    public ResponseEntity<Object> updateProducto(@RequestBody addProductoDTO producto){
        try{
            productoService.updateProducto(producto);
            return ResponseHandler.send("Producto Actualizado!", HttpStatus.OK, null);
        }catch (Exception ex){
            return ResponseHandler.send("Campos incompletos!", HttpStatus.OK, null);
        }

    }


    @DeleteMapping({ "/producto/{productoid}" })
    public ResponseEntity<Object> deleteProducto(@PathVariable("productoid") int productoid){
        boolean delete = productoService.DeleteProduct(productoid);
        if(delete){
            return ResponseHandler.send("Producto Eliminado!", HttpStatus.OK, null);
        }

        return ResponseHandler.send("Producto no existe!", HttpStatus.OK, null);
    }

}
