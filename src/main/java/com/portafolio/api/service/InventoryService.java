package com.portafolio.api.service;

import com.portafolio.api.dto.funcionario.*;

import java.util.List;
import java.util.Map;

public interface InventoryService {

    /**
     *
     * @return
     */
    List<Map<String, InventoryDTO>> GetInventory(int inventario_id);

    /**
     *
     * @param inventario_id
     * @return
     */
    List<Map<String, ProductsInventoryDTO>> GetInventoryProducts(int inventario_id, int departamento_id);


    /**
     * Lista de estados
     * @return
     */
    List<Map<String, EstadoInventarioDTO>> EstadoInventario();

    /**
     * Actualizar productos de un inventario
     * @param products
     */
    void UpdateProducts(List<UpdateProductInventoryDTO> products);

    /**
     * Actualizar inventario
     * @param inventory
     */
    void UpdateInventory(UpdateInventoryDTO inventory);

}
