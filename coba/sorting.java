package coba;
public class sorting {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("===== BUBBLE SORT =====");
        System.out.println("=======================");
        int[] data = {3, 10, 4, 2, 8, 5, 7, 6, 1, 9};
        System.out.println("Data sebelum diurutkan:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        // Bubble sort
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println("Data setelah diurutkan:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("=======================");
        System.out.println("=== SELECTION SORT ====");
        System.out.println("=======================");
        //selection sort
        int[] data2 = {3, 10, 4, 2, 8, 5, 7, 6, 1, 9};
        System.out.println("Data sebelum diurutkan:");
        for (int i = 0; i < data2.length; i++) {
            System.out.print(data2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < data2.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data2.length; j++) {
                if (data2[j] < data2[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data2[i];
            data2[i] = data2[minIndex];
            data2[minIndex] = temp;
        }
        System.out.println("Data setelah diurutkan:");
        for (int i = 0; i < data2.length; i++) {
            System.out.print(data2[i] + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("=======================");
        System.out.println("=== INSERTION SORT ====");
        System.out.println("=======================");

        //insertion sort
        int[] data3 = {3, 10, 4, 2, 8, 5, 7, 6, 1, 9};
        System.out.println("Data sebelum diurutkan:");
        for (int i = 0; i < data3.length; i++) {
            System.out.print(data3[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < data3.length; i++) {
            int key = data3[i];
            int j = i - 1;
            while (j >= 0 && data3[j] > key) {
                data3[j + 1] = data3[j];
                j--;
            }
            data3[j + 1] = key;
        }
        System.out.println("Data setelah diurutkan:");
        for (int i = 0; i < data3.length; i++) {
            System.out.print(data3[i] + " ");
        }
        System.out.println();
    }
}
