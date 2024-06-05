package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ACER
 */
public class MysqlMahasiswaService {
    private Connection koneksi;

    // Constructor
    public MysqlMahasiswaService() {
        this.koneksi = MysqlUtility.getConnection();
    }

    /** Membuat objek mahasiswa dari ResultSet */
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }

    /** Menambahkan data mahasiswa ke database */
    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (nama) VALUES (?)";
        try (PreparedStatement stmt = koneksi.prepareStatement(query)) {
            stmt.setString(1, mhs.getNama());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Update data mahasiswa di database */
    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement stmt = koneksi.prepareStatement(query)) {
            stmt.setString(1, mhs.getNama());
            stmt.setInt(2, mhs.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Delete data mahasiswa sesuai id di database */
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement stmt = koneksi.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Ambil mahasiswa sesuai id dari database */
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement stmt = koneksi.prepareStatement(query)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    mhs = makeMhsObject(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }

    /** Ambil semua isi tabel mahasiswa dari database */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                mahasiswaList.add(mhs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mahasiswaList;
    }

    /** Reset indeks tabel mahasiswa ke 1 */
    public void indexReset() {
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try (Statement stmt = koneksi.createStatement()) {
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Memeriksa apakah tabel kosong */
    public boolean isEmpty() {
        boolean isEmpty = true;
        String query = "SELECT COUNT(*) AS count FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next() && rs.getInt("count") > 0) {
                isEmpty = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isEmpty;
    }

    /** Menutup koneksi ke DB */
    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
