package com.javabasico.herencia;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Animal {
    protected double peso;

    public void nacer () {
        System.out.println("ANIMAL-Nazco");
    }
    public void vivir () {
        System.out.println("ANIMAL-Vivo");
    }
    public void morir () {
        System.out.println("ANIMAL-He muerto");
    }
}
