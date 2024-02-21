public class Mtitik {
public static void main(String[] args){
    Titik t1;
    Titik t2;
    Titik t3;

    t1 = new Titik();
    t1.setAbsis(2);
    t1.setOrdinat(5);

    t2 = new Titik();
    t2.setAbsis(3);
    t2.setOrdinat(4);

    //Pemanggilan dengan overloadeing constructor 
    t3 = new Titik(5,6);

    int counterTitik = Titik.getCounterTitik();

    System.out.printf("Jumlah Objek titik yang ada %d\n" , counterTitik);
    System.out.printf("Titik t1 memiliki absis %.2f, dan ordinat %.2f\n", t1.getAbsis(),t1.getOrdinat());
    System.out.printf("Titik t2 memiliki absis %.2f, dan ordinat %.2f\n" , t2.getAbsis() , t2.getOrdinat());
    System.out.printf("Titik t3 memiliki absis %.2f, dan ordinat %.2f" , t3.getAbsis() , t3.getOrdinat());
}
}