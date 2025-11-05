package P10;

import java.util.Scanner;

public class Kuadrat07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        System.out.print(" Masukkan nilai n : ");
        int n = Christ.nextInt();

        for (int i = 1; i <=n; i++) {
            int jumlahKuadrat = 0;
            String baris = "";

            for (int j = 1; j <=i; j++) {
                int kuadrat = j*j;
                jumlahKuadrat += kuadrat;
                baris +=kuadrat;
                if (j<i) {
                    baris+= " + "; 
                }
            }
            System.out.println("n = "+i + " : Jumlah kuadrat = " + baris + "=" + jumlahKuadrat);
        }
    }
}
