
public class LabKomputer extends Laboratorium {
    private int jumlahKomputer;
    private static int counterRuangLabKom = 0;

    public LabKomputer(){
        super();
        jumlahKomputer = 0;
        counterRuang++;
        counterRuangLabKom++;
    }

    public LabKomputer(String kode, int panjang, int lebar, int tinggi, int kapasitas, String namaLaboratorium, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLaboratorium);
        this.jumlahKomputer = jumlahKomputer;
        counterRuang++;
        counterRuangLabKom++;
    }

    @Override
    public double hitungBiayaSewa() {
        // Misalnya, biaya sewa per komputer adalah Rp. 200.000
        double biayaPerKomputer = 130071;
        return jumlahKomputer * biayaPerKomputer;
    }

    @Override
    public void getDetailsRuang() {
        super.getDetailsRuang();
        System.out.println("jumlah komputer : " + jumlahKomputer);
    }

    @Override
    public double hitungBiayaKebersihan() {
        double volume = hitungVolume();
        return volume * 500 * 71;
    }

    public static int getCounterRuangLabKom() {
        return counterRuangLabKom;
    }

}
