package P12;

import java.util.Arrays;
import java.util.Scanner;

public class Kuis2 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        double[][] dafHadr07 =new double [6][5];

        int kehadiran07;
        String bulan07, namaKaryawan07;
        double potGaji07 = 2.500, totalPGaji07=0;

       

        for (int i = 0; i < dafHadr07.length; i++) {

             System.out.print("Masukkan nama karyawan: ");
        namaKaryawan07 = Christ.nextLine();

        System.out.println("Bulan :" );
        bulan07 = Christ.nextLine();

        System.out.print("Masukkan jumlah hadir: ");
        kehadiran07 = Christ.nextInt();
             if (kehadiran07>30) {
            System.out.println(potGaji07);

            potGaji07+=totalPGaji07;
        }
        if (kehadiran07<=0) {
            System.out.println("cuti");
        }
        }

       
       
      
        
    }
}
