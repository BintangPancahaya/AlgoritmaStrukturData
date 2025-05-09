package Jobsheet9;
import java.util.Scanner;

public class Surat05Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat05 stack = new StackSurat05(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat05: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt(); sc.nextLine();
                    stack.push(new Surat05(id, nama, kelas, jenis, durasi));
                    break;

                case 2:
                    Surat05 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat05 atas = stack.peek();
                    if (atas != null) {
                        System.out.println("Surat05 terakhir dari: " + atas.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Nama Mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    boolean ditemukan = stack.cariSurat(cariNama);
                    if (ditemukan) {
                        System.out.println("Surat05 dari " + cariNama + " ditemukan.");
                    } else {
                        System.out.println("Surat05 dari " + cariNama + " tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);
    }
}