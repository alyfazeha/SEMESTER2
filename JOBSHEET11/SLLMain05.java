package JOBSHEET11;
import java.util.Scanner;
public class SLLMain05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList05 sll = new SingleLinkedList05();
        Mahasiswa05 mhs1 = new Mahasiswa05("21212200", "Alvaro", "1A", 4.0);
        Mahasiswa05 mhs2 = new Mahasiswa05("2321201", "Bimon", "2B", 3.8); // Fixed NIM and IPK
        Mahasiswa05 mhs3 = new Mahasiswa05("2221202", "Cintia", "3C", 3.5); // Fixed NIM
        Mahasiswa05 mhs4 = new Mahasiswa05("21212203", "Dirga", "4D", 3.6);
        
        sll.print();
        
        sll.addFirst(mhs4);
        sll.print();
        
        sll.addLast(mhs1);
        sll.print();
        
        sll.insertAfter("Dirga", mhs3);
        
        sll.insertAt(2, mhs2);
        sll.print();
        
        System.out.println("data index 1 : ");
        sll.getData(1);
        
        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();
        
        sll.removeFirst();
        
        sll.removeLast();
        sll.print();
        
        sll.removeAt(0);
        sll.print();
        
        sc.close();
    }
}