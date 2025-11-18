package P12;

import java.util.Scanner;

public class siakad07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        int [][] nilai =new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke- " + (i + 1) );
            double totalPerSiswa=0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) +": ");
                nilai[i][j] = Christ.nextInt();
                totalPerSiswa+=nilai[i][j];
            }

            System.out.println("nilai rata-rata: " + totalPerSiswa/3);
        }
        System.out.println("\n======================================");
        System.out.println("Rata rata nilai tiap matkul");

        for (int j = 0; j < 3; j++) {
            double totalperMatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalperMatkul +=nilai[i][j];

            }

            System.out.println("Mata kuliah " + (j+1) + ": " + totalperMatkul/4);
        }
    }
}
