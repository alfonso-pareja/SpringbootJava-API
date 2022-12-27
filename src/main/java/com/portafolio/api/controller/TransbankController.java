package com.portafolio.api.controller;

import cl.transbank.webpay.webpayplus.responses.WebpayPlusTransactionCommitResponse;
import cl.transbank.webpay.webpayplus.responses.WebpayPlusTransactionCreateResponse;
import cl.transbank.webpay.webpayplus.responses.WebpayPlusTransactionStatusResponse;
import com.portafolio.api.dto.transbank.CrearPagoDTO;
import com.portafolio.api.model.ResponseHandler;
import com.portafolio.api.service.TransbankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransbankController {
    @Autowired
    private TransbankService transbankService;

    @PostMapping({ "/create/payment" })
    public ResponseEntity<Object> createPago(@RequestBody CrearPagoDTO transaccion){
        WebpayPlusTransactionCreateResponse pago = transbankService.crearPago(transaccion);
        return ResponseHandler.send("Ok", HttpStatus.OK, pago);
    }

    @GetMapping({ "/status/payment/{token}" })
    public ResponseEntity<Object> estadoTransaccion(@PathVariable String token){
        WebpayPlusTransactionStatusResponse estado = transbankService.estadoTransaccion(token);
        return ResponseHandler.send("Ok", HttpStatus.OK, estado);
    }

    @GetMapping({ "/commit/payment/{token}" })
    public ResponseEntity<Object> commitTransaccion(@PathVariable String token){
        WebpayPlusTransactionCommitResponse estado = transbankService.commitTransaccion(token);
        return ResponseHandler.send("Ok", HttpStatus.OK, estado);
    }


}
