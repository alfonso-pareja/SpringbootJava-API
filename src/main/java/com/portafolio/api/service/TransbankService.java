package com.portafolio.api.service;

import cl.transbank.webpay.webpayplus.responses.WebpayPlusTransactionCommitResponse;
import cl.transbank.webpay.webpayplus.responses.WebpayPlusTransactionCreateResponse;
import cl.transbank.webpay.webpayplus.responses.WebpayPlusTransactionStatusResponse;
import com.portafolio.api.dto.PagoDTO;
import com.portafolio.api.dto.transbank.CrearPagoDTO;

public interface TransbankService {

    /**
     * Creacion del pago
     * @return
     */
    WebpayPlusTransactionCreateResponse crearPago(CrearPagoDTO transaccion);

    /**
     * Estado de una transaccion
     * @param token
     * @return
     */
    WebpayPlusTransactionStatusResponse estadoTransaccion(String token);


    /**
     * Confirmar una transaccion
     * @param token
     * @return
     */
    WebpayPlusTransactionCommitResponse commitTransaccion(String token);
}
