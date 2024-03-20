//Nama : Muthia Zhafira Sahnah 
//Nama File : Lingkaran.java  
//Deskripsi : kelas implementasi IArea berupa cara menghitung luas lingkaran 


import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(){
    }
    
    public Lingkaran(double r ){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
