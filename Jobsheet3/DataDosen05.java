package Jobsheet3;

public class DataDosen05 {

    int jumlahDosenPria = 0;
    int jumlahDosenWanita = 0;
    void dataSemuaDosen(Dosen05 arrayOfDosen[]){
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i+1));
            System.out.println("Kode            : " + arrayOfDosen[i].kode);
            System.out.println("Nama            : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin   : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + arrayOfDosen[i].usia);
            System.out.println("------------------------------");
        }
    }
    void jumlahDosenPerJenisKelamin(Dosen05 arrayOfDosen[]){
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                jumlahDosenPria += 1;
            } else {
                jumlahDosenWanita += 1;
            }
        }
        System.out.println("Jumlah Dosen Pria adalah " + jumlahDosenPria);
        System.out.println("Jumlah Dosen Wanita adalah " + jumlahDosenWanita);
        System.out.println("------------------------------");

    }
    void rerataUsiaDosenPerJenisKelamin(Dosen05 arrayOfDosen[]){
        double rataUsiaPria = 0;
        double rataUsiaWanita = 0;
        double x = 0;
        double y = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                x += arrayOfDosen[i].usia;
            } else {
                y += arrayOfDosen[i].usia;
            }
        }
        rataUsiaPria = x/jumlahDosenPria;
        rataUsiaWanita = y/jumlahDosenWanita;
        System.out.println("Rata - rata usia dosen pria adalah " + rataUsiaPria);
        System.out.println("Rata - rata usia dosen wanita adalah " + rataUsiaWanita);
        System.out.println("------------------------------");
    }
    void infoDosenPalingTua(Dosen05 arrayOfDosen[], String kode, String nama, boolean jenisKelamin, int usia){
        int dummy = arrayOfDosen[0].usia;
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > dummy) {
                dummy = arrayOfDosen[i].usia;
                nama = arrayOfDosen[i].nama;
                kode = arrayOfDosen[i].kode;
                usia = arrayOfDosen[i].usia;
                jenisKelamin = arrayOfDosen[i].jenisKelamin;
            }
        }
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia            : " + usia);
        System.out.println("------------------------------");
    }
    void infoDosenPalingMuda(Dosen05 arrayOfDosen[], String kode, String nama, boolean jenisKelamin, int usia){
        int dummy = arrayOfDosen[0].usia;
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < dummy) {
                dummy = arrayOfDosen[i].usia;
                nama = arrayOfDosen[i].nama;
                kode = arrayOfDosen[i].kode;
                usia = arrayOfDosen[i].usia;
                jenisKelamin = arrayOfDosen[i].jenisKelamin;
            }
        }
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia            : " + usia);
        System.out.println("------------------------------");
    }
}
