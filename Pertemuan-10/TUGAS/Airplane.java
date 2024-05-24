class Airplane extends Vehicle implements Flyer {
    double maxLoad;

    Airplane() {
        maxLoad = maxLoad;
    }

    public void takeOff() {
        System.out.println("Pesawat sedang lepas landas");
    }

    public void land() {
        System.out.println("Pesawat sedang mendarat");
    }

    public void fly() {
        System.out.println("Pesawat sedang terbang");
    }

    public double calcFuelEfficiency() {
        // Implementasi khusus untuk menghitung efisiensi bahan bakar Airplane
        return maxLoad*100;
    }

    public double calcTripDistance() {
        // Implementasi khusus untuk menghitung jarak perjalanan Airplane
        return 0.0;
    }
}