package JOBSHEET3;
import java.util.Scanner;
public class MataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dummy = "";

        System.out.print("Masukkan jumlah MataKuliah yang ingin diinput: ");
        int n = Integer.parseInt(sc.nextLine());
        
        MataKuliah05[] arrayOfMataKuliah = new MataKuliah05[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data MataKuliah Ke-" + (i + 1));

            arrayOfMataKuliah[i] = new MataKuliah05();
            arrayOfMataKuliah[i].tambahData(sc);
        }

        System.out.println("\nMenampilkan Data MataKuliah: ");
      
        for (int i = 0; i < n; i++) {
            System.out.println("Data MataKuliah Ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo(); 
        }

    }
}
