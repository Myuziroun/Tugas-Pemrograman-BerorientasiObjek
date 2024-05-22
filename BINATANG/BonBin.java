/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BINATANG;

/**
 *
 * @author Lenovo
 */
public class BonBin {
    static void test(Binatang x){
        x.makan();
        x.tidur();
    }
    public static void main(String[] args){
        Binatang gajah = new Gajah();
        Binatang kerbau = new Kerbau();
        test(kerbau);
        test(gajah);
    }
}
