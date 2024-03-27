public class LabNonKomputer extends Laboratorium {
    private int jumlahMatakuliah;
    private static int counterRuangLabNonKom = 0;

    public LabNonKomputer(){
        super();
        jumlahMatakuliah = 0;
        counterRuangLabNonKom++;
        counterRuang++;
    }

    public LabNonKomputer(String kode, int panjang, int lebar, int tinggi, int kapasitas, String namaLaboratorium, int jumlahMatakuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLaboratorium);
        this.jumlahMatakuliah = jumlahMatakuliah;
        counterRuangLabNonKom++;
        counterRuang++;
    }

    @Override
    public double hitungBiayaSewa() {
        // Misalnya, biaya sewa per matakuliah adalah Rp. 500.000
        double biayaPerMatakuliah = 500000;
        return jumlahMatakuliah * biayaPerMatakuliah;
    }

    public void getDetailsRuang(){
        super.getDetailsRuang();
        System.out.println("jumlah mata kuliah : " + jumlahMatakuliah);
    }

    public static int getCounterRuangLabNonKom() {
        return counterRuangLabNonKom;
    }
}
