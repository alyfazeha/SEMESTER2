package JOBSHEET11;
public class QueueLinkedList {
    private Node front;
    private Node rear;
    private int size;
    private int maxSize;
    
    public QueueLinkedList(int maxSize) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.maxSize = maxSize;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == maxSize;
    }
    
    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan!");
    }
    
    public void enqueue(Mahasiswa mahasiswa) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak bisa menambahkan mahasiswa baru.");
            return;
        }
        
        Node newNode = new Node(mahasiswa);
        
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        
        rear = newNode;
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian!");
    }
    
    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang dapat dipanggil.");
            return null;
        }
        
        Mahasiswa mahasiswa = front.data;
        front = front.next;
        
        if (front == null) {
            rear = null;
        }
        
        size--;
        return mahasiswa;
    }
    
    public void displayFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa di antrian terdepan.");
            return;
        }
        
        System.out.println("Mahasiswa di antrian terdepan:");
        System.out.println(front.data);
    }
    
    public void displayRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa di antrian terakhir.");
            return;
        }
        
        System.out.println("Mahasiswa di antrian terakhir:");
        System.out.println(rear.data);
    }
    
    public void displaySize() {
        System.out.println("Jumlah mahasiswa yang masih mengantri: " + size);
    }
    
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("Daftar mahasiswa dalam antrian:");
        
        Node current = front;
        int urutan = 1;
        
        while (current != null) {
            System.out.println(urutan + ". " + current.data);
            current = current.next;
            urutan++;
        }
    }
}
