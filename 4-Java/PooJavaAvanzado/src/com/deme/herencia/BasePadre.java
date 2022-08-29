package com.deme.herencia;

public class BasePadre {

    private int a;
    private double b;
    private String c;


    public BasePadre(){

    }

    public void visualizarA(){
        System.out.println("H -> Soy VISUALIZAR A");
        System.out.println("Soy un método de la clase BasePadre");
    }

    public void visualizarABC(){
        System.out.println("HO -> Soy VISUALIZAR ABC");
        System.out.println("Soy un método de la clase BasePadre");
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public String getC() {
        return c;
    }

}
