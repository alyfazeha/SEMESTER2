package JOBSHEET10;
public class AntrianKRS {
    Mahasiswa[] antrian;
    int front, rear, size, max = 10;
    int jumlahDPA = 30;
    int jumlahProsesKRS = 0;
    
    public AntrianKRS() {
        antrian = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
    }
    
    public boolean isKosong() {
        return size == 0;
    }
    
    public boolean isPenuh() {
        return size == max;
    }
    
    public void enqueue(Mahasiswa mhs) {
        if (isPenuh()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isKosong()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        antrian[rear] = mhs;
        size++;
    }
    
    public void dequeueDuaMahasiswa() {
        if (isKosong()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Memproses KRS untuk:");
        int count = Math.min(2, size);
        for (int i = 0; i < count; i++) {
            antrian[front].tampilkanData(); 
            front = (front + 1) % max;
            size--;
            jumlahProsesKRS++;
        }
    }
    
    public void tampilkanSemuaAntrian() {
        if (isKosong()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("front: " + front + ", rear: " + rear + ", size: " + size);
        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                antrian[i].tampilkanData();
            }
        } else {
            for (int i = front; i < max; i++) {
                antrian[i].tampilkanData();
            }
            for (int i = 0; i <= rear; i++) {
                antrian[i].tampilkanData();
            }
        }
    }
    
    public void tampilkanDuaTerdepan() {
        if (isKosong()) {
           System.out.println("Antrian kosong!");
           return;
       }
       System.out.println("Dua antrian terdepan:");
       int count = Math.min(2, size);
       for (int i = 0; i < count; i++) {
           antrian[(front + i) % max].tampilkanData();
       }
   }
    
   public void tampilkanAntrianTerakhir() {
        if (isKosong()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Antrian terakhir:");
        antrian[rear].tampilkanData();
    }
    
    public void cetakJumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }
    
    public void cetakJumlahProsesKRS() {
        System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + jumlahProsesKRS);
    }
    
    public void cetakJumlahBelumProsesKRS() {
        System.out.println("Jumlah mahasiswa yang belum proses KRS: " + (jumlahDPA - jumlahProsesKRS));
    }
    
    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }
}
