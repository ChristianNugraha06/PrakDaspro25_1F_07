package P14;

import java.util.Scanner;

public class HitungBalok07 {
    
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }
    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    public static void main(String[] args) {

        Scanner Christ = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.println("Masukkan panjang");
        p = Christ.nextInt();

        System.out.println("Masukkan Lebar");
        l = Christ.nextInt();

         System.out.println("Masukkan tinggi");
        t = Christ.nextInt();

        L = hitungLuas(p, l); 
            System.out.println("Luas persegi panjang adalah " + L);

            vol = hitungVolume(t, p, l);
            System.out.println("Volume balok adalah " + vol);

            Christ.close();   
    }
}
