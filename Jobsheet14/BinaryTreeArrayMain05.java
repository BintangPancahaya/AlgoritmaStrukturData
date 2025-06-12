package Jobsheet14;

public class BinaryTreeArrayMain05 {
    public static void main(String[] args) {
        BinaryTreeArray05 bta = new BinaryTreeArray05();
        
        Mahasiswa05 mhs1 = new Mahasiswa05("1001", "Ali", "A", 3.57);
        Mahasiswa05 mhs2 = new Mahasiswa05("1002", "Candra", "C", 3.41);
        Mahasiswa05 mhs3 = new Mahasiswa05("1003", "Badar", "B", 3.75);
        Mahasiswa05 mhs4 = new Mahasiswa05("1004", "Dewi", "B", 3.35);

        Mahasiswa05 mhs5 = new Mahasiswa05("1005", "Devi", "A", 3.48);
        Mahasiswa05 mhs6 = new Mahasiswa05("1006", "Ehsan", "D", 3.61);
        Mahasiswa05 mhs7 = new Mahasiswa05("1007", "Fizi", "B", 3.86);
        
        Mahasiswa05[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7}; 
        int idxLast = 6; 

        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder traversal: ");
        bta.traverseInOrder(0);
    }
}
