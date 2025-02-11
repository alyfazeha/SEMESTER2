package JOBSHEET1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, totalNilai;
        double nilaiAkhir;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUAS = sc.nextInt();

        System.out.println("==============================");
        if (nilaiTugas <= 100 && nilaiKuis <= 100 && nilaiUTS <= 100 && nilaiUAS <= 100) {
            nilaiTugas = 0.2 * nilaiTugas;
            nilaiKuis = 0.2 * nilaiKuis;
            nilaiUTS = 0.3 * nilaiUTS;
            nilaiUAS = 0.4 * nilaiUAS;

            nilaiAkhir = (nilaiTugas + nilaiKuis + nilaiUTS + nilaiUAS);
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                System.out.println("Nilai Huruf : A");
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                System.out.println("Nilai Huruf : B+");
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                System.out.println("Nilai Huruf : B");
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                System.out.println("Nilai Huruf : C+");
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                System.out.println("Nilai Huruf : C");
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                System.out.println("Nilai Huruf : D");
            } else if (nilaiAkhir <= 39) {
                System.out.println("Nilai Huruf : E");
            }
            
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA LULUS!");
        } else {
            System.out.println("==============================");
            System.out.println("nilai tidak valid");
            System.out.println("==============================");
        }
        System.out.println("==============================");
    }
}