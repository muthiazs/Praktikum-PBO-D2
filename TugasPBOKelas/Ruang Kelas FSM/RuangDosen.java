public class RuangDosen extends Ruangan {
    private String namaDosen;
    private static int counterRuangDosen = 0;

    public RuangDosen(){
        super();
        namaDosen = " ";
        counterRuangDosen++;
        counterRuang++;
    }


    public RuangDosen(String kode, int panjang, int lebar, int tinggi, int kapasitas, String namaDosen) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        counterRuangDosen++;
        counterRuang++;
    }

    // Metode untuk menampilkan informasi ruang dosen
    public void getDetailsRuang() {
        System.out.println("---Menampilkan data ruang dosen---");
        super.getDetailsRuang();
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
        System.out.println("volume ruang " + hitungVolume());
        System.out.println("biaya kebersihan : " + hitungBiayaKebersihan());
    }


    public static int getCounterRuangDosen() {
        return counterRuangDosen;
    }

}

