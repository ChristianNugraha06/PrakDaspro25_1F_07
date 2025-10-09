package P6;

import java.util.Scanner;

public class ifCetakKRS07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner (System.in);

        System.out.println("---Cetak KRS Siakad---");
        System.out.print("Apakah ukt ini sudah lunas (true/false)");
        boolean uktLunas = Christ.nextBoolean();
    

       // if (uktLunas) {
        //    System.out.println("pembayaran ukt terverivikasi");
        //    System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
       // }
        //else {
        //    System.out.println("“Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
       // }
       String pesan; 
       pesan = (uktLunas) ? "pembayaran UKT terverivikasi. Silahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu"; 
       System.out.println(pesan);
       
    }
}

    

