package com.modul2;

public class Mahasiswa {
    String nama = "panji segara brilliant syah";
    long nim = 202410370110318L;

    void displayInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    public void login(String namaInput, long nimInput){
        if ((namaInput.equalsIgnoreCase(nama)) && (nimInput == nim)){
            System.out.println("login berhasil");
            displayInfo();
        } else {
            System.out.println("login mahasiswa gagal. nama atau nim salah");
        }
    }
}