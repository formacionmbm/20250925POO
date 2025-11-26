package com.javabasico.herencia;

/**
 * Clase que representa un Animal
 * @author Fernando Navas
 * @version 1.0
 */
public class Animal {
    private double peso;

    public double getPeso() {
        return this.peso;
    }

    /**
     * Método para cambiar la variable peso
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void nacer() {
        System.out.println("ANIMAL-Nazco");
    }

    public void vivir() {
        System.out.println("ANIMAL-Vivo");
    }

    public void morir() {
        System.out.println("ANIMAL-Morir");
    }
}
