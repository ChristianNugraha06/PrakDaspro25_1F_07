package P7;


import java.util.Scanner;

public class CM {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        System.out.println("==== Biodata mahasiswa ====");
        System.out.print("Masukkan Nama:");
        String NamaMahasiswa = Christ.nextLine();
        System.out.print("Masukkan Nim:");
        String NimMahasiswa = Christ.nextLine();
        


        System.out.println("=== Masukkan nilai (0-100) ===");

        System.out.print("Nilai Pancasila:");
        int Pancasila = Christ.nextInt();
        System.out.print("Nilai Daspro:");
        int Daspro = Christ.nextInt();
        System.out.print("Nilai Bahasa inggris:");
        int BING = Christ.nextInt();
        
       double nilaiSetaraBING =0;
       double nilaiSetaraPancasila=0;
       double nilaiSetaraDaspro =0;

       int SKSpancasila =2;
        int SKSDaspro = 3;
        int SKSBING=2;

        if (Pancasila <0 || Daspro <0  || BING <0 || Pancasila >100 || Daspro > 100 || BING >100) {
            System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        }else {
        }
        if (Pancasila <=39) {
            nilaiSetaraPancasila = 0;
            System.out.println("E");
        }else if (Pancasila <=50 ) {
            nilaiSetaraPancasila = 1;
            System.out.println("D");
        }else if (Pancasila <=60) {
            nilaiSetaraPancasila = 2;
            System.out.println("C");
        }else if (Pancasila <=65) {
            nilaiSetaraPancasila = 2.5;
            System.out.println("C+");
        }else if (Pancasila <=73) {
            nilaiSetaraPancasila = 3;
            System.out.println("B");
        }else if (Pancasila <=80) {
            nilaiSetaraPancasila = 3.5;
            System.out.println("B+");
        }else if (Pancasila <=100) {
            nilaiSetaraPancasila = 4;
            System.out.println("A");
        }else {
            System.out.println("nilai tidak valid");
        }

        
        if (Daspro <=39) {
             nilaiSetaraDaspro = 0;
            System.out.println("E");
        }else if (Daspro <=50 ) {
            nilaiSetaraDaspro = 1;
            System.out.println("D");
        }else if (Daspro <=60) {
            nilaiSetaraDaspro = 2;
            System.out.println("C");
        }else if (Daspro <=65) {
             nilaiSetaraDaspro = 2.5;
            System.out.println("C+");
        }else if (Daspro <=73) {
            nilaiSetaraDaspro = 3;
            System.out.println("B");
        }else if (Daspro <=80) {
            nilaiSetaraDaspro = 3.5;
            System.out.println("B+");
        }else if (Daspro <=100) {
            nilaiSetaraDaspro = 4;
            System.out.println("A");
        }else {
            System.out.println("nilai tidak valid");
        }
             if (BING <=39) {
            nilaiSetaraBING = 0;
            System.out.println("E");
        }else if (BING <=50 ) {
            nilaiSetaraBING = 1;
            System.out.println("D");
        }else if (BING <=60) {
            nilaiSetaraBING = 2;
            System.out.println("C");
        }else if (BING <=65) {
            nilaiSetaraBING = 2.5;
            System.out.println("C+");
        }else if (BING <=73) {
            nilaiSetaraBING = 3;
            System.out.println("B");
        }else if (BING <=80) {
            nilaiSetaraBING = 3.5;
            System.out.println("B+");
        }else if (BING <=100) {
            nilaiSetaraBING = 4;
            System.out.println("A");
        }else {
            System.out.println("nilai tidak valid");
        }
        

        double bobot = (nilaiSetaraPancasila*SKSpancasila)+(nilaiSetaraDaspro*SKSDaspro)+(nilaiSetaraBING*SKSBING);
        double IPS = bobot/7;
        System.out.println("Total ips:"+IPS);
        String Status07="";
        if (IPS>=2.0) {
            if (Pancasila>50) {
                if (nilaiSetaraBING==0) {
                     Status07 = "tidak lulus ada nilai E";
                }else if (nilaiSetaraDaspro==0) {
                    Status07 = "tidak lulus ada nilai E";
                }else {
                    Status07 = "lulus";
                }
            }else {
                Status07 = "Tidak lulus nilai pancasila kurang dari C";
            }
        }else {
            System.out.println("Tidak lulus IPS anda kurang dari 2.0");
        }
        System.out.println("Status semester: " + Status07);
         
            
        }
    }   

        
            
        


       


        
        

        
    


    
        


        
            
        

        
       

       

       

       

        
        




        
    

