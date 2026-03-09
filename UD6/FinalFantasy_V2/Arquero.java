package FinalFantasy_V2;

public abstract class Arquero extends Personaje{
    public Arquero(String nombre, int vida, int ataqueBase, int nivel){
        super(nombre,vida,ataqueBase,nivel);
    }
    public void atacar(Personaje enemigo){
        if (enemigo.estaVivo()){
            enemigo.recibirDanio(ataqueBase + (nivel * 3));
        }
    }
}
