package JOBSHEET3;
public class DataDosen05 {
    void dataSemuaDosen(Dosen05[] arrayOfDosen,int n){
        System.out.println("======================================");
        System.out.println("========== DATA SEMUA DOSEN ==========");
        System.out.println("======================================");
        for (int a = 0; a < n; a++){
            System.out.println("Data Dosen Ke-" + (a+1));
            System.out.println("Kode             : " + arrayOfDosen[a].kode);
            System.out.println("Nama             : " + arrayOfDosen[a].nama);
            if (arrayOfDosen[a].jenisKelamin == true) {
                System.out.println("Jenis Kelamin    : Wanita");
            } else {
                System.out.println("Jenis Kelamin    : Pria");
            }
            System.out.println("Usia             : " + arrayOfDosen[a].usia);
            System.out.println("-------------------------------");
        }
        System.out.println();
    }

    void jumlahDosenPerJenisKelamin(Dosen05[] arrayOfDosen, int n){
        System.out.println("======================================");
        System.out.println("====== DOSEN BERDASARKAN GENDER ======");
        System.out.println("======================================");
        System.out.println("Dosen Wanita : ");
        for (int a = 0; a < n; a++){
            if (arrayOfDosen[a].jenisKelamin == true) {
                System.out.println(arrayOfDosen[a].nama);
            }
        }
        System.out.println("Dosen Pria : ");
        for (int a = 0; a < n; a++){
            if (arrayOfDosen[a].jenisKelamin == false) {
                System.out.println(arrayOfDosen[a].nama);
            }
        }
        System.out.println();
    }
    
    void rerataUsiaDosenPerJenisKelamin(Dosen05[] arrayOfDosen, int n){
        System.out.println("======================================");
        System.out.println("====== RATA RATA USIA BDS GENDER =====");
        System.out.println("======================================");
        int sumWanita = 0;
        int sumPria= 0;
        int countWanita = 0;
        int countPria = 0;
        
        for (int a = 0; a < n; a++){
            if (arrayOfDosen[a].jenisKelamin == true) {
                sumWanita += arrayOfDosen[a].usia;
                countWanita += 1;
            }
        }
        double aveWanita = sumWanita / countWanita;
        System.out.println("Rata Rata Usia Dosen Wanita : " + aveWanita);
        
        for (int a = 0; a < n; a++){
            if (arrayOfDosen[a].jenisKelamin == false) {
                sumPria += arrayOfDosen[a].usia;
                countPria += 1;
            }
        }
        double avePria = sumPria / countPria;
        System.out.println("Rata Rata Usia Dosen Pria : " + avePria);
        System.out.println();
    }

    void infoDosenPalingTua(Dosen05[] arrayOfDosen, int n) {
        System.out.println("======================================");
        System.out.println("========= DOSEN PALING TUA ===========");
        System.out.println("======================================");
        int tertua = arrayOfDosen[0].usia;
        int b = 0;
       
        for (int a = 1; a < n; a++) {
            if (tertua < arrayOfDosen[a].usia) {
                tertua = arrayOfDosen[a].usia;
                b = a;
            }
        }
        System.out.println("Dosen Paling Tua : " + arrayOfDosen[b].nama);
        System.out.println();
    }

    void infoDosenPalingMuda(Dosen05[] arrayOfDosen, int n ) {
        System.out.println("======================================");
        System.out.println("========== DOSEN PALING MUDA =========");
        System.out.println("======================================");
        int termuda = arrayOfDosen[0].usia;

        int b = 0;
        for (int a = 1; a < n; a++) {
            if (termuda > arrayOfDosen[a].usia) {
                termuda = arrayOfDosen[a].usia;
                b = a;
            }
        }
        System.out.println("Dosen Paling Muda : " + arrayOfDosen[b].nama);
        System.out.println();

    }
}
