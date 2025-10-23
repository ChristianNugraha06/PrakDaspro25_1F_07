package P9;

import java.util.Scanner;

public class KafeDoWhile07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        int kopi,teh,roti,totalHarga;
        String namaPelanggan;
        int hargaKopi=12000,hargaTeh=7000,hargaRoti=20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar):");
            namaPelanggan = Christ.nextLine();
            if (namaPelanggan.equalsIgnoreCase("Batal")) {
                System.out.println("transaksi dibatalkan");
                break;
            }
            System.out.print("jumlah kopi :");
            kopi = Christ.nextInt();
            System.out.print("jumlah teh :");
            teh=Christ.nextInt();
            System.out.print("jumlah roti :");
            roti=Christ.nextInt();
            totalHarga= (kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
            System.out.println("Total harga yang harus dibayar:" +totalHarga);
            Christ.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai");
    }
}
