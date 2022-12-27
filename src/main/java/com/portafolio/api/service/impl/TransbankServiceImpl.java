package com.portafolio.api.service.impl;

import cl.transbank.webpay.exception.TransactionCommitException;
import cl.transbank.webpay.exception.TransactionCreateException;
import cl.transbank.webpay.exception.TransactionStatusException;
import cl.transbank.webpay.webpayplus.WebpayPlus;
import cl.transbank.webpay.webpayplus.responses.WebpayPlusTransactionCommitResponse;
import cl.transbank.webpay.webpayplus.responses.WebpayPlusTransactionCreateResponse;
import cl.transbank.webpay.webpayplus.responses.WebpayPlusTransactionStatusResponse;
import com.portafolio.api.dto.PagoDTO;
import com.portafolio.api.dto.transbank.CrearPagoDTO;
import com.portafolio.api.service.TransbankService;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class TransbankServiceImpl implements TransbankService {

    @Override
    public WebpayPlusTransactionCreateResponse crearPago(CrearPagoDTO transaccion) {
        try {
            final WebpayPlusTransactionCreateResponse response = new WebpayPlus
                    .Transaction()
                    .create(
                            transaccion.getOrden(),
                            transaccion.getSessionId(),
                            transaccion.getMonto(),
                            transaccion.getReturnUrl()
                    );

            return response;
        } catch (TransactionCreateException | IOException e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public WebpayPlusTransactionStatusResponse estadoTransaccion(String token) {
        try {
            final WebpayPlusTransactionStatusResponse response = new WebpayPlus
                    .Transaction()
                    .status(token);
            return response;
        } catch (IOException | TransactionStatusException e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public WebpayPlusTransactionCommitResponse commitTransaccion(String token) {
        try {
            final WebpayPlusTransactionCommitResponse response = new WebpayPlus
                    .Transaction()
                    .commit(token);
            return response;
        } catch (IOException | TransactionCommitException e) {
            System.out.println(e);
            return null;
        }
    }
}
