public abstract class Laboratorium extends Ruangan {
    protected static String namaLaboratorium;
    private static int counterRuangLaboratorium = 0;

    public Laboratorium(){
        super();
        namaLaboratorium = " ";
        counterRuangLaboratorium++;
    }
    
    public Laboratorium(String kode, int panjang, int lebar, int tinggi, int kapasitas, String namaLaboratorium) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        Laboratorium.namaLaboratorium = namaLaboratorium;
        counterRuangLaboratorium++;
    }

    // Metode abstrak untuk menghitung biaya sewa laboratorium
    public abstract double hitungBiayaSewa();

    // Getter dan setter untuk nama laboratorium
    public String getNamaLaboratorium() {
        return namaLaboratorium;
    }

    public void setNamaLaboratorium(String namaLaboratorium) {
        Laboratorium.namaLaboratorium = namaLaboratorium;
    }

    public void getDetailsRuang(){
        System.out.println("---Menampilkan data laboratorium---");
        System.out.println("nama lab : " + getNamaLaboratorium());
        super.getDetailsRuang();
        System.out.println("volume ruang " + hitungVolume());
        System.out.println("biaya kebersihan : " + hitungBiayaKebersihan());
        System.out.println("harga sewa : " + hitungBiayaSewa());
    }

    public static int getCounterRuangLaboratorium() {
        return counterRuangLaboratorium;
    }

}
