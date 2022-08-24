import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *  - Crear una clase llamada Diccionario
 *
 *  - Crear un programa en Java que realice lo siguiente:
 *  Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
 *  Utilizar un objeto HashMap para almacenar los pares de palabras.
 *  Escoger al azar 5 palabras del mini diccionario.
 *  Pedir al usuario que teclee la palabra en inglés y que se imprima la traducción
 *
 *
 *
 * Extra:
 *  Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.
 *  Al final debe mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario.
 *
 * */


public class EjercicioDiccionario {
    public static void main(String[] args) {

        //Scanner teclado = new Scanner(System.in);
        //String scanner = teclado.nextLine();

        Map<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("manzana", "apple");
        diccionario.put("arbol", "tree");
        diccionario.put("mascota", "pet");
        diccionario.put("vaca", "cow");
        diccionario.put("rosa", "pink");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "kitten");
        diccionario.put("mariposa", "butterfly");
        diccionario.put("mosca", "fly");
        diccionario.put("verdura", "vegetable");
        diccionario.put("abeja", "bee");
        diccionario.put("sol", "sun");
        diccionario.put("nube", "cloud");
        diccionario.put("tierra", "ground");
        diccionario.put("mantequilla", "butter");
        diccionario.put("cocodrilo", "crocodile");
        diccionario.put("lampara", "lamp");
        diccionario.put("zapato", "shoe");
        diccionario.put("tenis", "sneakers");
        diccionario.put("coche", "car");
        diccionario.put("television", "television");
        diccionario.put("oso", "bear");
        diccionario.put("girasol", "sunflower");
        diccionario.put("servilleta", "napkin");
        diccionario.put("carpinteria", "carpentry");
        diccionario.put("madera", "wood");

        for (int i=0; i<5 ; i++){
            Object llaves = diccionario.keySet().toArray()[i];
            System.out.println(diccionario.get(llaves));
        }

        Scanner teclado = new Scanner(System.in);
        String scanner = teclado.nextLine();







    }
}
