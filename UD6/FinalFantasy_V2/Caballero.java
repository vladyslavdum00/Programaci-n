package FinalFantasy_V2;

public class Caballero extends Guerrero implements IEvasion{
    public Caballero(String nombre, int vida, int ataqueBase, int nivel){
        super(nombre,vida,ataqueBase,nivel);
    }

    @Override
    public void recibirDanio(int cantidad){
        if (!evadeAtaque()) {
            if (cantidad > 0){
                if ((this.vida - cantidad) < 0){
                    this.vida = 0;
                }else{
                    this.vida = (int)Math.round(this.vida - (cantidad * 0.30));
                }
            }else System.out.println("Caballero esquiva ataque");
        }
        }

    @Override
    public boolean evadeAtaque() {
        return Math.random() < 0.30;
    }

}
