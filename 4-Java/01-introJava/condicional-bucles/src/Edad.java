import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {

        //Determinar si una es mayor de edad

        Scanner escaner = new Scanner(System.in);
        System.out.println("Escribe tu edad: ");
        int edad = escaner.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }


        String resultado = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(resultado);
    }
}
