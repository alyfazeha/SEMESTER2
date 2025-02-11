package JOBSHEET1;
public class Fungsi {
    static int[][] RoyalGarden = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    static int[] totalHargaTiapBunga = new int[4];
    static int[] pendapatan = new int[4];
    static String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    public static void PendapatanTiapCabang(){

        System.out.println("=========================================================");
        System.out.println("PENDAPATAN TOKO BUNGA ROYALGARDEN");
        System.out.println("=========================================================");
        for (int a = 0; a < RoyalGarden.length; a++){
            for (int b = 0; b < RoyalGarden[a].length; b++){
                if (b == 0){
                    totalHargaTiapBunga[a] = RoyalGarden[a][b] * 75000;
                } else if (b == 1){
                    totalHargaTiapBunga[a] = RoyalGarden[a][b] * 50000;
                } else if (b == 2){
                    totalHargaTiapBunga[a] = RoyalGarden[a][b] * 60000;
                } else if (b == 3){
                    totalHargaTiapBunga[a] = RoyalGarden[a][b] * 10000;
                }
                pendapatan[a] += totalHargaTiapBunga[a];
            }
        }
        for (int a = 0; a < pendapatan.length; a++){
            System.out.println("Pendapatan Toko Bunga RoyalGarden" + (a+1) + " adalah Rp. " + pendapatan[a]);
        }
    }

    public static void StockRoyalGarden4(){
        System.out.println("=========================================================");
        System.out.println("Stok Bunga Pada Toko RoyalGarden4");
        System.out.println("=========================================================");
        for (int a = 0; a < 4; a++){
            System.out.println("Stok " + jenisBunga[a] + " : " + RoyalGarden[3][a]);
        }
        System.out.println("=========================================================");
        System.out.println("Dikarenakan Ada Bunga Yang Mati Maka Stok Menjadi : ");
        for (int a = 0; a < 4; a++){
            if (a == 0) {
                RoyalGarden[3][a] -= 1;
            } else if (a == 1) {
                RoyalGarden[3][a] -= 2;
            } else if (a == 2) {
                RoyalGarden[3][a] -= 0;
            } else if (a == 3) {
                RoyalGarden[3][a] -= 5;
            } 
            System.out.println("Stok " + jenisBunga[a] + " : " + RoyalGarden[3][a]);
        }
        System.out.println("=========================================================");
    }

    public static void main(String[] args) {
        PendapatanTiapCabang();
        StockRoyalGarden4();
    }
}
