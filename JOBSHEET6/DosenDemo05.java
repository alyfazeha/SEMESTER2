package JOBSHEET6;
import java.util.Scanner;
public class DosenDemo05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
            DataDosen05 dosen = new DataDosen05();
            for (int i = 0; i < 10; i++) {
                System.out.println("Masukkan jumlah data dosen ke-" + (i+1));
                System.out.print("Masukkan Kode          : ");
                String kode = input.next();
                System.out.print("Masukkan Nama          : ");
                String nama = input.next();
                System.out.print("Masukkan Jenis Kelamin : ");
                String jenisKelamin = input.next();
                input.nextLine();
                boolean jk = false;
                if (jenisKelamin.equalsIgnoreCase("wanita")) {
                    jk = true;
                }
                System.out.print("Masukkan Usia          : ");
                int usia = input.nextInt();
                input.nextLine();
                Dosen05 dsn = new Dosen05(kode, nama, jk, usia);
                dosen.tambah(dsn);
                System.out.println();
            }
    
            System.out.println("Data dosen sebelum sorting : ");
            dosen.tampil();

            System.out.println("Data dosen setelah sorting menggunakan BUBBLE SORT (ASC) : ");
            dosen.SortingASC();
            dosen.tampil();
    
            System.out.println("Data dosen setelah sorting menggunakan SELECTION SORT (DSC) : ");
            dosen.SortingDSC();
            dosen.tampil();

            System.out.println("Data dosen setelah sorting menggunakan INSERTION SORT (DSC) : ");
            dosen.insertion();
            dosen.tampil();
    }
}
