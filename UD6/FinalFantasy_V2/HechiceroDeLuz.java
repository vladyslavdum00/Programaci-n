package FinalFantasy_V2;

public class HechiceroDeLuz extends Mago implements ISanador{
    public HechiceroDeLuz(String nombre, int vida, int ataqueBase, int nivel, int mana){
        super(nombre, vida, ataqueBase, nivel, mana);
    }

    public void habilidadEspecial(Personaje enemigo){
        if (enemigo.estaVivo() && (enemigo instanceof HechiceroOscuro) ){
            if ((this.mana - 7) >= 0) {
                this.mana -= 7;
                enemigo.recibirDanio(ataqueBase + (nivel * 4));
            }
        }else if (enemigo.estaVivo()){
            if ((this.mana - 7) >= 0) {
                this.mana -= 7;
                enemigo.recibirDanio(ataqueBase + (nivel * 2));

            }
        }
    }

    @Override
    public int getCantidadSanacion() {
        return 20;
    }

    @Override
    public void sanar(Personaje objetivo) {
        if((objetivo.vida + getCantidadSanacion()) > 100){
            objetivo.vida = 100;
        }else{
            objetivo.vida += getCantidadSanacion();
        }

    }
}
