import java.util.ArrayList;
import java.util.Collection;

public class ArmadaKendaraan {
    private ArrayList<Vehicle> daftarArmada;

    public ArmadaKendaraan() {
        daftarArmada = new ArrayList<>();
    }

    // Method untuk menambahkan armada
    public void tambahArmada(Collection<? extends Vehicle> armada) {
        daftarArmada.addAll(armada);
    }

    // Method untuk mengambil semua kendaraan
    public ArrayList<Vehicle> getAllArmada() {
        return daftarArmada;
    }


}
