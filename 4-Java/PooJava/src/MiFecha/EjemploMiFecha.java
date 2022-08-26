package MiFecha;

public class EjemploMiFecha {
    public static void main(String[] args) {
        Fecha fechaAsig = new Fecha(25, 8, 2022);
        // System.out.println("La fecha de hoy, es " + fechaAsig.formatoF(25, 8, 2022));

        System.out.println("La fecha de hoy, es " + fechaAsig.formatoF());
    }
}
