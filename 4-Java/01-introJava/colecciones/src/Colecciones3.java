import java.util.*;


public class Colecciones3 {
    public static void main(String[] args) {
        // int -> Integer
        // float -> Float
        // Double -> Double
        // char -> Character

        System.out.println("ArrayList");
        List<String> comidas = new ArrayList<String>();
        comidas.add("Pozole");
        comidas.add("Tostadas");
        comidas.add("Ceviche");
        comidas.add(2, "Esquites");

        System.out.println(comidas);

        // Otra forma de inicializar una lista
        List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 56, 789));
        System.out.println(numeros);


        System.out.println("--------------------");


        System.out.println("HashSet");
        Set<String> ciudades = new HashSet<>();
        ciudades.add("CDMX"); // No se puede insertar un elemento en posiciones específicas
        ciudades.add("GDL");
        ciudades.add("MTY");
        System.out.println(ciudades);

        // Otra forma de crear un HashSet
        Set<Boolean> verdad =  new HashSet<Boolean>(Arrays.asList(true, false, false, true));
        System.out.println(verdad);


        System.out.println("--------------------");


        System.out.println("HashMap");

        // HashMap<llave, valor>
        // Nos permiten guardar pares de elementos
        // llave : valor

        Map<Integer, String> alumnos = new HashMap<Integer, String>();
        alumnos.put(1, "Pedro");
        alumnos.put(2, "Sofia");
        alumnos.put(3, "Salma");
        alumnos.put(4, "Miguel");
        alumnos.put(5, "Miguel 2");
        alumnos.put(0, "Luis");

        System.out.println(alumnos);
        System.out.println(alumnos.size());
        System.out.println(alumnos.values()); // Lista de valores
        System.out.println(alumnos.keySet()); // Lista de las llaves
        System.out.println(alumnos.get(2));

        // Object llaves = alumnos.keySet().toArray()[5]; // Genera una copia de las llaves en forma de lista y la convierte en un arreglo
        // System.out.println(alumnos.get(llaves)); // Regresa el objeto de la línea de arriba en la posición indicada

        for (int i=0; i<alumnos.size(); i++){
            Object llaves = alumnos.keySet().toArray()[i];
            System.out.println(alumnos.get(llaves));
        }

        for (Integer llave: alumnos.keySet()) {
            System.out.println(llave + " - " + alumnos.get(llave));
        }

    }
}
