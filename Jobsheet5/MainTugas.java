package Jobsheet5;

import java.util.Scanner;

public class MainTugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int baris = sc.nextInt();
        sc.nextLine();

        Tugas[] tgs = new Tugas[baris];

        for (int i = 0; i < baris; i++) {
            tgs[i] = new Tugas();
            System.out.println("----------------------");
            System.out.println("Mahasiswa "+(i+1));
            System.out.print("Masukkan Nama         : ");
            tgs[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM          : ");
            tgs[i].nim = sc.nextLine();
            System.out.print("Masukkan Tahun Masuk  : ");
            tgs[i].tahun = sc.nextInt();
            System.out.print("Masukkan nilai UTS    : ");
            tgs[i].uts = sc.nextInt();
            System.out.print("Masukkan nilai UAS    : ");
            tgs[i].uas = sc.nextInt();
            sc.nextLine();
        }

        Tugas tugas = new Tugas();
        int[] utsArray = new int[baris];
        int[] uasArray = new int[baris];

        for (int i = 0; i < baris; i++) {
            utsArray[i] = tgs[i].uts;
            uasArray[i] = tgs[i].uas;
        }

        System.out.println("\n+----------------------------------------------------------+");
        System.out.println("| Nama    | NIM        | Tahun Masuk | Nilai UTS | Nilai UAS |");
        System.out.println("+------------------------------------------------------------+");
        for (int i = 0; i < baris; i++) {
            System.out.printf("| %-7s | %-10s | %-11d | %-9d | %-9d |\n",
                    tgs[i].nama, tgs[i].nim, tgs[i].tahun, tgs[i].uts, tgs[i].uas);
        }
        System.out.println("+----------------------------------------------------------+\n");

        System.out.println("Hasil Perhitungan");
        System.out.println("a) Nilai UTS tertinggi menggunakan Divide and Conquer: " + tugas.utsTertinggiDC(utsArray, 0));
        System.out.println("b) Nilai UTS terendah menggunakan Divide and Conquer: " + tugas.utsTerendahDC(utsArray, 0));
        System.out.println("c) Rata-rata nilai UAS dari semua mahasiswa menggunakan Brute Force: " + tugas.rataUasBF(uasArray));

        sc.close();
    }
}