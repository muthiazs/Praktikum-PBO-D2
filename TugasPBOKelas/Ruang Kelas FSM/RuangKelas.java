public class RuangKelas extends Ruangan {
    private int jumlahKursi;
    private int jumlahKursiRusak;
    private static int counterRuangKelas = 0;

    public RuangKelas() {
        super(); 
        jumlahKursi = 0; 
        jumlahKursiRusak = 0; 
        counterRuang++; 
        counterRuangKelas++; 
    }
    
    public RuangKelas(String kode, int panjang, int lebar, int tinggi, int kapasitas, int jumlahKursi, int jumlahKursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahKursi = jumlahKursi;
        this.jumlahKursiRusak = jumlahKursiRusak;
        counterRuang++;
        counterRuangKelas++;
    }

    public int getJumlahKursi(){
        return jumlahKursi;
    }

    public int getJumlahKursiRusak(){
        return jumlahKursiRusak;
    }
    
    public void getDetailsRuang(){
        System.out.println("---Menampilkan data ruang kelas---");
        System.out.println("nama kelas : " + getKode());
        System.out.println("jumlah kursi : " + getJumlahKursi());
        System.out.println("jumlah kursi rusak : " + getJumlahKursiRusak());
        super.getDetailsRuang();
        System.out.println("volume ruang " + hitungVolume());
        System.out.println("biaya kebersihan : " + hitungBiayaKebersihan());
    }

    public static int getCounterRuangKelas() {
        return counterRuangKelas;
    }

    

}
