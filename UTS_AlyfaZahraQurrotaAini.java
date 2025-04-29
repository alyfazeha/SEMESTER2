import java.util.Scanner;

// 05_Alyfa Zahra Qurrota Aini
// SIB 1G

public class UTS_AlyfaZahraQurrotaAini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UTS_AlyfaZahraQurrotaAiniFeatures fitur = new UTS_AlyfaZahraQurrotaAiniFeatures(sc);
        fitur.menu();
    }
}

class UTS_Alyfa {
    String kode;
    String nama;
    int stok;
    int harga;
    int terjual;

    UTS_Alyfa() {}

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

class UTS_AlyfaZahraQurrotaAiniFeatures {
    UTS_Alyfa[] listBarang;
    int idx = 0;
    Scanner sc;

    public UTS_AlyfaZahraQurrotaAiniFeatures(Scanner scanner) {
        this.sc = scanner;
    }

    public void menu() {
        int pilihan;
        do {
            System.out.println("\n======== MENU ========");
            System.out.println("1. Input Barang");
            System.out.println("2. Penjualan Barang");
            System.out.println("3. Cek Stok Barang Terbanyak");
            System.out.println("4. Cek Barang Terlaris");
            System.out.println("5. Tampil Seluruh Barang");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1: inputBarang(); break;
                case 2: penjualanBarang(); break;
                case 3: cekStokBarangTerbanyak(); break;
                case 4: cekStokBarangTerlaris(); break;
                case 5: tampilBarang(true); break;
                case 6: System.out.println("Terima kasih telah menggunakan program."); break;
                default: System.out.println("Menu tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 6);
    }

    void inputBarang() {
        System.out.println("\n==== INPUT BARANG ====");
        System.out.print("Masukkan jumlah barang yang ingin diinput: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 
        listBarang = new UTS_Alyfa[jumlah];
        idx = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Barang ke-" + (i + 1));
            System.out.print("Kode Barang     : ");
            String kode = sc.nextLine();
            System.out.print("Nama Barang     : ");
            String nama = sc.nextLine();
            System.out.print("Stok Barang     : ");
            int stok = sc.nextInt();
            System.out.print("Harga Satuan    : ");
            int harga = sc.nextInt();
            sc.nextLine(); 

            UTS_Alyfa b = new UTS_Alyfa(kode, nama, stok, harga);
            listBarang[idx] = b;
            idx++;
            System.out.println();
        }
        System.out.println("Barang berhasil diinput!\n");
    }

    void penjualanBarang() {
        if (listBarang == null || idx == 0) {
            System.out.println("Belum ada data barang. Silakan input terlebih dahulu.");
            return;
        }

        System.out.println("\n==== PENJUALAN BARANG ====");
        tampilBarang(false);

        System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
        int jumlahBeli = sc.nextInt();
        sc.nextLine();

        String[] kodeJual = new String[jumlahBeli];
        int[] jumlahBeliPerItem = new int[jumlahBeli];
        int[] totalHargaPerItem = new int[jumlahBeli];
        UTS_Alyfa[] barangDibeli = new UTS_Alyfa[jumlahBeli];

        for (int i = 0; i < jumlahBeli; i++) {
            System.out.print("Masukkan kode barang ke-" + (i+1) + ": ");
            String kode = sc.nextLine();
            UTS_Alyfa barang = cariBarangByKode(kode);

            if (barang != null) {
                System.out.print("Jumlah beli untuk " + barang.nama + ": ");
                int jumlah = sc.nextInt();
                sc.nextLine();

                if (jumlah > barang.stok) {
                    System.out.println("Stok tidak cukup. Hanya tersedia: " + barang.stok);
                    i--; 
                } else {
                    barang.stok -= jumlah;
                    barang.terjual += jumlah;
                    kodeJual[i] = barang.kode;
                    jumlahBeliPerItem[i] = jumlah;
                    totalHargaPerItem[i] = jumlah * barang.harga;
                    barangDibeli[i] = barang;
                }
            } else {
                System.out.println("Kode barang tidak ditemukan.");
                i--; 
            }
        }

        System.out.println("\n==== STRUK PENJUALAN ====");
        System.out.printf("%-6s %-12s %-13s %-14s %-12s\n", "Kode", "Nama", "Jumlah Beli", "Harga Satuan", "Total Harga");
        System.out.println("-------------------------------------------------------------------");

        int totalBayar = 0;
        for (int i = 0; i < jumlahBeli; i++) {
            if (barangDibeli[i] != null) {
                System.out.printf("%-6s %-12s %-13d %-14d %-12d\n",
                    barangDibeli[i].kode,
                    barangDibeli[i].nama,
                    jumlahBeliPerItem[i],
                    barangDibeli[i].harga,
                    totalHargaPerItem[i]);
                totalBayar += totalHargaPerItem[i];
            }
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Total Bayar: " + totalBayar);
    }

    UTS_Alyfa cariBarangByKode(String kode) {
        for (int i = 0; i < idx; i++) {
            if (listBarang[i].kode.equalsIgnoreCase(kode)) {
                return listBarang[i];
            }
        }
        return null;
    }

    void tampilBarang(boolean showTerjual) {
        System.out.println("\n==== DAFTAR BARANG ====");
        System.out.printf("%-6s %-12s %-10s %-12s", "Kode", "Nama", "Stok", "Harga");
        if (showTerjual) {
            System.out.printf(" %-10s", "Terjual");
        }
        System.out.println();
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < idx; i++) {
            System.out.printf("%-6s %-12s %-10d %-12d", 
                listBarang[i].kode,
                listBarang[i].nama,
                listBarang[i].stok,
                listBarang[i].harga);
            if (showTerjual) {
                System.out.printf(" %-10d", listBarang[i].terjual);
            }
            System.out.println();
        }
    }

    void cekStokBarangTerbanyak() {
        if (listBarang == null || idx == 0) {
            System.out.println("Belum ada data barang.");
            return;
        }

        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listBarang[j].stok < listBarang[j + 1].stok) {
                    UTS_Alyfa temp = listBarang[j];
                    listBarang[j] = listBarang[j + 1];
                    listBarang[j + 1] = temp;
                }
            }
        }

        System.out.println("\n==== BARANG BERDASARKAN STOK TERBANYAK ====");
        tampilBarang(true);
    }

    void cekStokBarangTerlaris() {
        if (listBarang == null || idx == 0) {
            System.out.println("Belum ada data barang.");
            return;
        }

        UTS_Alyfa terlaris = listBarang[0];

        for (int i = 1; i < idx; i++) {
            if (listBarang[i].terjual > terlaris.terjual) {
                terlaris = listBarang[i];
            }
        }

        if (terlaris.terjual == 0) {
            System.out.println("\nBelum ada barang yang terjual.");
        } else {
            System.out.println("\n==== BARANG TERLARIS ====");
            System.out.println("Kode Barang     : " + terlaris.kode);
            System.out.println("Nama Barang     : " + terlaris.nama);
            System.out.println("Stok Tersisa    : " + terlaris.stok);
            System.out.println("Harga Satuan    : " + terlaris.harga);
            System.out.println("Jumlah Terjual  : " + terlaris.terjual);
        }
    }
}
