import java.util.Scanner;
public class fungsi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pendapatan[] = new int[4];
        int stokBunga[][] = new int[4][4];
        String namaBunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        String lanjut;
        byte menu;

        for (int i = 0; i < 4; i++) {
            System.out.println("=======================================");
            System.out.println("Stok Bunga pada Cabang RoyalGarden "+(i+1));
            System.out.println("=======================================");
            for (int j = 0; j < 4; j++) {
                System.out.print("Masukkan stok bunga "+namaBunga[j]+": ");
                stokBunga[i][j] = sc.nextInt();
            }
        }
        do {
            System.out.println("==== MENU ====");
            System.out.println("1. Pendapatan setiap Cabang");
            System.out.println("2. Jumlah Stok pada Cabang RoyalGarden 4");
            System.out.println("3. Keluar");

            System.out.print("Pilih Menu: ");
            menu = sc.nextByte();

            switch (menu) {
                case 1:
                Pendapatan(pendapatan, stokBunga);
                    break;
                case 2:
                StockBungaCabang4(namaBunga, stokBunga);
                    break;
                default:
                System.out.println("Keluar dari Menu!");
                    return;
            }

            System.out.print("Ingin Akses Menu Lagi? (y/n): ");
            lanjut = sc.next();
        } while(lanjut.equalsIgnoreCase("y"));

        sc.close();
    }
    static void Pendapatan(int pendapatan[], int stokBunga[][]) {
        int harga = 0;
        System.out.println("Pendapatan Setiap Cabang");
        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4; j++) {
                if (j==0) {
                    harga = 75000;
                } else if (j==1) {
                    harga = 50000;
                } else if (j==2) {
                    harga = 60000;
                } else if (j==3) {
                    harga = 10000;
                }
                pendapatan[i] += stokBunga[i][j]*harga;
            }
            System.out.println("RoyalGarden "+(i+1)+": Rp."+pendapatan[i]);
        }
    }
    static void StockBungaCabang4(String namaBunga[], int stokBunga[][]) {
        System.out.println("========================");
        System.out.println("Stok Bunga RoyalGarden 4");
        System.out.println("========================");
        int stokPengurang[] = {0, 1 , 2, 3};
        for (int i = 0; i < 4; i++) {
            int hasilKurang = stokBunga[3][i] - stokPengurang[i];
            if (hasilKurang < 0) {
                hasilKurang = 0;
            }
            System.out.println("Stok bunga "+namaBunga[i]+": " + hasilKurang);
        }
    }
}
