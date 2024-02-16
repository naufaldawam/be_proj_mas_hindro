package com.hindro.test.dto;

import lombok.*;

@Getter
@Setter
@Data
public class PaymentRequest {
    private String noHp;
    private String stan;
    private String requestDate;
    private String requestTime;
    private String language;
}