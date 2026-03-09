package FinalFantasy_V2;

public class Caballero extends Guerrero {
    public Caballero(String nombre, int vida, int ataqueBase, int nivel){
        super(nombre,vida,ataqueBase,nivel);
    }

    @Override
    public void recibirDanio(int cantidad){
        if (cantidad > 0){
                if ((this.vida - cantidad) < 0){
                    this.vida = 0;
                }else{
                    this.vida = (int)Math.round(this.vida - (cantidad * 0.30));
                }
            }
        }

}
