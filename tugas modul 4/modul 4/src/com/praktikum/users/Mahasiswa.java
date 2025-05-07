package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return inputNama.equalsIgnoreCase(getNama()) && inputNim.equals(getNim());
    }

    @Override
    public void reportItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Barang: ");
        String nama = scanner.nextLine();

        System.out.print("Deskripsi Barang: ");
        String deskripsi = scanner.nextLine();

        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();

        System.out.println("Laporan berhasil disimpan!");
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu() {
        System.out.println("1. Laporkan Barang Temuan/Hilang");
        System.out.println("2. Lihat Daftar Laporan");
        System.out.println("0. Logout");

        Scanner scanner = new Scanner(System.in);
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1 -> reportItem();
            case 2 -> viewReportedItems();
            default -> System.out.println("Logout...");
        }
    }
}
