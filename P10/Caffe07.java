package P10;

import java.util.Scanner;

public class Caffe07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        System.out.print("Jumlah cabang : ");
        int Cabang = Christ.nextInt();
        System.out.println();

        System.out.println(" --- Input Penjualan Percabang ---");
        System.out.println();
        int totalPembeli = 0, totalBarang =0;

        for (int i = 1; i <= Cabang; i++) {
            
            System.out.println("--- Cabang " + i + " ---" );
            System.out.print("Jumlah pembeli: ");
            int pembeli = Christ.nextInt();

            int barangCabang =0;

            for (int j = 1; j <=pembeli; j++) {
                System.out.print("- Pembeli " + j + " Memesan berapa barang ");
                int barang = Christ.nextInt();
                barangCabang+=barang;
            }
            System.out.println(" Cabang " + i + ":");
            System.out.println("Pembeli: " + pembeli + " Orang ");
            System.out.println("Barang terjual: "+barangCabang);

            totalPembeli+=pembeli;
            totalBarang+=barangCabang;

        }

        System.out.println("Total seluruh cabang:");
        System.out.println("Pembeli: "+totalPembeli);
        System.out.println("Barang terjual "+totalBarang);
    }
}
