package com.javabasico.herencia;

public class Animal {
    protected double peso;

    public Animal (){
        System.out.println("Animal");
    }

    public void nacer(){
        System.out.println("ANIMAL - Nazco");
    }
    public void vivir(){
        System.out.println("ANIMAL - Vivo");
    }
    public void morir(){
        System.out.println("ANIMAL - Muero");
    }
}
