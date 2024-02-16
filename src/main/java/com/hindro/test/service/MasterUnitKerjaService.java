package com.hindro.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.hindro.test.dto.MasterUnitKerjaDTO;
import com.hindro.test.repo.MasterUnitKerjaRepository;

@Service
public class MasterUnitKerjaService {

    private final MasterUnitKerjaRepository masterUnitKerjaRepository;

    @Autowired
    public MasterUnitKerjaService(MasterUnitKerjaRepository masterUnitKerjaRepository) {
        this.masterUnitKerjaRepository = masterUnitKerjaRepository;
    }

    // public void saveMasterUnitKerja(MasterUnitKerjaDTO masterUnitKerjaDTO) {
    // masterUnitKerjaRepository.save(masterUnitKerjaDTO);
    // }

    public List<MasterUnitKerjaDTO> getAllMasterUnitKerja() {
        return masterUnitKerjaRepository.findAll();
    }

}