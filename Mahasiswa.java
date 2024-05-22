/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    //atribute
    String nama;
    String npm;
    int umur;
    
    //constructor
    //Method yang akan dijalankan pertama kali oleh object ketika dijalankan
    public Mahasiswa(String namaMahasiswa, String kodeNpm, int umurMahasiswa){
        nama = namaMahasiswa;
        npm = kodeNpm;
        umur = umurMahasiswa;
    }
    
    public void tampilkanMahasiswa(){
        System.out.println("Nama mahasiswa :" + nama);
        System.out.println("Kode mahasiswa :" + npm);
        System.out.println("Umur mahasiswa :" + umur);
    }
}
