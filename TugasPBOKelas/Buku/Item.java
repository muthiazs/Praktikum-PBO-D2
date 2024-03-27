public class Item {
    protected String kode;
    protected String judul;
    protected String penulis;
    protected int tahun;

    public Item(String kode, String judul, String penulis, int tahun) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }
}
