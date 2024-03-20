//Nama : Muthia Zhafira Sahnah
//Nama File : MBujurSangkar.java  
//Deskripsi : kelas yang memngimplementasikan cara menghitung luas bujur sangkar 

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar" + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}
