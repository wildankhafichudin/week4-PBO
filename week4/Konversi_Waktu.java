/*
 * Nama     : Wildan Khafichudin
 * Nim      : A11.2021.13750
 * Kelas    : A11.4412 
 */

package week4;
import java.util.Scanner;

public class Konversi_Waktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan detik : ");
        int waktuDalamDetik = input.nextInt();
        int hari = 0, jam = 0, menit = 0;

        hari = waktuDalamDetik / 86400;

        waktuDalamDetik = waktuDalamDetik - (hari * 86400);

        jam = waktuDalamDetik / 3600;

        waktuDalamDetik = waktuDalamDetik - (jam * 3600);

        menit = waktuDalamDetik / 60;

        waktuDalamDetik = waktuDalamDetik - (menit * 60);

        //System.out.println("Days : "+hari +" Hours:"+ jam +" Minutes:"+ menit +" Seconds:"+ waktuDalamDetik);
        
        System.out.println(hari+" Hari");
        System.out.println(jam+" Jam");
        System.out.println(menit+" Menit");
        System.out.println(waktuDalamDetik+" Detik");
    }
}