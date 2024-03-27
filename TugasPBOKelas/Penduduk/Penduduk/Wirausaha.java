
public class Wirausaha extends WajibPajak {

    private String noSIUP;
    private double omzet;
    private static int jmlWirausaha;

    public Wirausaha(){
        jmlWirausaha++;
    }
    
    public Wirausaha(String noKTP, String nama, String npwp, double tarifPajak, String noSIUP, double omzet) {
        super(noKTP, nama, npwp, tarifPajak);
        this.noSIUP = noSIUP;
        this.omzet = omzet;
        jmlWirausaha++;
    }

    public String getNoSIUP() {
        return noSIUP;
    }

    public double getOmzet() {
        return omzet;
    }

    public static int getJmlWirausaha() {
        return jmlWirausaha;
    }

    @Override
    public void cetakInfo() {
        System.out.println("WIRAUSAHA");
        super.cetakInfo();
        System.out.println("NPWP : " + getNpwp());
        System.out.println("Tarif : " + getTarifPajak());
        System.out.println("Pajak : " + hitungPajak());
        System.out.println("SIUP : " + getNoSIUP());
        System.out.println("Omzet : " + getOmzet());
    }

    @Override
    public double hitungPajak() {
        return (getTarifPajak() / 100) * getOmzet();
    }
}
