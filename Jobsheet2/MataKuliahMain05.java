package Jobsheet2;

public class MataKuliahMain05 {
    public static void main(String[] args) {
        MataKuliah05 matkul1 = new MataKuliah05();
        matkul1.kodeMk = "1011";
        matkul1.nama = "ALSD";
        matkul1.sks = 4;
        matkul1.jumlahJam = matkul1.sks * 50/60;

        System.out.println("==============");
        System.out.println("Sebelum Diubah");
        System.out.println("--------------");
        matkul1.tampilInformasi();
        matkul1.ubahSKS(3);
        matkul1.tambahJam(0);
        matkul1.kurangiJam(1);
        System.out.println("==============");
        System.out.println("Sesudah Diubah");
        System.out.println("--------------");
        matkul1.tampilInformasi();

        MataKuliah05 matkul2 = new MataKuliah05("1012", "Daspro", 3, 2);
        System.out.println("=====================");
        System.out.println("Konstruktor Parameter");
        System.out.println("---------------------");
        matkul2.ubahSKS(3);
        matkul2.tambahJam(1);
        matkul2.kurangiJam(0);
        matkul2.tampilInformasi();
    }

}
