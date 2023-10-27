// package MODUL1.MODUL1_WAHYU.src;

import java.util.List;
import java.util.ArrayList;
import MODUL1.MODUL1_WAHYU.src.Konser;
public class Database {

    // TODO: Create List of Konser Object to Store Konser from Konser Class
    ArrayList<Konser> storeConcert = new ArrayList<>();
    // Konser firstConcert = new Konser();
    // Konser secondConcert = new Konser();



    // TODO: Create Method to insert Konser to Database
    public void addKonser( Konser konser){
        // String bandName = konser.getBandName();
        // String location = konser.getLokasi();
        // String date = konser.getTanggal();
        // float price = konser.getPrice();
        storeConcert.add(konser);


    }

    // TODO: Create Method to Show Konser from Database
    public void showData(Konser konser){
        // for (String storeConcert : storeConcert){
        //     System.out.println(storeConcert);
        // }
        System.out.println("Nama :"+ konser.getBandName());
        System.out.println("Lokasi :"+ konser.getLokasi());
        System.out.println("Tanggal :"+konser.getTanggal());
        System.out.println("Price :"+konser.getPrice());
    }

    // TODO: Create Method to Buy Ticket and Show the Total Price


}
