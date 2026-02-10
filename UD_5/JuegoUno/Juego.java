package JuegoUno;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Carta> mazo = new ArrayList<>();
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Mesa mesa = new Mesa();
    private int turnoActual = 0;
    private int direccion = 1;
}
