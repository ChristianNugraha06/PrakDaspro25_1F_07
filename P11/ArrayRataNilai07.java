package P11;

import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa :");
        int jmlmhs = Christ.nextInt();
        int [] nilaiMhs = new int[5];
        double totalLulus =0;
        double totalTdkLulus =0;
         int mhsLulus =0;
         int mhsTdkLlus=0;
         double rata2L=0; 
         double Rata2TL=0;


        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = Christ.nextInt();
        } 

        for (int i = 0; i < nilaiMhs.length; i++) {
            
            if (nilaiMhs[i]>70) {
                totalLulus+=nilaiMhs[i];
                mhsLulus++;    
            }else {
                totalTdkLulus+=nilaiMhs[i];
                mhsTdkLlus++;
            }

        } 
        if (mhsLulus>0) {
            rata2L = totalLulus/mhsLulus;
        }

        if (mhsTdkLlus>0) {
            Rata2TL = totalTdkLulus/mhsTdkLlus;
        }
        System.out.println("Rata-rata nilai lulus = "+rata2L);
        System.out.println("Rata-rata nilai tdiak lulus = "+Rata2TL);
    } 
}
