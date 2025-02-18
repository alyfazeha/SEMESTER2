package JOBSHEET1;
import java.util.Scanner;
public class JadwalKuliah {
    static Scanner sc = new Scanner(System.in);
    static String[] namaMK; 
    static int[] SKS; 
    static int[] semester; 
    static String[] hariKuliah;
    static String[] headlineTabel = {"Mata Kuliah", "SKS", "Semester", "Hari Perkuliahan"};
    
    public static void Menu(int n) {
        System.out.println("===============================================");
        System.out.println("=================== ACTION ====================");
        System.out.println("===============================================");
        System.out.println("1. Tampilkan seluruh jadwal");
        System.out.println("2. Tampilkan jadwal kuliah hari tertentu");
        System.out.println("3. Tampilkan jadwal kuliah semester tertentu");
        System.out.println("4. Mencari mata kuliah");
        System.out.println("5. Exit");

        System.out.print("Whats the action ? ");
        int confirm = sc.nextInt();
        sc.nextLine(); 

        switch (confirm) {
            case 1:
                seluruhJadwal(n);
                break;
            
            case 2:
                jadwalHari(n);
                break;
            
            case 3:
                jadwalsemester(n);
                break;

            case 4:
                jadwalmatkul(n);
                break;

            case 5:
                break;
            default:
                System.out.println("Pilihan tidak valid. Coba lagi.");
                break;
        }
    }

    public static void jadwalmatkul(int n) {
        System.out.println("===============================================");
        System.out.println("========= JADWAL BERDASARKAN MATKUL ===========");
        System.out.println("===============================================");
        System.out.print("Mata kuliah apa ? ");
        String cariMK = sc.nextLine();

        System.out.printf("%-40s %-15s %-15s %-15s%n", headlineTabel[0], headlineTabel[1], headlineTabel[2], headlineTabel[3]);
        for (int a = 0; a < n; a++) {
            if (cariMK.equalsIgnoreCase(namaMK[a])) { 
                System.out.printf("%-40s %-15s %-15s %-15s%n", namaMK[a], SKS[a], semester[a], hariKuliah[a]);
            }
        }
        Menu(n);
    }

    public static void jadwalsemester(int n) {
        System.out.println("===============================================");
        System.out.println("========= JADWAL BERDASARKAN SEMESTER =========");
        System.out.println("===============================================");
        System.out.print("Semester berapa ? ");
        int cariSemester = sc.nextInt();
        sc.nextLine(); 

        System.out.printf("%-40s %-15s %-15s %-15s%n", headlineTabel[0], headlineTabel[1], headlineTabel[2], headlineTabel[3]);
        for (int a = 0; a < n; a++) {
            if (cariSemester == semester[a]) {
                System.out.printf("%-40s %-15s %-15s %-15s%n", namaMK[a], SKS[a], semester[a], hariKuliah[a]);
            }
        }
        Menu(n);
    }

    public static void jadwalHari(int n) {
        System.out.println("===============================================");
        System.out.println("=========== JADWAL BERDASARKAN HARI ===========");
        System.out.println("===============================================");
        System.out.print("Hari apa ? ");
        String hari = sc.nextLine();

        System.out.printf("%-40s %-15s %-15s %-15s%n", headlineTabel[0], headlineTabel[1], headlineTabel[2], headlineTabel[3]);
        for (int a = 0; a < n; a++) {
            if (hari.equalsIgnoreCase(hariKuliah[a])) {
                System.out.printf("%-40s %-15s %-15s %-15s%n", namaMK[a], SKS[a], semester[a], hariKuliah[a]);
            }
        }
        Menu(n);
    }

    public static void seluruhJadwal(int n) {
        System.out.println("===============================================");
        System.out.println("=============== SELURUH JADWAL ================");
        System.out.println("===============================================");
        System.out.printf("%-40s %-15s %-15s %-15s%n", headlineTabel[0], headlineTabel[1], headlineTabel[2], headlineTabel[3]);
        for (int a = 0; a < n; a++) {
            System.out.printf("%-40s %-15s %-15s %-15s%n", namaMK[a], SKS[a], semester[a], hariKuliah[a]);
        }
        Menu(n);
    }

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("============== DATA MATA KULIAH ===============");
        System.out.println("===============================================");
        System.out.print("Jumlah data mata kuliah yang ingin diinputkan : ");
        int n = sc.nextInt();
        sc.nextLine(); 

        namaMK = new String[n];
        SKS = new int[n];
        semester = new int[n];
        hariKuliah = new String[n];

        for (int a = 0; a < n; a++) {
            System.out.print("Nama mata kuliah : ");
            namaMK[a] = sc.nextLine();
            System.out.print("SKS mata kuliah : ");
            SKS[a] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Semester : ");
            semester[a] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Hari mata kuliah : ");
            hariKuliah[a] = sc.nextLine();
            System.out.println();
        }

        Menu(n);
    }
}
