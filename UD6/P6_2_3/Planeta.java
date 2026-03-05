package P6_2_3;

import java.util.ArrayList;

public class Planeta extends Astro{
    private double distanciaAlSol;
    private ArrayList<Astro> satelites;

    public Planeta(String nombre, double masa, double temperaturaMedia, double distanciaAlSol){
        super(nombre, masa, temperaturaMedia);
        setDistanciaAlSol(distanciaAlSol);
        setSatelites(new ArrayList<>());
    }
    public void setDistanciaAlSol(double distanciaAlSol){
        this.distanciaAlSol = distanciaAlSol;
    }
    public double getDistanciaAlSol(){
        return this.distanciaAlSol;
    }
    public void setSatelites(ArrayList<Astro> satelites){
        this.satelites = satelites;
    }
    public ArrayList<Astro> getSatelites(){
        return this.satelites;
    }
    @Override
    public void addAstro(Astro satelite){
        getSatelites().add(satelite);
    }

    @Override
    public void removeAstro(Astro satelite){
        getSatelites().remove(satelite);
    }

    @Override
    public void mostrarAstros(){
        System.out.println("Satelites de : " + nombre);
        for (Astro satelite : getSatelites()) {

            System.out.println(satelite);
        }
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " | " + "Masa: " + this.masa + " | " + "TemperaturaMedia: " + this.temperaturaMedia + " | " + "DistanciaAlSol: " + getDistanciaAlSol();
    }
}


