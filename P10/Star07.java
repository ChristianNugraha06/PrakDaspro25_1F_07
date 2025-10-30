package P10;

import java.util.Scanner;

public class Star07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner (System.in);
        System.out.print("Masukkan nilai n =");
        int n = Christ.nextInt();

        for (int i=1;i<=n;i++) {
             System.out.print("*");
        }
    }
}
