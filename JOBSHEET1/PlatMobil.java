package JOBSHEET1;
import java.util.Scanner;
public class PlatMobil {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char[] kode = {'A','B','D','E','F','G','H','L','N','T'};
    char[][] kota = {
        {'B','A','N','T','E','N'},
        {'J','A','K','A','R','T','A'},
        {'B','A','N','D','U','N','G'},
        {'C','I','R','E','B','O','N'},
        {'B','O','G','O','R'},
        {'P','E','K','A','L','O','N','G','A','N'},
        {'S','E','M','A','R','A','N','G'},
        {'S','U','R','A','B','A','Y','A'},
        {'M','A','L','A','N','G'},
        {'T','E','G','A','L'},
    };

    char inputanUser;
    int indexCari = 0;

    System.out.print("Inputkan Kode Plat Nomor : ");
    inputanUser = sc.next().charAt(0);

    for (int a = 0; a < kode.length; a++){
        if (Character.toUpperCase(inputanUser) == kode[a]) {
            indexCari = a;
            break;
        }
    }
    for (int a = 0; a < kota[indexCari].length; a++){
        System.out.print(kota[indexCari][a]);
    }

    }
}
