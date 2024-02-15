package com.hindro.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hindro.test.entity.HistoryTransaksi;
import com.hindro.test.repository.HistoryTransaksiRepository;

@Service
public class HistoryTransaksiService {

    private final HistoryTransaksiRepository historyTransaksiRepository;

    @Autowired
    public HistoryTransaksiService(HistoryTransaksiRepository historyTransaksiRepository) {
        this.historyTransaksiRepository = historyTransaksiRepository;
    }

    public HistoryTransaksi saveHistoryTransaksi(HistoryTransaksi historyTransaksi) {
        return historyTransaksiRepository.save(historyTransaksi);
    }

    public List<HistoryTransaksi> getAllHistoryTransaksi() {
        return historyTransaksiRepository.findAll();
    }

}