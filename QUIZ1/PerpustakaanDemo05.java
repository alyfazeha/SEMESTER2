package QUIZ1;
import java.util.Scanner;
public class PerpustakaanDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int countMHS = 0;
        int countList = 0;
        int answer;
        Buku05[] arrayOfBuku = new Buku05[10];
        Mahasiswa05[] arrayOfMahasiswa = new Mahasiswa05[10];
        String[][] arrayOfList = new String[2][10];

        System.out.println("===================================");
        System.out.println("======== MENU PERPUSTAKAAN ========");
        System.out.println("==================================="); 
        System.out.println("1. Tambah Buku");
        System.out.println("2. Tambah Mahasiswa");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Kembalikan Buku");
        System.out.println("5. Tampilkan Peminjaman");
        System.out.println("6. Keluar");
        System.out.println("===================================");

        Perpustakaan05 perpus = new Perpustakaan05();
        while (true) { 
            System.out.print("Pilih Menu : ");
            if (sc.hasNextInt()) {
                answer = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                sc.next(); 
                continue;
            }
    
            switch (answer) {
                case 1:
                    count = perpus.tambahBuku(arrayOfBuku, count, sc);
                    break;
                
                case 2:
                    countMHS = perpus.tambahMahasiswa(arrayOfMahasiswa, countMHS, sc);
                    break;
                
                case 3:
                    perpus.pinjamBuku(arrayOfBuku, arrayOfMahasiswa, sc, arrayOfList, countList);
                    break;

                case 4:
                    perpus.kembalikanBuku(arrayOfBuku, arrayOfMahasiswa, sc, arrayOfList, countList);
                    break;

                case 5:
                    perpus.tampilPeminjaman(arrayOfMahasiswa, count);
                    break;

                case 6:
                    System.out.println("Terima Kasih Telah Menggunakan Sistem Perpustakaan !!");
                    System.exit(answer);
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }

    }
}
