package Jobsheet6;

public class Mahasiswa05 {
    String nim, nama, kelas;
    double ipk;
    
    Mahasiswa05() {
    }

    Mahasiswa05(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
    }
}
