package com.portafolio.api.service.impl;

import com.portafolio.api.dto.cliente.ReservaDepartamentoDTO;
import com.portafolio.api.repository.ClienteReservaRepository;
import com.portafolio.api.service.ClienteReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ClienteReservaServiceImpl implements ClienteReservaService {

    @Autowired
    private ClienteReservaRepository clienteReservaRepository;

    @Override
    public List<Map<String, ReservaDepartamentoDTO>> reservaDepartamento(int id) {
        return clienteReservaRepository.reservaDepartamento(id);
    }
}
