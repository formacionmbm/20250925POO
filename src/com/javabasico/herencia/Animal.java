package com.javabasico.herencia;

public class Animal {
    protected double peso;

    public Animal(){
        System.out.println("Animal");
    }

    public void nacer() {
        System.out.println("Animal-naci!!!");
    }

    public void vivir() {
        System.out.println("Animal-vivo");
    }

    public void morir() {
        System.out.println("Animal-he muerto");
    }


}
