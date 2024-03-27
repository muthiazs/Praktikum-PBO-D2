public class PNS extends WajibPajak {
    //atribut
    private String nip;
    private Departemen departemen;
    private static int jmlPNS;

    //konstruktor
    public PNS(){
        jmlPNS++;
    }
    public PNS(String noKTP, String nama, String npwp, int tarifPajak, String nip, Departemen departemen) {
        super(noKTP, nama, npwp, tarifPajak);
        this.nip = nip;
        this.departemen = departemen;
        jmlPNS++;
    }

    public String getNip() {
        return nip;
    }

    public Departemen getDepartemen() {
        return departemen;
    }

    public static int getJmlPNS(){
        return jmlPNS;
    }

    @Override
    public void cetakInfo() {
        System.out.println("PNS");
        super.cetakInfo();
        System.out.println("NPWP : " + getNpwp());
        System.out.println("Tarif : " + getTarifPajak());
        System.out.println("Pajak : " + hitungPajak());
        System.out.println("NIP : " + getNip());
        System.out.println("Departemen : " + departemen.getNama());
        System.out.println("GajiPokok : " + departemen.getGajiPokok());
    }

    @Override
    public double hitungPajak(){
        return (getTarifPajak() / 100) * departemen.getGajiPokok() * 12;
    }
}
