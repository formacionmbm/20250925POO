package com.javabasico.herencia;

public class Perro extends Mamifero{
    public Perro(){
        System.out.println("Perraco");
    }

    public void nacer(int numeroPatas){
        System.out.println("He nacido como chucho con " + numeroPatas);
    }
}
