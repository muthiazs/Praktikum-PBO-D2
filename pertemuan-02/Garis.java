
public class Garis {
    private Titik TitikAwal;
    private Titik TitikAkhir;

public Garis(Titik TitikAwal, Titik TitikAkhir) {
    this.TitikAwal = TitikAwal;
    this.TitikAkhir = TitikAkhir;
}

public void setTitikAwal(Titik t_awal){
    TitikAwal = t_awal;
}

public void setTitikAkhir(Titik t_akhir){
    TitikAwal = t_akhir;
}

public Titik getTitikAwal(){
    return TitikAwal;
}

public Titik getTitikAkhir(){
    return TitikAkhir;
}

public double getPanjang(){
    double x = TitikAkhir.getAbsis()-TitikAwal.getAbsis();
    double y = TitikAkhir.getOrdinat()-TitikAwal.getOrdinat();
    return Math.sqrt(x*x + y*y);
}

public double getGradien(){
    double x = TitikAkhir.getAbsis()-TitikAwal.getAbsis();
    double y = TitikAkhir.getOrdinat()-TitikAwal.getOrdinat();
    return y/x;
}

public Garis getRefleksiGarisY(){
    Titik T1 = TitikAwal.getRefleksiY();
    Titik T2 = TitikAkhir.getRefleksiY();
    return new Garis(T1,T2);
}

public boolean isTegakLurus(Garis G){
    double gradien1 = this.getGradien();
    double gradien2 = G.getGradien();
    return gradien1 * gradien2 == -1;
}

}




