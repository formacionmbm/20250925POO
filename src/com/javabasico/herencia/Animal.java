package com.javabasico.herencia;

public class Animal {
    protected double peso;

    public void nacer() {
        System.out.println("Animal-Nazco");
    }

    public void vivir() {
        System.out.println("Animal-Vivo");
    }

    public void morir() {
        System.out.println("Animal-He muerto");
    }

}