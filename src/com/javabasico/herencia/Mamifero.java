package com.javabasico.herencia;

public abstract class Mamifero extends Animal{
    public Mamifero(){
        System.out.println("Mamifero");
    }

    public void vivir(){
        System.out.println("Toma mamifero");
    }
}
