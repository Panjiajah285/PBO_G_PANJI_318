package perpustakaan;

public class Anggota implements Peminjaman {
    private String nama;
    private String idAnggota;
    private String bukuDipinjam;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.bukuDipinjam = null;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public String getBukuDipinjam() {
        return bukuDipinjam;
    }

    public void displayInfo() {
        System.out.println("Anggota: " + nama + " (ID: " + idAnggota + ")");
        if (bukuDipinjam != null) {
            System.out.println("Sedang meminjam buku: " + bukuDipinjam);
        }
    }

    @Override
    public void pinjamBuku(String judul) {
        System.out.println(nama + " meminjam buku berjudul: " + judul);
        this.bukuDipinjam = judul;
    }

    public void pinjamBuku(String judul, int durasi) {
        System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + durasi + " hari.");
        this.bukuDipinjam = judul;
    }

    @Override
    public void kembalikanBuku(String judul) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judul);
        if (bukuDipinjam != null && bukuDipinjam.equals(judul)) {
            this.bukuDipinjam = null;
        } else if (bukuDipinjam != null) {
            System.out.println("Kesalahan: " + nama + " tidak sedang meminjam buku \"" + judul + "\".");
        } else {
            System.out.println("Kesalahan: " + nama + " tidak sedang meminjam buku apapun.");
        }
    }
    }