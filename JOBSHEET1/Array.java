package JOBSHEET1;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double ip = 0;
        double sum = 0;
        double bobot = 0;

        String[][] konvNilai = new String[9][4];
        konvNilai[0][0] = "MK";
        konvNilai[0][1] = "Nilai Angka";
        konvNilai[0][2] = "Nilai Huruf";
        konvNilai[0][3] = "Bobot Nilai";
        String[] matkul = new String[] {"Pancasila", 
                                        "Konsep Teknologi Informasi", 
                                        "Critical Thinking dan Problem Solving",
                                        "Matematika Dasar",
                                        "Bahasa Inggris",
                                        "Dasar Pemrograman",
                                        "Praktikan Dasar Pemrograman",
                                        "Keselamatan dan Kesehatan Kerja"};
        double[] nilai = new double[8];

        for (int a = 1; a <= matkul.length; a++){
            konvNilai[a][0] = matkul[a-1];
        }

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int a = 1; a <= matkul.length; a++){
            System.out.print("Masukkan Nilai Angka Untuk MK " + matkul[a-1] + " : ");
            nilai[a-1] = sc.nextDouble();  
            konvNilai[a][1] = String.valueOf(nilai[a-1]); 
        }

        for (int a = 1; a <= matkul.length; a++){
            if (nilai[a-1] > 80 && nilai[a-1] <= 100) {
                konvNilai[a][2] = "A";
                konvNilai[a][3] = "4.00";
            } else if (nilai[a-1] > 73 && nilai[a-1] <= 80) {
                konvNilai[a][2] = "B+";
                konvNilai[a][3] = "3.50";
            } else if (nilai[a-1] > 65 && nilai[a-1] <= 73) {
                konvNilai[a][2] = "B";
                konvNilai[a][3] = "3.00";
            } else if (nilai[a-1] > 60 && nilai[a-1] <= 65) {
                konvNilai[a][2] = "C+";
                konvNilai[a][3] = "2.50";
            } else if (nilai[a-1] > 50 && nilai[a-1] <= 60) {
                konvNilai[a][2] = "C";
                konvNilai[a][3] = "2.00";
            } else if (nilai[a-1] > 39 && nilai[a-1] <= 50) {
                konvNilai[a][2] = "D";
                konvNilai[a][3] = "1.00";
            } else if (nilai[a-1] <= 39) {
                konvNilai[a][2] = "E";
                konvNilai[a][3] = "0.00";
            }
        }

        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        
        System.out.printf("%-40s %-15s %-15s %-15s%n", konvNilai[0][0], 
                            konvNilai[0][1], konvNilai[0][2], konvNilai[0][3]);
        for (int a = 1; a <= matkul.length; a++){
            System.out.printf("%-40s %-15s %-15s %-15s%n", konvNilai[a][0], 
                            konvNilai[a][1], konvNilai[a][2], konvNilai[a][3]);
        }

        System.out.println("==============================");
        for (int a = 1; a <= matkul.length; a++){
            bobot = Double.parseDouble(konvNilai[a][3]);
            sum += bobot;;
        }
        ip = sum / 8;
        System.out.println("IP : " + ip);
        System.out.println("==============================");
    }
}

