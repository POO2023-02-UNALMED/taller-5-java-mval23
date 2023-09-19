package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
    private final static ArrayList<Pez> listado =new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {
        listado.add(this);
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public String movimiento() {
        return "nadar";
    }

    public static int cantidadPeces() {
        return listado.size();
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        Pez pez = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        salmones++;
        listado.add(pez);
        return pez;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        Pez pez = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        bacalaos++;
        listado.add(pez);
        return pez;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public static int getSalmones() {
        return salmones;
    }

    public static void setSalmones(int salmones) {
        Pez.salmones = salmones;
    }

    public static int getBacalaos() {
        return bacalaos;
    }

    public static void setBacalaos(int bacalaos) {
        Pez.bacalaos = bacalaos;
    }
}
