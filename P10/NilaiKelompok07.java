package P10;
import java.util.Scanner;

public class NilaiKelompok07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        int nilai;
        float totalNilai,rataNilai;

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
       i++;
        
        
            

    }
    
      
    }
}
