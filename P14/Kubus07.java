package P14;

import java.util.Scanner;

public class Kubus07 {
     static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
    static void tampilkanInfoKubus(int sisi, int volume, int luasPermukaan) {
        System.out.println("\n===== INFORMASI KUBUS =====");
        System.out.println("Panjang Sisi       : " + sisi + " cm");
        System.out.println("Volume Kubus       : " + volume + " cm³");
        System.out.println("Luas Permukaan     : " + luasPermukaan + " cm²");
        System.out.println("===========================");
    }
    public static void main(String[] args) {
        Scanner Christ= new Scanner(System.in);
        
        System.out.println("===== PROGRAM HITUNG KUBUS =====");
        System.out.print("Masukkan panjang sisi kubus (cm): ");
        int sisi = Christ.nextInt();

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);
        tampilkanInfoKubus(sisi, volume, luasPermukaan);
    }
}
