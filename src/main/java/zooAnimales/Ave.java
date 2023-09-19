package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
    private final static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre,edad,habitat,genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }
    public Ave() {
        listado.add(this);
    }

    public static int cantidadAves(){
        return listado.size();
    }

    public String movimiento(){
        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave ave = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        halcones++;
        listado.add(ave);
        return ave;
    }

    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave ave = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        aguilas++;
        listado.add(ave);
        return ave;
    }

    public static int getHalcones() {
        return halcones;
    }

    public static void setHalcones(int halcones) {
        Ave.halcones = halcones;
    }

    public static int getAguilas() {
        return aguilas;
    }

    public static void setAguilas(int aguilas) {
        Ave.aguilas = aguilas;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}
