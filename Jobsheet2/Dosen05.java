package Jobsheet2;

public class Dosen05 {
    
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;
    int masaKerja;

    void tampilInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("Status Dosen : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
    }

    void setStatusAktif(boolean setStatus) {
        this.statusAktif = setStatus;
    }

    int hitungMasaKerja(int tahunBrgbung, int tahunSkrng) {
        tahunBergabung = tahunBrgbung;
        masaKerja = tahunSkrng - tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidangAhli) {
        bidangKeahlian = bidangAhli;
    }
    public Dosen05() {

    }
    public Dosen05(String id, String nm, String ahli, boolean statAktif, int tahunGabung, int msKerja) {
        idDosen = id;
        nama = nm;
        bidangKeahlian = ahli;
        statusAktif = statAktif;
        tahunBergabung = tahunGabung;
        masaKerja = msKerja;
        hitungMasaKerja(tahunGabung, msKerja);
    }
}
