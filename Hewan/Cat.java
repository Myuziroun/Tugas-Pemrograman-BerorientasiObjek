/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author Lenovo
 */
class Cat extends Animal{
    String jenisKucing;
    public Cat(String makanan, String suara, String jenisKucing){
        super(makanan,suara);
        this.jenisKucing = jenisKucing;
        System.out.println("Terbentuk Kucing" + jenisKucing);
    }
    void makan(){
        System.out.println("Kucing memakan" + this.makanan);
    }
    void bersuara(){
        System.out.println("Kucing Suaranya" + this.suara);
    }
}
