public class Jurnal {
    private String namaJurnal;
    private String pengelola;
    private int hargaPerLembar;

    public Jurnal(String namaJurnal, String pengelola, int hargaPerLembar) {
        this.namaJurnal = namaJurnal;
        this.pengelola = pengelola;
        this.hargaPerLembar = hargaPerLembar;
    }

    public int getHargaPerLembar() {
        return hargaPerLembar;
    }

    public void Info(){
        System.out.println("nama jurnal : " + namaJurnal);
        System.out.println("pengelola : " + pengelola);
    }
}
