package Jobsheet7;

import java.util.Scanner;

public class TugasDosenMain05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TugasDataDosen05 dosen = new TugasDataDosen05();
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampil data dosen");
            System.out.println("3. Sorting ASC (usia muda ke tua)");
            System.out.println("4. Sorting DSC (usia tua ke muda)");
            System.out.println("5. Insertion Sort ASC (usia muda ke tua)");
            System.out.println("6. Nama (Sequential)");
            System.out.println("7. Usia (Binary)");
            System.out.println("0. Keluar dari menu");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                System.out.print("Kode: ");
                String kode = sc.nextLine();
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("Jenis Kelamin (L/P): ");
                char jk = sc.next().charAt(0);
                boolean jenisKelamin = (jk == 'L' || jk == 'l');
                System.out.print("Usia: ");
                int usia = sc.nextInt();
                TugasDosen05 dsn = new TugasDosen05(kode, nama, jenisKelamin, usia);
                dosen.tambah(dsn);
                    break;
                case 2:
                dosen.tampil();
                    break;
                case 3:
                dosen.SortingASC();
                System.out.println("Data berhasil diurutkan ASC.");
                    break;
                case 4:
                dosen.SortingDSC();
                System.out.println("Data berhasil diurutkan DSC.");
                    break;
                case 5:
                dosen.insertionSort();
                System.out.println("Data berhasil diurutkan dengan insertion sort.");
                    break;
                case 6:
                System.out.print("Masukkan nama: ");
                String name = sc.nextLine();
                dosen.PencarianDataSequential(name);
                    break;
                case 7:
                System.out.print("Masukkan usia: ");
                int age = sc.nextInt();
                dosen.PencarianDataBinary(age);
                    break;
                case 0:
                System.out.println("Keluar");
                    break;
                default:
                System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);

        sc.close();
    }
}

// import java.util.Scanner;

// public class DosenDemo05 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         DataDosen05 data = new DataDosen05(10);

//         data.tambah(new Dosen05("Budi", 40));
//         data.tambah(new Dosen05("Ani", 35));
//         data.tambah(new Dosen05("Budi", 45));
//         data.tambah(new Dosen05("Dewi", 35));

//         System.out.println("Pilih metode pencarian:");
//         System.out.println("1. Nama (Sequential)");
//         System.out.println("2. Usia (Binary)");

//         int pilihan = sc.nextInt();
//         sc.nextLine(); // buang newline

//         if (pilihan == 1) {
//             System.out.print("Masukkan nama: ");
//             String nama = sc.nextLine();
//             data.PencarianDataSequential(nama);
//         } else if (pilihan == 2) {
//             System.out.print("Masukkan usia: ");
//             int usia = sc.nextInt();
//             data.PencarianDataBinary(usia);
//         } else {
//             System.out.println("Pilihan tidak valid.");
//         }

//         sc.close();
//     }
// }

