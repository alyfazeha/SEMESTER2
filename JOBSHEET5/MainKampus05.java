package JOBSHEET5;
public class MainKampus05 {
    public static void main(String[] args) {
        String[][] dataNilai = {
            {"Ahmad", "220101001", "2022", "78", "82"},
            {"Budi", "220101002", "2022", "85", "88"},
            {"Cindy", "220101003", "2021", "90", "87"},
            {"Dian", "220101004", "2021", "76", "79"},
            {"Eko", "220101005", "2023", "92", "95"},
            {"Fajar", "220101006", "2020", "88", "85"},
            {"Gina", "220101007", "2023", "80", "83"},
            {"Hadi", "220101008", "2020", "82", "84"},
        };

        System.out.println("Nilai UTS tertinggi menggunakan metode DC: " + Kampus05.nilaiTertinggiDC(dataNilai));
        System.out.println("Nilai UTS terendah menggunakan metode DC: " + Kampus05.nilaiTerendahDC(dataNilai));
        System.out.println("Rata-rata nilai UAS menggunakan metode BF: " + Kampus05.rataRataUASBF(dataNilai));
    }
}
