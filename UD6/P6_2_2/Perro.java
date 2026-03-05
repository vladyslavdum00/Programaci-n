package P6_2_2;

public class Perro extends Mascota {
    private boolean pulgas;
    public Perro(String nombre, int edad,  boolean pulgas) {
        super(nombre, edad);
        setPulgas(pulgas);
    }
    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }
    public boolean getPulgas() {
        return pulgas;
    }
    public void habla() {
        System.out.println(getClass().getSimpleName() + " Gua Gua");
    }
    public String toString(){
        return "Nombre: " + this.nombre + ", Edad: " + this.edad + ", Pulgas: " + getPulgas();
    }
}
