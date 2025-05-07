package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new NonFiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Buku buku2 = new Fiksi("Hainumele", "Sang Putri Kelapa", "Dongeng");

        buku1.displayInfo();
        buku2.displayInfo();

        Anggota anggota1 = new Anggota("Irfan", "227");
        Anggota anggota2 = new Anggota("Vero", "239");

        anggota1.cetakInfo();
        anggota2.cetakInfo();

        anggota1.pinjamBuku("Madilog", 7);
        anggota1.kembalikanBuku();

        anggota2.pinjamBuku("Hainumele: Sang Putri Kelapa", 7);
        anggota2.kembalikanBuku();
    }
}