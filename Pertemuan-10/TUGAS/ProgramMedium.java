import java.util.ArrayList;
import java.util.List;

public class ProgramMedium {
    public static void main(String[] args) {
        Truck truck = new Truck();
        System.out.println(truck);

        SeaPlane sPlane = new SeaPlane();
        System.out.println(sPlane);

        Helicopter copter = new Helicopter();
        System.out.println(copter);

        System.out.println("####################################");

        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        //Menambahkan kedndaraan ke kelompok armada yang sesuai 
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("jumlah Armada Truck: " + armadaTruck.size());
        armadaSeaPlane.add(sPlane);
        System.out.println("jumlah Armada SeaPlane: " + armadaSeaPlane.size());
        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("jumlah Armada Helicopter: " + armadaHelicopter.size());
        System.out.println("####################################");

        // Membuat objek ArmadaKendaraan
        ArmadaKendaraan armadaKendaraan = new ArmadaKendaraan();

        // Menambahkan dan mencetak jumlah kendaraan
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println(">>Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println(">>Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println(">>Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
    }
}
