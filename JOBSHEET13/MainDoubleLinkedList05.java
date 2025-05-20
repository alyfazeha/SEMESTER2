package JOBSHEET13;

import java.util.Scanner;

public class MainDoubleLinkedList05 {
    public static void main(String[] args) {
        DoubleLinkedList05 list = new DoubleLinkedList05();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah pada indeks tertentu");
            System.out.println("4. Tambah setelah NIM tertentu");
            System.out.println("5. Hapus dari awal");
            System.out.println("6. Hapus dari akhir");
            System.out.println("7. Hapus pada indeks tertentu");
            System.out.println("8. Hapus setelah NIM tertentu");
            System.out.println("9. Tampilkan data");
            System.out.println("10. Cari Mahasiswa berdasarkan NIM");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks tertentu");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa05 mhs1 = inputMahasiswa(scan);
                    list.addFirst(mhs1);
                    break;

                case 2:
                    Mahasiswa05 mhs2 = inputMahasiswa(scan);
                    list.addLast(mhs2);
                    break;
                    
                case 3:
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa05 mhs3 = inputMahasiswa(scan);
                    list.add(index, mhs3);
                    break;

                case 4:
                    if (list.isEmpty()) {
                        System.out.println("Linked List masih kosong, tidak bisa melakukan insertAfter!");
                    } else {
                        System.out.print("Masukkan NIM setelah data yang akan disisipkan: ");
                        String keyNim = scan.nextLine();
                        Mahasiswa05 mhs4 = inputMahasiswa(scan);
                        list.insertAfter(keyNim, mhs4);
                    }
                    break;

                case 5:
                    list.removeFirst();
                    break;
                
                case 6:
                    list.removeLast();
                    break;
                    
                case 7:
                    System.out.print("Masukkan indeks yang akan dihapus: ");
                    int idxRemove = scan.nextInt();
                    scan.nextLine();
                    list.remove(idxRemove);
                    break;
                    
                case 8:
                    if (list.isEmpty()) {
                        System.out.println("Linked List masih kosong!");
                    } else {
                        System.out.print("Masukkan NIM yang nodeDIBELAKANGNYA akan dihapus: ");
                        String nimAfter = scan.nextLine();
                        list.removeAfter(nimAfter);
                    }
                    break;

                case 9:
                    list.print();
                    break;

                case 10:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String nim = scan.nextLine();
                    Node05 found = list.search(nim);

                    if (found != null) {
                        System.out.print("Data ditemukan : ");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;
                    
                case 11:
                    Mahasiswa05 first = list.getFirst();
                    if (first != null) {
                        System.out.println("Data Mahasiswa Pertama:");
                        first.tampil();
                    }
                    break;
                    
                case 12:
                    Mahasiswa05 last = list.getLast();
                    if (last != null) {
                        System.out.println("Data Mahasiswa Terakhir:");
                        last.tampil();
                    }
                    break;
                    
                case 13:
                    System.out.print("Masukkan indeks yang ingin ditampilkan: ");
                    int indexTampil = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa05 dataAt = list.getIndex(indexTampil);
                    if (dataAt != null) {
                        System.out.println("Data Mahasiswa pada indeks " + indexTampil + ":");
                        dataAt.tampil();
                    }
                    break;
                    
                case 14:
                    System.out.println("Jumlah data dalam Linked List: " + list.size());
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);
        scan.close();
    }
    
    public static Mahasiswa05 inputMahasiswa(Scanner scan) {
        System.out.print("NIM: ");
        String nim = scan.nextLine();
        System.out.print("Nama: ");
        String nama = scan.nextLine();
        System.out.print("Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        
        return new Mahasiswa05(nim, nama, kelas, ipk);
    }
}