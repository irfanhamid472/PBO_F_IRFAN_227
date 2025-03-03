import java.util.Scanner;

public class LoginSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memilih jenis login
        System.out.println("Pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1 or 2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        if (pilihan == 1) {
            // Login Admin
            System.out.print("Masukkan namapengguna: ");
            String username = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (username.startsWith("Admin227") && password.startsWith("Password227")) {
                String nimDigits = username.substring(5);
                if (password.equals("Password" + nimDigits)) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (nama.equals("mids") && nim.equals("227")) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
}
}