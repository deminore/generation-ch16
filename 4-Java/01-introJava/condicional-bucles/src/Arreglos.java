public class Arreglos {
    public static void main(String[] args) {
        System.out.println("Arreglos");
        
        // Arreglos
        // No se pueden mezclar los tipos de datos


        // Debemos definir el tipo pde dato
        int[] numerosAleatorios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] valores = {"Hola", "Adiós", "Etc"};


        // Otra forma de declarar arreglos
        //byte otrosNumeros[] = {1, 2 , 3};


        //Los arreglos tienen un tamaño definido
        char[] caracteres = new char[4];
        caracteres[0] = 'h';
        caracteres[1] = 'o';
        caracteres[2] = 'l';
        caracteres[3] = 'a';

        valores[2] = "Valor Cambiado";

        System.out.println(numerosAleatorios[0]);
        System.out.println(valores);
        System.out.println(caracteres);


        // Ciclo for-each
        for (String elemento:valores) {
            System.out.println(elemento);
        }

        for (int numero:numerosAleatorios){
            System.out.println(numero);
        }
    }
}
