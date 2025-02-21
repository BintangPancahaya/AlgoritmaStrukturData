package Jobsheet2;

public class Dosen05 {
    
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;
    String status;
    int masaKerja;

    void tampilInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("Status Dosen : " + status);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
    }
    void setStatusAktif(boolean setStatus) {
        statusAktif = setStatus;
        if (statusAktif = true) {
            status = "Aktif";
        } else {
            status = "Tidak Aktif";
        }
    }
    int hitungMasaKerja(int tahunBrgbung, int tahunSkrng) {
        tahunBergabung = tahunBrgbung;
        masaKerja = tahunSkrng - tahunBergabung;
        return masaKerja;
    }
    void ubahKeahlian(String bidangAhli) {
        bidangKeahlian = bidangAhli;
    }
}
