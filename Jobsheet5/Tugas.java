package Jobsheet5;

public class Tugas {
    String nama, nim;
    int tahun;
    int uts, uas;

    int utsTertinggiDC(int u[], int dummy) {
        if (dummy == u.length - 1) {
            return u[dummy];
        }
        int nextMax = utsTertinggiDC(u, dummy + 1);
        if (u[dummy] > nextMax) {
            return u[dummy];
        } else {
            return nextMax;
        }
    }

    int utsTerendahDC(int a[], int dummy) {
        if (dummy == a.length - 1) {
            return a[dummy];
        }
        int nextMin = utsTerendahDC(a, dummy + 1);
        if (a[dummy] < nextMin) {
            return a[dummy];
        } else {
            return nextMin;
        }
    }

    double rataUasBF(int u[]) {
        int total = 0;
        for (int i = 0; i < u.length; i++) {
            total += u[i];
        }
        return (double) total / u.length;
    }
}