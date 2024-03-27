public abstract class WajibPajak extends Penduduk {
    private String npwp;
    private double tarifPajak;

    protected WajibPajak(){
    }

    protected WajibPajak(String noKTP, String nama, String npwp, double tarifPajak){
        super(noKTP, nama);
        this.npwp = npwp;
        this.tarifPajak = tarifPajak;
    }

    public String getNpwp() {
        return npwp;
    }

    public double getTarifPajak() {
        return tarifPajak;
    }

    public abstract double hitungPajak();
}
