package P15;
 
import java.util.Scanner;

public class CM2_Gaji_07 {
    static Scanner Christ = new Scanner(System.in);
    
    static String[][] dataPegawaiString07;
    static double[] gajiPokok07Array;
    static int[] anak07Array;
    static int[] lamaKerja07Array;
    static int jumlahPegawai07 = 0;
    
    public static void main(String[] args) {
        System.out.println(" SISTEM PENGGAJIAN MULTI PEGAWAI  ");
        System.out.print("Masukkan jumlah pegawai: ");
        int totalPegawai07 = Christ.nextInt();
        Christ.nextLine();
        
        dataPegawaiString07 = new String[totalPegawai07][3];
        gajiPokok07Array = new double[totalPegawai07];
        anak07Array = new int[totalPegawai07];
        lamaKerja07Array = new int[totalPegawai07];
        
        int pilihan07 = 0;
        
        while (pilihan07 != 3) {
            tampilkanMenu07();
            pilihan07 = Christ.nextInt();
            Christ.nextLine();
            
            if (pilihan07 == 1) {
                inputDataPegawai07(totalPegawai07);
            } else if (pilihan07 == 2) {
                lihatSlipGaji07();
            } else if (pilihan07 == 3) {
                System.out.println("\nTerima kasih!");
            }
        }
    }
    
    static void tampilkanMenu07() {
        System.out.println("\n---------------------------------------------------");
        System.out.println("1. Input/Edit Data Pegawai");
        System.out.println("2. Lihat Slip Gaji Pegawai");
        System.out.println("3. Keluar");
        System.out.println("---------------------------------------------------");
        System.out.print("Pilih menu (1-3): ");
    }
    
    static void inputDataPegawai07(int totalPegawai07) {
        String lanjut07 = "y";
        
        while (lanjut07.equals("y") && jumlahPegawai07 < totalPegawai07) {
            tampilkanDaftarPegawai07(totalPegawai07);
            
            System.out.print("\nPilih pegawai (1-" + totalPegawai07 + "): ");
            int nomor07 = Christ.nextInt();
            Christ.nextLine();
            
            int slotPegawai07 = nomor07 - 1;
            
            if (slotPegawai07 >= totalPegawai07 || slotPegawai07 < 0) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }
            
            if (slotPegawai07 < jumlahPegawai07) {
                System.out.println("Pegawai terpilih: " + dataPegawaiString07[slotPegawai07][1] + " / " + dataPegawaiString07[slotPegawai07][0]);
            } else {
                System.out.println("Pegawai terpilih: (Belum diisi) / -");
            }
            
            inputDetailPegawai07(slotPegawai07);
            
            if (slotPegawai07 == jumlahPegawai07) {
                jumlahPegawai07++;
            }
            
            
            System.out.print("\nInput pegawai lagi? (y/n): ");
            lanjut07 = Christ.nextLine();
        }
        
        if (jumlahPegawai07 >= totalPegawai07) {
            System.out.println("Kapasitas pegawai penuh!");
        }
    }
    
    static void tampilkanDaftarPegawai07(int totalPegawai07) {
        System.out.println(" DAFTAR PEGAWAI ");
        for (int i = 0; i < totalPegawai07; i++) {
            if (i < jumlahPegawai07) {
                System.out.println((i + 1) + ". " + dataPegawaiString07[i][1] + " / " + dataPegawaiString07[i][0]);
            } else {
                System.out.println((i + 1) + ". (Belum diisi) / -");
            }
        }
       
    }
    
    static void inputDetailPegawai07(int slotPegawai07) {
        System.out.println(" INPUT DATA PEGAWAI No. " + (slotPegawai07 + 1));
        
        System.out.print("Nama : ");
        String nama07 = Christ.nextLine();
        
        System.out.print("NIK  : ");
        String nik07 = Christ.nextLine();
        
        System.out.print("Gaji Pokok (>0): ");
        double gajiPokok07 = Christ.nextDouble();
        Christ.nextLine();
        
        System.out.print("Menikah? (y/n): ");
        String menikah07 = Christ.nextLine();
        
        int anak07 = 0;
        if (menikah07.equals("y")) {
            System.out.print("Jumlah Anak: ");
            anak07 = Christ.nextInt();
            Christ.nextLine();
        } else {
            System.out.println("Jumlah Anak: 0");
        }
        
        System.out.println("Lama Kerja (tahun):");
        int lamaKerja07 = Christ.nextInt();
        Christ.nextLine();
        
        dataPegawaiString07[slotPegawai07][0] = nik07;
        dataPegawaiString07[slotPegawai07][1] = nama07;
        dataPegawaiString07[slotPegawai07][2] = menikah07;
        gajiPokok07Array[slotPegawai07] = gajiPokok07;
        anak07Array[slotPegawai07] = anak07;
        lamaKerja07Array[slotPegawai07] = lamaKerja07;
        
        System.out.println("[OK] Data pegawai disimpan.");
    }
    
    static void lihatSlipGaji07() {
        if (jumlahPegawai07 == 0) {
            System.out.println("\nBelum ada data pegawai!");
            return;
        }
        
        System.out.println(" DAFTAR PEGAWAI ");
        for (int i = 0; i < jumlahPegawai07; i++) {
            System.out.println((i + 1) + ". " + dataPegawaiString07[i][1] + " / " + dataPegawaiString07[i][0]);
        }
        
        System.out.print("\nPilih pegawai (1-" + jumlahPegawai07 + "): ");
        int nomor07 = Christ.nextInt();
        Christ.nextLine();
        
        int slotPegawai07 = nomor07 - 1;
        
        if (slotPegawai07 >= 0 && slotPegawai07 < jumlahPegawai07) {
            System.out.println("Pegawai terpilih: " + dataPegawaiString07[slotPegawai07][1] + " / " + dataPegawaiString07[slotPegawai07][0]);
            cetakSlipGaji07(slotPegawai07);
        } else {
            System.out.println("Pegawai tidak ditemukan!");
        }
    }
    
    static void cetakSlipGaji07(int slotPegawai07) {
        String nama07 = dataPegawaiString07[slotPegawai07][1];
        String nik07 = dataPegawaiString07[slotPegawai07][0];
        double gajiPokok07 = gajiPokok07Array[slotPegawai07];
        String menikah07 = dataPegawaiString07[slotPegawai07][2];
        int anak07 = anak07Array[slotPegawai07];
        int lamaKerja07 = lamaKerja07Array[slotPegawai07];
        
        double tunjanganIstri07 = 0;
        if (menikah07.equals("y")) {
            tunjanganIstri07 = gajiPokok07 * 0.10;
        }
        
        int totalAnak07 = anak07;
        if (totalAnak07 > 3) {
            totalAnak07 = 3;
        }
        double tunjanganAnak07 = gajiPokok07 * 0.02 * totalAnak07;
        
        double bonus07 = 0;
        if (lamaKerja07 > 10) {
            bonus07 = gajiPokok07 * 0.10;
        }
        
        double gajiKotor07 = gajiPokok07 + tunjanganIstri07 + tunjanganAnak07 + bonus07;
        double pajak07 = gajiKotor07 * 0.05;
        double gajiBersih07 = gajiKotor07 - pajak07;
        
        System.out.println("SLIP GAJI ");
        System.out.println("Nama : " + nama07);
        System.out.println("NIK  : " + nik07);
        System.out.println("-------------------------------------------");
        System.out.println("Gaji Pokok          : Rp" + formatAngka07(gajiPokok07));
        System.out.println("Tunjangan Istri     : Rp" + formatAngka07(tunjanganIstri07));
        System.out.println("Tunjangan Anak      : Rp" + formatAngka07(tunjanganAnak07));
        System.out.println("Bonus               : Rp" + formatAngka07(bonus07));
        System.out.println("-------------------------------------------");
        System.out.println("Gaji Kotor (Gross)  : Rp" + formatAngka07(gajiKotor07));
        System.out.println("Pajak (5%)          : Rp" + formatAngka07(pajak07));
        System.out.println("-------------------------------------------");
        System.out.println("Gaji Bersih (Net)   : Rp" + formatAngka07(gajiBersih07));
    }
        
    
    static String formatAngka07(double angka07) {
        return String.format("%,.2f", angka07);
    }
}