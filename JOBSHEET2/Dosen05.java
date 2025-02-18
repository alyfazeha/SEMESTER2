package JOBSHEET2;
public class Dosen05 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen05() {

    }
    public Dosen05(String id, String nm, boolean sttsAkt, int thnGbg, String bidAhli) {
        idDosen = id;
        nama = nm;
        statusAktif = sttsAkt;
        tahunBergabung = thnGbg;
        bidangKeahlian = bidAhli;
    }

    void tampilInformasi() {
        System.out.println();
        System.out.println("Id Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Status Dosen : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }
    void setStatusAktif( boolean status ) {
        statusAktif = status;
        if (statusAktif == true) {
            System.out.println("Dosen Aktif!!");
        } else {
            System.out.println("Dosen Non-Aktif!!");
        }
    }
    int hitungMasaKerja(int thnSkrg) {
        int tahunMasa = thnSkrg - tahunBergabung;
        return tahunMasa;
    }
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
