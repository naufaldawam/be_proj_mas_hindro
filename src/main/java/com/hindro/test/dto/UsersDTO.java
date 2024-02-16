package com.hindro.test.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@Table(name = "users")
public class UsersDTO {
    @Id
    private Long id;
    private String name;
    private String nrik;
    private String username;
    private String email;
    private String password;
    private String tanggal_lahir; // jangan lupa di parse nanti jadi date
    private Long id_file_foto;
    private Long id_unit_kerja;
    private Integer status_data; // ini coba nnati dulu deh soalnya Integer 2
    private Integer is_blokir; // ini coba nnati dulu deh soalnya Integer 2
    private String ip_address;
    private String session_id;
    private String last_seen; // ini timestamp
    private String last_activity; // ini timestamp
    private Integer expired_password; // ini date
    private Integer email_verified_at; // ini timestamp
    private Long updated_by;
    private String remember_token;
    private String created_at; // ini date
    private String updated_at; // ini date
}