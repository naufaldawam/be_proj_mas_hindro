package com.hindro.test.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "history_transaksi")
public class HistoryTransaksi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_master_status_payment")
    private Integer idMasterStatusPayment;

    @Column(name = "no_hp")
    private String noHp;

    @Column(name = "no_ref")
    private String noRef;

    @Column(name = "total_tiket")
    private Integer totalTiket;

    @Column(name = "total_nominal")
    private Integer totalNominal;

    @Column(name = "data_tiket", columnDefinition = "TEXT")
    private String dataTiket;

    @Column(name = "expired_payment")
    private Date expiredPayment;

    @Column(name = "tanggal_book")
    private Date tanggalBook;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}