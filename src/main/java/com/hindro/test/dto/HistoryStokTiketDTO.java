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
@Table(name = "tbl_history_stok_tiket")
public class HistoryStokTiketDTO {
    @Id
    private Long id;
    private Long id_master_jenis_tiket;
    private String tanggal; // date
    private String no_tiket; // tapi nanti parse kalau dia integer
    private Boolean is_book;
    private Boolean is_payment;
    private String created_at; // date
    private String updated_at; // date
}
