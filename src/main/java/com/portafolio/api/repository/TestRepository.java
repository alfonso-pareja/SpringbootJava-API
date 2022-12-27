package com.portafolio.api.repository;

import com.portafolio.api.dto.TipoDepartamentoDTO;
import com.portafolio.api.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestRepository extends CrudRepository<Test, Long> {

    @Query(value="SELECT id, nombre FROM tipo_departamento", nativeQuery = true)
    public List<Object[]> typeDepartment();
}
