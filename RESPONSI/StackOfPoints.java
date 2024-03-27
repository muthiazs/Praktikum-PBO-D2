//Nama = Muthia Zhafira Sahnah 
//NIM = 24060122130071 
//Responsi tanggal 27/03/2024

public class StackOfPoints extends Stack{
    //constructor
    public StackOfPoints(){
    }
    
    //method
    @Override
    public boolean cekElmtType(Object elmt){
        return (elmt instanceof Point);
    }
    
    @Override
    public void cetak(){
        int i;
        for(i=getSize()-1; i >= 0; i--){
            if(getElmt(i) instanceof Point P){
                P.cetak();
            }
        }
    }
    
    @Override
    public Point getElmt(int i){
       return (Point)super.getElmt(i);
    }
    
    @Override
    public Point getTop(){
       return (Point)super.getTop();
    }
}