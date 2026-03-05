package P6_2_3;

import java.util.ArrayList;

public class SistemaSolar {
    protected String nombre;
    private ArrayList<Astro> planetas;
    public SistemaSolar(String nombre){
        this.nombre = nombre;
        setAstros(new ArrayList<>());
    }

    public ArrayList<Astro> getAstros() {
        return planetas;
    }
    public void setAstros(ArrayList<Astro> planetas) {
        this.planetas = planetas;
    }

    public void addAstro(Astro planeta){
        getAstros().add(planeta);
    }

    public void removeAstro(Astro planeta){
        getAstros().remove(planeta);
    }
    public String toString(){
        return "Nombre: " + this.nombre;
    }
    public void mostrarAstros(){
        System.out.println("Planetas de " + nombre);
        for (Astro planeta : getAstros()) {

            System.out.println(planetas.get(getAstros().indexOf(planeta)));
        }
    }

}
