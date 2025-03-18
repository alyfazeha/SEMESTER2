package JOBSHEET6;
import java.util.Scanner;
public class MahasiswaDemo05 {
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        MahasiwaBerprestasi05 list = new MahasiwaBerprestasi05();
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan jumlah data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan NIM : ");
            String nim = input.next();
            System.out.print("Masukkan Nama : ");
            String nama = input.next();
            System.out.print("Masukkan Kelas : ");
            String kelas = input.next();
            System.out.print("Masukkan IPK : ");
            double ipk = input.nextDouble();
            Mahasiswa05 m = new Mahasiswa05(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC) : ");
        list.insertionSort();
        list.tampil();
    }
}
