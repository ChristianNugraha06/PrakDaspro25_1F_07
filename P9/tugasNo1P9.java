package P9;

import java.util.Scanner;

public class tugasNo1P9 {
    public static void main(String[] args) {
        Scanner Christ= new Scanner(System.in);

    int hargaTiket07 = 50000;
    int totalTiket07 = 0;
    double totalPendapatan07 =  0, totalHarga07;

    while (true) {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli (tekan 0 untuk selesai): ");
            int jumlahTiket07 = Christ.nextInt();
            if (jumlahTiket07 == 0) {
                System.out.println("Anda tidak memesan tiket, terimaksih.");
                break;
            }
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
     System.out.println("Total tiket terjual hari ini: " + totalTiket07 + " tiket");
    System.out.println("Pendapatan hari ini       : Rp" + (int)totalPendapatan07);    

        
    
}
}