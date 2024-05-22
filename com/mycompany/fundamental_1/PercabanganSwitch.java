/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamental_1;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class PercabanganSwitch {
    public static void main(String Args []){
        char grade = 'C';
        
        switch(grade) {
            case 'A' :
                System.out.println("Nilai mu BAGUSS!!!");
                break;
            case 'B' :
                System.out.println("Nilai mu LUMANYAN");
                break;
            case 'C' :
                System.out.println("Nilai mu Pas - Pasan");
                break;
            case 'D' :
                System.out.println("Nilai mu Hampir Gagal");
                break;
            case 'F' :
                System.out.println("Nilai mu Gagal");
                break;
            default :
                System.out.println("Lu salah nilai Kocak !!!");
        }
//        System.out.println("Tingkatan mu adalah : " + grade);
    }
}
