package Jobsheet6;

public class TugasDosen05 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    TugasDosen05 (String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", JK: " + (jenisKelamin ? "Laki - laki" : "Perempuan") + ", Usia: " + usia);
    }
}

