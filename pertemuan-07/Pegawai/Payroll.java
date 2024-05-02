package Pegawai;

public class Payroll {
    public static void main(String[] args) {
        // Membuat objek Pegawai
        Pegawai pegawai1 = new Pegawai("Mira");
        Manajer manajer = new Manajer("Joko");
        Programmer programmer = new Programmer("Argo");

        // Menghitung dan mencetak gaji
        System.out.println("Data Pegawai:");
        pegawai1.printData();
        System.out.println("Total Gaji: " + pegawai1.hitungGaji());

        System.out.println("\nData Manajer:");
        manajer.printData();
        System.out.println("Total Gaji: " + manajer.hitungGaji());

        System.out.println("\nData Programmer:");
        programmer.printData();
        System.out.println("Total Gaji: " + programmer.hitungGaji());
    }
}

