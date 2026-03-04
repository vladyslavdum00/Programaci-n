package Final_Fantasy;

public class Mago extends Personaje {
    protected int mana;
    public Mago(String nombre, int vida, int ataqueBase, int nivel, int mana) {
        super(nombre, vida, ataqueBase, nivel);
        this.mana = mana;
    }

    public void habilidadEspecial(Personaje enemigo){
        this.mana = this.mana - 10;

    }
}
