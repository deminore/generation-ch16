package MiFecha;

import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {

    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setDia() {
        System.out.println(" Ingresa un día: ");
        Scanner scDay = new Scanner(System.in);
        int Day = scDay.nextInt();
        this.dia = Day;
    }

    public void setMes() {
        System.out.println(" Ingresa un mes (con número): ");
        Scanner scMonth = new Scanner(System.in);
        int Month = scMonth.nextInt();
        this.mes = Month;
    }

    public void setAnio() {
        System.out.println(" Ingresa el año: ");
        Scanner scYear = new Scanner(System.in);
        int Year = scYear.nextInt();
        this.anio = Year;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public String formatoF(){
        String fechaFormato = this.dia + "/" + this.mes + "/" + this.anio;
        return fechaFormato;
    }

    /* public String formatoF(int diaAsig, int mesAsig, int anioAsig){
        this.dia = diaAsig;
        this.mes = mesAsig;
        this.anio = anioAsig;

        String fechaFormato = dia + "/" + mes + "/" + anio;

        return fechaFormato;
    }*/
}
