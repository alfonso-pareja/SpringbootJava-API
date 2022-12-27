package com.portafolio.api.service.impl;

import com.portafolio.api.dto.addProductoDTO;
import com.portafolio.api.entity.Producto;
import com.portafolio.api.repository.ProductoRepository;
import com.portafolio.api.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    public ProductoRepository productoRepository;

    @Override
    public List<Producto> Products() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto GetProductById(int id) {
        return productoRepository.findById(id).get();
    }

    @Override
    public void SaveProduct(Producto producto) {
        System.out.println(producto.getFechaIngreso());
        productoRepository.save(producto);
    }

    @Override
    public void AddProduct(addProductoDTO producto) {
        productoRepository.createProduct(
                producto.getFecha_ingreso(),
                producto.getCategoriaproducto_id(),
                producto.getCodigo(),
                producto.getDescripcion(),
                producto.getNombre(),
                producto.getValor()
        );
    }

    @Override
    public void updateProducto(addProductoDTO producto) {
        productoRepository.updateProduct(
                producto.getId(),
                producto.getNombre(),
                producto.getCodigo(),
                producto.getDescripcion(),
                producto.getFecha_ingreso(),
                producto.getValor(),
                producto.getCategoriaproducto_id()
        );
    }

    @Override
    public Boolean UpdateProduct(Producto producto) {
        boolean exists = productoRepository.existsById(producto.getId());
        if(!exists)
            return false;

        productoRepository.save(producto);
        return true;
    }

    @Override
    public Boolean DeleteProduct(int id) {
        boolean exists = productoRepository.existsById(id);
        if(!exists)
            return false;

        productoRepository.deleteById(id);
        return true;
    }
}
