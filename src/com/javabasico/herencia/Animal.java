package com.javabasico.herencia;

public class Animal {
    private double peso;

    public Animal() {
        System.out.println("ANIMAL-Creo un animal");
    }

    public double getPeso() {
        return this.peso;
    }

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
