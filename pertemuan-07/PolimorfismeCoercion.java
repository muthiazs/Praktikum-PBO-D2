public class PolimorfismeCoercion{
    public static int kuadrat(int bilangan){
        return bilangan*bilangan;
    }

    public static void main(String[] args) {
        //deklarasi objek integer
        Integer bilangan = 10;

        //objek integer 'dipaksa u/ diubah menjadi primitif'
        int hasilKuadrat = kuadrat(bilangan);

        System.out.println("hasil kuadrat " + bilangan + " adalah " + hasilKuadrat);
    }
}