//Nama = Muthia Zhafira Sahnah 
//NIM = 24060122130071 
//Responsi tanggal 27/03/2024

public abstract class Queue extends List {
    public Queue(){

    }

    public Object getHead(){
        return getElmt(0);
    }

    public Object getTail(){
        return getElmt(getSize()-1);
    }

    @Override
    public void del(){
        list.removeFirst();
    }

    @Override
    public void cetak(){
        int i;
        //mencetak elemen dari head ke tail
        for(i=0; i<getSize(); i++){
            System.out.println(getElmt(i));
        }
    }
}
