package MiSaludo;

import java.util.Scanner;

public class Saludo {
    public void saludar (){
        System.out.println("Hola. Ingresa tu nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre + ". Te saludo desde POO");
    }
}
