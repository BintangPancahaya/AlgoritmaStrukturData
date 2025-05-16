package Jobsheet10;

public class AntrianLayanan05 {
    Mahasiswa05[] data;
    int front, rear, size, max, sudahDilayani, sudahProses;

    public AntrianLayanan05(int max){
        this.max = max;
        this.data = new Mahasiswa05[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahDilayani = 0;
        this.sudahProses = 0;
    }

    public boolean isFull(){
        if (size == max){
            return true;
        } else { return false; }
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        } else { return false; }
    }

    public int getMhsBelumNgurusKRS(){
        //return 30-(size+sudahDilayani);
        return 30-sudahProses;
    }
    public void peek(){
        if (!isEmpty()){
            System.out.println("Elemen terdepan: " + data[front]);
        } else { System.out.println("Queue masih kosong");}
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear){
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear(){
        if (!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else { System.out.println("Queue masih kosong"); }
    }

    public void tambahAntrian(Mahasiswa05 mhs){
        if (isFull() || (size+sudahDilayani>=30)){
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        if ((sudahProses>=30)){
            System.out.println("Quota penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        sudahProses++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    public Mahasiswa05 layaniMahasiswa05(){
        if (isEmpty()){
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa05 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }
    // public Mahasiswa05[] layaniMahasiswa05(){
    //     if (isEmpty()){
    //         System.out.println("Antrian kosong.");
    //         return null;
    //     }
    //     if(size==1){
    //         Mahasiswa05[] ret = new Mahasiswa05[1];
    //         Mahasiswa05 mhs = data[front];
    //         ret[0] = mhs;
    //         front = (front + 1) % max;
    //         size--;
    //         sudahDilayani++;
    //         return ret;
    //     }else{
    //         Mahasiswa05[] ret = new Mahasiswa05[2];
    //         Mahasiswa05 mhs = data[front];
    //         ret[0] = mhs;
    //         front = (front + 1) % max;
    //         size--;
    //         sudahDilayani++;
    //         ret[1] = data[front]; 
    //         front = (front + 1) % max;
    //         size--;
    //         sudahDilayani++;
    //         return ret;
    //     }
    // }

    public void lihatTerdepan(){
        if (isEmpty()){
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()){
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++){
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }
}
