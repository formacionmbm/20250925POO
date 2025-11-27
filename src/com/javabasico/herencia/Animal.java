package com.javabasico.herencia;

public abstract class Animal{
    protected double peso;

    //Constructor/es
    public Animal(){
        System.out.println("Animal");
    }

    //Metodos de negocio
    public void nacer(){
        System.out.println("ANIMAL-Nazco!!");
    }

//    public void vivir(){
//        System.out.println("ANIMAL-Vivo!!");
//    }

    public void morir(){
        System.out.println("ANIMAL-He muerto");
    }
}
