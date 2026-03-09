package FinalFantasy_V2;

public class Paladin extends Guerrero{
    public Paladin(String nombre, int vida, int ataqueBase, int nivel){
        super(nombre, vida, ataqueBase, nivel);
    }

    @Override
    public void atacar(Personaje enemigo){
        if (enemigo.estaVivo()){
            enemigo.recibirDanio((int)Math.round(ataqueBase + (nivel * 1.5)));
        }
    }
}
