//Nama = Muthia Zhafira Sahnah 
//NIM = 24060122130071 
//Responsi tanggal 27/03/2024

public class QueueOfPoints extends Queue {
    public QueueOfPoints(){
    }
    
    @Override
    public boolean cekElmtType(Object elmt){
        return (elmt instanceof Point);
    }
    
    @Override
    public void cetak(){
        int i;
        for(i=0; i < getSize(); i++){
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
    public Point getHead(){
       return (Point)super.getHead();
    }
    
    @Override
    public Point getTail(){
       return (Point)super.getTail();
    }
}