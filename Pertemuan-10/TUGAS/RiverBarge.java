class RiverBarge extends Vehicle {
    double maxLoad;

    public RiverBarge(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad*150;
    }

    public double calcTripDistance() {
        // Implementasi khusus untuk menghitung jarak perjalanan RiverBarge
        return 0.0;
    }
}