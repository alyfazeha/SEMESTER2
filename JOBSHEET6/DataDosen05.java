package JOBSHEET6;
public class DataDosen05 {
    Dosen05[] dataDosen;
    int idx;

    public DataDosen05(int jumlah) {
        dataDosen = new Dosen05[jumlah];
    }

    void tambah(Dosen05 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen05 dsn:dataDosen) {
            dsn.tampilData();
            System.out.println("------------------------------");
        }
    }

    void SortingASC() {
        for (int i = 0; i < dataDosen.length-1; i++) {
            for (int j = 1; j < dataDosen.length-i; j++) {
                if (dataDosen[j].usia < dataDosen[j-1].usia) {
                    Dosen05 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
                }
            }
        }
    }

    void SortingDSC() {
        for (int i = 0; i < (dataDosen.length-1); i++) {
            int idxMin = i;
            for (int j = (i+1); j < dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[idxMin].usia) {
                    idxMin = j;
                }
            }
            Dosen05 tmp = dataDosen[idxMin];
            dataDosen[idxMin] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void insertion() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen05 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j-1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    void pencarianDataSequential(String cariNama) {
        int jumlahHasil = 0;
        for (int i = 0; i < dataDosen.length; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(cariNama)) {
                System.out.println("Data dosen dengan nama : " + dataDosen[i].nama + 
                                   " ditemukan pada indeks " + i);
                System.out.println("Dengan detail data dosen : ");
                System.out.println("Kode          : " + dataDosen[i].kode);
                System.out.println("Nama          : " + dataDosen[i].nama);
                    if (dataDosen[i].jenisKelamin == true) {
                        System.out.println("Jenis Kelamin : Wanita");
                    } else {
                        System.out.println("Jenis Kelamin : Pria");
                    }
                System.out.println("Usia          : " + dataDosen[i].usia);
                System.out.println();
                jumlahHasil++;
            }
        }
        if (jumlahHasil == 0) {
            System.out.println("Data tidak ditemukan.");
        } else {
            System.out.println("===============================================");
            System.out.println("PERINGATAN : Data ditemukan sebanyak " + jumlahHasil);
            System.out.println("===============================================");
            if (jumlahHasil > 1) {
                System.out.println("PERINGATAN: Terdapat lebih dari satu data dosen dengan nama tersebut.");
            }
        }
    }

    void pencarianDataBinary(int cari, int left, int right) {
        int mid;
        int jumlahHasil = 0; 
        int[] indexSama = new int[dataDosen.length]; 
        
        while (right >= left) {
            mid = (left + right) / 2;
            
            if (cari == dataDosen[mid].usia) {
                indexSama[jumlahHasil] = mid;
                jumlahHasil++;
                
                int temp = mid - 1;
                while (temp >= left && dataDosen[temp].usia == cari) {
                    indexSama[jumlahHasil] = temp;
                    jumlahHasil++;
                    temp--;
                }
                
                temp = mid + 1;
                while (temp <= right && dataDosen[temp].usia == cari) {
                    indexSama[jumlahHasil] = temp;
                    jumlahHasil++;
                    temp++;
                }
                
                System.out.println("===============================================");
                System.out.println("PERINGATAN : Data ditemukan sebanyak " + jumlahHasil);
                System.out.println("===============================================");
                for (int i = 0; i < jumlahHasil; i++) {
                    int index = indexSama[i];
                    System.out.println("Data dosen dengan usia : " + dataDosen[index].usia + 
                                       " ditemukan pada indeks " + index);
                    System.out.println("Dengan detail data dosen : ");
                    System.out.println("Kode          : " + dataDosen[index].kode);
                    System.out.println("Nama          : " + dataDosen[index].nama);
                    if (dataDosen[index].jenisKelamin == true) {
                        System.out.println("Jenis Kelamin : Wanita");
                    } else {
                        System.out.println("Jenis Kelamin : Pria");
                    }
                    System.out.println("Usia          : " + dataDosen[index].usia);
                    System.out.println();
                }

                if (jumlahHasil > 1) {
                    System.out.println("PERINGATAN: Terdapat lebih dari satu data dosen dengan usia tersebut.");
                }
                return; 
            } else if (dataDosen[mid].usia < cari) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }
}
