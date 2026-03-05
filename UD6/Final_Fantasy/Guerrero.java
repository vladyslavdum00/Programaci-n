package Final_Fantasy;

public class Guerrero extends Personaje {
    public Guerrero(String nombre, int vida, int ataqueBase, int nivel) {
        super(nombre, vida, ataqueBase, nivel);
    }
    @Override
    public void atacar(Personaje p) {
        p.recibirDanio(ataqueBase + (nivel * 2));
    }
}
