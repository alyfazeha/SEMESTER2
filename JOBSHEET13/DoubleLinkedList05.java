package JOBSHEET13;
public class DoubleLinkedList05 {
    Node05 head;
    Node05 tail;

    public DoubleLinkedList05() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void add(int index, Mahasiswa05 data) {
        if (isEmpty() || index == 0) {
            addFirst(data);
            return;
        }
        
        Node05 current = head;
        int i = 0;
        
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        
        if (current == null) {
            addLast(data);
        } else {
            Node05 newNode = new Node05(data);
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
        }
        
        System.out.println("Node berhasil disisipkan pada indeks " + index);
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

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
            return;
        }
        
        String nim = head.data.nim;
        String nama = head.data.nama;
        String kelas = head.data.kelas;
        double ipk = head.data.ipk;
        
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
            return;
        }
        
        String nim = tail.data.nim;
        String nama = tail.data.nama;
        String kelas = tail.data.kelas;
        double ipk = tail.data.ipk;
        
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat menghapus!");
            return;
        }
        
        Node05 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current == tail) {
            System.out.println("Tidak ada node setelah node dengan NIM " + keyNim);
            return;
        }
        
        Node05 targetNode = current.next;
        String nim = targetNode.data.nim;
        String nama = targetNode.data.nama;
        String kelas = targetNode.data.kelas;
        double ipk = targetNode.data.ipk;
        
        if (targetNode == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = targetNode.next;
            targetNode.next.prev = current;
        }
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus.");
        System.out.println("Data yang terhapus adalah: ");
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    }
    
    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat menghapus!");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        
        Node05 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Indeks " + index + " tidak valid, tidak ada data yang dihapus.");
            return;
        }
        
        String nim = current.data.nim;
        String nama = current.data.nama;
        String kelas = current.data.kelas;
        double ipk = current.data.ipk;
        
        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        System.out.println("Data pada indeks " + index + " berhasil dihapus.");
        System.out.println("Data yang terhapus adalah: ");
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    }
    
    public Mahasiswa05 getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong!");
            return null;
        }
        return head.data;
    }
    
    public Mahasiswa05 getLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong!");
            return null;
        }
        return tail.data;
    }
    
    public Mahasiswa05 getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong!");
            return null;
        }
        
        Node05 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Indeks " + index + " tidak valid!");
            return null;
        }
        return current.data;
    }
    
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        
        int count = 0;
        Node05 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
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
            System.out.println("WARNING: Linked List masih kosong!");
            return;
        }
        
        System.out.println("Data Mahasiswa:");
        Node05 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}