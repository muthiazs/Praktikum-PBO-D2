package Pegawai;

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    public int getBonus() {
        return bonus;
    }

    // Override hitungGaji untuk menyertakan bonus
    @Override
    public int hitungGaji() {
        return super.getGajiPokok() + bonus;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Bonus: " + bonus);
    }
}
