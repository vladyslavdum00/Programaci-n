package FinalFantasy_V2;

import java.util.ArrayList;
import java.util.Random;

public class Paladin extends Guerrero implements ISanador, ISupport{
    public Paladin(String nombre, int vida, int ataqueBase, int nivel){
        super(nombre, vida, ataqueBase, nivel);
    }

    @Override
    public void atacar(Personaje enemigo){
        if (enemigo.estaVivo()){
            enemigo.recibirDanio((int)Math.round(ataqueBase + (nivel * 1.5)));
        }
    }

    @Override
    public int getCantidadSanacion() {
        return 15;
    }

    @Override
    public void sanar(Personaje objetivo) {
        if((objetivo.vida + getCantidadSanacion()) > 100){
            objetivo.vida = 100;
        }else{
            objetivo.vida += getCantidadSanacion();
        }
    }

    @Override
    public void habilidadBuff(ArrayList<Personaje> aliados) {
        if(!aliados.isEmpty()){
            if (Math.random() < 0.3){
                for(Personaje aliado : aliados){
                    if(aliado.estaVivo() && !aliado.equals(this)){
                        aliado.ataqueBase += 3;
                    }
                }
                System.out.println("Paladin activa AURA: +3 a todos");
            }else{
                Random random = new Random();
                Personaje aliado;
                do {
                   aliado = aliados.get(random.nextInt(aliados.size()));
                } while (!aliado.estaVivo() && aliado.equals(this));

                   aliado.ataqueBase += 7;
                   System.out.println("Paladin activa AURA: +7 a " + aliado.nombre);
            }
        }
    }
}
