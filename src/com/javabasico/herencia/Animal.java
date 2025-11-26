package com.javabasico.herencia;

import java.time.Clock;

public class Animal {
    protected double peso; /*protected para que puedan acceder las hijas, pero rpivado para los demás*/

    public void nacer() {
        System.out.println("ANIMAL-Nazco!");
    }

    public void vivr() {
        System.out.println("ANIMAL-Vivo!");
    }
    public void morir() {
        System.out.println("ANIMAL-Muerte!");
        }
}
