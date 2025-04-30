package app;

import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;
import perpustakaan.Anggota;

public class Main {
    public static void main(String[] args) {

        NonFiksi madilog = new NonFiksi("","");
        Fiksi hainuwele = new Fiksi("","");

        Anggota yudis = new Anggota("", "");
        Anggota panji = new Anggota("", "");

        madilog.setJudul("Madilog");
        madilog.setPenulis("Tan Malaka");
        madilog.setBidang("Sejarah & Ilmu Pengetahuan");

        hainuwele.setJudul("Hainuwele: Sang Putri Kelapa");
        hainuwele.setPenulis("Lilis Wu");
        hainuwele.setGenre("Dongeng");

        yudis.setNama("yudis");
        yudis.setIdAnggota("G323");

        panji.setNama("panji");
        panji.setIdAnggota("G318");

        madilog.displayInfo();
        hainuwele.displayInfo();

        System.out.println();

        System.out.println("Anggota: " + yudis.getNama() + " (ID: " + yudis.getIdAnggota() + ")");
        System.out.println("Anggota: " + panji.getNama() + " (ID: " + panji.getIdAnggota() + ")");

        System.out.println();

        yudis.pinjamBuku(madilog.getJudul());
        panji.pinjamBuku(hainuwele.getJudul(), 7);

        System.out.println();

        yudis.kembalikanBuku(madilog.getJudul());
        panji.kembalikanBuku(hainuwele.getJudul());

        System.out.println();
    }
}