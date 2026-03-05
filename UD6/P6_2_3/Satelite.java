package P6_2_3;

public class Satelite extends Astro {
    private double distanciaAlPlaneta;
    public Satelite(String nombre, double masa, double temperaturaMedia,  double distanciaAlPlaneta) {
        super(nombre, masa, temperaturaMedia);
        setDistanciaAlPlaneta(distanciaAlPlaneta);
    }
    public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
        this.distanciaAlPlaneta = distanciaAlPlaneta;
    }
    public double getDistanciaAlPlaneta() {
        return distanciaAlPlaneta;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " | " + "Masa: " + this.masa + " | " + "TemperaturaMedia: " + this.temperaturaMedia + " | " + "DistanciaAlPlaneta: " + getDistanciaAlPlaneta();
    }
}
