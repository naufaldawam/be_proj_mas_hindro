package com.hindro.test.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hindro.test.entity.HistoryTransaksi;
import com.hindro.test.service.HistoryTransaksiService;

@Controller
@RestController
@RequestMapping("history_transaksi")
public class HistoryTransaksiController {

    private final HistoryTransaksiService historyTransaksiService;

    @Autowired
    public HistoryTransaksiController(HistoryTransaksiService historyTransaksiService) {
        this.historyTransaksiService = historyTransaksiService;
    }

    @GetMapping("/get_all_data")
    public List<HistoryTransaksi> getAllHistoryTransaksi() {
        return historyTransaksiService.getAllHistoryTransaksi();
    }

}
