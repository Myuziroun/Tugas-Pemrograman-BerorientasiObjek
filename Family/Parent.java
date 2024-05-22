/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Family;

/**
 *
 * @author Lenovo
 */
public class Parent extends Person {
    String myParent;
    Parent(String name, int age, String myParent){
        super(name,age);
        this.myParent = myParent;   
    }
    void asParent(){
        System.out.println("ini adalah "+ this.myParent + "ku, Nama dia adalah " + this.name + ",dan umurnya adalah " + this.age + " Tahun");
    }
}
