public class ElemploString {
    public static void main(String[] args) {
        String curso = "Curso en Java"; // Declaración literal
        System.out.println("Curso = " + curso);

        String nombre = "Diana Minor";

        // new crea un nuevo objeto. En este caso, de tipo String
        String resultado = new String("Curso en Java"); // Declaración po referencia
        System.out.println("Resultado = " + resultado);

        boolean esIgual = curso == resultado; // Se compara como es declarado (referencias de asignación)
        System.out.println("Esigula = " + esIgual);

        // equals compara objetos
        esIgual = curso.equals(resultado); // Se compara el valor asignado
        System.out.println("Esigula = " + esIgual);


        // CONCATENACIÓN (.concat)
        String concatenacion = curso + " con " + nombre;
        System.out.println("Concat = " + concatenacion);

        String dia = "Jueves";

        String concatenacion1 = concatenacion.concat(" ").concat(dia);// Se hace una copia de los objetos. Declaración por referencia
        System.out.println("concatenacion1 = " + concatenacion1);

    }
}
