package com.portafolio.api.service.impl;

import cl.transbank.webpay.webpayplus.responses.WebpayPlusTransactionCreateResponse;
import com.portafolio.api.dto.*;
import com.portafolio.api.repository.DashboardRepository;
import com.portafolio.api.repository.DepartamentoRepository;
import com.portafolio.api.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;


import cl.transbank.webpay.exception.TransactionCaptureException;
import cl.transbank.webpay.exception.TransactionCommitException;
import cl.transbank.webpay.exception.TransactionCreateException;
import cl.transbank.webpay.exception.TransactionRefundException;
import cl.transbank.webpay.webpayplus.WebpayPlus;
import cl.transbank.webpay.webpayplus.WebpayPlus.Transaction.*;



@Component
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    public DashboardRepository dashboardRepository;

    @Override
    public List<Map<String, TotalReservasDTO>> getReservas() {
        return dashboardRepository.getReservas();
    }

    @Override
    public List<Map<String, CostoMantencionDTO>> getMantenciones() {
        return dashboardRepository.getMantenciones();
    }

    @Override
    public List<Map<String, ReservaActivaDTO>> getReservasActivas() {
        return dashboardRepository.getReservasActivas();
    }

    @Override
    public List<Map<String, TotalClientesDTO>> getClientes(Integer rol_id) {
        return dashboardRepository.getClientesRegistrados(rol_id);
    }

    @Override
    public List<Map<String, TopDepartamentoDTO>> getTopDeptos() {
        return dashboardRepository.getTopDepto();
    }

    @Override
    public List<Map<String, OcupacionDTO>> getOcupacion() {
        return dashboardRepository.getOcupacion();
    }

    @Override
    public List<Map<String, DashboardGraphDTO>> getGraph() {
        return dashboardRepository.getGraph();
    }

    @Override
    public List<Map<String, DashboardReservaDTO>> reservas() {
        return dashboardRepository.reservas();
    }

    @Override
    public List<Map<String, DashboardMantencionDTO>> mantenciones() {
        return dashboardRepository.mantenciones();
    }

    @Override
    public List<Map<String, DashboardTransporteDTO>> transporte() {
        return dashboardRepository.transporte();
    }



    @Override
    public PagoDTO pruebaPago() {
        String buyOrder = String.valueOf(new Random().nextInt(Integer.MAX_VALUE));
        String sessionId = String.valueOf(new Random().nextInt(Integer.MAX_VALUE));
        double amount = 1000;
        String returnUrl = "http://localhost:4200";

        try {
            final WebpayPlusTransactionCreateResponse response = new WebpayPlus.Transaction().create(buyOrder, sessionId, amount, returnUrl);
            PagoDTO pago = new PagoDTO(response.getToken(), response.getUrl());
            return pago;
        } catch (TransactionCreateException | IOException e) {
            System.out.println(e);
        }
        return null;
    }


}
