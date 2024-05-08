/* Deskripsi : program penggunaan 
 * objek ArrayList sebagai Collection class
 */

 import java.util.ArrayList;

 public class ArrayListTest {
 
    public static void main(String[] args) {
        //inisialisasi arraylist yang berisi string
        ArrayList<String> strings = new ArrayList<String>();
        //menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //menghapus elemen 
        strings.remove(("praktikum"));
        //iterasi pada keseluruhan array list 
        for(String s : strings){
            System.out.println(s +" ");
        }
    }
 }