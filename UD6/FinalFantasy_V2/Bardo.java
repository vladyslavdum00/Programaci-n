package FinalFantasy_V2;

import java.util.Random;

public class Bardo extends Arquero implements IEvasion{
    public Bardo(String nombre, int vida, int ataqueBase, int nivel) {
        super(nombre, vida, ataqueBase, nivel);
    }

    @Override
    public boolean evadeAtaque() {
        return Math.random() < 0.40;
    }

    @Override
    public void recibirDanio(int cantidad){
        if(!evadeAtaque()){
            super.recibirDanio(cantidad);
        }else System.out.println("Bardo esquiva ataque");
    }



}
