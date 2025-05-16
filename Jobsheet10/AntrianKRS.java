package Jobsheet10;

public class AntrianKRS {
    Mahasiswa05[] data;
    int front, rear, size, max, sudahProses;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa05[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahProses = 0;
    }

    public boolean isFull() {
        if (size == max){
            return true;
        } else { return false; }
    }

    public boolean isEmpty() {
        if (size == 0){
            return true;
        } else { return false; }
    }

    public void clear() {
        if (!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else { System.out.println("Queue masih kosong"); }
    }

    public void enqueue(Mahasiswa05 m) {
        if (isFull() || sudahProses >= 30) {
            System.out.println("Antrian penuh atau quota 30 sudah tercapai.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = m;
        size++;
        System.out.println(m.nama + " masuk antrian.");
    }

    public Mahasiswa05[] dequeue2() {
        if (size < 2) {
        System.out.println("Tidak cukup mahasiswa dalam antrian.");
        return null;
    }

    Mahasiswa05[] result = new Mahasiswa05[2];
    for (int i = 0; i < 2; i++) {
        result[i] = data[front];
        front = (front + 1) % max;
        size--;
        sudahProses++;
        }
        return result;
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar Antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void tampil2Terdepan() {
    if (size < 2) {
        System.out.println("Antrian kurang dari 2 orang.");
        return;
    }
    System.out.println("2 Antrian Terdepan:");
    for (int i = 0; i < 2; i++) {
        int idx = (front + i) % max;
        data[idx].tampilkanData();
        }
    }


    public void tampilTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getSudahProses() {
        return sudahProses;
    }

    public int getBelumProses() {
        return 30 - sudahProses;
    }
}