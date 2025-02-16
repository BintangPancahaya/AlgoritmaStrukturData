import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] kota = {
                {'B','A', 'N', 'T', 'E', 'N'},
                {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
                {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                {'B', 'O', 'G', 'O', 'R'},
                {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
                {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
                {'M', 'A', 'L', 'A', 'N', 'G'},
                {'T', 'E', 'G', 'A', 'L'}
        };
            System.out.print("Masukkan Kode Plat Nomor: ");
            String kodesc = sc.nextLine();

            if (kodesc.length() != 1) {
                System.out.println("Kode plat nomor harus 1 karakter.");
            }
            char code = kodesc.charAt(0);

            int index = -1;
            for (int i = 0; i < kode.length; i++) {
                if (kode[i] == code) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("Kode plat nomor tidak ditemukan.");
            } else {
                System.out.print("Nama Kota: ");
                for (int j = 0; j < kota[index].length; j++) {
                    System.out.print(kota[index][j]);
                }
                System.out.println();
            }
        sc.close();
    }
}