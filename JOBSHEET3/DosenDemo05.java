package JOBSHEET3;
import java.util.Scanner;
public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Dosen Yang Ingin Diinput : ");
        int n = sc.nextInt();
        sc.nextLine();
        Dosen05[] arrayOfDosen = new Dosen05[n];
        String dummy = "";
        for (int a = 0; a < n; a ++){
            arrayOfDosen[a] = new Dosen05();
            System.out.println("Masukkan Data Dosen Ke-" + (a+1));
            System.out.print("Kode            : ");
            arrayOfDosen[a].kode = sc.nextLine();
            System.out.print("Nama            : ");
            arrayOfDosen[a].nama = sc.nextLine();
            System.out.print("Jenis Kelamin   : ");
            dummy= sc.nextLine();
            if (dummy.equalsIgnoreCase("wanita")) {
                arrayOfDosen[a].jenisKelamin = true;
            } else {
                arrayOfDosen[a].jenisKelamin = false;
            }
            System.out.print("Usia            : ");
            dummy= sc.nextLine();
            arrayOfDosen[a].usia = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");
        }
        System.out.println();
        for (int a = 0; a < n; a++){
            System.out.println("Data Dosen Ke-" + (a+1));
            System.out.println("Kode             : " + arrayOfDosen[a].kode);
            System.out.println("Nama             : " + arrayOfDosen[a].nama);
            if (arrayOfDosen[a].jenisKelamin == true) {
                System.out.println("Jenis Kelamin    : Wanita");
            } else {
                System.out.println("Jenis Kelamin    : Pria");
            }
            System.out.println("Usia             : " + arrayOfDosen[a].usia);
            System.out.println("-----------------------------------");
        }

        DataDosen05 dsn = new DataDosen05();
        dsn.dataSemuaDosen(arrayOfDosen, n);
        dsn.jumlahDosenPerJenisKelamin(arrayOfDosen, n);
        dsn.rerataUsiaDosenPerJenisKelamin(arrayOfDosen, n);
        dsn.infoDosenPalingMuda(arrayOfDosen, n);
        dsn.infoDosenPalingTua(arrayOfDosen, n);
    }
}
