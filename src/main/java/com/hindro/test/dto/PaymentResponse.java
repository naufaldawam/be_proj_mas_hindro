package com.hindro.test.dto;

import lombok.*;

@Getter
@Setter
@Data
public class PaymentResponse {

    private boolean status;
    private String statusCode;
    private String responseCode;
    private Result result;

}