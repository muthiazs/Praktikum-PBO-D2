// Nama : Muthia Zhafira S 
// NIM : 24060122130071
// Lab : D2
// 10a nomer 3 a

// Polimorfisme Ad Hoc menggunakan kemampuan method overloading. 
// Ini berarti kita dapat memiliki beberapa metode dengan nama yang sama dalam sebuah kelas, 
// namun dengan parameter yang berbeda. 
// Syarat-syarat untuk mendapatkan method overloading adalah:
// 1. Nama method harus sama.
// 2. Daftar parameter harus berbeda dalam hal jumlah atau tipe data parameter.
// 3. Tidak peduli tipe pengembalian (return type), yang membedakan adalah daftar parameter.

//CONTOH
public class pertemuan6_a {
    public void print(int num) {
        System.out.println("Printing an integer: " + num);
    }

    public void print(double num) {
        System.out.println("Printing a double: " + num);
    }

    public void print(String str) {
        System.out.println("Printing a string: " + str);
    }
}
