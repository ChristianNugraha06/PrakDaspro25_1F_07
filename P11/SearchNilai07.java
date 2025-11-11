package P11;

import java.util.Scanner;

public class SearchNilai07 {
    public static void main(String[] args) {
       Scanner Christ = new Scanner(System.in);


        System.out.print(" Masukkan banyak nilai yang akan di input : ");
        int banyakNilai = Christ.nextInt();


        int [] nilai = new int [banyakNilai];  

       for (int i = 0; i < banyakNilai; i++) {
        
       }

        for (int i = 0; i < banyakNilai; i++) {
           System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
           nilai[i] = Christ.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari: ");
        int key = Christ.nextInt();
        

        int hasil=0;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                hasil=i;
                break;
            }
             
        }System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+(hasil+1));
        System.out.println();
       
    }
}
