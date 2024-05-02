package Vehicle;

public class Main {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle kendaraan = new Vehicle();

        // Create Car and Bus objects and assign them to Vehicle variables
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        // Calculate and print rental fare for each vehicle
        System.out.println("Rental fare for kendaraan (Vehicle): " + kendaraan.calRent(50, 1000));
        System.out.println("Rental fare for mobil (Car): " + mobil.calRent(50, 1000));
        System.out.println("Rental fare for bis (Bus): " + bis.calRent(50, 1000));
    }
}