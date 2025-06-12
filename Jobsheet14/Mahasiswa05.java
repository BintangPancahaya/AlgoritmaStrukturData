package Jobsheet14;

public class Mahasiswa05 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa05(){
    }
    
    public Mahasiswa05(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilkanInformasi(){
        System.out.println("NIM: " + this.nim+" " +
        "Nama: " + this.nama+" "+
        "Kelas: " + this.kelas+" "+
        "IPK: "+this.ipk);
    }
}