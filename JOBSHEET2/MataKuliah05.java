package JOBSHEET2;
public class MataKuliah05 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah05() {

    }
    public MataKuliah05(String kode, String nm, int sks, int jam) {
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }

    void tampilInformasi() {
        System.out.println();
        System.out.println("Kode mata kuliah : " + kodeMK);
        System.out.println("Nama mata kuliah : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah jam : " + jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah dirubah!!");
        System.out.println("SKS : " + sks);
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
    }
    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak berhasil!!");
        } else {
            jumlahJam -= jam;
            System.out.println("Pengurangan jam berhasil");
            System.out.println("Jumlah jam : " + jumlahJam);
        }
    }
}
