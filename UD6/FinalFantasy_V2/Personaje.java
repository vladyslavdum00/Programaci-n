package FinalFantasy_V2;

public abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected int ataqueBase;
    protected int nivel;

    public Personaje(String nombre, int vida, int ataqueBase, int nivel) {
        setNombre(nombre);
        setVida(vida);
        setAtaqueBase(ataqueBase);
        setNivel(nivel);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public void setAtaqueBase(int ataqueBase) {
        this.ataqueBase = ataqueBase;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getNombre() {
        return nombre;
    }
    public int getVida() {
        return vida;
    }
    public int getAtaqueBase() {
        return ataqueBase;
    }
    public int getNivel() {
        return nivel;
    }

    public boolean estaVivo(){
        return vida > 0;
    }

    public void recibirDanio(int cantidad){
       if (cantidad > 0){
          if ((this.vida - cantidad) < 0){
              this.vida = 0;
          }else{
              this.vida -= cantidad;
          }
       }
    }

    public String toString(){
        return "Nombre " + nombre + " | " + "Vida: " + vida + " | " + "AtaqueBase: " + ataqueBase + " | " + "Nivel: " + nivel;
    }

    public abstract void atacar(Personaje enemigo);

}
