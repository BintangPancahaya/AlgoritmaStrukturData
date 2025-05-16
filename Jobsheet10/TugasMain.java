package Jobsheet10;

import java.util.Scanner;

public class TugasMain {
    public static void main(String[] args) {
        AntrianKRS antrian = new AntrianKRS(10);
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Jumlah Antrian");
            System.out.println("8. Jumlah Sudah Proses");
            System.out.println("9. Jumlah Belum Proses");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa05 m = new Mahasiswa05(nim, nama, prodi, kelas);
                    antrian.enqueue(m);
                    break;
                case 2:
                    Mahasiswa05[] dilayani = antrian.dequeue2();
                    if (dilayani != null) {
                        for (Mahasiswa05 x : dilayani) {
                            System.out.print("Diproses: ");
                            x.tampilkanData();
                        }
                    }
                    break;
                case 3:
                    antrian.tampilSemua();
                    break;
                case 4:
                    antrian.tampil2Terdepan();
                    break;
                case 5:
                    System.out.print("Antrian Terakhir: ");
                    antrian.tampilTerakhir();
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 7:
                    System.out.println("Jumlah Antrian: " + antrian.getJumlahAntrian());
                    break;
                case 8:
                    System.out.println("Sudah Proses: " + antrian.getSudahProses());
                    break;
                case 9:
                    System.out.println("Belum Proses: " + antrian.getBelumProses());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
