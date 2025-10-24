package P9;

import java.util.Scanner;

public class tugasNo1P9 {
    public static void main(String[] args) {
        Scanner Christ= new Scanner(System.in);

    int hargaTiket07 = 50000;
    int totalTiket07 = 0;
    double totalPendapatan07 =  0, totalHarga07;
    String beliTiket07;

    while (true) {
            System.out.print("Beli tiket (Ya/Tidak) " );
            beliTiket07 = Christ.nextLine();
            if (beliTiket07.equalsIgnoreCase("Tidak")) {
                System.out.println("Transaksi anda selesai, terimakasih");
                break;
            }if (beliTiket07.equalsIgnoreCase("Ya")) {
                
            System.out.print("Masukkan Jumlah tiket yang ingin di pesan:");
            int jumlahTiket07 = Christ.nextInt();
             if (jumlahTiket07 < 0) {
                System.out.println("Jumlah tiket tidak valid, Silakan input ulang.");
                continue;
            }
            totalHarga07 = jumlahTiket07 * hargaTiket07;
            if (jumlahTiket07 > 10) {
                totalHarga07 *= 0.85; 
            } else if (jumlahTiket07 > 4) {
                totalHarga07 *= 0.90; 
            }
            totalTiket07 += jumlahTiket07;
            totalPendapatan07 += totalHarga07;
            System.out.println("Total yang harus dibayar: Rp " + (int) totalHarga07 );
            }
            System.out.println("Apakah ingin membeli lagi?");
            beliTiket07=Christ.nextLine();
           
        }   
     System.out.println("Total tiket terjual hari ini: " + totalTiket07 + " tiket");
    System.out.println("Pendapatan hari ini       : Rp" + (int)totalPendapatan07);    

        
    
}
}