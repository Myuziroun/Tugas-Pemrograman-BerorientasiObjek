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
public class InptutKeyBoard {
    public static void main (String args []){
        Scanner s = new Scanner(System.in);
        String nama;
        String alamat;
        int tahunLahir;
        int tahunSekarang;
        
//        Untuk memasukkan inputan Tahun sekarang (INT)
        System.out.print("Masukkan Tahun sekarang : ");
        tahunSekarang = s.nextInt();
//        Untuk memasukkan input Tahun Lahir (INT)
        System.out.print("Masukkan Tahun lahir : ");
        tahunLahir = s.nextInt();
//        Untuk memasukkan nama (String)
        System.out.print("Masukkan nama : ");
        nama = s.nextLine();
//        Untuk memasukkan alamat (Stirng)
        System.out.print("Masukkan alamat : ");
        alamat = s.nextLine();
        
//        Untuk melakukan operator matematika
        int umurSekarang = tahunSekarang - tahunLahir;
        String umurStr = String.valueOf(umurSekarang);
        
        
        System.out.println("Selamat datang " + nama + " dari " + alamat);
        System.out.println("Umur Sekaranga adalah : " + umurStr);
                
    }
}
