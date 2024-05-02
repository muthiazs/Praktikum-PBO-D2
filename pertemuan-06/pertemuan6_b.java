// Nama : Muthia Zhafira S 
// NIM : 24060122130071
// Lab : D2
// 10a nomer 3 b


/* 
Nomor 1 
public class Main{
	public static void main(String[] args) {
		int output = 'a';
		System.out.println(output);
	}
 }

 Output : 97 

 Ini berhasil dieksekusi. Ini karena karakter 'a' memiliki nilai ASCII yang sesuai. 
 Dalam kasus ini, 'a' diubah menjadi bilangan bulat sesuai dengan nilai ASCII-nya, 
 yang pada dasarnya adalah polimorfisme ad hoc melalui coercion.

 Nomor 2
 public class Main
{
	public static void main(String[] args) {
        double x = 15.5;
        int output = x;
		System.out.println(output);
	}
}

Output : Main.java:13: error: incompatible types: possible lossy conversion from double to int
        int output = x;
                     ^
1 error

Gagal dieksekusi. Ini karena penugasan langsung dari tipe data double ke tipe data int tanpa casting eksplicit,
 yang merupakan downcasting dan membutuhkan konversi eksplisit.

 Nomor 3 
 public class Main
{
	public static void main(String[] args) {
       int y = 25;
       double output = y;
	   System.out.println(output);
	}
}

Output : 25.0 

Berhasil dieksekusi. Ini karena ini adalah upcasting, 
yang dapat dilakukan secara otomatis tanpa perlu casting eksplisit.\

Nomor 4 
public class Main
{
	public static void main(String[] args) {
       int z = 78;
       char output = (char) z;
	   System.out.println(output);
	}
}

Output : N

Berhasil dieksekusi. Ini karena kita melakukan casting eksplicit dari int ke char. 
Dalam hal ini, kita mengubah kode ASCII 78 menjadi karakter yang sesuai,
 yang merupakan polimorfisme ad hoc melalui coercion.

 Nomor 5 
 public class Main
{
	public static void main(String[] args) {
        char a = 'a';
        double output = (double) a; // Mengkonversi nilai ASCII dari 'a' ke tipe data double
        System.out.println(output);

	}
}

Output : 97.0 

Ini adalah hasil dari konversi nilai ASCII dari karakter 'a' (97) ke tipe data double.

*/


