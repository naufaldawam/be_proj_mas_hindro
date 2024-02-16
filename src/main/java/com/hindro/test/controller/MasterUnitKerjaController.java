package com.hindro.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.hindro.test.dto.MasterUnitKerjaDTO;
import com.hindro.test.service.MasterUnitKerjaService;

@RestController
@RequestMapping("master-unit-kerja")
public class MasterUnitKerjaController {

    private final MasterUnitKerjaService masterUnitKerjaService;

    @Autowired
    public MasterUnitKerjaController(MasterUnitKerjaService masterUnitKerjaService) {
        this.masterUnitKerjaService = masterUnitKerjaService;
    }

    @GetMapping("/all")
    public List<MasterUnitKerjaDTO> getAllMasterUnitKerja() {
        return masterUnitKerjaService.getAllMasterUnitKerja();
    }

}