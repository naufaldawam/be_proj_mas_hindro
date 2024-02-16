package com.hindro.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hindro.test.dto.MasterUnitKerjaDTO;

@Repository
public interface MasterUnitKerjaRepository extends JpaRepository<MasterUnitKerjaDTO, Long> {

}