package com.generation.animales;

public class Perro extends Animal {

    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre) {
        super(nombre);
    }

    public void jugar() {
        System.out.println("Estoy jugando");
    }

    public void ladrar() {
        System.out.println("Gua");
    }

    @Override //se utiliza para indicar que se esta sobre escribiendo un metodo //
    public void comer() {
        System.out.println("Comiendo croquetas");
    }

    @Override
    public void respirar() {
        System.out.println("Estoy respirando por la nariz");
    }
}
