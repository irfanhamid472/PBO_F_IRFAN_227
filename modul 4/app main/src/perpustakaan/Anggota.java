package perpustakaan;

public class Anggota implements Peminjaman {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    public void pinjamBuku(String judul) {
        System.out.println(nama + " meminjam buku berjudul: " + judul);
    }

    public void pinjamBuku(String judul, int durasiHari) {
        System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + durasiHari + " hari.");
    }

    @Override
    public void pinjamBuku() {
        System.out.println(nama + " meminjam buku.");
    }

    @Override
    public void kembalikanBuku() {
        System.out.println(nama + " mengembalikan buku.");
    }

    public void cetakInfo() {
        System.out.println("Anggota: " + nama + " (ID: " + idAnggota + ")");
    }
}
