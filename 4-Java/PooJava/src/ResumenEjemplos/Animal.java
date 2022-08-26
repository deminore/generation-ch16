package ResumenEjemplos;

import java.util.Scanner;

public class Animal {
    String nombre;
    String raza;
    int edad;

    public Animal(){

    }
    public Animal(String nuevonombre) {nombre = nuevonombre;}

    public void setNombre() {
        System.out.println(" Ingresa el nombre del tu mascota: ");
        Scanner scName = new Scanner(System.in);
        String NameMasc = scName.nextLine();
        this.nombre = NameMasc;
    }

    public void setEdad(){
        System.out.println("Ingresa la edad de tu mascota: ");
        Scanner scAge = new Scanner(System.in);
        int Age = scAge.nextInt();
        this.edad = Age;
    }

    public void setRaza() {
        System.out.println(" Ingresa el nombre del tu mascota: ");
        Scanner scRaza = new Scanner(System.in);
        String RazaMasc = scRaza.nextLine();
        this.nombre = RazaMasc;
        this.raza = RazaMasc;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getRaza(){
        return raza;
    }

}
