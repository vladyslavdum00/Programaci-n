package JuegoUno;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Carta> mano = new ArrayList<>();
    public Jugador(String nombre) {
            setNombre(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }
    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "mano=" + mano +
                '}';
    }
}
