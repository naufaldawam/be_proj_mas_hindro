package com.hindro.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hindro.test.dto.PaymentRequest;
import com.hindro.test.dto.PaymentResponse;
import com.hindro.test.service.PaymentTiketService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentTiketService paymentTicketService;

    @Autowired
    public PaymentController(PaymentTiketService paymentTicketService) {
        this.paymentTicketService = paymentTicketService;
    }

    @PostMapping("/inquiry")
    public PaymentResponse inquiryPayment(@RequestBody PaymentRequest request) {
        return paymentTicketService.inquiryPayment(request);
    }
}