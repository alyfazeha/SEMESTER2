package JOBSHEET2;
public class MahasiswaMain05 {
    public static void main(String[] args) {
        Mahasiswa05 mhs1 = new Mahasiswa05();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "S1 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa05 mhs2 = new Mahasiswa05("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa05 alyfa = new Mahasiswa05("Alyfa Zahra Qurrota Aini", "244107060057", 4.00, "SIB 1G");
        alyfa.tampilkanInformasi();
    }
}
