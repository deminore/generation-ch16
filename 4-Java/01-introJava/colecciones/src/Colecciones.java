import java.util.ArrayList;
import java.util.List;

public class Colecciones {
    public static void main (String[] args){
        // List - Arraylist
        // Los valores se ordenan segun el orden en que los agrefuemos
        // Permiten tener valores duplicados
        // Es una colección de objetos de un mismo tipo

        List<String> meses = new ArrayList<String>();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add(1, "Abril");

        // Object mes = meses.remove(3); // Si no conozco el tipo de dato exacto puedo usar Object
        String mes = meses.remove(3);

        System.out.println(meses);
        System.out.println(mes);

        System.out.println(meses.get(0));
        System.out.println(meses.size());

        for (String elemento:meses) {
            System.out.println(elemento);
        }

        // List<int> numeros = new ArrayList<int>();

        int num1 = 10;
        Integer num2 = 10;

        System.out.println(num1+ 10);
        System.out.println(num2 - 5);
        System.out.println(num2.getClass().getSimpleName());

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(500);
        numeros.add(98);
        numeros.add(90);

        System.out.println(numeros);


    }
}
