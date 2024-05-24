class SeaPlane extends Airplane {
    SeaPlane() {
        super();
    }

    public double calcFuelEfficiency() {
        return maxLoad * 100;
    }

    public double calcTripDistance() {
        // Implementasi khusus untuk menghitung jarak perjalanan SeaPlane
        return 0.0;
    }

    public String toString() {
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}