public abstract class Penduduk {
    //atribut
    private String noKTP;
    private String nama;

    //konstruktor
    protected Penduduk() {
    }

    protected Penduduk(String noKTP, String nama) {
        this.noKTP = noKTP;
        this.nama = nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public void cetakInfo() {
        System.out.println("Nomor KTP: " + getNoKTP());
        System.out.println("Nama: " + getNama());
    }
}
