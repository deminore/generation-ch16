import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);

        System.out.println("i + j = " + (i + j));
        System.out.println("i + j = " + i + j);

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i - j));

        int multi = i * j;
        System.out.println("multi = " + multi);
        System.out.println("i * j = " + (i * j));

        // int div = i / j;
        // System.out.println("div = " + div);
        // float div1 = i / j;

        int div = i / j;
        System.out.println("div = " + div); // Se imprime uno porque div sólo esta declarado como entero y solo muestra los enteros

        float div1 = (float) i / (float) j; // tenemos que convertir i, j a flotantes para poder recibir un flotante.
        System.out.println("div1 = " + div1);


        int residuo = i % j;
        System.out.println("residuo = " + residuo);
        residuo = 8 % 5;
        System.out.println("residuo = " + residuo);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Cual es tu nombre");
        String dato = scanner.next();

        System.out.println(" Cual es tu edad");
        String dato1 = scanner.next();
        int edad = Integer.parseInt(dato1);

        System.out.println(" Mi nombre es: "  + dato);
        System.out.println(" Y mi edad es: "  + edad);


    }
}
