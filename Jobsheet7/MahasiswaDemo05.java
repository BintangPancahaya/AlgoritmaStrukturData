package Jobsheet7;

import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05(jumMhs);


        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM\t: ");
            String nim = sc.nextLine();
            System.out.print("Nama\t: ");
            String nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            String kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            double ipk = Double.parseDouble(sc.nextLine());

            list.tambah(new Mahasiswa05(nim, nama, kelas, ipk));
            System.out.println("----------------------------------------------");
        }

        list.tampil();

        // Melakukan pencarian data sequential
        System.out.println("------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------------");
        System.out.print("masukkan ipk mahasiswa yang dicari:\nIPK: ");
        double cari = Double.parseDouble(sc.nextLine());

        System.out.println("menggunakan sequential searching");
        int pss = list.sequentialSearching(cari);
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        //melakukan pencarian data Binary
        System.out.println("---");
        System.out.println("Pencarian data");
        System.out.println("---");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        cari = Double.parseDouble(sc.nextLine());
        System.out.println("---");
        System.out.println("menggunakan binary search");
        System.out.println("---");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
