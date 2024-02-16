package com.hindro.test.dto;

import java.util.*;
import lombok.*;

@Getter
@Setter
@Data
public class Result {
    private String noHp;
    private String stan;
    private String requestDate;
    private String requestTime;
    private String language;
    private String destinationAccount;
    private String feeAccount;
    private String amount;
    private String fee;
    private String screen;
    private List<DetailTiket> detailTiket;

}