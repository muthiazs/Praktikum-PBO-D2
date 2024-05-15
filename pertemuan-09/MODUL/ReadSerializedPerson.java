/*File:                                                            ReadSerializedPerson.java
Deskripsi: Program untuk deserialisasi objek Person */

import java.io.*;

public class ReadSerializedPerson {

    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);

            person = (Person) s.readObject();

            System.out.println("serialized person name="+person.getName());
            s.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
