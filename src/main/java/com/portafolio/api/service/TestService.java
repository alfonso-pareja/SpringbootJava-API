package com.portafolio.api.service;

import com.portafolio.api.dto.TipoDepartamentoDTO;
import com.portafolio.api.entity.Test;

import java.util.List;

public interface TestService {

    List<Test> ListTest();

    List<Object[]> ListTipo();

//
//    {
//        return (List<Test>) testRepository.findAll();
//    }

}
