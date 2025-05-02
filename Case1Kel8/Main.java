import java.util.Scanner;

public class Main {

    public static void urutkanMahasiswaBerdasarkanNilai(Penilaian[] penilaian) {
        for (int i = 0; i < penilaian.length - 1; i++) {
            for (int j = 0; j < penilaian.length - i - 1; j++) {
                if (penilaian[j].nilaiAkhir < penilaian[j + 1].nilaiAkhir) {
                    Penilaian temp = penilaian[j];
                    penilaian[j] = penilaian[j + 1];
                    penilaian[j + 1] = temp;
                }
            }
        }
        System.out.println("=== DATA MAHASISWA BERDASARKAN NILAI AKHIR (DESC) ===");
        for (Penilaian p : penilaian) {
            p.tampilPenilaian();
        }
    }

    public static void searchNIM(Penilaian[] penilaian, String nim) {
        boolean ditemukan = false;
        for (Penilaian p : penilaian) {
            if (p.mahasiswa.NIM.equalsIgnoreCase(nim)) {
                p.tampilPenilaian();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dengan NIM " + nim + " tidak ditemukan.\n");
        }
    }

    static void pencarianNilai(Penilaian[] penilaian) {
        String[] kategori1 = new String[penilaian.length];
        String[] kategori2 = new String[penilaian.length];
        String[] kategori3 = new String[penilaian.length];
    
        int idx0 = 0, idx1 = 0, idx2 = 0;
    
        for (Penilaian p : penilaian) {    
            if (p.nilaiAkhir > 80.0 && !sudahAda(p.mahasiswa.NIM, kategori1, idx0)) {
                kategori1[idx0++] = p.mahasiswa.NIM;
            }
    
            if (p.nilaiAkhir >= 70.0 && p.nilaiAkhir <= 80.0 && !sudahAda(p.mahasiswa.NIM, kategori2, idx1)) {
                kategori2[idx1++] = p.mahasiswa.NIM;
            }
    
            if (p.nilaiAkhir < 70.0 && !sudahAda(p.mahasiswa.NIM, kategori3, idx2)) {
                kategori3[idx2++] = p.mahasiswa.NIM;
            }
        }
        System.out.println("Jumlah mahasiswa yang punya p.nilaiAkhir akhir > 80             : " + idx0 + " mahasiswa");
        System.out.println("Jumlah mahasiswa yang punya p.nilaiAkhir akhir antara 70 - 80   : " + idx1 + " mahasiswa");
        System.out.println("Jumlah mahasiswa yang punya p.nilaiAkhir akhir < 70             : " + idx2 + " mahasiswa");
    }
    
    static boolean sudahAda(String nim, String[] kategori, int index) {
        for (int i = 0; i < index; i++) {
            if (kategori[i].equalsIgnoreCase(nim)) {
                return true;
            }
        }
        return false;
    }
    
    static Mahasiswa[] mhs = {
        new Mahasiswa("22001", "Ali Rahman", "D4 Teknik Informatika"),
        new Mahasiswa("22002", "Budi Santoso", "D3 Sistem Informasi"),
        new Mahasiswa("22003", "Citra Dewi", "D4 Sistem Informasi")
    };

    static Matkul[] mk = {
        new Matkul("MK001", "Struktur Data", 3),
        new Matkul("MK002", "Basis Data", 4),
        new Matkul("MK003", "Desain Web", 2)
    };

    static Penilaian[] penilaian = {
        new Penilaian(mhs[0], mk[0], 80, 85, 90),
        new Penilaian(mhs[0], mk[1], 70, 75, 70),
        new Penilaian(mhs[1], mk[0], 75, 70, 80),
        new Penilaian(mhs[2], mk[1], 85, 90, 95),
        new Penilaian(mhs[2], mk[2], 80, 90, 65)
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte pilihan;

        do {
            System.out.println("=== MENU ====");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Data Penilaian Mahasiswa Berdasarkan NIM");
            System.out.println("6. Jumlah Mahasiswa Berdasarkan Nilai");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = sc.nextByte();
            switch (pilihan) {
                case 1:
                System.out.println("\n=== DATA MAHASISWA ===");
                for (Mahasiswa mhs : mhs) {
                    System.out.println("NIM  : " + mhs.NIM);
                    System.out.println("Nama : " + mhs.nama);
                    System.out.println("Prodi : " + mhs.prodi);
                    System.out.println();
                }
                    break;
                case 2:
                System.out.println("\n=== DATA MATA KULIAH ===");
                    for (Matkul Matkul : mk) {
                        Matkul.tampilMatkul();
                        System.out.println();
                    }
                    break;
                case 3:
                System.out.println("\n=== DATA PENILAIAN MAHASISWA ===");
                    for (Penilaian Penilaian : penilaian) {
                        Penilaian.tampilPenilaian();
                    }
                    break;
                case 4:
                    urutkanMahasiswaBerdasarkanNilai(penilaian);
                    System.out.println();
                    break;
                case 5:
                    sc.nextLine(); 
                    System.out.print("Masukkan NIM: ");
                    String cariNIM = sc.nextLine();
                    System.out.println("\n=== HASIL PENCARIAN PENILAIAN ===");
                    searchNIM(penilaian, cariNIM);
                    break;
                case 6:
                    sc.nextLine(); 
                    System.out.println("\n=== JUMLAH MAHASISWA ===");
                    pencarianNilai(penilaian);
                    System.out.println();
                    break;
                case 0:
                System.out.println("Program selesai.");
                    break;
            
                default:
                System.out.println("Menu tidak valid! Silahkan input ulang.");
                    break;
            }
        } while(pilihan != 0);
    }
}