package P11;

import java.util.Scanner;

public class TugasNo1_07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jmlh = Christ.nextInt();

        double [] nilai = new double[jmlh];
        
        for (int i = 0; i < jmlh; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = Christ.nextDouble();
            
        }
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        double rataRata2 = total / jmlh;

        double nilaiTertinggi = nilai[0];
        double nilaiTerendah = nilai[0];

        
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }
        System.out.println("  HASIL PENGOLAHAN NILAI ");
        System.out.println("Nilai rata-rata: " + rataRata2);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        
        System.out.println("  DAFTAR SEMUA NILAI ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }
}
