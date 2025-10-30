package P10;

import java.util.Scanner;

public class Square07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);
        System.out.print("Masukkan nilai n =");
        int n = Christ.nextInt();

        for(int iOuter=1;iOuter<=n;iOuter++) {
             for (int i=1;i<=n;i++ ) {
                System.out.print("*");
        }
        System.out.println();
        }
           
    }
}
