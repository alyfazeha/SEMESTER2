package JOBSHEET3;
import java.util.Scanner;
public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa05[] arrayOfMahasiswa = new Mahasiswa05[3];
        String dummy = "";
        int n = 3;

        for (int i = 0; i < n; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa05();

            System.out.println("Masukkan Data Mahasiswa Ke-" + (i+1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy= sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------------");
        }

        System.out.println("ini hasilnya");
        Mahasiswa05 mahasiswa = new Mahasiswa05();
        mahasiswa.cetakInfo(arrayOfMahasiswa);
        // Mahasiswa05[] arrayOfMahasiwa
        // arrayOfMahasiwa[0] = new Mahasiswa05();
        // arrayOfMahasiwa[0].nim = "244107060033";
        // arrayOfMahasiwa[0].nama = "AGNES TITANIA KINANTI";
        // arrayOfMahasiwa[0].kelas = "SIB-1E";
        // arrayOfMahasiwa[0].ipk = (float) 3.75;

        // arrayOfMahasiwa[1] = new Mahasiswa05();
        // arrayOfMahasiwa[1].nim = "2341720172";
        // arrayOfMahasiwa[1].nama = "ACHMAD MAULANA HAMZAH";
        // arrayOfMahasiwa[1].kelas = "TI-2A";
        // arrayOfMahasiwa[1].ipk = (float) 3.36;

        // arrayOfMahasiwa[2] = new Mahasiswa05();
        // arrayOfMahasiwa[2].nim = "244107023006";
        // arrayOfMahasiwa[2].nama = "DIRHAMAWAN PUTRANTO";
        // arrayOfMahasiwa[2].kelas = "TI-2E";
        // arrayOfMahasiwa[2].ipk = (float) 3.80;

        // System.out.println("NIM     : " + arrayOfMahasiwa[0].nim);
        // System.out.println("Nama    : " + arrayOfMahasiwa[0].nama);
        // System.out.println("Kelas   : " + arrayOfMahasiwa[0].kelas);
        // System.out.println("IPK     : " + arrayOfMahasiwa[0].ipk);
        // System.out.println("--------------------------------------");

        // System.out.println("NIM     : " + arrayOfMahasiwa[1].nim);
        // System.out.println("Nama    : " + arrayOfMahasiwa[1].nama);
        // System.out.println("Kelas   : " + arrayOfMahasiwa[1].kelas);
        // System.out.println("IPK     : " + arrayOfMahasiwa[1].ipk);
        // System.out.println("--------------------------------------");

        // System.out.println("NIM     : " + arrayOfMahasiwa[2].nim);
        // System.out.println("Nama    : " + arrayOfMahasiwa[2].nama);
        // System.out.println("Kelas   : " + arrayOfMahasiwa[2].kelas);
        // System.out.println("IPK     : " + arrayOfMahasiwa[2].ipk);
        // System.out.println("--------------------------------------");
    }
}
