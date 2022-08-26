package MenuP;

import MiEjemploJava.Persona;
import MiFecha.Fecha;
import MiSaludo.Saludo;
import ResumenEjemplos.Animal;

import java.util.Scanner;

public class MenuCompleto {
    public void Menu() {
        Scanner sc = new Scanner(System.in);
        MenuOp manuOp = new MenuOp();
        int opc;

        do {
            manuOp.menu();
            System.out.println("Elije una opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    Saludo s = new Saludo();
                    s.saludar();
                    System.out.println("\n");
                    break;
                case 2:
                    Persona p1 = new Persona();
                    p1.setNombre();
                    p1.setEdad();
                    p1.setNss();
                    System.out.println("Nombre: " + p1.getNombre());
                    System.out.println("Edad: " + p1.getEdad());
                    System.out.println("NSS: " + p1.getNss());
                    System.out.println("\n");
                    break;
                case 3:
                    Animal a1 = new Animal();
                    a1.setNombre();
                    a1.setEdad();
                    a1.setRaza();
                    System.out.println("Nombre: " + a1.getNombre());
                    System.out.println("Edad: " + a1.getEdad());
                    System.out.println("Raza: " + a1.getRaza());
                    System.out.println("\n");
                    break;
                case 4:
                    Fecha f = new Fecha();
                    f.setDia();
                    f.setMes();
                    f.setAnio();
                    System.out.println("La fecha de hoy, es " + f.formatoF());
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("nontendi");
                    System.out.println("VOY A SALIR...");
                    break;
            }
        } while (opc <= 4);
    }
}
