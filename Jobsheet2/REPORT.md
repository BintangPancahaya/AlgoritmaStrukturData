|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  244107020115|
| Nama |  Bintang Pancahaya Prasetyo |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/BintangPancahaya/AlgoritmaStrukturData/tree/main/Jobsheet1) |

# JOBSHEET 2

## 2.1.2 Verifikasi Hasil Percobaan

Hasil Verifikasi Percobaan

![Verifikasi](img/error.png)

## 2.1.3 Pertanyaan

1. Sebutkan dua karakteristik class atau object!
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
Mahasiswa? Sebutkan apa saja atributnya!
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method
tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah
IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak
pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,
kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang
dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
6. Commit dan push kode program ke Github


#### JAWABAN

1. Karakterisik Object :  
a. Mempunyai sesuatu, contoh : Data, Properti, Variabel, Atribut.  
b. Melakukan sesuatu, contoh : Tingkah laku, Fungsi, Method.  
Karakteristik Class :
2. Ada 4 atribut. String nama, String nim, String kelas, double ipk
3. Ada 4 method. void tampilkanInformasi(), void ubahKelas(), void updateIpk(), String nilaiKinerja().
4. Hasil screenshot modifikasi 
![Modifikasi](img/Modifikasi4.png)
5. Pertama method nilaiKinerja() akan menerima parameter double ipk. Kemudian kriteria yang digunakan jika ipk >= 3.5 Kinerja sangat baik, ipk 3.0 - 3.49 Kinerja baik, ipk 2.0 - 2.99 Kinerja cukup, ipk < 2 Kinerja kurang. Method ini mengembalikan nilai berupa string yang menjelaskan tingkat kinerja mahasiswa.
6. Hasil screenshot push ke github
![Github](img/Github1.png)

## 2.2.2 Verifikasi Hasil Percobaan

Hasil Verifikasi Percobaan
![Verif](img/Verifikasi.png)

## 2.2.3 Pertanyaan

1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses
instansiasi! Apa nama object yang dihasilkan?
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

#### JAWABAN

1. Baris kode program yang menunjukkan instansiasi
```
Mahasiswa05 mhs1 = new Mahasiswa05(); 
Mahasiswa05 mhs2 = new Mahasiswa05("Abidau","244107020115", 3.5, "TI 1H");
```
Pada baris pertama, objek mhs1 dibuat menggunakan konstruktor tanpa parameter (default).  
Pada baris kedua, objek mhs2 dibuat menggunakan konstruktor dengan parameter.

2. Dengan cara menggunakan operator titik (.) setelah nama objek. Contoh:   
`mhs1.kelas = "TI 1I";
mhs1.tampilkanInformasi();`
3. Hasilnya berbeda karena ada perubahan nilai pada atribut objek mhs1 sebelum pemanggilan kedua.

## 2.3.2 Verifikasi Hasil Percobaan

Hasil Verifikasi Percobaan

![Verif2](img/Verifikasi2.png)

## 2.3.3 Pertanyaan

1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
mendeklarasikan konstruktor berparameter!
2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program
berikut?
3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program.
Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses
secara berurutan? Jelaskan alasannya!
5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor
berparameter dari class Mahasiswa!
6. Commit dan push kode program ke Github

#### JAWABAN

1. Baris kode yang menunjukkan konstruktor berparameter
```
public Mahasiswa05(String nm, String nim, double ipk, String kls) {
    nama = nm;
    this.nim = nim;
    this.ipk = ipk;
    kelas = kls;
}
```
2. Baris ini membuat objek mhs2 dari class Mahasiswa05.
Konstruktor berparameter dipanggil untuk langsung mengisi atribut nama, nim, ipk, dan kelas.
Objek mhs2 akan memiliki nilai awal sesuai parameter yang diberikan.
3. Jika konstruktok default di hapus maka saat program mencoba membuat mhs1 dengan new Mahasiswa05();, terjadi error karena tidak ada konstruktor yang cocok.
4. Tidak harus. Method dalam Mahasiswa05 bisa dipanggil dalam urutan yang tidak tetap, tergantung kebutuhan.
5. Menambahkan objek mhs dengan nama mahasiswa
![Objek](img/Objek.png)
6. 

## Tugas 
### Tugas 1

Hasil Kode Program Pada Tugas Nomer 1

![Tugas1](img/Tugas1Fail.png)

Langkah-Langkah Kode Pemograman saya :
1. Program mendeklarasikan array KODE yang berisi karakter kode plat nomor dan array KOTA yang menyimpan nama kota dalam bentuk array karakter dua dimensi.
2. Program meminta pengguna untuk memasukkan satu karakter kode plat nomor menggunakan Scanner, lalu membaca karakter pertama dari input yang diberikan. Setelah itu, Scanner ditutup untuk menghemat sumber daya.
3. Program melakukan pencarian kode plat nomor dalam array KODE menggunakan perulangan for. Jika ditemukan, program menampilkan nama kota yang sesuai dengan cara mengakses elemen array KOTA pada indeks yang sama.
4. Program mencetak karakter dalam array KOTA satu per satu untuk membentuk nama kota yang lengkap, kemudian menampilkan hasilnya di terminal. Jika kode ditemukan, pencarian dihentikan menggunakan break.
5. Jika kode yang dimasukkan tidak ada dalam array KODE, program menampilkan pesan "Kode plat tidak ditemukan", menandakan bahwa input pengguna tidak cocok dengan daftar kode yang tersedia.

### Tugas 2

Hasil Kode Program Pada Tugas Nomer 2

![Tugas2](img/Tugas2.png)

Langkah-Langkah Kode Pemograman saya :
1. Program menampilkan menu pilihan kepada pengguna dengan empat opsi:

- Menghitung Volume Kubus
- Menghitung Luas Permukaan Kubus
- Menghitung Keliling Kubus
- Keluar dari program

2. Pengguna diminta memasukkan angka sesuai dengan pilihan perhitungan yang diinginkan. Jika pengguna memilih opsi 4 (Keluar), program akan menampilkan pesan "Keluar dari menu!" dan keluar dari perulangan dengan break.

3. Jika pengguna memilih opsi selain 1-3, program meminta pengguna untuk memasukkan panjang rusuk kubus. Program kemudian menggunakan switch-case untuk memanggil fungsi yang sesuai dengan pilihan pengguna:

- hitungVolume(int sisi) → Mengembalikan volume kubus dengan rumus sisi³
- hitungLuasPermukaan(int sisi) → Mengembalikan luas permukaan kubus dengan rumus 6 × sisi²
- hitungKeliling(int sisi) → Mengembalikan keliling kubus dengan rumus 12 × sisi

4. Program terus menampilkan menu dan meminta input hingga pengguna memilih opsi 4. Jika pengguna memasukkan angka selain 1, 2, 3, atau 4 program akan menampilkan "Menu tidak tersedia".

### Tugas 3

Hasil Kode Program Pada Tugas Nomer 3

![Tugas3-1](img/Tugas3-1.png)

![Tugas3-2](img/Tugas3-2.png)

![Tugas3-3](img/Tugas3-3.png)

Langkah-Langkah Kode Pemograman saya :
1. Program meminta pengguna untuk memasukkan jumlah mata kuliah yang akan dimasukkan. Untuk setiap mata kuliah, pengguna diminta mengisi nama mata kuliah, jumlah SKS, semester, dan hari kuliah. Data ini disimpan dalam array namaMk, sks, semester, dan hari.
2. Program menampilkan menu berisi 6 pilihan:

- 1 : Input Data Mata Kuliah
- 2 : Menampilkan Seluruh Jadwal
- 3 : Menampilkan jadwal Berdasarkan Hari
- 4 : Menampilkan jadwal Berdasarkan Semester
- 5 : Mencari Mata Kuliah Berdasarkan Nama Matkul
- 6 : Keluar

    Pengguna diminta memasukkan angka sesuai dengan pilihan yang diinginkan.

3. Berdasarkan input pengguna, program memanggil salah satu dari 5 fungsi berikut:

- InputData() → Menginputkan seluruh informasi mata kuliah
- TampilJadwal() → Menampilkan seluruh daftar mata kuliah beserta informasi SKS, semester, dan hari kuliah.
- TampilJadwalHari() → Menampilkan daftar mata kuliah yang dijadwalkan pada hari tertentu.
- TampilJadwalSemester() → Menampilkan daftar mata kuliah yang tersedia pada semester tertentu.
- CariNamaMataKul() → Mencari dan menampilkan informasi mata kuliah berdasarkan nama yang dimasukkan pengguna.

4. Jika pengguna memilih untuk menampilkan jadwal berdasarkan hari, semester, atau mencari mata kuliah berdasarkan nama, program akan memeriksa apakah data yang dicari tersedia. Jika tidak ditemukan, program menampilkan pesan "Mata Kuliah Tidak Ada".

5. Program terus menampilkan menu hingga pengguna memilih opsi 6 (Keluar). Jika opsi ini dipilih, program menampilkan pesan "Keluar dari Menu." dan keluar dari perulangan menggunakan 'return'.