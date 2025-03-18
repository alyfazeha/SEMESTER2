package JOBSHEET6;
public class MahasiswaDemo05 {
    public static void main(String[] args) {    
        MahasiwaBerprestasi05 list = new MahasiwaBerprestasi05();
        Mahasiswa05 m1 = new Mahasiswa05("123", "Zidan", "2A", 3.2);
        Mahasiswa05 m2 = new Mahasiswa05("124", "Ayu", "2A", 3.5);
        Mahasiswa05 m3 = new Mahasiswa05("125", "Sofi", "2A", 3.1);
        Mahasiswa05 m4 = new Mahasiswa05("126", "Sita", "2A", 3.9);
        Mahasiswa05 m5 = new Mahasiswa05("127", "Miki", "2A", 3.7);
    
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    }
}
