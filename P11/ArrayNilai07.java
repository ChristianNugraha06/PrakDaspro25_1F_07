package P11;

import java.util.Scanner;

public class ArrayNilai07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        int [] nilaiAkhir = new int[10];

        for (int i = 1; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke- " +i+" : ");
            nilaiAkhir[i]=Christ.nextInt();
            
        } for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" Lulus!");
            }else System.out.println("Mahasiswa ke-"+i+ " Tidak Lulus!");
            
        }

        
           
        

    
       
    }
}
