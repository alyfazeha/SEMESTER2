package JOBSHEET5;
public class Kampus05 {
    public static int nilaiTertinggiDC(String[][] data, int l, int r) {
        if (l == r) {
            return Integer.parseInt(data[l][3]); 
        }
        int mid = (l + r) / 2;
        int leftMax = nilaiTertinggiDC(data, l, mid); 
        int rightMax = nilaiTertinggiDC(data, mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    public static int nilaiTertinggiDC(String[][] data) {
        return nilaiTertinggiDC(data, 0, data.length - 1);
    }

    public static int nilaiTerendahDC(String[][] data, int l, int r) {
        if (l == r) {
            return Integer.parseInt(data[l][3]); 
        }
        int mid = (l + r) / 2;
        int leftMin = nilaiTerendahDC(data, l, mid); 
        int rightMin = nilaiTerendahDC(data, mid + 1, r); 
        return Math.min(leftMin, rightMin);
    }

    public static int nilaiTerendahDC(String[][] data) {
        return nilaiTerendahDC(data, 0, data.length - 1);
    }

    public static double rataRataUASBF(String[][] data) {
        double totalUAS = 0;
        for (int i = 0; i < data.length; i++) {
            totalUAS += Integer.parseInt(data[i][4]); 
        }
        return totalUAS / data.length; 
    }
}
