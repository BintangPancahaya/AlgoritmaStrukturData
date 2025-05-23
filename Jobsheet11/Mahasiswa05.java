package Jobsheet11;

public class Mahasiswa05 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa05(){}

    public Mahasiswa05(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi(){
    System.out.printf("%-10s\t%-10s\t%-3s\t%.1f\n", nama, nim, kelas, ipk);
    }
}
