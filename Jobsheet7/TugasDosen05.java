package Jobsheet7;

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

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }
    
    void tampil() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", JK: " + (jenisKelamin ? "Laki - laki" : "Perempuan") + ", Usia: " + usia);
    }
}


// public class TugasDosen05 {
//     String nama;
//     int usia;

//     public TugasDosen05(String nama, int usia) {
//         this.nama = nama;
//         this.usia = usia;
//     }



//     public void display() {
//         System.out.println("Nama: " + nama + ", Usia: " + usia);
//     }
// }
