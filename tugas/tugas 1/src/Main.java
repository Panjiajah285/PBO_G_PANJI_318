import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            loginAdmin(input);
        } else if (pilihan == 2) {
            loginMahasiswa(input);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }

    public static void loginAdmin(Scanner input) {
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();


        if (username.equals("Admin318") && password.equals("Password318")) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    public static void loginMahasiswa(Scanner input) {
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();


        if (nama.equals("Panji segara brilliant") && nim.equals("202410370110318")) {
            System.out.println("Login Mahasiswa berhasil!");
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}