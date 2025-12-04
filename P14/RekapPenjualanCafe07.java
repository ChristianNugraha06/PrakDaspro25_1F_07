package P14;

import java.util.Scanner;

public class RekapPenjualanCafe07 {
    
    static void inputNamaMenu(String[] namaMenu, Scanner Christ) {
        System.out.println("\n===== INPUT NAMA MENU =====");
        Christ.nextLine();
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = Christ.nextLine();
        }
    }
    
    static void inputDataPenjualan(int[][] penjualan, String[] namaMenu, Scanner Christ) {
        System.out.println("\n===== INPUT DATA PENJUALAN =====");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println("\nMenu: " + namaMenu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = Christ.nextInt();
            }
        }
    }
    
    static void tampilkanDataPenjualan(int[][] penjualan, String[] namaMenu) {
        System.out.println("\n===== REKAP PENJUALAN KAFE =====");
        System.out.print("Menu\t\t");
        for (int j = 0; j < penjualan[0].length; j++) {
            System.out.print("Hari " + (j + 1) + "\t");
        }
        System.out.println();
        
        String separator = "";
        for (int j = 0; j < penjualan[0].length + 2; j++) {
            separator += "========";
        }
        System.out.println(separator);
        
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.print(namaMenu[i]);
            if (namaMenu[i].length() < 8) {
                System.out.print("\t\t");
            } else if (namaMenu[i].length() < 16) {
                System.out.print("\t");
            }
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(separator);
    }
    
    static void tampilkanMenuTertinggi(int[][] penjualan, String[] namaMenu) {
        int maxTotal = 0;
        int indexMax = 0;
        
        for (int i = 0; i < namaMenu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                indexMax = i;
            }
        }
        
        System.out.println("\n===== MENU DENGAN PENJUALAN TERTINGGI =====");
        System.out.println("Menu: " + namaMenu[indexMax]);
        System.out.println("Total Penjualan: " + maxTotal);
    }
    
    static void tampilkanRataRataPenjualan(int[][] penjualan, String[] namaMenu) {
        System.out.println("\n===== RATA-RATA PENJUALAN SETIAP MENU =====");
        for (int i = 0; i < namaMenu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.printf("%s: %.2f\n", namaMenu[i], rataRata);
        }
    }
    
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);
        
        System.out.println("===== PROGRAM REKAP PENJUALAN KAFE =====");
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = Christ.nextInt();
        
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = Christ.nextInt();
        
        String[] namaMenu = new String[jumlahMenu];
        int[][] dataPenjualan = new int[jumlahMenu][jumlahHari];
        
        inputNamaMenu(namaMenu, Christ);
        
        inputDataPenjualan(dataPenjualan, namaMenu, Christ);
        
        tampilkanDataPenjualan(dataPenjualan, namaMenu);
        
        tampilkanMenuTertinggi(dataPenjualan, namaMenu);
        
        tampilkanRataRataPenjualan(dataPenjualan, namaMenu);
        
        Christ.close();
    }
}