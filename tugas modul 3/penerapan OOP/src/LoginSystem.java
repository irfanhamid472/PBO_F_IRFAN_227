import java.util.Scanner;

// Kelas Superclass User
class User {
    private String nama;
    private String nim;

    // Constructor
    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    // Method login (akan dioverride)
    public boolean login(String inputNama, String inputNim) {
        return false; // Default, akan dioverride di subclass
    }

    // Method displayInfo (akan dioverride)
    public void displayInfo() {
        System.out.println("User Info");
    }
}

// Kelas Admin (subclass dari User)
class Admin extends User {
    private String username;
    private String password;

    // Constructor menggunakan super untuk memanggil constructor User
    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    // Override method login
    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
        System.out.println("Nama Admin: " + getNama());
        System.out.println("NIM Admin: " + getNim());
    }
}

// Kelas Mahasiswa (subclass dari User)
class Mahasiswa extends User {
    // Constructor menggunakan super untuk memanggil constructor User
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    // Override method login
    @Override
    public boolean login(String inputNama, String inputNim) {
        return inputNama.equalsIgnoreCase(getNama()) && inputNim.equals(getNim());
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}

// Kelas utama untuk sistem login
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Admin dan Mahasiswa
        Admin admin = new Admin("Admin Name", "227", "Admin227", "Password227");
        Mahasiswa mahasiswa = new Mahasiswa("mids", "227");

        // Memilih jenis login
        System.out.println("Pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1 atau 2): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Pilihan harus berupa angka!");
            scanner.close();
            return;
        }

        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        if (pilihan == 1) {
            // Login Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                admin.displayInfo();
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}