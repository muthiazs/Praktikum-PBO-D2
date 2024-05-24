public class Superman extends Kryptonian {
    String name;

    Superman(String name) {
        this.name = name;
    }

    public void takeOff() {
        System.out.println(name + " sedang mengambil ancang-ancang untuk terbang");
    }

    public void land() {
        System.out.println(name + " sedang mendarat");
    }

    public void fly() {
        System.out.println(name + " sedang terbang");
    }

    public void leapBuilding() {
        System.out.println(name + " sedang melompati gedung");
    }

    public void stopBullet() {
        System.out.println(name + " sedang menghentikan peluru");
    }
}