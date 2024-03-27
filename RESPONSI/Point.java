//Nama = Muthia Zhafira Sahnah 
//NIM = 24060122130071 
//Responsi tanggal 27/03/2024

public class Point {
    private double absis;
    private double ordinat;

    public Point(double x, double y){
        this.absis = x;
        this.ordinat = y;
    }
    public Point(){
        absis = 0; 
        ordinat = 0;
    }

    public double getAbsis(){
        return absis;
    }

    public void setAbsis(double x){
        this.absis = x;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public void setOrdinat(double y){
        this.ordinat = y;
    }

    public void cetak(){
        System.out.println("(" + absis + "," + ordinat + ")");
    }

}
