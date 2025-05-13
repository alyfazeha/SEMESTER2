package JOBSHEET11;
import java.util.Scanner;

public class ProgramAntrianLayananKemahasiswaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== PROGRAM ANTRIAN LAYANAN UNIT KEMAHASISWAAN ===");
        
        System.out.print("Masukkan kapasitas maksimum antrian: ");
        int maxSize = scanner.nextInt();
        scanner.nextLine();
        
        QueueLinkedList queue = new QueueLinkedList(maxSize);
        
        int pilihan = 0;
        while (pilihan != 9) {
            System.out.println("\n=== MENU PROGRAM ===");
            System.out.println("1. Cek antrian kosong");
            System.out.println("2. Cek antrian penuh");
            System.out.println("3. Mengosongkan antrian");
            System.out.println("4. Tambah mahasiswa ke antrian");
            System.out.println("5. Panggil mahasiswa dari antrian");
            System.out.println("6. Tampilkan antrian terdepan dan terakhir");
            System.out.println("7. Tampilkan jumlah mahasiswa dalam antrian");
            System.out.println("8. Tampilkan semua antrian");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");
            
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Apakah antrian kosong? " + queue.isEmpty());
                    break;
                    
                case 2:
                    System.out.println("Apakah antrian penuh? " + queue.isFull());
                    break;
                    
                case 3:
                    queue.clear();
                    break;
                    
                case 4:
                    if (queue.isFull()) {
                        System.out.println("Antrian penuh! Tidak bisa menambahkan mahasiswa baru.");
                    } else {
                        System.out.println("--- Tambah Mahasiswa ---");
                        System.out.print("Masukkan NIM: ");
                        String nim = scanner.nextLine();
                        System.out.print("Masukkan Nama: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan Keperluan: ");
                        String keperluan = scanner.nextLine();
                        
                        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, keperluan);
                        queue.enqueue(mahasiswa);
                    }
                    break;
                    
                case 5:
                    Mahasiswa mahasiswaDipanggil = queue.dequeue();
                    if (mahasiswaDipanggil != null) {
                        System.out.println("Mahasiswa yang dipanggil:");
                        System.out.println(mahasiswaDipanggil);
                    }
                    break;
                    
                case 6:
                    queue.displayFront();
                    queue.displayRear();
                    break;
                    
                case 7:
                    queue.displaySize();
                    break;
                    
                case 8:
                    queue.displayQueue();
                    break;
                    
                case 9:
                    System.out.println("Terima kasih telah menggunakan program antrian layanan kemahasiswaan!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu yang tersedia.");
            }
        }
        
        scanner.close();
    }
}
