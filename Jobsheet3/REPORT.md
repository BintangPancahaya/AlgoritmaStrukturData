|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  244107020115|
| Nama |  Bintang Pancahaya Prasetyo |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/BintangPancahaya/AlgoritmaStrukturData/tree/main/Jobsheet3) |

# JOBSHEET 3

## 3.2 Membuat Array dari Object, Mengisi dan Menampilkan

Hasil Kode Program 

![Screenshot](img/Mahasiswa1.png)

### 3.2.3 Pertanyaan

1. Tidak, sebuah class bisa saja hanya memiliki atribut tanpa method, atau hanya memiliki method tanpa atribut. Biasanya class yang dibuat untuk array of objects memiliki atribut untuk menyimpan data dan method untuk melakukan sesuatu dengan data tersebut. Atribut digunakan untuk menyimpan informasi, sedangkan method digunkana untuk melakukan sebuah proses dari informasi tersebut.

2. `Mahasiswa[] arrayOfMahasiswa` mendeklarasikan sebuah array yang akan menyimpan objek-objek dari kelas Mahasiswa.

    `new Mahasiswa[3]` membuat array dengan ukuran 3, yang berarti array ini dapat menampung tiga objek Mahasiswa.

3. Jika class Mahasiswa tidak memiliki konstruktor, Java secara otomatis memberikan konstruktor default yang tidak memerlukan parameter. Jika ada konstruktor yang dibuat dengan parameter, harus memanggilnya dengan memberikan nilai yang sesuai.

4. Kode program ini membuat sebuah array yang berisi tiga objek dari class Mahasiswa. Setiap objek diisi dengan informasi data mahasiswa seperti NIM, nama, kelas, dan IPK.

5. Dipisah karena untuk membuat kode lebih teratur dan mudah dipahami. Class Mahasiswa berfungsi untuk mendefinisikan data dan perilaku yang berkaitan dengan mahasiswa, seperti atribut NIM, nama, kelas, dan IPK. Sedangkan, class MahasiswaDemo digunakan untuk menjalankan program dan menguji class Mahasiswa.

## 3.3 Menerima Input Isian Array Menggunakan Looping

Hasil Kode Pemrograman

![Screenshot](img/Mahasiswa.png)

### 3.3.3 Pertanyaan

1. Jawaban

Kode class Mahasiswa05

![Screenshot](img/cetakInfo.png)

Kode class MahasiswaDemo05

![Screenshot](img/Demo.png)

2. Jika mencoba menggunakan array myArrayOfMahasiswa tanpa menginstansiasi terlebih dahulu, maka kode tersebut akan menyebabkan error karena tidak dapat mengakses elemen dari array yang belum dibuat.

## 3.4 Constructor Berparameter

Hasil Kode Pemrograman

![Screenshot](img/matkul.png)

### 3.4.3 Pertanyaan

1. Ya, sebuah class dapat memiliki lebih dari satu constructor.

![Screenshot](img/contoh.png)

2. Jawaban

Kode class Matakuliah

![Screenshot](img/tambahdata.png)

Kode class MatakuliahDemo

![Screenshot](img/tambahMatkulDemo.png)

3.  Jawaban

kode class Matakuliah

![Screenshot](img/matkulinfo.png)

Kode class MatakuliahDemo

![Screenshot](img/matkulinfo1.png)

4. Jawaban

![Screenshot](img/jumlahMatkul.png)

## 3.5 Tugas 1

1. Hasil Kode Pemrograman 

![Screenshot](img/Tugas1.png)

Langkah - langkah kode program saya:  

1. Pada Class Dosen05, pertama melakukan deklarasi variabel.  
`kode (String)` → Kode unik dosen.  
`nama (String)` → Nama dosen.  
`jenisKelamin (boolean)` → Jenis kelamin dosen (true = laki-laki, false = perempuan).  
`usia (int)` → Usia dosen dalam tahun.

2. Kemudian menggunakan konstruktor berparameter.  
Parameter Constructor:  
`kode` → Untuk menyimpan kode dosen.  
`nama` → Untuk menyimpan nama dosen.  
`jenisKelamin` → Untuk menyimpan jenis kelamin (true = laki-laki, false = perempuan).  
`usia` → Untuk menyimpan usia dosen.  
`this` digunakan untuk membedakan antara variabel instance (this.kode) dan parameter (kode).

3. Pada Class DosenDemo05, pertama harus membuat scanner dan menginputkan jumlah dosen.

4. Kemudian mengisi data dosen menggunakan looping.  
Looping untuk menginput data dosen satu per satu.  
Input String → `kode, nama, dan jenisKelamin` (L untuk laki-laki, P untuk perempuan).  
Konversi Jenis Kelamin → Jika `dummy.equals("L")`, maka `jenisKelamin = true (laki-laki)`, jika tidak maka false (perempuan).  
Konversi Usia → Input usia awalnya `String (dummy)`, kemudian dikonversi menjadi int.  
Objek Dosen05 dibuat dan disimpan ke dalam array.

5. Menampilkan semua data dosen menggunakan looping.

## Tugas 2

1. Hasil Kode Pemrograman

![Screenshot](img/Tugas2.png)

2. Di Class DataDosen05 terdapat 5 method.
- yang pertama untuk menampilkan semua data dosen.
- yang kedua untuk menghitung jumlah dosen per kelamin.
- yang ketiga untuk menghitung rata - rata jumlah dosen per kelamin.
- yang keempat untuk mencari tahu informasi dosen paling tua.
- yang kelima untuk mencari tahu informasi dosen paling muda.

