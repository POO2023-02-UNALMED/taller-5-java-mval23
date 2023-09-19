package zooAnimales;


import gestion.Zona;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private final static ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje,int patas) {
        super(nombre,edad,habitat,genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }
    public Mamifero() {
        listado.add(this);
    }

    public static int cantidadMamiferos(){
        return listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero mamifero = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        caballos++;
        listado.add(mamifero);
        return mamifero;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero mamifero = new Mamifero(nombre, edad, "selva", genero, true, 4);
        leones++;
        listado.add(mamifero);
        return mamifero;
    }

    public static int getCaballos() {
        return caballos;
    }

    public static void setCaballos(int caballos) {
        Mamifero.caballos = caballos;
    }

    public static int getLeones() {
        return leones;
    }

    public static void setLeones(int leones) {
        Mamifero.leones = leones;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
