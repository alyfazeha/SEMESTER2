package JOBSHEET6;
public class DataDosen05 {
    Dosen05[] dataDosen = new Dosen05[10];
    int idx;

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
}
