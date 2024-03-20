//Nama : Muthia Zhafira Sahnah 
//Nama File : MLingkaran.java  
//Deskripsi : implementasi cara menghitung luas lingkaran 
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari : ");
        double jejari = scan.nextDouble();
        Lingkaran L = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " adalah "+ L.hitungLuas());
    }
}
