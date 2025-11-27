package com.javabasico.herencia;

import java.time.Clock;

public class Animal {
    protected double peso; /*protected para que puedan acceder las hijas, pero rpivado para los demás*/

    public Animal() {
        System.out.println("Animal");
    }

    // método de negocio
    public void nacer() {
        System.out.println("ANIMAL-Nazco!");
    }

    // método de negocio
    public void vivr() {
        System.out.println("ANIMAL-Vivo!");
    }

    // método de negocio
    public void morir() {
        System.out.println("ANIMAL-Muerte!");
        }
}
