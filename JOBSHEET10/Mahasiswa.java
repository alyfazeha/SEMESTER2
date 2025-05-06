package JOBSHEET10;
public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    String kelas;

    Mahasiswa() {
    }

    Mahasiswa(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}