package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
    private final static ArrayList<Reptil> listado =new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public static int getIguanas() {
        return iguanas;
    }

    public static void setIguanas(int iguanas) {
        Reptil.iguanas = iguanas;
    }

    public static int getSerpientes() {
        return serpientes;
    }

    public static void setSerpientes(int serpientes) {
        Reptil.serpientes = serpientes;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre,edad,habitat,genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }
    public Reptil() {
        listado.add(this);
    }

    public String movimiento(){
        return "reptar";
    }
    public static int cantidadReptiles(){
        return listado.size();
    }

    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil reptil = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        iguanas++;
        listado.add(reptil);
        return reptil;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil reptil = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        serpientes++;
        listado.add(reptil);
        return reptil;
    }

}
