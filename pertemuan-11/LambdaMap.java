import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String , String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("2406012213001 ," ,"Adi");
        mahasiswaMap.put("2406012213002 ," ,"Bambang");
        mahasiswaMap.put("2406012213003 ,","Cici");
        mahasiswaMap.put("2406012213004 ,","Didi");

        mahasiswaMap.forEach((nim, nama)-> System.out.println("NIM : " + nim + " Nama : " + nama));
    }
}
