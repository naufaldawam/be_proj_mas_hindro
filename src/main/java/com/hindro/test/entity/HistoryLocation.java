// package com.hindro.test.entity;

// import lombok.*;
// import jakarta.persistence.*;
// import java.util.Date;

// @Entity
// @Getter
// @Setter
// @Table(name = "tbl_history_location")
// public class HistoryLocation {

// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Long id;

// @Column(name = "judul", columnDefinition = "json NOT NULL DEFAULT
// '[]'::json")
// private String judul;

// @Column(name = "id_master_kategori", nullable = false)
// private Long idMasterKategori;

// @Column(name = "id_master_sub_kategori", nullable = false)
// private Long idMasterSubKategori;

// @Column(name = "lokasi", nullable = false)
// private String lokasi;

// @Column(name = "id_master_kota", nullable = false)
// private Long idMasterKota;

// @Column(name = "latitude", nullable = false)
// private String latitude;

// @Column(name = "longitude", nullable = false)
// private String longitude;

// @Column(name = "jam_mulai")
// private Date jamMulai;

// @Column(name = "jam_akhir")
// private Date jamAkhir;

// @Column(name = "no_telephone")
// private String noTelephone;

// @Column(name = "deskripsi", columnDefinition = "json NOT NULL")
// private String deskripsi;

// @Column(name = "icon", nullable = false)
// private String icon;

// @Column(name = "is_show_dashboard", nullable = false)
// private boolean isShowDashboard;

// @Column(name = "created_by", nullable = false, columnDefinition = "bigint
// DEFAULT 1")
// private Long createdBy;

// @Column(name = "updated_by")
// private Long updatedBy;

// @Column(name = "deleted_by")
// private Long deletedBy;

// @Column(name = "created_at")
// private Date createdAt;

// @Column(name = "updated_at")
// private Date updatedAt;

// @Column(name = "deleted_at")
// private Date deletedAt;

// @Column(name = "keterangan_tolak")
// private String keteranganTolak;

// @ManyToOne
// @JoinColumn(name = "id_master_is_active")
// @Column(name = "id_master_is_active")
// private Long idMasterIsActive;

// @Column(name = "slug")
// private String slug;

// @Column(name = "is_tiket", nullable = false, columnDefinition = "boolean
// DEFAULT false")
// private boolean isTiket;
// }