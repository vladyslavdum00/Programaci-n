package FinalFantasy_V2;

public abstract class Mago extends Personaje{
    protected int mana;
    public Mago(String nombre, int vida, int ataqueBase, int nivel, int mana) {
        super(nombre, vida, ataqueBase, nivel);
        this.mana = mana;
    }
    public void atacar(Personaje enemigo){
        if (enemigo.estaVivo()){
            enemigo.recibirDanio(ataqueBase + nivel);
        }
    }
    public abstract void habilidadEspecial(Personaje enemigo);

    @Override
    public String toString() {
        return super.toString() + " | Mana: " + this.mana;
    }
}
