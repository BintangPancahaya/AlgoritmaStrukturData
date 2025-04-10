package Jobsheet7;

public class TugasDataDosen05 {
    TugasDosen05[] dataDosen = new TugasDosen05[10];
    int idx = 0;

    void tambah(TugasDosen05 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx++] = dsn;
        } else {
            System.out.println("Data dosen penuh!");
        }
    }

    void tampil() {
        System.out.println(idx);
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    TugasDosen05 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void SortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            TugasDosen05 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
           TugasDosen05 key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia > key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = key;
        }
    }

    // a. Pencarian data berdasarkan nama menggunakan Sequential Search
    public void PencarianDataSequential(String nama) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].getNama().equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Data tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari 1 hasil!");
        }
    }

        // b. Pencarian data berdasarkan usia menggunakan Binary Search
        public void PencarianDataBinary(int usia) {
            // Urutkan array berdasarkan usia terlebih dahulu
            sortingUsia();
    
            int low = 0;
            int high = idx - 1;
            int count = 0;
    
            while (low <= high) {
                int mid = (low + high) / 2;
                if (dataDosen[mid].getUsia() == usia) {
                    // Jika ketemu, tampilkan data dan cari duplikat di kiri-kanannya
                    int kiri = mid;
                    while (kiri >= 0 && dataDosen[kiri].getUsia() == usia) {
                        dataDosen[kiri].tampil();
                        kiri--;
                        count++;
                    }
    
                    int kanan = mid + 1;
                    while (kanan < idx && dataDosen[kanan].getUsia() == usia) {
                        dataDosen[kanan].tampil();
                        kanan++;
                        count++;
                    }
    
                    break;
                } else if (dataDosen[mid].getUsia() < usia) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
    
            if (count == 0) {
                System.out.println("Data tidak ditemukan.");
            } else if (count > 1) {
                System.out.println("Peringatan: Ditemukan lebih dari 1 hasil!");
            }
        }
    
        private void sortingUsia() {
            // Selection sort untuk mengurutkan berdasarkan usia
            for (int i = 0; i < idx - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < idx; j++) {
                    if (dataDosen[j].getUsia() < dataDosen[minIdx].getUsia()) {
                        minIdx = j;
                    }
                }
                TugasDosen05 temp = dataDosen[i];
                dataDosen[i] = dataDosen[minIdx];
                dataDosen[minIdx] = temp;
            }
        }
}

// public class TugasDataDosen05 {
//     TugasDosen05[] dataDosen;
//     int idx;

//     public TugasDataDosen05(int kapasitas) {
//         dataDosen = new TugasDosen05[kapasitas];
//         idx = 0;
//     }

//     public void tambah(TugasDosen05 d) {
//         if (idx < dataDosen.length) {
//             dataDosen[idx++] = d;
//         } else {
//             System.out.println("Data sudah penuh!");
//         }
//     }




