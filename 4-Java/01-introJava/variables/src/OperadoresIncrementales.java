public class OperadoresIncrementales {
    public static void main(String[] args) {
        // PRE INCREMENTO
        int i = 1;
        int j = ++i; // i = i + 1
        System.out.println("PRE INCREMENTO");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // POS INCREMENTO
        i = 2;
        j = i++; // i = i + 1
        System.out.println("POS INCREMENTO");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println(" ");

        // PRE DECREMENTO
        i = 1;
        j = --i; // i = i - 1
        System.out.println("PRE DECREMENTO");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // POS DECREMENTO
        i = 2;
        j = i--; // i = i - 1
        System.out.println("PRE DECREMENTO");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
