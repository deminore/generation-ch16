import java.util.Objects;
import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        // Buecle controlado: se donde comienza y donde termina
        for (int i=0; i<10; i++)
        {
            System.out.println(i);
        }


        // Bucle no controlado
        String condicion = "";
        Scanner sc = new Scanner(System.in);


        // == != estamos comparando datos primitivos
        //La condicion se debe modificar dentro del while
        // Mientras la condición
        while (!Objects.equals(condicion, "Hola")){
            System.out.println("Salúdame");
            condicion = sc.next();
        }
        

        //do-while es igual al while pero se ejecuta al menos una vez el código antes de verificar la condición

    }
}


