/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fundamental_1;

/**
 *
 * @author Lenovo
 */
public class Fundamental_1 {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
          String nama = "Alif";
          String kampus = "Unimma";
          int umur = 20;
          System.out.println("nama saya adalah :" + nama);
          System.out.println("kampus saya di :" + kampus);
          System.out.println("Umur saya :" + umur + "Tahun");
         
//                  Cara 1 inisiasi Array (tanpa alokasi memori)
         String hari [] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
         System.out.println("Sekarang hari " + hari[3]);
//         Cara 2 inisiasi Array (Alokasi memori)
        String arrayHari[] = new String [7];
        arrayHari[0] = "Senin";
        arrayHari[1] = "Selasa";
        arrayHari[2] = "Rabu";
        arrayHari[3] = "Kamis";
        arrayHari[4] = "Jum'at";
        arrayHari[5] = "Sabtu";
        arrayHari[6] = "Minggu";
        
        System.out.println("HARI INI ADALAH HARI " + arrayHari[0]);
        
//        boolean
        int x = 3;
        int y = 6;
        System.out.println(x>y);
        System.out.println(3<6);
        
//        pecahan (float dan double)

        float pi = 3.141592f; //        float bisa 7 angka di belakang koma
        double pI = 3.141592653589793;
        
        double hasil = 22/7;
        System.out.println("Hasil 22/7 adalah %.2f " + hasil);
        
//        pertemuan ke 3

   
    }
    
}

