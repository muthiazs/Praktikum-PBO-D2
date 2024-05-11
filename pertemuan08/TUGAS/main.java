public class main {
    public static void main(String[] args) {
        ulat k;
        data<kupu> anu;

        k = new ulat();
        anu = new data<>();
        anu.setIsi(k);
        anu.getIsi().gerak();
        anu.setIsi(new kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new kupuDewasa());
        anu.getIsi().gerak();
    }
}
