/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Family;

/**
 *
 * @author Lenovo
 */
public class main {
    public static void main(String[]args){
        Parent Ayah = new Parent("Ilham",40,"Ayah");
        Parent Ibu = new Parent("Yuki",39, "Ibu");
        Child anak1 = new Child("Bambang",15,"Satu", "Laki - Laki");
        Child anak2 = new Child("Agus", 9, "Dua", "Laki - Laki");
        
        Ayah.asParent();
        Ibu.asParent();
        anak1.asChild();
        anak2.asChild();
    }
}
