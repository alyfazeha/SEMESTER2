package JOBSHEET10;

import java.util.Scanner;

public class AntrianKRSMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianKRS antrianKRS = new AntrianKRS();

        int pilihan;
        do {
            System.out.println("\nMenu Antrian KRS:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Sudah Proses KRS");
            System.out.println("8. Cetak Jumlah Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan NIM      : ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama     : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Prodi    : ");
                    String prodi = scanner.nextLine();
                    System.out.print("Masukkan Kelas    : ");
                    String kelas = scanner.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrianKRS.enqueue(mhs);
                    System.out.println("Mahasiswa ditambahkan ke antrian.");
                    break;
                case 2:
                    antrianKRS.dequeueDuaMahasiswa();
                    break;
                case 3:
                    antrianKRS.tampilkanSemuaAntrian();
                    break;
                case 4:
                    antrianKRS.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrianKRS.tampilkanAntrianTerakhir();
                    break;
                case 6:
                    antrianKRS.cetakJumlahAntrian();
                    break;
                case 7:
                    antrianKRS.cetakJumlahProsesKRS();
                    break;
                case 8:
                    antrianKRS.cetakJumlahBelumProsesKRS();
                    break;
                case 9:
                    antrianKRS.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
