/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class OperasiAritmatika {
    public static void main(String [] args){
        
        int a = 10;
        int b = 7;
        boolean hasil;
//        Operasi Aritmatika +, - , / , *, ^ , %
        System.out.println("a + b : " + (a+b));
        System.out.println("a - b : " + (a-b));
        System.out.println("a / b : " + (a/b));
        System.out.println("a * b : " + (a*b));
        System.out.println("a % b : " + (a%b));
        System.out.println("  b^3 : " + Math.pow(7, 3));
//        Operasi pembanding
        hasil = (a != b);
        System.out.println(hasil);
        
//        Operasi Kondisional AND (&&), OR (||)
        int x = 4;
        int y = 7;
        boolean b1 = (x>y); 
        boolean b2 = (x == y ); 
        boolean banding = b1 && b2;
        System.out.println(banding);
        
        
        String s1 = "3";
        String s2 = "4";
        String s3 = s1 + s2;
        
        System.out.println(s3);
        
    }
    
}
