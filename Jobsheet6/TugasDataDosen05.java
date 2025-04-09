package Jobsheet6;

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
}
