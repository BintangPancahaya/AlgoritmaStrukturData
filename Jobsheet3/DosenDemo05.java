package Jobsheet3;
import java.util.Scanner;

public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen: ");
        int jumDosen = sc.nextInt();
        Dosen05[] arrayOfDosen = new Dosen05[jumDosen];
        String kode = "";
        String nama = "";
        String dummy = "";
        boolean jenisKelamin = false;
        int usia = 0;

        sc.nextLine();
        System.out.println("------------------------------");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode                  : ");
            kode = sc.nextLine();
            System.out.print("Nama                  : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin(L/P)    : ");
            dummy = sc.nextLine();
            jenisKelamin = dummy.equals("L") ? true : false;
            System.out.print("Usia                  : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            
            arrayOfDosen[i] = new Dosen05(kode, nama, jenisKelamin, usia);
        }
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i+1));
            System.out.println("Kode    : " + arrayOfDosen[i].kode);
            System.out.println("Nama    : " + arrayOfDosen[i].nama);
            System.out.println("Sks     : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia    : " + arrayOfDosen[i].usia);
            System.out.println("------------------------------");
        }
        DataDosen05 dataDosen = new DataDosen05();
        System.out.println("DATA SEMUA DOSEN");
        System.out.println("------------------------------");
        dataDosen.dataSemuaDosen(arrayOfDosen);
        System.out.println("JUMLAH DOSEN BERDASARKAN JENIS KELAMIN");
        System.out.println("------------------------------");
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("RATA2 USIA DOSEN PER JENIS KELAMIN");
        System.out.println("------------------------------");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("DOSEN PALING TUA");
        System.out.println("------------------------------");
        dataDosen.infoDosenPalingTua(arrayOfDosen, kode, nama, jenisKelamin, usia);
        System.out.println("DOSEN PALING MUDA");
        System.out.println("------------------------------");
        dataDosen.infoDosenPalingMuda(arrayOfDosen, kode, nama, jenisKelamin, usia);
    }
}