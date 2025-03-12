import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        char jenisKelaminChar = scanner.next().charAt(0);
        String jenisKelamin = "";

        if (jenisKelaminChar == 'L' || jenisKelaminChar == 'l') {
            jenisKelamin = "Laki-laki";
        } else if (jenisKelaminChar == 'P' || jenisKelaminChar == 'p') {
            jenisKelamin = "Perempuan";
        } else {
            System.out.println("Jenis kelamin tidak valid.");
            scanner.close();
            return;
        }

        System.out.print("Masukkan Tahun Lahir Anda: ");
        int tahunLahir = scanner.nextInt();

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        System.out.println("\nData Diri Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}