/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author Lenovo
 */
public class AnimalTest {
    public static void main(String args[]){
        Animal animal = new Animal("Nasi", "Hoeemmm");
        animal.makan();
        animal.bersuara();
        
        Cat Anggora = new Cat("Ikan", "Miaww.Miaww", "Anggora");
        
        Anggora.makan();
        Anggora.bersuara(); 
    }
}
