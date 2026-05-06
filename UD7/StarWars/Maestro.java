package StarWars;

public abstract class Maestro {
    protected String nombre;
    protected int vida;
    public Maestro(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;

    }
    public String toString() {
        return getClass().getSimpleName() + ": " + this.nombre +". Vida: " + this.vida +".";
    }

    abstract public void atacar(Maestro defensor);
    public void recibirDanio(int danio) {
        this.vida -= danio;
    }
}
