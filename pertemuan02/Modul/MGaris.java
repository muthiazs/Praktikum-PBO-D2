public class MGaris {

    public static void main(String[] args){
        Garis G1;
        Garis G2;
        Titik t1;
        Titik t2;
        Titik t3;
    
        
        t1 = new Titik(5,2);
        t2 = new Titik(7,4);
        t3 = new Titik(10,6);

        G1 = new Garis(t1,t2);
        G2 = new Garis(t1,t3);

        Garis refleksiYG1 = G1.getRefleksiGarisY();

        System.out.printf("Panjang garis G1 adalah %.2f\n" , G1.getPanjang());
        System.out.printf("Panjang garis G2 adalah %.2f\n" , G2.getPanjang());
        System.out.printf("Gradien garis G1 adalah %.2f\n" , G1.getGradien());
        System.out.printf("Gradien garis G2 adalah %.2f\n" , G2.getGradien());
        System.out.printf("Refleksi garis G1 terhadap sumbu y adalah t1(%.2f , %.2f) dan t2(%.2f , %.2f)\n" , refleksiYG1.getTitikAwal().getAbsis() , refleksiYG1.getTitikAwal().getOrdinat() , refleksiYG1.getTitikAkhir().getAbsis() , refleksiYG1.getTitikAkhir().getOrdinat());
        System.out.println("G1 dan G2 tegak lurus : " + G1.isTegakLurus(G2));
       





    }
}
