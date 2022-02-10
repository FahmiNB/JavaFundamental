package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListPlanetdan {
    static public void main(String[] args){
        //deklarasi array
        String[] heroes =new String[2];
        heroes[0] = "Fahmi";
        heroes[1] = "Silvi";

        //menggunakan ArrayList
        List<String> planet = new ArrayList<>();
        // method add() untuk menambahkan objek ke List
        planet.add("Mercury");
        planet.add("Venus");
        planet.add("Earth");
        planet.add("Mars");// objek lainnya masih bisa terus ditambahkan ke List

        System.out.println("List planet awal");
        for (int i = 0; i < planet.size(); i++){
            // method size() untuk mendapatkan ukuran List
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-" + i +" = " + planet.get(i));
        }

        planet.remove("Venus");// method remove() untuk mengeluarkan objek dari List

        System.out.println("List planets akhir");
        for (int i = 0; i < planet.size(); i++){
            System.out.println("\t index-" + i +" = " + planet.get(i));
        }
    }
}
