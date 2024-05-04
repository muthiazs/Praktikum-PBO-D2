package Pegawai;
public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        super(nama);
    }

    public int getTunjangan() {
        return tunjangan;
    }

    // Override calculateSalary untuk menyertakan tunjangan
    @Override
    public int hitungGaji() {
        return super.getGajiPokok() + tunjangan;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
