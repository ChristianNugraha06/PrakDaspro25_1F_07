package P12;

import java.util.Scanner;

public class SurveiKepuasanPelanggan07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);
        
        // a. Menyimpan hasil survei dalam array 2 dimensi
        // Deklarasi array untuk 10 responden dan 6 pertanyaan
        int[][] hasilSurvei = new int[10][6];
        
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;
        
        // Input data survei
        System.out.println("=== INPUT DATA SURVEI KEPUASAN PELANGGAN ===");
        System.out.println("Masukkan nilai 1-5 untuk setiap pertanyaan\n");
        
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                do {
                    System.out.print("  Pertanyaan " + (j + 1) + ": ");
                    hasilSurvei[i][j] = Christ.nextInt();
                    if (hasilSurvei[i][j] < 1 || hasilSurvei[i][j] > 5) {
                        System.out.println("  Nilai harus antara 1-5!");
                    }
                } while (hasilSurvei[i][j] < 1 || hasilSurvei[i][j] > 5);
            }
            System.out.println();
        }
        
        // Menampilkan data survei
        System.out.println("=== DATA HASIL SURVEI KEPUASAN PELANGGAN ===\n");
        System.out.print("Responden\t");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            System.out.print("P" + (j + 1) + "\t");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
        
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.print("R" + (i + 1) + "\t\t");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print(hasilSurvei[i][j] + "\t");
            }
            System.out.println();
        }
        
        // b. Menghitung dan menampilkan rata-rata setiap responden
        System.out.println("\n=== RATA-RATA SETIAP RESPONDEN ===\n");
        double[] rataResponden = new double[jumlahResponden];
        int totalSemuaResponden = 0;
        
        for (int i = 0; i < jumlahResponden; i++) {
            int totalPerResponden = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalPerResponden += hasilSurvei[i][j];
            }
            rataResponden[i] = (double) totalPerResponden / jumlahPertanyaan;
            totalSemuaResponden += totalPerResponden;
            System.out.printf("Responden %d: %.2f\n", (i + 1), rataResponden[i]);
        }
        
        // c. Menghitung dan menampilkan rata-rata setiap pertanyaan
        System.out.println("\n=== RATA-RATA SETIAP PERTANYAAN ===\n");
        double[] rataPertanyaan = new double[jumlahPertanyaan];
        
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int totalPerPertanyaan = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalPerPertanyaan += hasilSurvei[i][j];
            }
            rataPertanyaan[j] = (double) totalPerPertanyaan / jumlahResponden;
            System.out.printf("Pertanyaan %d: %.2f\n", (j + 1), rataPertanyaan[j]);
        }
        
        // d. Menghitung dan menampilkan rata-rata keseluruhan
        System.out.println("\n=== RATA-RATA KESELURUHAN ===\n");
        double rataKeseluruhan = (double) totalSemuaResponden / (jumlahResponden * jumlahPertanyaan);
        System.out.printf("Nilai rata-rata keseluruhan survei: %.2f\n", rataKeseluruhan);
        
        // Interpretasi hasil
        System.out.println("\n=== INTERPRETASI ===\n");
        if (rataKeseluruhan >= 4.5) {
            System.out.println("Kepuasan pelanggan: SANGAT TINGGI");
        } else if (rataKeseluruhan >= 3.5) {
            System.out.println("Kepuasan pelanggan: TINGGI");
        } else if (rataKeseluruhan >= 2.5) {
            System.out.println("Kepuasan pelanggan: SEDANG");
        } else {
            System.out.println("Kepuasan pelanggan: RENDAH");
        }
        
        Christ.close();
    }
}
    
