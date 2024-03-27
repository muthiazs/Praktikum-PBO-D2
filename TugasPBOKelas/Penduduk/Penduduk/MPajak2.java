public class MPajak2 {
    public static void main(String[] args) {
        Departemen D1 = new Departemen("Pendidikan",4000000);
        PNS P1 = new PNS("1234","Andi","1001",10,"2222",D1);
        Wirausaha P2 = new Wirausaha("1235","Arif","1002",10,"2221",400000000);
        Petani P3 = new Petani("1236","Budi","Bogor","Teh");
        // Penduduk P4 = new Penduduk("1237", "Didi"); //kalo Penduduk bukan abstract, bisa new
        
        P1.cetakInfo();
        P2.cetakInfo();
        P3.cetakInfo();
        // P4.cetakInfo();
        
        System.out.println("Jumlah PNS = " + PNS.getJmlPNS());
        System.out.println("Jumlah Wirausaha = " + Wirausaha.getJmlWirausaha());
        System.out.println("Jumlah Petani = " + Petani.getJmlPetani());
    }
}
