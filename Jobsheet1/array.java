import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMK[] = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking and Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum dan Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        
        double bobotSKS[] = new double[8];
        String nilaiHuruf[] = new String[8];
        int nilaiMK[] = new int[8];
        int sks[] = {2, 3, 3, 2, 2, 3, 3, 2};
        double ipk = 0;
        int totalSKS = 0;
        double totalNilai = 0;

        System.out.println("=====================================");
        System.out.println("    Program Menghitung IP Semester   ");
        System.out.println("=====================================");

        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + namaMK[i] + ": ");
            nilaiMK[i] = sc.nextInt();

            if (nilaiMK[i] > 80 && nilaiMK[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotSKS[i] = 4.0;
            } else if (nilaiMK[i] > 73 && nilaiMK[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotSKS[i] = 3.5;
            } else if (nilaiMK[i] > 65 && nilaiMK[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotSKS[i] = 3.0;
            } else if (nilaiMK[i] > 60 && nilaiMK[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotSKS[i] = 2.5;
            } else if (nilaiMK[i] > 50 && nilaiMK[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotSKS[i] = 2.0;
            } else if (nilaiMK[i] > 39 && nilaiMK[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotSKS[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotSKS[i] = 0.0;
            }

            totalNilai += bobotSKS[i] * sks[i];
            totalSKS += sks[i];
        }

        System.out.println("\n==============================================");
        System.out.println("            Hasil Konversi Nilai              ");
        System.out.println("==============================================");
        System.out.printf("%-40s %-15s %-15s %-15s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < nilaiMK.length; i++) {
            System.out.printf("%-40s %-15d %-15s %-15s%n", namaMK[i], nilaiMK[i], nilaiHuruf[i], bobotSKS[i]);
        }

        ipk = totalNilai / totalSKS;
        System.out.println("==============================================");
        System.out.println("IP : " + ipk);
        System.out.println("==============================================");

        sc.close();
    }
}