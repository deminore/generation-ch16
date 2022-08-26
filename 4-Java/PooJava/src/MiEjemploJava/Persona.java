package MiEjemploJava;

import java.util.Scanner;

public class Persona {
    // Inicializados
    // String nombre = "Diana";
    // int edad = 24 ;
    // int nss = 2014050668;

    //Para inicilaizar con el constructor Persona
    private String nombre;
    private int edad;
    private int nss;

    // Constructor
    /*public Persona(String nuevonombre, int nuevaedad, int nuevonss) {
        this.nombre = nuevonombre;
        this.edad = nuevaedad;
        this.nss = nuevonss;
    }*/

    // Mutador - Para asignar valores a las variables sin usar el constructor
    public void setNombre() {
        System.out.println(" Ingresa un nombre: ");
        Scanner scName = new Scanner(System.in);
        String Name = scName.nextLine();
        this.nombre = Name;
    }

    public void setEdad() {
        System.out.println("Ingresa la edad: ");
        Scanner scAge = new Scanner(System.in);
        int Age = scAge.nextInt();
        this.edad = Age;
    }

    public void setNss() {
        System.out.println("Ingresa el nss: ");
        Scanner numSeg = new Scanner(System.in);
        int nSeg = numSeg.nextInt();
        this.nss = nSeg;
    }


    //Para obtener los valores de los atributos de la clase
    public String getNombre(){
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNss() {
        return nss;
    }

    public void Caminar(){ System.out.println("Caminando"); }

    public void Dormir(){ System.out.println("Durmiendo"); }


}
