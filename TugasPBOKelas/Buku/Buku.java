
public class Buku extends Item {
    private String penerbit;
    private int jumlahHalaman;
    private int harga;

    private static int jmlBuku = 0;

    public Buku(String kode, String judul, String penulis, int tahun, String penerbit, int jumlahHalaman, int harga) {
        super(kode, judul, penulis, tahun);
        this.penerbit = penerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
        jmlBuku++;
    }

    public static int getJmlBuku() {
        return jmlBuku;
    }

    public void cetakInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun: " + tahun);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Harga: " + harga);
        System.out.println("Harga Jual: " + getHargaJual());
        System.out.println();
    }

    public double getHargaJual() {
        return harga * 1.11; // Harga ditambah PPN 11%
    }
}
