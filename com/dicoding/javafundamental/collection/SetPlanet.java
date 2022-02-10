package com.dicoding.javafundamental.collection;

import java.util.*;

public class SetPlanet {
    static public void main(String[] args){
        //Menggunakan HashSet
        Set<String> planets = new HashSet<>();

        planets.add("mercury"); // method add() untuk menambahkan objek ke Set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // menambahkan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("mars"); // objek bisa terus ditambahkan ke Set

        //method size() untuk mendapatkan ukuran set
        System.out.println("Set planet awal: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari Set

        System.out.println("Set planets akhir: (size =" + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ){
            //looping menggunakan iterator
            System.out.println("\t "+ iterator.next());

        }
    }
}
