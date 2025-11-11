package P11;

import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        int [] nilaiMhs= new int[10];
        double total =0;
        double rata2;
         int mhsLulus =0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = Christ.nextInt();
        }
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            total+=nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                mhsLulus++;
                
                

            } 
            
        } System.out.println("Total mahasiswa Lulus: " +mhsLulus);
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
    }
}
