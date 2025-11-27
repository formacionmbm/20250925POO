package com.javabasico.herencia;

public class Animal {
    protected double peso;

    public Animal () {
        System.out.println("Soy la Clase Animal");
    }

    public void nacer(){
        System.out.println("Método Nacer()");
    }
    public void vivirAsiEsMorirDeAmor(){
        System.out.println("Método vivr de amor()");
    }
    public void morirDeAmor(){
        System.out.println("Método morir así es vivir de amor()");
    }
}
