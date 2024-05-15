import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        //Membuat koneksi, nama db, user, password menyesuaikan 
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                         "jdbc:mysql://localhost:3306/pbo", "root", "" );
        //Kerjakan mysql query 
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi database 
        con.close();
    }
}
