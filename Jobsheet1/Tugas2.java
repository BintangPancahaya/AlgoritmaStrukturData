import java.util.Scanner;

public class Tugas2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int sisi;

        System.out.print("Masukkan sisi kubus: ");
        sisi = sc.nextInt();

        do {
        int menu = rumus();
        switch (menu) {
            case 1:
                int hasilVolume;
                hasilVolume = hitungVolume(sisi);
                System.out.println("=============================================");
                System.out.println("Hasil Volume Kubus dengan sisi "+sisi+ " adalah "+hasilVolume);
                System.out.println("=============================================");
                break;
                case 2:
                int hasilLuasPermukaan;
                hasilLuasPermukaan = hitungLuasPermukaan(sisi);
                System.out.println("=============================================");
                System.out.println("Hasil Luas Permukaan dengan sisi "+sisi+ " adalah "+hasilLuasPermukaan);
                System.out.println("=============================================");
                break;
                case 3:
                int hasilKeliling;
                hasilKeliling = hitungKeliling(sisi);
                System.out.println("=============================================");
                System.out.println("Hasil Keliling dengan sisi "+sisi+ " adalah "+hasilKeliling);
                System.out.println("=============================================");
                break;
                case 4:
                System.out.println("=============================================");
                System.out.println("Keluar dari menu!");
                System.out.println("=============================================");
                return;
                default:
                System.out.println("=============================================");
                System.out.println("Menu tidak tersedia.");
                System.out.println("=============================================");
                break;
        }

    } while (true);
    }
    static int rumus() {
        System.out.println("==== Menu Memilih Rumus Kubus ====");
        System.out.println("1. Menghitung Volume");
        System.out.println("2. Menghitung Luas Permukaan");
        System.out.println("3. Menghitung Keliling");
        System.out.println("4. Keluar");

        System.out.print("Pilih menu: ");
        int x = sc.nextInt();

        return x;
    }
    static int hitungVolume(int sisi) {
        int x;
        x = sisi*sisi*sisi;
        return x;
    }
    static int hitungLuasPermukaan(int sisi) {
        int x;
        x = 6*sisi*sisi;
        return x;
    }
    static int hitungKeliling(int sisi) {
        int x;
        x = 4*sisi;
        return x;
    }
}