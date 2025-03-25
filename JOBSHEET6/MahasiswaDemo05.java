package JOBSHEET6;
import java.util.Scanner;
public class MahasiswaDemo05 {
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        MahasiwaBerprestasi05 list = new MahasiwaBerprestasi05();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
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
        
        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("---------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("---------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        double cari = input.nextDouble();

        System.out.println("Menggunakan Sequential Searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
