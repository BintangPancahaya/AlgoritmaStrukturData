package Jobsheet12;

public class DoubleLinkedLists {
    Node05 head, tail;

    public DoubleLinkedLists() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa05 data) {
        Node05 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
            
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node05 newNode = new Node05(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada yang dihapus.");
        } if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada yang dihapus.");
        } if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }   
    }

    public Node05 search(String nim) {
        Node05 current = head;
            while (current != null) {
                if (current.data.nim.equals(nim)) {
                    return current;
                }
            current = current.next;
            }
        return null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
        } else {
            Node05 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public void add(Mahasiswa05 data, int index) {
        if (index < 0 || index > size()) {
            System.out.println("Indeks tidak valid.");
            return;
        } if (index == 0) {
            addFirst(data);
            return;
        } if (index == size()) {
        addLast(data);
        return;
        }

        Node05 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node05 newNode = new Node05(data);
        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;
    }

    public void removeAfter(String keyNim) {
        Node05 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current != null && current.next != null) {
            Node05 toDelete = current.next;
            current.next = toDelete.next;
        if (toDelete.next != null) {
            toDelete.next.prev = current;
        } else {
            tail = current;
        }
        System.out.println("Data setelah " + keyNim + " berhasil dihapus: ");
        toDelete.data.tampil();
        } else {
            System.out.println("Data setelah " + keyNim + " tidak ditemukan.");
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("Indeks tidak valid.");
            return;
        } if (index == 0) {
            removeFirst();
            return;
        } if (index == size() - 1) {
            removeLast();
            return;
        }

        Node05 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Data berhasil dihapus:");
        current.data.tampil();
    }

    public Mahasiswa05 getFirst() {
        return head != null ? head.data : null;
    }

    public Mahasiswa05 getLast() {
        return tail != null ? tail.data : null;
    }

    public Mahasiswa05 get(int index) {
        if (index < 0 || index >= size()) return null;
            Node05 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        int count = 0;
        Node05 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
