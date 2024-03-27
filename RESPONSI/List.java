//Nama = Muthia Zhafira Sahnah 
//NIM = 24060122130071 
//Responsi tanggal 27/03/2024

import java.util.ArrayList;

public abstract class List{
    protected ArrayList<Object> list;

    List(){
        list = new ArrayList<>();
    }

    public int getSize(){
        return list.size();
    }
    
    public Object getElmt(int i){
        return list.get(i);
    }
    
    public abstract boolean cekElmtType(Object elmt);
    
    public void add(Object elmt) throws Exception{
        if(cekElmtType(elmt)){
            list.addLast(elmt);
        }else{
            throw new Exception("Tipe Elemen tidak sesuai !");
        }
    }
   
    public abstract void del();
    
    public abstract void cetak();
}