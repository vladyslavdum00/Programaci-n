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
        this.mesa = new Mesa();
        crearJugadores();
        ponerPrimeraCartaActual();
        reparteCartas();
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



    public void ponerPrimeraCartaActual(){
        setCartaActual(mesa.getMazo().getLast());
        mesa.getMazo().remove(getCartaActual());
    }

    public  void reparteCartas() {
        for(int i = 0; i < jugadores.size(); i++){
            Jugador j1 = jugadores.get(i);
            for (int j = 0; j < 7; j++){
                j1.getMano().add(mesa.getMazo().removeLast());
            }
        }

    }
    public void crearJugadores(){
        int cantidadJugadores = Main.pideCantidadJugadores();
       for(int i = 0; i < cantidadJugadores; i++){
           String nombreJugador = Main.pedirNombreJugador();
           getJugadores().add(new Jugador(nombreJugador));
       }
    }

    public void listarJugadores(){
        for(int i = 0; i < getJugadores().size(); i++){
            System.out.println(getJugadores().get(i).getNombre());
        }
    }
    private String centrarTexto(String texto, int ancho) {

        if (texto.length() >= ancho) {
            return texto.substring(0, ancho);
        }

        int espacios = ancho - texto.length();
        int izquierda = espacios / 2;
        int derecha = espacios - izquierda;

        return " ".repeat(izquierda) + texto + " ".repeat(derecha);
    }

    public void listarCartas() {

        int ancho = 13; // ancho interno de la carta

        for (Jugador jugador : getJugadores()) {

            System.out.println("\nCartas de: " + jugador.getNombre());

            // 🔢 Índices
            for (int i = 0; i < jugador.getMano().size(); i++) {
                String indice = "(" + (i+1) + ")";
                System.out.print(centrarTexto(indice, ancho + 2) + "  ");
            }
            System.out.println();

            // 🔝 Línea superior
            for (int i = 0; i < jugador.getMano().size(); i++) {
                System.out.print("┌" + "─".repeat(ancho) + "┐  ");
            }
            System.out.println();

            // 🎨 Línea color
            for (Carta carta : jugador.getMano()) {
                String color = carta.getColor().toString();
                System.out.print("│" + centrarTexto(color, ancho) + "│  ");
            }
            System.out.println();

            // 🔹 Línea vacía
            for (int i = 0; i < jugador.getMano().size(); i++) {
                System.out.print("│" + " ".repeat(ancho) + "│  ");
            }
            System.out.println();

            // 🔢 Número o tipo
            for (Carta carta : jugador.getMano()) {

                String valor;

                if (carta.getTipoCarta() == TipoCarta.NUMERO) {
                    valor = String.valueOf(carta.getNumero());
                } else {
                    valor = carta.getTipoCarta().toString();
                }

                System.out.print("│" + centrarTexto(valor, ancho) + "│  ");
            }
            System.out.println();

            // 🔹 Línea vacía
            for (int i = 0; i < jugador.getMano().size(); i++) {
                System.out.print("│" + " ".repeat(ancho) + "│  ");
            }
            System.out.println();

            // 🔻 Línea inferior
            for (int i = 0; i < jugador.getMano().size(); i++) {
                System.out.print("└" + "─".repeat(ancho) + "┘  ");
            }
            System.out.println("\n");
        }
    }

}





