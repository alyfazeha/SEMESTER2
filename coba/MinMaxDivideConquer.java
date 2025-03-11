package coba;
import java.util.Scanner;
public class MinMaxDivideConquer {


public class FibonacciDivideConquer {

    // Fungsi untuk menghitung Fibonacci dengan metode Rekursif
    public static int fibonacciRecursive(int n) {
        if (n == 0) return 0; // Basis: Fibonacci(0) = 0
        if (n == 1) return 1; // Basis: Fibonacci(1) = 1
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan jumlah bilangan Fibonacci yang ingin dihitung: ");
        int n = scanner.nextInt();  // Membaca angka yang dimasukkan oleh pengguna

        // Menampilkan hasil
        System.out.println("Fibonacci ke-" + n + " (Recursive): " + fibonacciRecursive(n));

        scanner.close();
    }
}
}