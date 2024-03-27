public class RuangDepartmen extends Ruangan {
    private String namaDepartmen;
    private String ketuaDepartmen;
    private static int counterRuangDepartemen = 0;

    public RuangDepartmen(){
        super();
        namaDepartmen = " ";
        ketuaDepartmen = " ";
        counterRuangDepartemen ++;
        counterRuang ++;
    }

    public RuangDepartmen(String kode, int panjang, int lebar, int tinggi, int kapasitas, String namaDepartmen, String ketuaDepartmen){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDepartmen = namaDepartmen;
        this.ketuaDepartmen = ketuaDepartmen;
        counterRuangDepartemen ++;
        counterRuang ++;
    }


    public void getDetailsRuang(){
        System.out.println("---Menampilkan data ruang departmen---");
        System.out.println("nama departmen : " + namaDepartmen);
        System.out.println("nama ketua departmen : " + ketuaDepartmen);
        super.getDetailsRuang();
        System.out.println("volume ruang " + hitungVolume());
        System.out.println("biaya kebersihan : " + hitungBiayaKebersihan());
    }

    public static int getCounterRuangDepartemen() {
        return counterRuangDepartemen;
    }

}
