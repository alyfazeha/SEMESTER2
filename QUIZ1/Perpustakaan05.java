package QUIZ1;
import java.util.Scanner;
public class Perpustakaan05 {
    Perpustakaan05() {

    }

    int tambahBuku(Buku05[] arrayOfBuku, int count, Scanner sc) {
        System.out.println("===================================");
        System.out.println("=========== TAMBAH BUKU ===========");
        System.out.println("==================================="); 
        arrayOfBuku[count] = new Buku05(); 
        System.out.print("Masukkan Kode Buku : ");
        arrayOfBuku[count].kodeBuku = sc.nextLine();
        System.out.print("Masukkan Judul Buku : ");
        arrayOfBuku[count].judulBuku = sc.nextLine();
        System.out.print("Masukkan Penulis Buku : ");
        arrayOfBuku[count].penulis = sc.nextLine();
        arrayOfBuku[count].statusPeminjaman = true;
        count++;
        System.out.println("Buku Berhasil Ditambahkan !!");
        System.out.println();
        return count; 
    }

    int tambahMahasiswa(Mahasiswa05[] arrayOfMahasiswa, int countMHS, Scanner sc) {
        System.out.println("===================================");
        System.out.println("======== TAMBAH MAHASISWA =========");
        System.out.println("==================================="); 
        arrayOfMahasiswa[countMHS] = new Mahasiswa05();
        System.out.print("Masukkan NIM Mahasiswa : ");
        arrayOfMahasiswa[countMHS].nim = sc.nextLine();
        
        System.out.print("Masukkan Nama Mahasiswa : ");
        arrayOfMahasiswa[countMHS].nama = sc.nextLine();
        
        System.out.println("Mahasiswa Berhasil Ditambahkan !!"); 
        System.out.println();
        countMHS++;
        return countMHS;
    }
   
    int pinjamBuku(Buku05[] arrayOfBuku, Mahasiswa05[] arrayOfMahasiswa, Scanner sc, String[][] arrayOfList, int countList) {
        System.out.println("===================================");
        System.out.println("=========== PINJAM BUKU ===========");
        System.out.println("==================================="); 
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nimInput = sc.nextLine();
        System.out.print("Masukkan Kode Buku : ");
        String kodeInput = sc.nextLine();

        Mahasiswa05 mahasiswa = null;
        for (int b = 0; b < arrayOfMahasiswa.length; b++) { 
            if (arrayOfMahasiswa[b] != null && arrayOfMahasiswa[b].nim.equals(nimInput)) {
                mahasiswa = arrayOfMahasiswa[b];
                break;
            }
        }

        if (mahasiswa == null) {
            System.out.println("Mahasiswa dengan NIM " + nimInput + " tidak terdaftar.");
            return countList;
        }

        for (int a = 0; a < arrayOfBuku.length; a++) {
            if (arrayOfBuku[a] != null && arrayOfBuku[a].kodeBuku.equals(kodeInput)) {
                if (arrayOfBuku[a].statusPeminjaman == true) {
                    if (mahasiswa.bukuYangDipinjam[0] == null) {
                        mahasiswa.bukuYangDipinjam[0] = arrayOfBuku[a].judulBuku;
                        arrayOfBuku[a].statusPeminjaman = false;
                        arrayOfList[0][countList] = mahasiswa.nama;
                        arrayOfList[1][countList] = arrayOfBuku[a].judulBuku;
                        countList++; 
    
                        System.out.println(mahasiswa.nama + " Berhasil Meminjam " + arrayOfBuku[a].judulBuku);
                    } else if (mahasiswa.bukuYangDipinjam[1] == null) {
                        mahasiswa.bukuYangDipinjam[1] = arrayOfBuku[a].judulBuku;
                        arrayOfBuku[a].statusPeminjaman = false;
                        arrayOfList[0][countList] = mahasiswa.nama;
                        arrayOfList[1][countList] = arrayOfBuku[a].judulBuku;
                        countList++; 
    
                        System.out.println(mahasiswa.nama + " Berhasil Meminjam " + arrayOfBuku[a].judulBuku);
                    } else {
                        System.out.println(mahasiswa.nama + " Sudah meminjam 2 buku, tidak dapat meminjam buku lagi.");
                    }
                } else {
                    System.out.println("Gagal meminjam buku " + arrayOfBuku[a].judulBuku + " karena sudah dipinjam orang lain.");
                }
                return countList; 
            }
        }
        System.out.println("Buku dengan kode " + kodeInput + " tidak ditemukan.");
        System.out.println();
        return countList;
    }

    void kembalikanBuku(Buku05[] arrayOfBuku, Mahasiswa05[] arrayOfMahasiswa, Scanner sc, String[][] arrayOfList, int countList) {
        System.out.println("===================================");
        System.out.println("========= KEMBALIKAN BUKU =========");
        System.out.println("==================================="); 
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nimInput = sc.nextLine();
        System.out.print("Masukkan Kode Buku : ");
        String kodeInput = sc.nextLine();

        Mahasiswa05 mahasiswa = null;
        for (int b = 0; b < arrayOfMahasiswa.length; b++) { 
            if (arrayOfMahasiswa[b] != null && arrayOfMahasiswa[b].nim.equals(nimInput)) {
                mahasiswa = arrayOfMahasiswa[b];
                break;
            }
        }

        if (mahasiswa == null) {
            System.out.println("Mahasiswa dengan NIM " + nimInput + " tidak terdaftar.");
            return;
        }

        for (int a = 0; a < arrayOfBuku.length; a++) {
            if (arrayOfBuku[a] != null && arrayOfBuku[a].kodeBuku.equals(kodeInput)) {
                boolean bukuDikembalikan = false;
                for (int i = 0; i < mahasiswa.bukuYangDipinjam.length; i++) {
                    if (mahasiswa.bukuYangDipinjam[i] != null && mahasiswa.bukuYangDipinjam[i].equals(arrayOfBuku[a].judulBuku)) {
                        mahasiswa.bukuYangDipinjam[i] = null;
                        arrayOfBuku[a].statusPeminjaman = true;
                        bukuDikembalikan = true;
    
                        for (int j = 0; j < countList; j++) {
                            if (arrayOfList[0][j].equals(mahasiswa.nama) && arrayOfList[1][j].equals(arrayOfBuku[a].judulBuku)) {
                                for (int k = j; k < countList - 1; k++) {
                                    arrayOfList[0][k] = arrayOfList[0][k + 1];
                                    arrayOfList[1][k] = arrayOfList[1][k + 1];
                                }
                                countList--; 
                                break;
                            }
                        }
    
                        System.out.println(mahasiswa.nama + " Berhasil Mengembalikan Buku " + arrayOfBuku[a].judulBuku);
                        break;
                    }
                }

                if (!bukuDikembalikan) {
                    System.out.println(mahasiswa.nama + " tidak meminjam buku " + arrayOfBuku[a].judulBuku);
                }
                return; 
            }
        }
    
        System.out.println("Buku dengan kode " + kodeInput + " tidak ditemukan.");
        System.out.println();
    }
    

    int tampilPeminjaman(Mahasiswa05[] arrayOfMahasiswa, int count) {
        System.out.println("===================================");
        System.out.println("========= LIST PEMINJAMAN =========");
        System.out.println("==================================="); 

        for (int a = 0; a < count; a++) {
            System.out.println(arrayOfMahasiswa[a].nama + " Meminjam Buku : " + arrayOfMahasiswa[a].bukuYangDipinjam[0]);
        }
    System.out.println();
    return count; 
    }
}
