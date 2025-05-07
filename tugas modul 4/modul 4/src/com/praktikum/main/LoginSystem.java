package com.praktikum.main;

import com.praktikum.users.*;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Admin Name", "227", "Admin227", "Password227");
        Mahasiswa mahasiswa = new Mahasiswa("mids", "227");

        System.out.println("Pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        User user = null;

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                user = admin;
            } else {
                System.out.println("Login gagal!");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                user = mahasiswa;
            } else {
                System.out.println("Login gagal!");
            }
        }

        if (user != null) {
            user.displayAppMenu(); // Polymorphism in action
        }

        scanner.close();
    }
}