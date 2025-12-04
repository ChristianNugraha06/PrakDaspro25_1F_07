package P14;


import java.util.Scanner;

public class NilaiMahasiswa07 {
    
    static void isianArray(int[] arrayNilai, Scanner Christ) {
        System.out.println("\n=== INPUT NILAI MAHASISWA ===");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrayNilai[i] = Christ.nextInt();
        }
    }
    
    static void tampilArray(int[] arrayNilai) {
        System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + arrayNilai[i]);
        }
    }
    
    static int hitTot(int[] arrayNilai) {
        int total = 0;
        for (int i = 0; i < arrayNilai.length; i++) {
            total += arrayNilai[i];
        }
        return total;
    }
    
    static double hitRata(int[] arrayNilai) {
        int total = hitTot(arrayNilai);
        double rataRata = (double) total / arrayNilai.length;
        return rataRata;
    }
    
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);
        
        System.out.println("===== PROGRAM NILAI MAHASISWA =====");
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = Christ.nextInt();
        
        int[] nilaiMahasiswa = new int[N];
        
        isianArray(nilaiMahasiswa, Christ);
        
        tampilArray(nilaiMahasiswa);
        
        int totalNilai = hitTot(nilaiMahasiswa);
        
        double rataRata = hitRata(nilaiMahasiswa);
        
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("=========================");
        
       
    }
}
    

