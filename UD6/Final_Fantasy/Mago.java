package Final_Fantasy;

public class Mago extends Personaje {
    protected int mana;
    public Mago(String nombre, int vida, int ataqueBase, int nivel, int mana) {
        super(nombre, vida, ataqueBase, nivel);
        this.mana = mana;
    }

    public void habilidadEspecial(Personaje enemigo){
       if ((this.mana - 10) >= 0){
           this.mana -= 10;
           atacar(enemigo);
           atacar(enemigo);
       }


    }

    @Override
    public void atacar(Personaje p) {
        p.recibirDanio(ataqueBase + nivel);
    }
}
