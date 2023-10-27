// package MODUL1.MODUL1_WAHYU.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // TODO: Create Database Object
        Database db = new Database();
        
        Konser K1 = new Konser();
        K1.setBandName("Noah");
        K1.setLokasi("Sukabirus");
        K1.setPrice((float) 1000.0);
        K1.setTanggal("15-1-2023");

        db.addKonser(K1);
        db.showData(K1);


        // TODO: Create Konser Object and Set the Attributes


        // TODO: Insert Konser Object to Database


        // TODO: Display Greeting Message and Prompt User to Register


        // TODO: Create a User Object and Set the Attributes


        // TODO: Display Main Menu and Prompt User to Choose Menu
        
    }
}
