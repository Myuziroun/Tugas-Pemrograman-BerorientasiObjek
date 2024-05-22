/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author Lenovo
 */
public class Main {
    
    public static void main(String[] args){
        Hewan hewan = new Hewan();
        System.out.println("Apakah hewan IS-A Object -->" + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -->" + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -->" + (hewan instanceof Kucing));
        
        System.out.println("======================================");
        
        Kucing kucing = new Kucing();
        System.out.println("Apakah hewan IS A OBjek -->" + (kucing instanceof Object));
        System.out.println("Apakah hewan IS A Hewan -->" + (kucing instanceof Hewan));
        System.out.println("Apakah hewan IS A Kucing -->" + (kucing instanceof Kucing));
        
        System.out.println("======================================");
        hewan.makan();
        kucing.makan();
        kucing.makan("daging ikan");
        
        System.out.println("======================================");
        
        Kucing meow = new Kucing("Ocicat", "Tropis");
        Kucing puss = new Kucing("Ocicat", "SubTropis");
        Kucing popo = new Kucing("Anggora", "Subtropis");
        
        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());
        
        System.out.println("Meow equals puss ? " + meow.equals(puss));
        System.out.println("Meow equals popo ? " + meow.equals(popo));
       
        System.out.println("======================================");
        
        Object o = new Kucing();
        Hewan h = new Kucing();
        Kucing k = new Kucing();
        
        Object object = k;
        Hewan hewanK = k;
        
        Kucing kucingK = (Kucing) h;
        kucingK.makan();
        
        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau; 
    }
}
