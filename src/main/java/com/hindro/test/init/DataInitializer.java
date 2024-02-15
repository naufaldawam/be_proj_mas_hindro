// package com.hindro.test.init;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;

// import java.util.Date;

// import com.hindro.test.entity.HistoryTransaksi;
// import com.hindro.test.service.HistoryTransaksiService;

// @Component
// public class DataInitializer implements CommandLineRunner {

// private final HistoryTransaksiService historyTransaksiService;

// @Autowired
// public DataInitializer(HistoryTransaksiService historyTransaksiService) {
// this.historyTransaksiService = historyTransaksiService;
// }

// @Override
// public void run(String... args) {
// // Inisialisasi data transaksi
// HistoryTransaksi transaksi1 = new HistoryTransaksi();
// transaksi1.setIdMasterStatusPayment(1);
// transaksi1.setNoHp("085270196990");
// transaksi1.setNoRef("REF123456");
// transaksi1.setTotalTiket(2);
// transaksi1.setTotalNominal(60000);
// transaksi1.setDataTiket("{\"ticketType\": \"VIP\", \"quantity\": 2}");
// transaksi1.setExpiredPayment(new Date());
// transaksi1.setTanggalBook(new Date());
// transaksi1.setCreatedAt(new Date());
// transaksi1.setUpdatedAt(new Date());

// historyTransaksiService.saveHistoryTransaksi(transaksi1);
// System.out.println("Data transaksi telah diinisialisasi.");
// }
// }