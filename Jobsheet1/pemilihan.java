import java.util.Scanner;
public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int tugas, kuis, uts, uas;
        double nilaiAkhir;
        String nilaiHuruf = "";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        uas = sc.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");
        if (tugas > 100 || tugas < 0 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
        } else {
        nilaiAkhir = (tugas*0.2 + kuis*0.2 + uts*0.3 + uas*0.3);
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        }
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        }
        else {
            nilaiHuruf = "E";
        }
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        System.out.println("Nilai Huruf : "+nilaiHuruf);
        System.out.println("==============================");
        System.out.println("==============================");
        if (nilaiHuruf != "D" || nilaiHuruf != "E") {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA TIDAK LULUS");
        }
        }
        sc.close();
    }
}