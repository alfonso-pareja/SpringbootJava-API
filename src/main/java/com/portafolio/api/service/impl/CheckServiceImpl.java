package com.portafolio.api.service.impl;

import com.portafolio.api.dto.funcionario.*;
import com.portafolio.api.repository.CheckRepository;
import com.portafolio.api.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class CheckServiceImpl implements CheckService {

    @Autowired
    public CheckRepository checkRepository;

    @Override
    public List<Map<String, CheckDetailDTO>> getAllChecks() {
        return checkRepository.getAllChecks();
    }

    @Override
    public List<Map<String, CheckDetailDTO>> getChecks(int id) {
        return checkRepository.getChecks(id);
    }

    @Override
    public List<Map<String, QuestionDTO>> getQuestions(int idDepto, int idReserva) {
        return checkRepository.getQuestions(idDepto, idReserva);
    }

    @Override
    public void addCheckIn(CheckInDTO check) {
        checkRepository.addCheckIn(
                check.getDepartamento_id(),
                check.getBoleta_id(),
                check.getReserva_id(),
                check.getUsuario_id(),
                check.getFecha(),
                check.getObservacion());
    }

    @Override
    public void addCheckOut(CheckOutDTO check) {
        checkRepository.addCheckOut(
                check.getCheckin_id(),
                check.getFecha(),
                check.getDepto(),
                check.getObservacion());
    }


    @Override
    public void updateQuestionCheckIn(List<QuestionCheckInDTO> questions) {
        // Por cada pregunta se actualiza la respuesta
        questions.forEach((q) -> {
            checkRepository.updateQuestionsCheckIn(q.getId(), q.getReserva_id(), q.getDepartamento_id(), q.getRespuesta_ci());
        });

    }

    @Override
    public void updateQuestionCheckOut(List<QuestionCheckOutDTO> questions) {
        // Por cada pregunta se actualiza la respuesta
        questions.forEach((q) -> {
            checkRepository.updateQuestionsCheckOut(q.getId(), q.getReserva_id(), q.getDepartamento_id(), q.getRespuesta_co());
        });
    }

    @Override
    public void addMulta(MultaDTO multa) {
        checkRepository.addMulta(multa.getMotivo(), multa.getValor(), multa.getReserva_id());
    }

    @Override
    public void addPayMulta(PayMultaDTO multapay) {
        checkRepository.addMultaPay(multapay.getBoleta_id(), multapay.getMulta_id());
    }


}
