package Jobsheet3;
import java.util.Scanner;

public class MatakuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int matkul = sc.nextInt();

        Matakuliah05 arraayOfMatakuliah[] = new Matakuliah05[matkul];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            arraayOfMatakuliah[i] = new Matakuliah05("", "", 0, 0);
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode    : ");
            kode = sc.nextLine();
            System.out.print("Nama    : ");
            nama = sc.nextLine();
            System.out.print("SKS     : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            arraayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
            System.out.println("------------------------------");
            
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arraayOfMatakuliah[i].cetakInfo();
            System.out.println("------------------------------");
        }
    }
}
