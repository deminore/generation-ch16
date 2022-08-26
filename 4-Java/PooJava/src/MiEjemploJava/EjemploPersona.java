package MiEjemploJava;

public class EjemploPersona {
    public static void main(String[] args) {
        // Con constructor
        /* Persona p = new Persona("Diana", 24, 2014050668);
        System.out.println("El valor de la instancia p.nombre -> " + p.nombre); */

        // Con el método set y get
        Persona p = new Persona();
        p.setNombre();
        p.setEdad();
        p.setNss();
        System.out.println("El valor de la instancia p.nombre -> " + p.getNombre());
        System.out.println("El valor de la instancia p.edad -> " + p.getEdad());
        System.out.println("El valor de la instancia p.nss -> " + p.getNss());
    }
}
