package P11;

import java.util.Scanner;

public class TugasNo3_07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                         "Kentang Goreng", "Teh Tarik", "Cappucino", 
                         "Chocolate Ice"};
                          System.out.println("=== DAFTAR MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = Christ.nextLine();

        boolean ditemukan = false;
        int hasil = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                hasil= i;
                break;
            }
        }
         System.out.println();
        if (ditemukan) {
            System.out.println("Makanan \"" + menu[hasil] + "\" tersedia di menu.");
            System.out.println("Posisi di menu: nomor " + (hasil + 1));
        } else {
            System.out.println("Maaf, makanan \"" + cari + "\" tidak ada di menu.");
        }


    }
}
