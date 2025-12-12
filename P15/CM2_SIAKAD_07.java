package P15;

import java.util.Scanner;
import java.util.ArrayList;

public class CM2_SIAKAD_07 {

    public static String[] MATA_KULIAH = {
            "Pancasila",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Bahasa Inggris 1",
            "Fisika",
            "Matematika Dasar",
            "Konsep Teknologi Informasi",
            "Keselamatan dan Kesehatan Kerja",
            "Critical thinking dan problem solving"
    };

    public static int[] SKS = { 2, 2, 3, 2, 2, 2, 2, 2, 2 };
    public static Scanner Chris = new Scanner(System.in);
    public static ArrayList<DataMahasiswa> daftarMahasiswa = new ArrayList<>();

    public static class DataMahasiswa {
        String nama;
        String nim;
        double[] nilaiAngka;
        String[] nilaiHuruf;
        double[] nilaiSetara;
        double[] bobot;
        int totalSKS;
        double totalBobot;
        double IP;
        String status;

        DataMahasiswa(String nama, String nim, double[] nilaiAngka) {
            this.nama = nama;
            this.nim = nim;
            this.nilaiAngka = nilaiAngka;
            prosesNilai();
        }
        

        public void prosesNilai() {
            nilaiHuruf = new String[nilaiAngka.length];
            nilaiSetara = new double[nilaiAngka.length];
            bobot = new double[nilaiAngka.length];
            totalSKS = 0;
            totalBobot = 0;

            for (int i = 0; i < nilaiAngka.length; i++) {
                nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
                nilaiSetara[i] = konversiNilaiSetara(nilaiAngka[i]);
                bobot[i] = nilaiSetara[i] * SKS[i];
                totalSKS += SKS[i];
                totalBobot += bobot[i];
            }

            IP = totalBobot / totalSKS;
            status = tentukanStatus();
        }

        String tentukanStatus() {
            for (String nilai : nilaiHuruf) {
                if (nilai.equals("E")) {
                    return "TIDAK LULUS (Terdapat Nilai E)";
                }
            }

            if (nilaiHuruf[0].equals("C") || nilaiHuruf[0].equals("C+") ||
                    nilaiHuruf[0].equals("D") || nilaiHuruf[0].equals("E")) {
                return "TIDAK LULUS (Nilai Pancasila kurang dari B)";
            }

            if (IP < 2.00) {
                return "TIDAK LULUS (IP minimal harus 2,00)";
            }

            return "LULUS";
        }
    }

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            tampilkanMenu();
            int pilihan = inputPilihan();

            switch (pilihan) {
                case 1:
                    inputNilaiMahasiswa();
                    break;
                case 2:
                    lihatKHS();
                    break;
                case 3:
                    running = false;
                    System.out.println("\nTerima kasih telah menggunakan sistem SIAKAD!");
                    break;
                default:
                    System.out.println("\n[ERROR] Pilihan tidak valid!");
            }
        }

    }

    public static void tampilkanMenu() {
        System.out.println("SISTEM SIAKAD SEDERHANA (MENU) : ");
        System.out.println("1. Input nilai mata kuliah");
        System.out.println("2. Lihat KHS (konversi & IP + status)");
        System.out.println("3. Keluar");

    }

    public static int inputPilihan() {
        System.out.print("Pilih menu (1-3): ");
        return Chris.nextInt();
    }

    public static void inputNilaiMahasiswa() {
        Chris.nextLine();

        System.out.println("\nDaftar Mahasiswa:");
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("1. (belum diisi) ");
            System.out.println("2. (belum diisi) ");
            System.out.println("3. (belum diisi) ");
        } else {
            for (int i = 0; i < daftarMahasiswa.size(); i++) {
                DataMahasiswa mhs = daftarMahasiswa.get(i);
                System.out.println((i + 1) + ". " + mhs.nama + " / " + mhs.nim);
            }
            if (daftarMahasiswa.size() < 3) {
                for (int i = daftarMahasiswa.size(); i < 3; i++) {
                    System.out.println((i + 1) + ". (belum diisi) ");
                }
            }
        }

        System.out.print("Pilih nomor mahasiswa (1-3): ");
        int nomor = Chris.nextInt();
        Chris.nextLine();

        System.out.println("=== INPUT NILAI MAHASISWA ===");
        System.out.print("Nama : ");
        String nama = Chris.nextLine();
        System.out.print("NIM  : ");
        String nim = Chris.nextLine();

        double[] nilaiAngka = new double[MATA_KULIAH.length];
        boolean valid = true;

        System.out.println("\nMasukkan nilai (0 - 100) untuk mata kuliah berikut:");
        for (int i = 0; i < MATA_KULIAH.length; i++) {
            System.out.print((i + 1) + ". " + MATA_KULIAH[i] + ": ");
            nilaiAngka[i] = Chris.nextDouble();

            if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                System.out.println("\n[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100.");
                valid = false;
                break;
            }
        }

        if (valid) {
            System.out.println("\n[OK] Semua nilai berhasil dimasukkan.");

            DataMahasiswa mhs = new DataMahasiswa(nama, nim, nilaiAngka);

            if (nomor - 1 < daftarMahasiswa.size()) {
                daftarMahasiswa.set(nomor - 1, mhs);
            } else {
                daftarMahasiswa.add(mhs);
            }
        }
    }

    public static void lihatKHS() {
        Chris.nextLine();

        if (daftarMahasiswa.isEmpty()) {
            System.out.println("\n[ERROR] Belum ada data mahasiswa!");
            return;
        }

        System.out.println("\nDaftar Mahasiswa:");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            DataMahasiswa mhs = daftarMahasiswa.get(i);
            System.out.println((i + 1) + ". " + mhs.nama + " / " + mhs.nim);
        }

        System.out.print("Pilih nomor mahasiswa (1-" + daftarMahasiswa.size() + "): ");
        int nomor = Chris.nextInt();

        if (nomor < 1 || nomor > daftarMahasiswa.size()) {
            System.out.println("\n[ERROR] Nomor mahasiswa tidak valid!");
            return;
        }

        DataMahasiswa mhs = daftarMahasiswa.get(nomor - 1);
        tampilkanKHS(mhs);
    }

    public static void tampilkanKHS(DataMahasiswa mhs) {
        System.out.println(" HASIL KONVERSI NILAI MAHASISWA");
        System.out.println("Nama : " + mhs.nama);
        System.out.println("NIM  : " + mhs.nim);
        System.out.printf("%-4s %-38s %4s %7s %6s %6s\n",
                "No", "Mata Kuliah", "SKS", "Nilai", "Huruf", "Setara");

        for (int i = 0; i < MATA_KULIAH.length; i++) {
            System.out.printf("%-4d %-38s %4d %7.1f %6s %6.1f\n",
                    (i + 1), MATA_KULIAH[i], SKS[i], mhs.nilaiAngka[i],
                    mhs.nilaiHuruf[i], mhs.nilaiSetara[i]);
        }

        System.out.printf("Total SKS   : %d\n", mhs.totalSKS);
        System.out.printf("Total Bobot : %.2f\n", mhs.totalBobot);
        System.out.printf("Indeks Prestasi (IP): %.2f\n", mhs.IP);
        System.out.println("Status Semester : " + mhs.status);

    }

    public static String konversiNilaiHuruf(double nilai) {
        if (nilai > 80)
            return "A";
        else if (nilai > 73)
            return "B+";
        else if (nilai >= 65)
            return "B";
        else if (nilai >= 60)
            return "C+";
        else if (nilai >= 50)
            return "C";
        else if (nilai >= 39)
            return "D";
        else
            return "E";
    }

    public static double konversiNilaiSetara(double nilai) {
        if (nilai > 80)
            return 4.0;
        else if (nilai > 73)
            return 3.5;
        else if (nilai >= 65)
            return 3.0;
        else if (nilai >= 60)
            return 2.5;
        else if (nilai >= 50)
            return 2.0;
        else if (nilai >= 39)
            return 1.0;
        else
            return 0.0;
    }
}
