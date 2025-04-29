package JOBSHEET9;
public class Surat05 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;
    boolean statusCek;

    Surat05() {
    }

    Surat05(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
        this.statusCek = false;
    }

    void suratDicek() {
        this.statusCek = true;
    }
}
