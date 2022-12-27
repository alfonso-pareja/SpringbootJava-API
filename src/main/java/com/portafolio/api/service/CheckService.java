package com.portafolio.api.service;

import com.portafolio.api.dto.funcionario.*;

import java.util.List;
import java.util.Map;

public interface CheckService {

    /**
     * Lista de checks
     * @return
     */
    List<Map<String, CheckDetailDTO>> getAllChecks();

    /**
     * Cheecks por usuario
     * @return
     */
    List<Map<String, CheckDetailDTO>> getChecks(int id);

    /**
     * Lista de preguntas por reserva
     * @return
     */
    List<Map<String, QuestionDTO>> getQuestions(int idDepto, int idReserva);

    /**
     * Agregar checkin
     * @param check
     */
    void addCheckIn(CheckInDTO check);

    /**
     * Agregar checkin
     * @param check
     */
    void addCheckOut(CheckOutDTO check);


    /**
     * Actualizar preguntas
     * @param question
     */
    void updateQuestionCheckIn(List<QuestionCheckInDTO> question);

    /**
     * Actualizar checkout
     * @param question
     */
    void updateQuestionCheckOut(List<QuestionCheckOutDTO> question);

    /**
     * Agregar multa
     * @param multa
     */
    void addMulta(MultaDTO multa);

    /**
     * Agregar pago de multa
     * @param multapay
     */
    void addPayMulta(PayMultaDTO multapay);

}
