package JOBSHEET5;
public class Sum {
    double keuntungan[];

    Sum (int el) {
        keuntungan = new double[el];
    }

    double totalBF() {
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r)/ 2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, (mid + 1), r);
        return lsum + rsum;
    }
}
