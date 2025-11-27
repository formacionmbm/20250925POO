package com.javabasico.herencia;

public class Perro extends Mamifero implements IPerro{
    public Perro(){
        System.out.println("Perraco");
    }

    public void nacer(int numeroPatas){
        System.out.println("He nacido como chucho con " + numeroPatas);
    }

    @Override
    public void ladrar() {
        System.out.println("GUAU GUAU!!");
    }
}
