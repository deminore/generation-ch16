package com.deme.h_abstracta;

public class Triangulo extends FigurasGeometricas {
    private float base;
    private float altura;

    // Constructor
    public Triangulo(){

    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    // Se sobreescribe
    @Override
    public float area() {
        //return (base * altura)/2;
        return (getBase() * getAltura())/2;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
}
