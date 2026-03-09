package FinalFantasy_V2;
public class Ballestero extends Arquero{
    private boolean recargando;
    public Ballestero(String nombre, int vida, int ataqueBase, int nivel){
        super(nombre,vida,ataqueBase,nivel);
        this.recargando = false;
    }
    public void setRecargando(boolean recargando){
        this.recargando=recargando;
    }
    public boolean getRecargando(){
        return this.recargando;
    }

    @Override
    public void atacar(Personaje enemigo){
        if(this.recargando){
            System.out.println("Recargando");
            this.recargando = false;
            return;
        }
        if (enemigo.estaVivo()){
            super.atacar(enemigo);
            enemigo.recibirDanio(10);
        }
    }

    @Override
    public String toString(){
        return super.toString() + " | Recargando: " + this.recargando;
    }

}
