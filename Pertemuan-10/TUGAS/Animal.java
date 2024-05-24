abstract class Animal implements Flyer {
    void eat() {
        System.out.println("Sedang makan...");
    }

    public String toString() {
        return "Saya adalah hewan";
    }

    // Implementasi default dari metode interface Flyer
    public void takeOff() {}
    public void land() {}
    public void fly() {}
}