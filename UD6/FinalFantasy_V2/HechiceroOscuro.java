package FinalFantasy_V2;

public class HechiceroOscuro extends Mago {
    public HechiceroOscuro(String nombre, int vida, int ataqueBase, int nivel, int mana) {
        super(nombre, vida, ataqueBase, nivel, mana);
    }

    @Override
    public void atacar(Personaje enemigo){
        if (enemigo.estaVivo()){
            enemigo.recibirDanio((ataqueBase + nivel) * 3);
        }
    }
    public void habilidadEspecial(Personaje enemigo){
        if (enemigo.estaVivo()){
            if ((this.mana - 10) >= 0) {
                this.mana -= 10;
                atacar(enemigo);
                if (enemigo.estaVivo()){
                    enemigo.recibirDanio(5);
                }
            }

        }
    }
}