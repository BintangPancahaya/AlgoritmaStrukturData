package Jobsheet14;

public class Node05 {
    Mahasiswa05 mahasiswa;
    Node05 left;
    Node05 right;

    public Node05(){
    }

    public Node05(Mahasiswa05 mahasiswa){
        this.mahasiswa = mahasiswa;
        left = right = null;
    }
}
