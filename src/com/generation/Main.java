package com.generation;

import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;

public class Main {

    public static void main(String[] args) {

        Ave ave = new Ave("petirrojo");
        System.out.println(ave.getNombre());
        //ave.comunicarse();
        //ave.hacerNido();
        //ave.comer();

        System.out.println("---------------------------------------------");

        Perro lomito = new Perro("Pulgas");
        //lomito.jugar();
        //lomito.comer();

        /*Animal animal = new Animal();
        animal.comer();
        animal.hacerNido();*/


    }
}
