package P6;

import java.util.Scanner;

public class ifElseCetakKRS07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner (System.in);

        System.out.println("---cetak KRS SIAKAD---");
        System.out.print("Masukkan semester saat ini");
        int semester = Christ.nextInt();

        if (semester == 1) {
            System.out.println("Tampilkan KRS semester 1");
             } else if (semester == 2) {
                System.out.println("Tampilkan KRS semester 2");
             } else if (semester == 3) {
                System.out.println("Tampilkan KRS semester 3");
             } else if (semester == 4) {
                System.out.println("Tampilkan KRS semester 4");
             } else if (semester == 5) {
                System.out.println("Tampilkan KRS semester 5");
             } else if (semester == 6) {
                System.out.println("tampilkan KRS semester 6");
             } else if (semester == 7) {
                System.out.println("tampilkan KRS semester 7");
             } else if (semester == 8) {
                System.out.println("tampilkan KRS semester 8");
             } else {
                System.out.println("semester tidak valid");
             }
      }      }   

