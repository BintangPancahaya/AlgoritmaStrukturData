package Jobsheet2;

public class DosenMain05 {
    public static void main(String[] args) {
        Dosen05 dosen1 = new Dosen05();
        dosen1.idDosen = "1200";
        dosen1.nama = "Imam Fahrur Rozi, ST., MT.";
        dosen1.bidangKeahlian = "Algoritma dan Struktur Data";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.masaKerja = 10;

        System.out.println("==============");
        System.out.println("Sebelum Diubah");
        System.out.println("--------------");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(dosen1.tahunBergabung, 2025);
        dosen1.ubahKeahlian("Praktikum Algoritma dan Struktur Data");
        System.out.println("==============");
        System.out.println("Sesudah Diubah");
        System.out.println("--------------");
        dosen1.tampilInformasi();
    }
}
