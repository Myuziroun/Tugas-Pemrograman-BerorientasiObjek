/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Kendaraan {
  String Merk1 = "Toyota avanza";
  String Warna1 = "Putih";
  int harga1 = 180_000_000;
  int cc1 = 1300;
  int jumlahPenumpang1 = 7;
  
  String Merk2 = "Honda Jazz";
  String Warna2 = "Merah";
  int harga2 = 250_000_000;
  int cc2 = 1500;
  int jumlahPenumpang2 = 5;
  
  void mobilSatu(){
      System.out.println(
      "Merk:" + Merk1 + ", " +
      "Warna:" + Warna1 + ", " +
      "Harga:" + harga1 + ", " +
       "CC:" + cc1 + ", " +
       "Jumlah Penumpang" + jumlahPenumpang1
      );
  }
  void mobilDua(){
      System.out.println(
      "Merk:" + Merk2 + ", " +
      "Warna:" + Warna2 + ", " +
      "Harga:" + harga2 + ", " +
       "CC:" + cc2 + ", " +
       "Jumlah Penumpang" + jumlahPenumpang2
      );
  }
  
  
}
