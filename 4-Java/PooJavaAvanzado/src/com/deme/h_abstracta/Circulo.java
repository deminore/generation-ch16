package com.deme.h_abstracta;


public class Circulo extends FigurasGeometricas {
    private float radio;

    public Circulo(){

    }

    public Circulo (float radio){
        this.radio = radio;
    }
    @Override
    public float area() {
        return (float) (Math.PI*Math.pow(radio, 2));
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }
}
