package JOBSHEET11;

public class Mahasiswa05 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa05() {
    }

    Mahasiswa05(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
