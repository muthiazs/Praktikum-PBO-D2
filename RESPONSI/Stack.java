//Nama = Muthia Zhafira Sahnah 
//NIM = 24060122130071 
//Responsi tanggal 27/03/2024

public abstract class Stack extends List {
    protected Stack(){

    }

    public Object getTop(){
        return getElmt(getSize()-1);
    }
    
    @Override
    public void del(){
        list.removeLast();
    }
    
    @Override
    public void cetak(){
        int i;
        //mencetak elemen dari top hingga elemen pertama
        for(i=getSize()-1; i >= 0; i--){
            System.out.println(getElmt(i));
    }
    }
}
