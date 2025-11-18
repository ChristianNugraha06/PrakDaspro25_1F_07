package P12;

import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        int baris, kolom;
        String nama,next;
        String [][] penonton = new String[4][2];

         while (true) {
            System.out.println("\n---Pilih menu berikut--- ");
            System.out.println("Menu 1 : input data penonton \nMenu 2: Tampilkan daftar penonton \nMenu 3: Exit");
            System.out.println("(Pilih dengan angka (1-3))");
            System.out.print("Masukkan menu yang di pilih: ");
            int opsiMenu = Christ.nextInt();
            Christ.nextLine();
            System.out.println();

            switch (opsiMenu) {
                case 1:
                     while (true) {
                        System.out.print("isi nama: ");
                        nama = Christ.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = Christ.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = Christ.nextInt();
                        Christ.nextLine();

                      
                         penonton[baris-1][kolom-1] = nama;
                        

                        System.out.println("Tambahkan penonton lainnya?(y/n): ");
                        next = Christ.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                     }
                     break;
                    
                case 2:
                  System.out.println("Daftar penonton: ");
                  for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print(penonton[i][j] + "\t");

                    }
                    System.out.println();
                  }
                    break;
                case 3:
                   System.out.println("Selesai");
                   return;
                default:
                System.out.println("Menu Tidak valid, silahkan masukkan yang valid!");
            }





            
        

           

          
        

     }


       
    }
}
