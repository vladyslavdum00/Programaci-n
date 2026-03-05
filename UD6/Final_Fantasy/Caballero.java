package Final_Fantasy;

public class Caballero extends Guerrero {
    public Caballero(String nombre, int vida, int ataqueBase, int nivel) {
        super(nombre, vida + 20, ataqueBase, nivel);
    }
    @Override
    public void atacar(Personaje p) {
        super.atacar(p);
        p.recibirDanio(5);
    }
}
