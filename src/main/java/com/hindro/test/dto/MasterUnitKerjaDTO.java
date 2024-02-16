package com.hindro.test.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "tbl_master_unit_kerja")
public class MasterUnitKerjaDTO {
    @Id
    private Long id;
    private Long idUnitKerja;
    private String namaUnitKerja;
    private String kodeBranchInduk;
    private String kodeBranch;
    private String kategoriUnitKerja;
    private Integer statusData;
    private String createdAt; // jangn lupa di parse ke date
    private String updatedAt; // jangn lupa di parse ke date
}