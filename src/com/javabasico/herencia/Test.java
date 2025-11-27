package com.javabasico.herencia;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(); /*sino tenemos ningún constructor, ponemos el de por defecto*/
        animal1.nacer();

        Dalmata dalmata1 = new Dalmata(); /*sino tenemos ningún constructor, ponemos el de por defecto*/
        dalmata1.nacer();

    }
}
