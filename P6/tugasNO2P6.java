package P6;

import java.util.Scanner;

public class tugasNO2P6 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        System.out.println("Masukkan sebuah angka");
        int angka07 = Christ.nextInt();

        if (angka07 %2 == 0) {
            System.out.println("genap");
            
        } else{
            System.out.println("ganjil");
        }
    }
}
