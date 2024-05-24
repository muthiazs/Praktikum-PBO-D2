class Helicopter extends Vehicle implements Flyer {
    double maxLoad;

    Helicopter() {
        maxLoad = maxLoad;
    }

    public void takeOff() {
        System.out.println("Helicopter sedang lepas landas");
    }

    public void land() {
        System.out.println("Helicopter sedang mendarat");
    }

    public void fly() {
        System.out.println("Helicopter sedang terbang");
    }

    public double calcFuelEfficiency() {
        // Implementasi khusus untuk menghitung efisiensi bahan bakar Helicopter
        return maxLoad*100;
    }

    public double calcTripDistance() {
        // Implementasi khusus untuk menghitung jarak perjalanan Helicopter
        return 0.0;
    }
    public String toString() {
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
