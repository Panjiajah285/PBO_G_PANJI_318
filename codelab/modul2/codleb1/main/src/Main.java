// Definisi kelas utama (main class)
public class Main {
    // Metode utama (entry point dari aplikasi)
    public static void main (String[] args) {
        // Membuat objek hewan1 menggunakan kelas 'hewan'
        Hewan hewan1 = new Hewan ();
        // Membuat objek hewan2 menggunakan kelas 'hewan'
        Hewan hewan2 = new Hewan();

        // Menetapkan nilai atribut untuk objek hewan1
        hewan1.nama = "kucing"; // Memberikan nilai "kucing" untuk atribut nama
        hewan1.jenis = "mamalia"; // Memberikan nilai "mamalia" untuk atribut jenis
        hewan1.suara = "miawww~"; // Memberikan suara yang dibuat kucing

        // Menetapkan nilai atribut untuk objek hewan2
        hewan2.nama = "anjing"; // Memberikan nilai "anjing" untuk atribut nama
        hewan2.jenis = "mamalia"; // Deskripsi untuk jenis anjing
        hewan2.suara = "wooff-wooff!!"; // Suara yang diberikan untuk anjing

        // Memanggil metode tampilkanInfo() untuk menampilkan informasi objek hewan1
        hewan1.tampilkanInfo();
        // Memanggil metode tampilkanInfo() untuk menampilkan informasi objek hewan2
        hewan2.tampilkanInfo();
    }
}