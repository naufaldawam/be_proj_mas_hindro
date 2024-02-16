package com.hindro.test.dto;

import lombok.*;

@Getter
@Setter
@Data
public class DetailTiket {
    private String totalTiket;
    private String categoryTiket;
    private String descriptionCategoryTiket;
    private String totalAmount;
    private String tiketDate;
}