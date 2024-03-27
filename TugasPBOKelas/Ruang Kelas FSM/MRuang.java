public class MRuang {
    public static void main(String[] args) {
        // Membuat objek RuangDepartemen
        RuangDepartmen rd1 = new RuangDepartmen("FSM105", 6, 10, 4, 25, "Informatika", "Retno K");
        // Membuat objek RuangKelas
        RuangKelas rk1 = new RuangKelas("B203", 5, 8, 4, 20, 18, 2); //18 kursi baik, 2 kursi rusak
        // Membuat objek RuangDosen
        RuangDosen rdos1 = new RuangDosen("FSME301", 3, 2, 4, 2, "Aris Puji"); //3 kursi, 2 meja
        // Membuat objek LabKomputer
        LabKomputer rlk1 = new LabKomputer("LKIFE01", 10, 10, 4, 40, "Lab IF E01", 40); //40PC
        // Membuat objek LabNonKomputer
        LabNonKomputer rlnk1 = new LabNonKomputer("LNKFIF01", 10, 10, 4, 30, "Lab FISIKA F01", 3); //3Makul
        
        rd1.getDetailsRuang(); //termasuk biaya kebersihannya
        System.out.println("\n");
        rk1.getDetailsRuang(); //termasuk biaya kebersihannya
        System.out.println("\n");
        rdos1.getDetailsRuang(); //termasuk biaya kebersihannya
        System.out.println("\n");
        rlk1.getDetailsRuang(); //termasuk biaya kebersihannya dan biaya sewanya
        System.out.println("\n");
        rlnk1.getDetailsRuang(); //termasuk biaya kebersihannya dan biaya sewanya
        System.out.println("\n");

        System.out.println("Jumlah Ruang = " + Ruangan.getCounterRuang());
        System.out.println("Jumlah Ruang Departemen = " + RuangDepartmen.getCounterRuangDepartemen());
        System.out.println("Jumlah Ruang Kelas = " + RuangKelas.getCounterRuangKelas());
        System.out.println("Jumlah Ruang Dosen = " + RuangDosen.getCounterRuangDosen());
        System.out.println("Jumlah Laboratorium = " + Laboratorium.getCounterRuangLaboratorium());
        System.out.println("Jumlah Lab Komputer = " + LabKomputer.getCounterRuangLabKom());
        System.out.println("Jumlah Lab Non Komputer = " + LabNonKomputer.getCounterRuangLabNonKom());
    }
}
