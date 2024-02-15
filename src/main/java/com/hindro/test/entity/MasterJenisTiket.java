// package com.hindro.test.entity;

// import lombok.*;
// import jakarta.persistence.*;
// import java.util.Date;

// @Entity
// @Getter
// @Setter
// @Table(name = "tbl_master_jenis_tiket")
// public class MasterJenisTiket {

// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Long id;

// @ManyToOne
// @JoinColumn(name = "id_history_location", referencedColumnName = "id")
// private HistoryLocation historyLocation;

// @Column(name = "nama")
// private String nama;

// @Column(name = "keterangan")
// private String keterangan;

// @Column(name = "created_at")
// private Date createdAt;

// @Column(name = "update_at")
// private Date updatedAt;
// }
