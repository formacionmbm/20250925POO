package com.javabasico.herencia;

public abstract class Animal implements IAnimal{

    protected double peso;

    public Animal() {
        System.out.println("Animal");
    }

    public void nacer(){
        System.out.println("Animal - Nacer");
    }

    public void vivir(){
        System.out.println("Animal - Vivir");
    }

    public void morir(){
        System.out.println("Animal - Morir");
    }

}
