package com.portafolio.api.controller;

import com.portafolio.api.dto.ReservaDTO;
import com.portafolio.api.dto.funcionario.*;
import com.portafolio.api.model.ResponseHandler;
import com.portafolio.api.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CheckFuncionarioController {

    @Autowired
    private CheckService checkService;


    @GetMapping({ "/funcionario/checks" })
    public ResponseEntity<Object> getAllChecks(){
        try{
            List<Map<String, CheckDetailDTO>> checks = checkService.getAllChecks();
            return ResponseHandler.send("OK", HttpStatus.OK, checks);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se logro obtener los checks", HttpStatus.OK, null);
        }
    }

    @GetMapping({ "/funcionario/checks/{userid}" })
    public ResponseEntity<Object> getAllChecks(@PathVariable("userid") int userid){
        try{
            List<Map<String, CheckDetailDTO>> checks = checkService.getChecks(userid);
            return ResponseHandler.send("OK", HttpStatus.OK, checks);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se logro obtener los checks", HttpStatus.OK, null);
        }
    }

    @GetMapping({ "/funcionario/checks/departamento/{idDepto}/reserva/{idReserva}" })
    public ResponseEntity<Object> getQuestions(@PathVariable("idDepto") int idDepto, @PathVariable("idReserva") int idReserva){
        try{
            List<Map<String, QuestionDTO>> q = checkService.getQuestions(idDepto, idReserva);
            return ResponseHandler.send("OK", HttpStatus.OK, q);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se logro obtener los checks", HttpStatus.OK, null);
        }
    }

    @PostMapping({ "/funcionario/checkin" })
    public ResponseEntity<Object> addCheckin(@RequestBody CheckInDTO checkin){
        try{
            checkService.addCheckIn(checkin);
            return ResponseHandler.send("OK", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se lograron actualizar las preguntas", HttpStatus.OK, null);
        }
    }

    @PostMapping({ "/funcionario/checkin/preguntas" })
    public ResponseEntity<Object> updateQuestionCheckIn(@RequestBody List<QuestionCheckInDTO> questions ){
        try{
            checkService.updateQuestionCheckIn(questions);
            return ResponseHandler.send("OK", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se lograron actualizar las preguntas", HttpStatus.OK, null);
        }
    }

    @PostMapping({ "/funcionario/checkout" })
    public ResponseEntity<Object> addCheckout(@RequestBody CheckOutDTO checkout){
        try{
            checkService.addCheckOut(checkout);
            return ResponseHandler.send("OK", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se lograron actualizar las preguntas", HttpStatus.OK, null);
        }
    }


    @PostMapping({ "/funcionario/checkout/preguntas" })
    public ResponseEntity<Object> updateQuestionCheckOut(@RequestBody List<QuestionCheckOutDTO> questions ){
        try{
            checkService.updateQuestionCheckOut(questions);
            return ResponseHandler.send("OK", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se lograron actualizar las preguntas", HttpStatus.OK, null);
        }
    }


    @PostMapping({ "/funcionario/multa" })
    public ResponseEntity<Object> addMulta(@RequestBody MultaDTO multa ){
        try{
            checkService.addMulta(multa);
            return ResponseHandler.send("OK", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se logro actualizar la multa", HttpStatus.OK, null);
        }
    }


    @PostMapping({ "/funcionario/multa/pay" })
    public ResponseEntity<Object> addMultaPay(@RequestBody PayMultaDTO multapay ){
        try{
            checkService.addPayMulta(multapay);
            return ResponseHandler.send("OK", HttpStatus.OK, null);
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseHandler.send("No se logro actualizar la multa", HttpStatus.OK, null);
        }
    }

}
