package ResumenEjemplos;

public class Animal {
    String raza;
    String nombre;
    int edad;

    public Animal(String nuevonombre) {
        nombre = nuevonombre;
    }

    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }

    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

}
