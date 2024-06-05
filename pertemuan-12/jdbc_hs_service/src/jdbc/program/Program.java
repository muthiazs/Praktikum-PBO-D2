package jdbc.program;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");

        // Insert
        System.out.println("=== insert ===");
        Mahasiswa mhsAdd = new Mahasiswa(4, "Puji");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();
//
//        // Update
//        System.out.println("=== update ===");
//        Mahasiswa mhsUpdate = service.getById(2);
//        System.out.println("Akan diupdate data lama: " + mhsUpdate);
//        mhsUpdate.setNama("Dinaya");
//        System.out.println("dengan data baru: " + mhsUpdate);
//        service.update(mhsUpdate);
//        displayAll();

//        // Delete
//        System.out.println("=== delete ===");
//        System.out.println("akan di delete: " + service.getById(4));
//        service.delete(4);
//        displayAll();
    }

    public static void displayAll() {
        List<Mahasiswa> listmhs = service.getAll();
        for (Mahasiswa mhs : listmhs) {
            System.out.println(mhs);
        }
    }
}
