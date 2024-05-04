/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author ACER
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;

    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
    }

    private String getBunyi(){
        return bunyi;
    }

    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    private boolean isMenusuk(){
        return menusuk;
    }

    private void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

    public void menembak(int jumlah){
        for (int i = 0; i < jumlah; i++){
            System.out.print(this.getBunyi() + " ");
        }
        System.out.println("");
    }

    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet Sudah Terpasang");
    }

    public String menusuk(){
        if (this.isMenusuk()){
            return "Jleb!";
        } else {
            return "Gagal, belum di pasang bayonet nya";
        }
    }

}
