package P10;
import java.util.Scanner;

public class NilaiKelompok07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        int nilai,kelompokTertinggi=0;
        float totalNilai,rataNilai,rataTertinggi=0;

        int i =1;
        while (i<=6) {
            System.out.println("Kelompok"+i);
            totalNilai=0;
        for (int j=1;j<=5; j++) {
            System.out.print(" Nilai dari kelompok penilai " + j + ": ");
            nilai = Christ.nextInt();
            totalNilai += nilai;
        } 
        rataNilai=totalNilai/5;
        System.out.println("Kelompok "+ i +" nilai rata - rata :" + rataNilai);
        if (rataNilai>rataTertinggi) {
        rataTertinggi = rataNilai;
        kelompokTertinggi = i;
       }
       i++;
    }
     System.out.print(" Kelompok rata-rata tertinggi " + kelompokTertinggi + " rata-rata : " + rataTertinggi);
      
    }
}
