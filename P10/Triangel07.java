package P10;

import java.util.Scanner;

public class Triangel07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);
        System.out.print("Masukkan nilai n =");
        int n = Christ.nextInt();
        int i = 0;

        while (i<=n) {
            int j =0;
            while (j<i) {
                System.out.print("*");
                j++;
            }
            i++;
            
        }
        
    }
}
