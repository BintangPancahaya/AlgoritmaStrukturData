package Jobsheet10;

public class Mahasiswa05 {
    String nim, nama, prodi, kelas;

    Mahasiswa05(String nim, String nama, String prodi, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    void tampilkanData(){
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
