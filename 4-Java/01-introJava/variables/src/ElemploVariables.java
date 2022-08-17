public class ElemploVariables {
    public static void main(String[] args) {
        String nombre = "Diana";
        String saludo = "Hola esto es un ejemplo de variables";

        System.out.println(saludo + " " + nombre);
        char espacio = '\u0040';
        char caracter = 'a';

        System.out.println("espacio = " + espacio);
        System.out.println("char corresponde en byte: " + Character.BYTES);
        System.out.println("char corresponde en bits: " + Character.SIZE);
        System.out.println("char valor máximo: " + Character.MAX_VALUE);
        System.out.println("char valor mínimo: " + Character.MIN_VALUE);

        int numeroEntero = 2;
        System.out.println(" ");
        System.out.println("numeroEntero = " + numeroEntero);
        System.out.println("int corresponde en byte: " + Integer.BYTES);
        System.out.println("int corresponde en bits: " + Integer.SIZE);
        System.out.println("int valor máximo: " + Integer.MAX_VALUE);
        System.out.println("int valor mínimo: " + Integer.MIN_VALUE);

        float numeroFloat = 1;
        System.out.println(" ");
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("float corresponde en byte: " + Float.BYTES);
        System.out.println("float corresponde en bits: " + Float.SIZE);
        System.out.println("float valor máximo: " + Float.MAX_VALUE);
        System.out.println("float valor mínimo: " + Float.MIN_VALUE);

        double numeroDouble = 3.444567E39;
        System.out.println(" ");
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("double corresponde en byte: " + Double.BYTES);
        System.out.println("double corresponde en bits: " + Double.SIZE);
        System.out.println("double valor máximo: " + Double.MAX_VALUE);
        System.out.println("double valor mínimo: " + Double.MIN_VALUE);

        boolean valorBooleano = true;
        System.out.println(" ");
        System.out.println("valorBooleano = " + valorBooleano);
        System.out.println("boolean corresponde en byte: " + Boolean.TYPE);


        long numeroLong = 1;
        System.out.println(" ");
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("long corresponde en byte: " + Long.BYTES);
        System.out.println("long corresponde en bits: " + Long.SIZE);
        System.out.println("long valor máximo: " + Long.MAX_VALUE);
        System.out.println("long valor mínimo: " + Long.MIN_VALUE);

        short numeroShort = 1;
        System.out.println(" ");
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("short corresponde en byte: " + Short.BYTES);
        System.out.println("short corresponde en bits: " + Short.SIZE);
        System.out.println("short valor máximo: " + Short.MAX_VALUE);
        System.out.println("short valor mínimo: " + Short.MIN_VALUE);

        byte valorByte = 1;
        System.out.println(" ");
        System.out.println("valorByte = " + valorByte);
        System.out.println("byte corresponde en byte: " + Byte.BYTES);
        System.out.println("byte corresponde en bits: " + Byte.SIZE);
        System.out.println("byte valor máximo: " + Byte.MAX_VALUE);
        System.out.println("byte valor mínimo: " + Byte.MIN_VALUE);

    }
}
