package com.portafolio.api.service.impl;

import com.portafolio.api.dto.funcionario.*;
import com.portafolio.api.repository.InventarioRepository;
import com.portafolio.api.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    public InventarioRepository inventarioRepository;

    @Override
    public List<Map<String, InventoryDTO>> GetInventory(int inventario_id) {
        return inventarioRepository.Inventory(inventario_id);
    }

    @Override
    public List<Map<String, ProductsInventoryDTO>> GetInventoryProducts(int inventario_id, int departamento_id) {
        return inventarioRepository.ListProducts(inventario_id, departamento_id);
    }

    @Override
    public List<Map<String, EstadoInventarioDTO>> EstadoInventario() {
        return inventarioRepository.EstadoInventario();
    }

    @Override
    public void UpdateProducts(List<UpdateProductInventoryDTO> products) {
        products.forEach((q) -> {
            inventarioRepository.UpdateProducts(q.getRespuesta(), q.getId());
        });
    }

    @Override
    public void UpdateInventory(UpdateInventoryDTO inventory) {
        inventarioRepository.UpdateInventory(inventory.getEstado_id(), inventory.getFecha_termino(), inventory.getObservacion(), inventory.getId());
    }

}
