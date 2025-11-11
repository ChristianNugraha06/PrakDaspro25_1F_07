package P11;

import java.util.Scanner;

public class TugasNo2_07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

         System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = Christ.nextInt(); 
        Christ.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

         System.out.println(" INPUT DATA PESANAN ");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            System.out.print("Nama makanan/minuman: ");
            namaPesanan[i] = Christ.nextLine();
            System.out.print("Harga: Rp ");
            hargaPesanan[i] = Christ.nextDouble();
            Christ.nextLine();
        }
         double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }

        System.out.println(" DAFTAR PESANAN KAFE ");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print( namaPesanan[i]  );
            System.out.println(" : " +hargaPesanan[i]);
                
        }
        System.out.println(" TOTAL BIAYA " );
        System.out.println(totalBiaya);
    }
}
