package UTS;
public class UTS_Alyfa {
    String kode;
    String nama;
    int stok;
    int harga;
    int terjual;

    UTS_Alyfa() {

    }

    UTS_Alyfa(String kd, String nm, int stk, int hrg) {
        kode = kd;
        nama = nm;
        stok = stk;
        harga = hrg;
        terjual = 0;
    }

    void tampilInformasi() {
        System.out.println("Kode Barang     : " + kode);
        System.out.println("Nama Barang     : " + nama);
        System.out.println("Stok Barang     : " + stok);
        System.out.println("Harga Barang    : " + harga);
        System.out.println("Total terjual   : " + terjual);
    }
}
