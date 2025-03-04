package QUIZ1;
public class Buku05 {
    String kodeBuku;
    String judulBuku;
    String penulis;
    Boolean statusPeminjaman;

    public Buku05() {

    }

    public Buku05(String kode, String judul, String penulis, Boolean status) {
        kodeBuku = kode;
        judulBuku = judul;
        this.penulis = penulis;
        statusPeminjaman = status;
    }
}
