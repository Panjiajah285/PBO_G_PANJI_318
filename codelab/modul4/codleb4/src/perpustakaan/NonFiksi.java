package perpustakaan;

public class NonFiksi extends buku {
    private String penulis;
    private String bidang = "Sejarah & Ilmu Pengetahuan"; // Nilai default bidang

    public NonFiksi(String judul, String penulis) {
        super(judul, penulis);
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Non-Fiksi: " + judul + " oleh " + penulis + " (Bidang: " + bidang + ")");
    }
}