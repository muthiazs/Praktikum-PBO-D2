package Vehicle;

public class Bus extends Vehicle {
    @Override
    public float calRent(int distance, float price) {
        float baseFare = super.calRent(distance, price);  // Call parent's calRent
        return baseFare - 200.00f;  // Apply discount
    }
}
