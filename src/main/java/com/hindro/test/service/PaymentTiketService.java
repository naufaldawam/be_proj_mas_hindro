package com.hindro.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hindro.test.dto.DetailTiket;
import com.hindro.test.dto.PaymentRequest;
import com.hindro.test.dto.PaymentResponse;
import com.hindro.test.dto.Result;
import com.hindro.test.repo.MasterUnitKerjaRepository;
import java.util.*;

@Service
public class PaymentTiketService {
    private final MasterUnitKerjaRepository masterUnitKerjaRepository;

    @Autowired
    public PaymentTiketService(MasterUnitKerjaRepository masterUnitKerjaRepository) {
        this.masterUnitKerjaRepository = masterUnitKerjaRepository;
    }

    public PaymentResponse inquiryPayment(PaymentRequest request) {
        masterUnitKerjaRepository.findById(1L).orElse(null);

        PaymentResponse response = new PaymentResponse();
        response.setStatus(true);
        response.setStatusCode("OK");
        response.setResponseCode("00");

        Result result = new Result();
        result.setNoHp(request.getNoHp());
        result.setStan(request.getStan());

        DetailTiket detailTiket1 = new DetailTiket();
        detailTiket1.setTotalTiket("2");
        detailTiket1.setCategoryTiket("1");

        DetailTiket detailTiket2 = new DetailTiket();
        detailTiket2.setTotalTiket("1");
        detailTiket2.setCategoryTiket("2");

        result.setDetailTiket(List.of(detailTiket1, detailTiket2));

        response.setResult(result);

        return response;
    }
}