package com.deme.principal;

import com.deme.h_abstracta.Circulo;
import com.deme.h_abstracta.Triangulo;

public class EjemploFigurasG {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(5, 10);
        // System.out.println("t es el objeto de Triangulo: " + t.area());
        System.out.println(t);

        Circulo c = new Circulo(5);
        // c.setRadio(15.5f);
        // System.out.println("c es el objeto del Circulo: " + c.area());
        System.out.println(c);
    }
}
