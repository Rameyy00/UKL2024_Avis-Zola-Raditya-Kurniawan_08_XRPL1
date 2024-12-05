
package ukl;

import java.util.Random;
import java.util.Scanner;

public class UKL {



    public static void main(String[] args) {
    
        for (int i = 50; i > 0; i--) {
            if (i == 1) {
                System.out.println(i+". saya senang");
            } else if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println(i + ". saya anak moklet");
            } else {
                System.out.println(i + ". saya anak wikusama");
            }
        }

        

         Scanner input = new Scanner(System.in);
        Random viss = new Random();

        while (true) {
           
            int bilangan1 = viss.nextInt(100) + 1;
            int bilangan2 = viss.nextInt(100) + 1;
            int operator = viss.nextInt(3); 

            String simbol = "";
            int hasilBenar = 0;

            switch (operator) {
                case 0:
                    simbol = "*";
                    hasilBenar = bilangan1 * bilangan2;
                    break;
                case 1:
                    simbol = "/";
                    hasilBenar = bilangan1 / bilangan2; 
                    break;
                case 2:
                    simbol = "%";
                    hasilBenar = bilangan1 % bilangan2;
                    break;
            }

            
            System.out.printf("%d %s %d = ?%n", bilangan1, simbol, bilangan2);
            System.out.print("Masukkan jawaban Anda (atau ketik -0 untuk keluar): ");
            int jawaban = input.nextInt();


            
            if (jawaban == -0) {
                System.out.println("Kuis selesai. Terima kasih!");
                break;
            }

            
            if (jawaban == hasilBenar) {
                System.out.println("Jawaban benar!");
            } else {
                System.out.println("Jawaban salah. Jawaban yang benar adalah: " + hasilBenar);
            }
 }

Scanner scanner = new Scanner(System.in);

        int jumlahHariKerja = 0;

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        int totalKehadiran = 0;
        int[] hariHadir = new int[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            hariHadir[i] = scanner.nextInt();
            totalKehadiran += hariHadir[i];
        }

        int rataRata = totalKehadiran / jumlahSiswa;

        
        System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja: " + jumlahHariKerja + " Hari):");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + hariHadir[i] + " hari hadir");
        }

       
        System.out.println("\nRata-rata kehadiran siswa: " + rataRata + " hari");


    
        System.out.println("\nKesimpulan:");
        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] > rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }

        System.out.println("- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] < rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }
 



}
}
