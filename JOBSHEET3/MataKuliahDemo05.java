package JOBSHEET3;
import java.util.Scanner;
public class MataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        MataKuliah05[] arrayOfMataKuliah = new MataKuliah05[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i ++) {
            System.out.println("Masukkan Data MataKuliah Ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah05(kode, nama, sks, jumlahJam) ;  
        }

        for (int i = 0; i < 3; i++){
            System.out.println("Data MataKuliah Ke-" + (i+1));
            System.out.println("Kode       : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMataKuliah[i].nama);
            System.out.println("SKS        : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("-----------------------------------------");
        }
    }
}
