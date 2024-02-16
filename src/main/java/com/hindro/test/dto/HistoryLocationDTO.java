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
@Table(name = "tbl_history_location")
public class HistoryLocationDTO {
    @Id
    private Long id;
    private String judul; // but this is to temp json
    private Integer id_master_kategori;
    private Integer id_master_sub_kategori;
    private String lokasi;
    private Integer id_master_kota;
    private String latitude;
    private String longitude;
    private Integer jam_mulai;// ini itu adalah time
    private Integer jam_akhir;// ini itu adalah time
    private String no_telephone;
    private String deskripsi;// ini adalah file json
    private String icon;
    private Boolean is_show_dashboard;
    private Long created_by;// inin adalah int8
    private Long updated_by;// inin adalah int8
    private Long deleted_by;// inin adalah int8
    private Long created_at;// inin adalah int8
    private Long updated_at;// inin adalah int8
    private Long deleted_at;// inin adalah int8
    private String keterangan_tolak;
    private Long id_master_is_active;
    private String slug;
    private Boolean is_tiket;

}
