package FinalFantasy_V2;

import java.util.Random;

public class Bardo extends Arquero {
    public Bardo(String nombre, int vida, int ataqueBase, int nivel) {
        super(nombre, vida, ataqueBase, nivel);
    }
    @Override
    public void recibirDanio(int cantidad){
        System.out.println("Bardo está intentando esquivar...");
        if (Math.random() <= 0.30){
            System.out.println(nombre + " Esquiva el ataque");
        }else{
            System.out.println(nombre + " No esquiva el ataque");
        super.recibirDanio(cantidad);}
    }

}
