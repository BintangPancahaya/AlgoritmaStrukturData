package Jobsheet3;
import java.util.Scanner;

public class MatakuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matakuliah05 arraayOfMatakuliah[] = new Matakuliah05[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Sks           : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam    : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");
            
            arraayOfMatakuliah[i] = new Matakuliah05(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            System.out.println("Kode        : " + arraayOfMatakuliah[i].kode);
            System.out.println("Nama        : " + arraayOfMatakuliah[i].nama);
            System.out.println("Sks         : " + arraayOfMatakuliah[i].sks);
            System.out.println("Jumlah jam  : " + arraayOfMatakuliah[i].jumlahJam);
            System.out.println("------------------------------");
        }
    }
}
