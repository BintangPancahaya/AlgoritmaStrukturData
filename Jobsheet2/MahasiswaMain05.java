package Jobsheet2;

public class MahasiswaMain05 {

    public static void main(String[] args) {
        Mahasiswa05 mhs1 = new Mahasiswa05();
        mhs1.nama = "Bintang Pancahaya Prasetyo";
        mhs1.nim = "244107020115";
        mhs1.kelas = "TI 1H";
        mhs1.ipk = 3.89;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1I");
        mhs1.updateIpk(4.0);
        mhs1.tampilkanInformasi();
        String kinerja1 = mhs1.nilaiKinerja(mhs1.ipk);
        System.out.println("Nilai kinerja : " + kinerja1);
        
        Mahasiswa05 mhs2 = new Mahasiswa05("Abidau","244107020115", 3.5, "TI 1H");
        mhs2.updateIpk(3.6);
        mhs2.tampilkanInformasi();
        String kinerja2 = mhs2.nilaiKinerja(mhs2.ipk);
        System.out.println("Nilai kinerja : " + kinerja2);

        Mahasiswa05 mhsBintang = new Mahasiswa05("Bintang Pancahaya P.", "244107020115", 3.7, "TI 1H");
        mhsBintang.tampilkanInformasi();
    }
}