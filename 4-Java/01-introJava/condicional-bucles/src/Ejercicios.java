import java.util.Scanner;
/*
            Problema 1
            La salida tiene que ser la siguiente:
            *
            **
            ***
            ****
            *****

            Problema 2
            *****
            ****
            ***
            **
            *

            Problema 3
            Pedirle al usuario la cantidad de estrellitas y la direccion
        */


public class Ejercicios {
    public static void main(String[] args) {
        //Problema 01
        System.out.println("Problema 01");
        for(int i=0; i<=5; i++)
        {
            for(int j=0; j<i; j++) {
                System.out.print('*');
            }
            System.out.println(' ');
        }


        //Problema 02
        System.out.println("\nProblema 02");
        for(int i=5; i>0; i--)
        {
            for(int j=i; j>0; j--) {
                System.out.print('*');
            }
            System.out.println(' ');
        }

        //Problema 03
        System.out.println("\nProblema 3:");

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero maximo de asteriscos:");

        int numAsteriscos = leer.nextInt();
        System.out.println("\nPara orden ascendente ingrese 1. Para orden desendente ingrese 2.");

        int opcion = leer.nextInt();
        switch (opcion){
            case 1:
                for(int i=0; i<numAsteriscos; i++){
                    for(int j=0; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                for(int i=numAsteriscos; i>0; i--){
                    for(int j=i; j>0; j--){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            default:
                System.out.println("Opcion Incorrecta");
        }


    }
}
