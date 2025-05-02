public class Penilaian {

    Mahasiswa mahasiswa;
    Matkul mataKuliah;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    Penilaian(Mahasiswa mahasiswa, Matkul mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        hitungNilaiAKhir();
    }

    void hitungNilaiAKhir() {
        this.nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4); 
    }

    void tampilPenilaian() {
        System.out.println("NIM: " + mahasiswa.NIM);
        System.out.println("Nama: " + mahasiswa.nama);
        System.out.println("Mata Kuliah: " + mataKuliah.namaMK);
        System.out.println("Tugas: " + nilaiTugas);
        System.out.println("UTS: " + nilaiUTS);
        System.out.println("UAS: " + nilaiUAS);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println();
    }
}