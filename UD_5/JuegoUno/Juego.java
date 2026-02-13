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
    public void setTurnoActual(int turnoActual) {
        this.turnoActual = turnoActual;
    }
    public int getTurnoActual() {
        return turnoActual;
    }
    public int getDireccion() {
        return direccion;
    }
    public void setDireccion(int direccion) {
        this.direccion = direccion;
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
            Jugador jugador = getJugadores().get(turnoActual);


            System.out.println("\nCartas de: " + jugador.getNombre());


            for (int i = 0; i < jugador.getMano().size(); i++) {
                String indice = "(" + (i+1) + ")";
                System.out.print(centrarTexto(indice, ancho + 2) + "  ");
            }
            System.out.println();


            for (int i = 0; i < jugador.getMano().size(); i++) {
                System.out.print("┌" + "─".repeat(ancho) + "┐  ");
            }
            System.out.println();


            for (Carta carta : jugador.getMano()) {
                String color = carta.getColor().toString();
                System.out.print("│" + centrarTexto(color, ancho) + "│  ");
            }
            System.out.println();


            for (int i = 0; i < jugador.getMano().size(); i++) {
                System.out.print("│" + " ".repeat(ancho) + "│  ");
            }
            System.out.println();


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


            for (int i = 0; i < jugador.getMano().size(); i++) {
                System.out.print("│" + " ".repeat(ancho) + "│  ");
            }
            System.out.println();


            for (int i = 0; i < jugador.getMano().size(); i++) {
                System.out.print("└" + "─".repeat(ancho) + "┘  ");
            }
            System.out.println("\n");

    }

    public void mostrarCartaActual() {
        Carta carta =  getCartaActual();
        int ancho = 13;

        String color = carta.getColor().toString();

        String valor;
        if (carta.getTipoCarta() == TipoCarta.NUMERO) {
            valor = String.valueOf(carta.getNumero());
        } else {
            valor = carta.getTipoCarta().toString();
        }

        System.out.println();
        System.out.println("Carta Actual:");

        System.out.println("┌" + "─".repeat(ancho) + "┐");
        System.out.println("│" + centrarTexto(color, ancho) + "│");
        System.out.println("│" + " ".repeat(ancho) + "│");
        System.out.println("│" + centrarTexto(valor, ancho) + "│");
        System.out.println("│" + " ".repeat(ancho) + "│");
        System.out.println("└" + "─".repeat(ancho) + "┘");

        System.out.println();
    }

    public void siguienteTurno() {
        setTurnoActual((getTurnoActual() + getDireccion() + getJugadores().size()) % getJugadores().size());
    }

    public void mostrarTurnoActual() {
        System.out.println("Turno Actual de " + jugadores.get(turnoActual).getNombre());
    }

    public boolean ponerCarta(){
        Carta cartaActual = getCartaActual();
        listarCartas();
        int opcion = Main.elegirJugada();
        if (opcion == 1){
            jugadores.get(turnoActual).getMano().add(mesa.getMazo().getLast());
            mesa.getMazo().removeLast();
            listarCartas();
        }

        if (opcion == 2) {
            int numCarta = Main.pideNumeroCarta();
            Carta cartaMano = jugadores.get(turnoActual).getMano().get(numCarta);

            if (cartaMano.getColor().equals(cartaActual.getColor()) || cartaMano.getNumero() == cartaActual.getNumero() || cartaMano.getColor().equals(Color.NEGRO)) {
                mesa.getDescarte().add(getCartaActual());
                setCartaActual(cartaMano);
                jugadores.get(turnoActual).getMano().remove(numCarta);
                return true;
        }




        }

        return false;

    }
    public void mostrarDescarte(){
        for(Carta carta : mesa.getDescarte()){
            System.out.println(carta.toString());
        }
    }

    public void empezarJuego(){
        while (true){
            mostrarCantidadCartasBaraja();
            mostrarCartaActual();
            boolean CartaPuesta = ponerCarta();
            if (CartaPuesta){
                siguienteTurno();

            }

        }
    }
    public void mostrarCantidadCartasBaraja(){
        System.out.println("Cartas restantes en baraja: " + mesa.getMazo().size());
    }


}





