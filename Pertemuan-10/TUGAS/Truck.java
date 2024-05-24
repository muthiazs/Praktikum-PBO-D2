class Truck extends Vehicle {
    double maxLoad;

    public Truck() {
        maxLoad = maxLoad;
    }

    public double getTruckMaxLoad() {
        return maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad * 100; //anggap saja cara menghitungnya begini
    }

    public double calcTripDistance() {
        return 0;
    }

    public String toString() {
        return "Truk adalah angkutan darat yang sangat handal";
    }
}