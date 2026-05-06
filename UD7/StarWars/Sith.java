package StarWars;

public class Sith extends Maestro{
    private int fuerzaOscura;
    public Sith(String nombre, int vida, int fuerzaOscura) {
        super(nombre, vida);
        this.fuerzaOscura = fuerzaOscura;
    }
    public int getFuerzaOscura() {
        return fuerzaOscura;
    }
    public void setFuerzaOscura(int fuerzaOscura) {
        this.fuerzaOscura = fuerzaOscura;
    }
    @Override
    public String toString() {
        return super.toString() + " Fuerza Oscura: " + fuerzaOscura;
    }
    @Override
    public void atacar(Maestro defensor) {
        if (this.vida < 1 || this.fuerzaOscura < 1) {
            defensor.recibirDanio(0);
        }else {
            int danio = this.fuerzaOscura;
            defensor.recibirDanio(danio);
            Jedi jedi = (Jedi) defensor;
            jedi.setFuerzaLuz(jedi.getFuerzaLuz() - 1);
            System.out.println(this.nombre + " ataca a " + defensor.nombre +". " + "Le quita " + danio + " de vida y 1 punto de fuerza.");
        }

    }

}
