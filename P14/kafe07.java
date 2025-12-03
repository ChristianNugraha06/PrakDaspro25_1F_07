package P14;

import java.util.Scanner;

public class kafe07 {
    public static void Menu (String NamaPelanggan, Boolean isMember, String kodePromo  ) {


        System.out.println("Selamat datang : " +NamaPelanggan + "!" );
       

        if (isMember) {
            System.out.println("Anda adalah member");
        }
       
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%!");
        }else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda medapatkan diskon30%!");
        }else {
            System.out.println("Kode promo invalid!");
        }
        
        System.out.println("=== MENU RESTO CAFE ===");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("================================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    } 
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000,18000 };
        int hargaTotal = hargaItems[pilihanMenu-1]*banyakItem;
        int diskon = 0;
        if (kodePromo.equals("DISKON50")) {
            diskon = hargaTotal * 50 / 100;
            System.out.println("Anda mendapat diskon 50%: Rp" + diskon);
        } else if (kodePromo.equals("DISKON30")) {
            diskon = hargaTotal * 30 / 100;
            System.out.println("Anda mendapat diskon 30%: Rp" + diskon);
        } else {
            System.out.println("Kode promo invalid, tidak ada pengurangan harga");
        }
        hargaTotal=hargaTotal-diskon;
        return hargaTotal;
    }public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);
        Menu("Budi", true, "DISKON30");
    
      System.out.print("\n Masuukan nomor menu yang ingin anda pesan: ");
      int pilihanMenu = Christ.nextInt();
      System.out.print("Masukkan jumlah item yang ingin di pesan: ");
      int banyakItem = Christ.nextInt();
      System.out.println("Masukkan kode promo (Atau input 'TIDAK' jika tidak ada");
      String kodePromo = Christ.next();
      int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

      System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
    }
        
       
    
} 
