package P10;

import java.util.Scanner;

public class KotakAngka07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        System.out.print("masukkan nilai n : ");
        int n = Christ.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i == 1 || i == n || j == 1 || j == n ) {
                    System.out.print(n+" ");
                }else {
                    System.out.print("  ");
                }
            } 
            System.out.println();
        } 
    }
}
