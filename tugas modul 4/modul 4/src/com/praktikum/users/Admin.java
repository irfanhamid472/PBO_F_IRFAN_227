package com.praktikum.users;

import com.praktikum.actions.AdminActions;

public class Admin extends User implements AdminActions {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    @Override
    public void manageItems() {
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu() {
        System.out.println("1. Kelola Laporan Barang");
        System.out.println("2. Kelola Data Mahasiswa");
        System.out.println("0. Logout");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1 -> manageItems();
            case 2 -> manageUsers();
            default -> System.out.println("Logout...");
        }
    }
}
