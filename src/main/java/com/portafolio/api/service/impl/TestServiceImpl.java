package com.portafolio.api.service.impl;

import com.portafolio.api.dto.TipoDepartamentoDTO;
import com.portafolio.api.repository.TestRepository;
import com.portafolio.api.entity.Test;
import com.portafolio.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public List<Test> ListTest() {
        return (List<Test>) testRepository.findAll();
    }

    @Override
    public List<Object[]> ListTipo() {
        return testRepository.typeDepartment();
    }
}
