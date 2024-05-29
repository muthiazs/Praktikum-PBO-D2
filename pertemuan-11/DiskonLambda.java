/*
 * File DiskonLambda.java
 * Deskripsi : Ekspresi Lambda dasar digunakan untuk menghitung diskon 
 */

 /**
  * DiskonLambda
  */

/**
 * InnerDiskonLambda
 */
interface InnerDiskonLambda {
  public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args) {
      //tanpa lambda
      InnerDiskonLambda diskonMerdeka = new InnerDiskonLambda() {
        public double hitungDiskon(int harga){
          return harga - (harga * 0.3 );
        }
      };
      //dengan lambda
      InnerDiskonLambda diskonLebaran = (harga) -> harga - (harga *0.4);
      // dengan lambda dengan blok statement
      InnerDiskonLambda diskonBiasa = (harga) -> {
        return harga - (harga*0.1);
      };
      System.out.println("Diskon Merdeka: "+ diskonMerdeka.hitungDiskon(45000));
      System.out.println("Diskon Lebaran: " +diskonLebaran.hitungDiskon(45000));
      System.out.println("Diskon Biasa: "+ diskonBiasa.hitungDiskon(45000));
    }
}