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
@Table(name = "tbl_master_jenis_tiket")
public class MasterJenisTiketDTO {
    @Id
    private Long id;
    private Long id_history_location;
    private String nama;
    private String keterangan;
    private String created_at;// ini date
    private String updated_at;// ini date
}
