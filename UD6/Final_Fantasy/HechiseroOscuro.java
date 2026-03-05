package Final_Fantasy;

public class HechiseroOscuro extends Mago{
    public HechiseroOscuro(String nombre, int vida, int ataqueBase, int nivel, int mana) {
        super(nombre, vida, ataqueBase, nivel, mana);
    }

    @Override
    public void habilidadEspecial(Personaje enemigo){
        if(enemigo.estaVivo()){
            super.habilidadEspecial(enemigo);
            super.atacar(enemigo);
        }
        if(enemigo.estaVivo()){
            recibirDanio(5);
        }

    }



}
