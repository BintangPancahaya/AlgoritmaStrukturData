package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists list = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        
        int pilihan;
        Mahasiswa05 mhs;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Menambahkan Mahasiswa pada indeks tertentu");
            System.out.println("8. Menghapus NIM tertentu");
            System.out.println("9. Menghapus data di index tertentu");
            System.out.println("10. Menampilkan data pertama");
            System.out.println("11. Menampilkan data terakhir");
            System.out.println("12. Menampilkan data pada index tertentu");
            System.out.println("13. Menampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

             switch (pilihan) {
                case 1:
                System.out.println("Ukuran saat ini: " + list.size());

                    mhs = inputMahasiswa(sc);
                    list.addFirst(mhs);
                    break;
                case 2:
                    mhs = inputMahasiswa(sc);
                    list.addLast(mhs);
                    break;
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = sc.nextLine();
                    Node05 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Mahasiswa ditemukan");
                        found.data.tampil();
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                case 7:
                    System.out.print("Index: ");
                    int idxAdd = sc.nextInt();
                    sc.nextLine();
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();
                    list.add(new Mahasiswa05(nim, nama, kelas, ipk), idxAdd);
                    break;
                case 8:
                    System.out.print("Masukkan NIM yang ingin dihapus sesudahnya: ");
                    String keyNim = sc.nextLine();
                    list.removeAfter(keyNim);
                    break;
                case 9:
                    System.out.print("Hapus data di index ke berapa? ");
                    int idxRemove = sc.nextInt();
                    list.remove(idxRemove);
                    break;
                case 10:
                    Mahasiswa05 first = list.getFirst();
                    if (first != null) {
                        System.out.println("Data pertama:");
                        first.tampil();
                    } else {
                        System.out.println("Linked list kosong.");
                    }
                    break;
                case 11:
                    Mahasiswa05 last = list.getLast();
                    if (last != null) {
                        System.out.println("Data Terakhir:");
                        last.tampil();
                    } else {
                        System.out.println("Linked list kosong.");
                    }
                    break;
                case 12:
                     System.out.print("Index berapa yang ingin ditampilkan? ");
                    int idx = sc.nextInt();
                    Mahasiswa05 data = list.get(idx);
                    if (data != null) {
                        System.out.println("Data di index " + idx + ":");
                        data.tampil();
                    } else {
                        System.out.println("Index tidak ditemukan.");
                    }
                    break;
                case 13:
                    System.out.println("Jumlah data saat ini: " + list.size());
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
            }
        } while (pilihan != 0);
    }

    public static Mahasiswa05 inputMahasiswa(Scanner sc) {
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 
        return new Mahasiswa05(nim, nama, kelas, ipk);
    }
}
