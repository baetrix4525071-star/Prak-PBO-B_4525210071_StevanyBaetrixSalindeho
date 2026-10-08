package com.contoh1;

public class Main {
    public static void main(String[] args) {
        // Objek dari class Dokter sebagai class independent
        Dokter andi = new Dokter("Andi");
        Dokter sari = new Dokter("Sari");
        Pasien budi = new Pasien("Budi");
        Pasien dina = new Pasien("Dina");

        // Membuat asosiasi (cukup dari satu sisi, sisi lain otomatis)
        andi.tambahPasien(budi);
        andi.tambahPasien(dina);
        sari.tambahPasien(budi);

        andi.periksaPasien(budi);
        andi.tampilkanPasien();
        budi.tampilkanDokter();
    }
}