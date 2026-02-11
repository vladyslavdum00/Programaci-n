package JuegoUno;

import java.util.ArrayList;
import java.util.Collections;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Mesa mesa;
    private int turnoActual = 0;
    private int direccion = 1;
    private Carta cartaActual;

    public Juego(){
        jugadores = new ArrayList<>();
        this.cartaActual = null;
        mesa = new Mesa();
    }
    public void setCartaActual(Carta cartaActual) {
        this.cartaActual = cartaActual;
    }
    public Carta getCartaActual() {
        return cartaActual;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public  void barajarMazo() {
        Collections.shuffle(mesa.getMazo());
    }

    public void ponerPrimeraCartaActual(){
        setCartaActual(mesa.getMazo().getLast());
        mesa.getMazo().remove(getCartaActual());
    }

    public  void reparteCartas(Jugador jugador) {
        for(int i = 0; i < jugadores.size(); i++){
            Jugador j1 = jugadores.get(i);
            for (int j = 0; j < 7; j++){
                j1.getMano().add(mesa.getMazo().removeLast());
            }
        }

    }

}
