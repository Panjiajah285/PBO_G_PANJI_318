package perpustakaan;

public class Fiksi extends buku {
    private String penulis;
    private String genre = "Dongeng"; // Nilai default genre

    public Fiksi(String judul, String penulis) {
        super(judul, penulis);
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Fiksi: " + judul + " oleh " + penulis + " (Genre: " + genre + ")");
    }
}