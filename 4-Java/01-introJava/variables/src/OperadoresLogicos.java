public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j =3;
        float k = 127e-7f;
        double l = 201415e3d;
        boolean m = true;

        boolean b1 = k < l && i == j && m == false;
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || m == false;
        System.out.println("b2 = " + b2);
    }
}
