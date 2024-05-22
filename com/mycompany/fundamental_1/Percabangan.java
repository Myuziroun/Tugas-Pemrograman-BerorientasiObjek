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
public class Percabangan {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        int nilaiUjian;
        String grade ;
//        Untuk Menginput nilai ujian (INT)
        System.out.print("Masukkan nilai ujian : ");
        nilaiUjian = s.nextInt();
//        Kondisi ketika sudah memasukkan nilaii ujian
        if (nilaiUjian == 100) {
           grade = "SS";
        } else if (nilaiUjian >= 90){
            grade = "S";
        } else if (nilaiUjian >= 80 && nilaiUjian < 90){
            grade = "A";
        } else if (nilaiUjian >= 70 && nilaiUjian <80){
            grade = "B";
        } else if (nilaiUjian >= 50 && nilaiUjian < 70){
            grade = "C";
        } else if(nilaiUjian >= 10 && nilaiUjian < 50){
            grade = "D";
        }else {
            grade = "anda Sudah dipastikan di lolos ";         
        }
//        untuk menampilkan hasil perkodisian 
        System.out.println("Grade : " + grade);
    }
}
