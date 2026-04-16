package FinalFantasy_V2;

import java.util.ArrayList;

public class HechiceroOscuro extends Mago implements ISupport{
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

    @Override
    public void habilidadBuff(ArrayList<Personaje> aliados) {
        for (Personaje aliado : aliados) {
            if(aliado.estaVivo() && !aliado.equals(this) && ((aliado.vida - 3) >0)){
                aliado.ataqueBase += 7;
                aliado.vida -= 3;
            }
        }
        System.out.println("HechiceroOscuro activa FURIA: +5 ataque, -3 vida a aliados");
    }
}