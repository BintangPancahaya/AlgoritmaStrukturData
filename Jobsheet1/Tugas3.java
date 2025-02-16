import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahMK, menu;
        
        System.out.println("===========================");
        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMK = sc.nextInt();
        
        String namaMK[] = new String[jumlahMK];
        String hari[] = new String[jumlahMK];
        int sks[] = new int[jumlahMK];
        int semester[] = new int[jumlahMK];
        
        do {
            System.out.println("===========================");
            System.out.println("MENU");
            System.out.println("1. Input Data Mata Kuliah");
            System.out.println("2. Menampilkan Seluruh Jadwal");
            System.out.println("3. Menampilkan Jadwal Berdasarkan Hari");
            System.out.println("4. Menampilkan Jadwal Berdasarkan Semester");
            System.out.println("5. Mencari Mata Kuliah Berdasarkan Nama Matkul");
            System.out.println("6. Keluar");
            
            System.out.print("Pilih Menu: ");
            menu = sc.nextByte();
            System.out.println("===========================");
            
            switch (menu) {
                case 1:
                InputData(jumlahMK, namaMK, hari, sks, semester);
                break;
                case 2:
                TampilJadwal(jumlahMK, namaMK, hari, sks, semester);
                break;
                case 3:
                TampilJadwalHari(jumlahMK, namaMK, hari, sks, semester);
                break;
                case 4:
                TampilJadwalSemester(jumlahMK, namaMK, hari, sks, semester);
                break;
                case 5:
                CariNamaMatkul(jumlahMK, namaMK, hari, sks, semester);
                break;
                case 6:
                System.out.println("Keluar dari Menu.");
                System.out.println("===========================");
                return;
                default:
                System.out.println("Pilihan Menu Tidak Valid!");
                break;
            }
        } while(menu != 6);
        sc.close();
    }
    static void InputData(int jumlahMK, String namaMK[], String hari[], int sks[], int semester[]) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan Nama Matkul ke-"+(i+1)+": ");
            namaMK[i] = sc.nextLine();
            System.out.print("Masukkan SKS Matkul ke-"+(i+1)+": ");
            sks[i] = sc.nextInt();
            System.out.print("Masukkan Semester Matkul ke-"+(i+1)+": ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Hari Matkul ke-"+(i+1)+": ");
            hari[i] = sc.nextLine();
            if (i != (jumlahMK-1)) {
                System.out.println("==================================");
            }
        }
    }
    static void TampilJadwal(int jumlahMK, String namaMK[], String hari[], int sks[], int semester[]) {
        boolean x = false;

        if (namaMK[0] == null && sks[0] == 0 && semester[0] == 0 && hari[0] == null) {
            System.out.println("Mata Kuliah Tidak Ada.");
            x = true;
        } else if (x == false) {
        System.out.printf("%-20s %-6s %-10s %-12s%n", "Nama MK", "SKS", "Semester", "Hari");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-20s %-6s %-10s %-12s%n", namaMK[i], sks[i], semester[i], hari[i]);
        }
    }
    }
    static void TampilJadwalHari(int jumlahMK, String namaMK[], String hari[], int sks[], int semester[]) {
        Scanner sc = new Scanner(System.in);
        String key;
        boolean x = false;
        
        System.out.print("Masukkan Hari untuk Jadwal Tertentu: ");
        key = sc.nextLine();
        System.out.printf("%-20s %-6s %-10s%n", "Nama MK", "SKS", "Semester");
        for (int i = 0; i < jumlahMK; i++) {
            if (key.equalsIgnoreCase(hari[i])) {
                System.out.printf("%-20s %-6s %-10s%n", namaMK[i], sks[i], semester[i]);
                x = true;
            }
        } 
        if (!x) {
            System.out.println("Jadwal tidak ada di hari tersebut.");
        }
    }
    static void TampilJadwalSemester(int jumlahMK, String namaMK[], String hari[], int sks[], int semester[]) {
        Scanner sc = new Scanner(System.in);
        int key;
        boolean x = false;
        
        System.out.print("Masukkan Semester untuk Jadwal Tertentu: ");
        key = sc.nextInt();
        System.out.printf("%-20s %-6s %-10s%n", "Nama MK", "SKS", "Hari");
        for (int i = 0; i < jumlahMK; i++) {
            if (key == semester[i]) {
                System.out.printf("%-20s %-6s %-10s%n", namaMK[i], sks[i], hari[i]);
                x = true;
            }
        } 
        if (!x) {
            System.out.println("Jadwal tidak ada di semester tersebut.");
        }
    }
    static void CariNamaMatkul(int jumlahMK, String namaMK[], String hari[], int sks[], int semester[]) {
        Scanner sc = new Scanner(System.in);
        String key;
        boolean x = false;
        
        System.out.print("Masukkan Nama Matkul untuk Jadwal Tertentu: ");
        key = sc.nextLine();
        System.out.printf("%-6s %-10s %-12s%n", "SKS", "Semester", "Hari");
        for (int i = 0; i < jumlahMK; i++) {
            if (key.equalsIgnoreCase(namaMK[i])) {
                System.out.printf("%-6s %-10s %-12s%n", sks[i], semester[i], hari[i]);
                x = true;
            }
        } 
        if (!x) {
            System.out.println("Mata kuliah tidak ada di jadwal.");
        }
    }
}