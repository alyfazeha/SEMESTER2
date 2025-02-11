package JOBSHEET1;

import java.util.Scanner;

public class Kubus {
    static Scanner sc = new Scanner(System.in);
    static int pilihanMenu;
    static int sisi;
    static char check;

    public static void Menu(){
        System.out.println("1. Volume Kubus");
        System.out.println("2. Permukaan Kubus");
        System.out.println("3. Keliling Kubus");

        System.out.print("Apa yang ingin kamu hitung ?? ");
        pilihanMenu = sc.nextInt();

        switch (pilihanMenu) {
            case 1:
                HitungVolume();
                break;

            case 2:
                HitungPermukaan();
                break;
            
            case 3:
                HitungKeliling();
                break;
        
            default:
                break;
        }
    }

    public static void HitungVolume(){
        System.out.println("========================================================");
        System.out.println("VOLUME KUBUS");
        System.out.println("========================================================");

        System.out.print("Panjang sisi : ");
        sisi = sc.nextInt();

        int volume = sisi * sisi * sisi;
        System.out.println("Volume kubus dengan sisi " + sisi + " : " + volume + "\n");
        
        Check();
    }

    public static void HitungPermukaan(){
        System.out.println("========================================================");
        System.out.println("LUAS PERMUKAAN KUBUS");
        System.out.println("========================================================");

        System.out.print("Panjang sisi : ");
        sisi = sc.nextInt();

        int luasPermukaan = 6 * (sisi * sisi);
        System.out.println("Luas Permukaan kubus dengan sisi " + sisi + " : " + luasPermukaan + "\n");
        
        Check();
    }

    public static void HitungKeliling(){
        System.out.println("========================================================");
        System.out.println("KELILING KUBUS");
        System.out.println("========================================================");

        System.out.print("Panjang sisi : ");
        sisi = sc.nextInt();

        int keliling = 4 * sisi;
        System.out.println("Keliling kubus dengan sisi " + sisi + " : " + keliling + "\n");
        
        Check();
    }
    
    public static void Check(){
        
            System.out.print("Mau menghitung lagi (y/n) ? ");
            check = sc.next().charAt(0);
            sc.nextLine();

            switch (check) {
                case 'Y':
                    Menu();
                    break;
            
                case 'y':
                    Menu();
                    break;
                case 'n':
                    System.out.println("Terima kasih, program selesai.");
                    break;
                case 'N':
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    break;   
        }

    }

    public static void main(String[] args) {
        System.out.println("========================================================");
        System.out.println("PROGRAM MENGHITUNG VOLUME, PERMUKAAN, DAN KELILING KUBUS");
        System.out.println("========================================================");

        Menu();
    }
}
