package Vehicle;

public class Car extends Vehicle {
    @Override
    public float calRent(int distance, float price) {
        return super.calRent(distance, price) - 100.00f;
    }
}
