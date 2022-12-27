package com.portafolio.api.service;

import com.portafolio.api.dto.addProductoDTO;
import com.portafolio.api.entity.Producto;

import java.util.List;

public interface ProductoService {

    /**
     * Retorna una lista de productos
     * @return
     */
    List<Producto> Products();

    /**
     * Obtiene un producto desde el id entregado
     * @param id
     * @return
     */
    Producto GetProductById(int id);

    /**
     * Ingresa un nuevo registro de producto
     * @param producto
     */
    void SaveProduct(Producto producto);

    /**
     * Agregar producto
     * @param producto
     */
    void AddProduct(addProductoDTO producto);

    /**
     *
     * @param producto
     */
    void updateProducto(addProductoDTO producto);

    /**
     * Actualiza un producto
     * @param producto
     * @return
     */
    Boolean UpdateProduct(Producto producto);

    /**
     * Elimina un producto por id
     * @param id
     * @return
     */
    Boolean DeleteProduct(int id);

}
