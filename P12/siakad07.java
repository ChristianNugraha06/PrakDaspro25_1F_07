package P12;

import java.util.Scanner;

public class siakad07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        int jumlahMatkul,jumlahMHS;
        int [][] nilai;


        System.out.println("Input jumlah MHS: ");
        jumlahMHS = Christ.nextInt();
        System.out.println("input Jumlah Matkul: ");
        jumlahMatkul = Christ.nextInt();

        nilai = new int [jumlahMHS][jumlahMatkul];

        for (int i = 0; i <jumlahMHS ; i++) {
            System.out.println("Input nilai mahasiswa ke- " + (i + 1) );
            double totalPerSiswa=0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) +": ");
                nilai[i][j] = Christ.nextInt();
                totalPerSiswa+=nilai[i][j];
            }

            System.out.println("nilai rata-rata: " + totalPerSiswa+jumlahMatkul);
        }
        System.out.println("\n======================================");
        System.out.println("Rata rata nilai tiap matkul");

        for (int j = 0; j <jumlahMatkul ; j++) {
            double totalperMatkul = 0;

            for (int i = 0; i < jumlahMHS; i++) {
                totalperMatkul +=nilai[i][j];

            }

            System.out.println("Mata kuliah " + (j+1) + ": " + totalperMatkul/jumlahMHS);
        }
    }
}
