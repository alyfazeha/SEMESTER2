package JOBSHEET2;
public class MataKuliahMain05 {
    public static void main(String[] args) {
        MataKuliah05 mk1 = new MataKuliah05();
        mk1.nama = "Dasar Pemrograman";
        mk1.kodeMK = "DP001";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSKS(1);
        mk1.tambahJam(4);
        mk1.kurangiJam(2);
        mk1.tampilInformasi();

        MataKuliah05 mk2 = new MataKuliah05("PRAKDP002", "Praktikum Dasar Pemrograman", 3, 6);
        mk2.tampilInformasi();
        mk2.ubahSKS(8);
        mk2.tambahJam(2);
        mk2.kurangiJam(9);
        mk2.tampilInformasi();

        MataKuliah05 mk3 = new MataKuliah05("ALSD003", "Algoritma Struktur Data", 4, 6);
        mk3.tampilInformasi();
    }
}
