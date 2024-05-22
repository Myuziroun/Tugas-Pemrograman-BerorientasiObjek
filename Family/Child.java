/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Family;

/**
 *
 * @author Lenovo
 */
public class Child extends Person{
    private String NumberofChild;
    private String jenisKelamin;
    
    Child(String name, int age, String NumberofChild, String jenisKelamin){
        super(name,age);
        this.NumberofChild = NumberofChild;
        this.jenisKelamin = jenisKelamin;
    }
    void asChild(){
        System.out.println(
                "ini merupakan anak ke-" + this.NumberofChild 
                + ", nama dia adalah " + this.name  
                +", memiliki Jenis Kelamin " + this.jenisKelamin 
                +",dan umurnya adalah " + this.age + " Tahun"
        );
    }
    
}
