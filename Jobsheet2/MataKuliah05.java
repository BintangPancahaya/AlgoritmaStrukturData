package Jobsheet2;

public class MataKuliah05 {
    
    String kodeMk, nama; 
    int sks, jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode MK : " + kodeMk);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah jam : " + jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
    }
    void kurangiJam(int jam) {
        jumlahJam -= jam;
    }
    public MataKuliah05() {
    }
    public MataKuliah05(String kdMk, String nm, int sks, int jam) {
        kodeMk = kdMk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }
}
