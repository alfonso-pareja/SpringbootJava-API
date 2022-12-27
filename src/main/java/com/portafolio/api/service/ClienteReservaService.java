package com.portafolio.api.service;

import com.portafolio.api.dto.cliente.DepartamentosDTO;
import com.portafolio.api.dto.cliente.ReservaDepartamentoDTO;

import java.util.List;
import java.util.Map;

public interface ClienteReservaService {

    List<Map<String, ReservaDepartamentoDTO>> reservaDepartamento(int id);


}
