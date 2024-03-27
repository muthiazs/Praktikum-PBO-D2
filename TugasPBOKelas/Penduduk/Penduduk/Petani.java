public class Petani extends Penduduk {
    //atribut
    private String kotaAsal;
    private String jenisTani;
    private static int jmlPetani;

    //konstruktor
    Petani(){
        jmlPetani++;
    }

    Petani(String noKTP, String nama, String kotaAsal, String jenisTani){
        super(noKTP, nama);
        this.kotaAsal = kotaAsal;
        this.jenisTani = jenisTani;
        jmlPetani++;
    }

    //method
    public String getKotaAsal() {
        return kotaAsal;
    }

    public String getJenisTani() {
        return jenisTani;
    }

    public static int getJmlPetani() {
        return jmlPetani;
    }

    @Override
    public void cetakInfo() {
        System.out.println("WIRAUSAHA");
        super.cetakInfo();
        System.out.println("Kota : " + getKotaAsal());
        System.out.println("Jenis Tani : " + getJenisTani());
    }
}
