package P9;

import java.util.Scanner;

public class tugasNo2P9 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        int jenis07,waktu07,total07 =0;
        System.out.println("Masukkan jenis kendaraan: (1 Mobil, 2 Motor, 0 Keluar)");
        jenis07 = Christ.nextInt();
        while (jenis07!=0) {
            if (jenis07==1||jenis07==2) {
                System.out.println("Lama waktu parkir :");
                waktu07 = Christ.nextInt();
                if (waktu07>5) {
                     total07 +=12500;
                } else if (jenis07 == 1) {
                    total07 += waktu07*3000;
                } else if (jenis07 == 2) {
                    total07 += waktu07*2000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
            }
            System.out.println("Kendaraan berikutnya: (1 Mobil, 2 Motor, 0 Keluar)");
            jenis07 = Christ.nextInt();      
        }
        System.out.println("Total biaya parkir anda :"+total07);
            }
        }
        
    

