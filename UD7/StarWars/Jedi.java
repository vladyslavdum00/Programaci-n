package StarWars;

public class Jedi extends Maestro {
    private int fuerzaLuz;
    public Jedi(String nombre, int vida, int fuerzaLuz) {
        super(nombre,vida);
        this.fuerzaLuz = fuerzaLuz;
    }
    public int getFuerzaLuz() {
        return fuerzaLuz;
    }
    public void setFuerzaLuz(int fuerzaLuz) {
        this.fuerzaLuz = fuerzaLuz;
    }
    @Override
    public String toString() {
        return super.toString() + " Fuerza Luz: " + fuerzaLuz;
    }

    @Override
    public void atacar(Maestro defensor) {
        if (this.vida < 1 || this.fuerzaLuz < 1) {
            defensor.recibirDanio(0);
        } else if (this.vida < 10) {
            int danio = this.fuerzaLuz * 3;
            defensor.recibirDanio(danio);
            System.out.println(this.nombre + " ataca a " + defensor.nombre +". " + "Le quita " + danio + " de vida (daño triple)." );
        }else {
            int danio = this.fuerzaLuz;
            defensor.recibirDanio(danio);
            System.out.println(this.nombre + " ataca a " + defensor.nombre +". " + "Le quita " + danio + " de vida." );
        }
    }



}
