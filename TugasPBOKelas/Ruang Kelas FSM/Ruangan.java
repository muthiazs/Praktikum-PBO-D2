public abstract class Ruangan{
    private String kode;
    private int panjang;
    private int lebar;
    private int tinggi;
    private int kapasitas;
    public static int counterRuang = 0;


    //Konstruktor
    protected Ruangan(String kode, int panjang, int lebar, int tinggi, int kapasitas){
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }

    protected Ruangan(){
        kode = "0000";
        panjang = 0;
        lebar = 0;
        tinggi = 0; 
        kapasitas = 0;
    }

    public void getDetailsRuang(){
        System.out.println("kode ruang: " + kode);
        System.out.println("panjang ruang: " + panjang);
        System.out.println("lebar ruang: " + lebar);
        System.out.println("tinggi ruang: " + tinggi);
        System.out.println("kapasitas ruang: " + kapasitas);
    }


    public double hitungVolume() {
        return getPanjang()  * getLebar() * getTinggi();
    }

    public double hitungBiayaKebersihan() {
        double volume = hitungVolume();
        return volume * 500 * 71;
    }

    //set get method 
    public String getKode(){
        return kode;
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public int getPanjang(){
        return panjang;
    }

    public void setPanjang( int panjang){
        this.panjang = panjang;
    }

    public int getLebar(){
        return lebar;
    }

    public void setLebar( int lebar){
        this.lebar = lebar;
    }

    public int getTinggi(){
        return tinggi;
    }

    public void setTinggi( int tinggi){
        this.tinggi = tinggi;
    }

    public int getKapasitas(){
        return kapasitas;
    }

    public void setKapasitas( int kapasitas){
        this.kapasitas = kapasitas;
    }

    public static int getCounterRuang() {
        return counterRuang;
    }
}