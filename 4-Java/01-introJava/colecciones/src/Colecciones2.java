import java.util.HashSet;
import java.util.Set;

public class Colecciones2 {
    public static void main(String[] args) {
        // SET
        // HashSet

        // No guardan los valores en el orden en el que se van agregando
        // SET no permiten elementos duplicados
        // La colección que funciona más rápido

        Set<String> miSet = new HashSet<>();

        miSet.add("Juan");
        miSet.add("Pedro");
        miSet.add("Luis");
        miSet.add("Felipe");
        miSet.add("Felipe");
        miSet.add("Felipe");
        miSet.add("Felipe");
        miSet.add("Felipe");

        System.out.println(miSet);

        }
    }
