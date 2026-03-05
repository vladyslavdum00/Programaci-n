package P6_2_2;

public class Canario extends Mascota{
    private boolean volando;
    public Canario(String nombre, int edad, boolean volando) {
        super(nombre, edad);
        setVolando(volando);
    }
    public void setVolando(boolean volando) {
        this.volando = volando;
    }
    public boolean getVolando(){
        return this.volando;
    }

    public void habla() {
        System.out.println(getClass().getSimpleName() + " Pio Pio");
    }
    public String toString(){
        return "Nombre: " + this.nombre + ", Edad: " + this.edad + " Volando: " + getVolando();
    }

    @Override
    public void cumpleanios(){
        this.edad=this.edad+2;
    }
}
