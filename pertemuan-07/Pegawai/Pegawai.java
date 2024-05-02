package Pegawai;

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000; // Gaji pokok default

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    // Menghitung total gaji (implementasi default)
    public int hitungGaji() {
        return gajiPokok;
    }

    public void printData() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}

