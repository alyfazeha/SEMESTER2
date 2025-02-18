package JOBSHEET2;
public class DosenMain05 {
    public static void main(String[] args) {
        Dosen05 alyfa = new Dosen05();
        alyfa.idDosen = "AL001";
        alyfa.nama = "Alyfa Zahra";
        alyfa.statusAktif = true;
        alyfa.tahunBergabung = 2003;
        alyfa.bidangKeahlian = "Matematika";

        alyfa.tampilInformasi();
        alyfa.setStatusAktif(false);
        // int masa = alyfa.hitungMasaKerja(2025);
        System.out.println("Masa Kerja : " + alyfa.hitungMasaKerja(2025));
        alyfa.ubahKeahlian("Sains");
        alyfa.tampilInformasi();

        Dosen05 zahra = new Dosen05("ZH002", "Zahra rarara", true, 2017, "Komputer");
        zahra.tampilInformasi();
        zahra.setStatusAktif(true);

    }
}
