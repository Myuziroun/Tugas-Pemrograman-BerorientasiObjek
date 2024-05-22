/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class User {
    public String username;
    public String password;
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
}

class DemoUser {
    public static void main (String [] args){
        User pengguna1 = new User("Faiz","Faizkum");
        System.out.println("Username: " + pengguna1.username);
        System.out.println("Password: " + pengguna1.password);
    }
}