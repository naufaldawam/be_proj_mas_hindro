package com.hindro.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hindro.test.entity.HistoryTransaksi;

@Repository
public interface HistoryTransaksiRepository extends JpaRepository<HistoryTransaksi, Long> {

}