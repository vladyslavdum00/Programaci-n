package FinalFantasy_V2;

public class HechiceroOscuro extends Mago {
    public HechiceroOscuro(String nombre, int vida, int ataqueBase, int nivel, int mana) {
        super(nombre, vida, ataqueBase, nivel, mana);
    }

    public void habilidadEspecial(Personaje enemigo){
        if (enemigo.estaVivo()){
            if ((this.mana - 10) >= 0) {
                this.mana -= 10;
                super.atacar(enemigo);
                super.atacar(enemigo);
                super.atacar(enemigo);
                if (enemigo.estaVivo()){
                    enemigo.recibirDanio(5);
                }
            }

        }
    }
}