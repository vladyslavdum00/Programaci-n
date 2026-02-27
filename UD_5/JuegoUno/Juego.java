package JuegoUno;

import java.util.ArrayList;
import java.util.Collections;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Mesa mesa;
    private int turnoActual = 0;
    private Color colorActual;
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

    public void setColorActual(Color colorActual) {
        this.colorActual = colorActual;
    }
    public Color getColorActual() {
        return colorActual;
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
        setColorActual(cartaActual.getColor());
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

        int ancho = 13;
        int maxPorFila = 10;

        Jugador jugador = getJugadores().get(turnoActual);

        System.out.println("\nCartas de: " + jugador.getNombre());

        int totalCartas = jugador.getMano().size();

        for (int inicio = 0; inicio < totalCartas; inicio += maxPorFila) {

            int fin = Math.min(inicio + maxPorFila, totalCartas);

            // Mostrar índices
            for (int i = inicio; i < fin; i++) {
                String indice = "(" + (i + 1) + ")";
                System.out.print(centrarTexto(indice, ancho + 2) + "  ");
            }
            System.out.println();

            // Borde superior
            for (int i = inicio; i < fin; i++) {
                System.out.print("┌" + "─".repeat(ancho) + "┐  ");
            }
            System.out.println();

            // Nombre color
            for (int i = inicio; i < fin; i++) {
                Carta carta = jugador.getMano().get(i);
                Color colorEnum = carta.getColor();
                String colorCentrado = centrarTexto(colorEnum.getNombre(), ancho);
                System.out.print("│" + colorEnum.getAnsi() + colorCentrado + "\u001B[0m" + "│  ");
            }
            System.out.println();

            // Línea en blanco
            for (int i = inicio; i < fin; i++) {
                System.out.print("│" + " ".repeat(ancho) + "│  ");
            }
            System.out.println();

            // Valor
            for (int i = inicio; i < fin; i++) {
                Carta carta = jugador.getMano().get(i);
                String valor;

                if (carta.getTipoCarta() == TipoCarta.NUMERO) {
                    valor = String.valueOf(carta.getNumero());
                } else {
                    valor = carta.getTipoCarta().toString();
                }

                System.out.print("│" + centrarTexto(valor, ancho) + "│  ");
            }
            System.out.println();

            // Línea en blanco
            for (int i = inicio; i < fin; i++) {
                System.out.print("│" + " ".repeat(ancho) + "│  ");
            }
            System.out.println();

            // Borde inferior
            for (int i = inicio; i < fin; i++) {
                System.out.print("└" + "─".repeat(ancho) + "┘  ");
            }
            System.out.println("\n");
        }
    }


    public void mostrarCartaActual() {
        Carta carta = getCartaActual();
        int ancho = 13;

        Color colorEnum = carta.getColor();
        String nombreColor = colorEnum.getNombre(); // sin color para centrar
        String colorTexto = colorEnum.getAnsi() + nombreColor + "\u001B[0m"; // con color para mostrar

        String valor;
        if (carta.getTipoCarta() == TipoCarta.NUMERO) {
            valor = String.valueOf(carta.getNumero());
        } else {
            valor = carta.getTipoCarta().toString();
        }

// Centrar el nombre sin contar ANSI
        String colorCentrado = centrarTexto(nombreColor, ancho);

// Mostrar carta
        System.out.println();
        System.out.println("Carta Actual:");
        System.out.println("┌" + "─".repeat(ancho) + "┐");
        System.out.println("│" + colorEnum.getAnsi() + colorCentrado + "\u001B[0m" + "│");
        System.out.println("│" + " ".repeat(ancho) + "│");
        System.out.println("│" + centrarTexto(valor, ancho) + "│");
        System.out.println("│" + " ".repeat(ancho) + "│");
        System.out.println("└" + "─".repeat(ancho) + "┘");
        System.out.println();

    }
    public void ponerColor(){
        int color = Main.pedirColor();
        switch(color){
            case 1:
                setColorActual(Color.ROJO);
                break;
            case 2:
                setColorActual(Color.AZUL);
                break;
            case 3:
                setColorActual(Color.AMARILLO);
                break;
            case 4:
                setColorActual(Color.VERDE);
                break;
            default:
                setColorActual(null);
                break;
        }
        System.out.println("El jugador " + jugadores.get(turnoActual).getNombre() + " ha puesto color: " + getColorActual());
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
        Jugador ganador;
        boolean victoria = false;
        if (opcion == 1){
            if(mesa.getMazo().isEmpty()){
                mesa.getDescarte().removeLast();
                mesa.getMazo().addAll(mesa.getDescarte());
                mesa.getDescarte().clear();
                mesa.barajarMazo();
            }
            jugadores.get(turnoActual).getMano().add(mesa.getMazo().getLast());
            mesa.getMazo().removeLast();
            listarCartas();
        }

        if (opcion == 2) {
            int numCarta = Main.pideNumeroCarta();
            Carta cartaMano = jugadores.get(turnoActual).getMano().get(numCarta);


            if ((cartaMano.getColor().equals(getColorActual())) ||
                    (cartaMano.getNumero() == cartaActual.getNumero()) ||
                    (cartaMano.getColor().equals(Color.NEGRO))
            ||  (cartaMano.getTipoCarta() == TipoCarta.SKIP && cartaActual.getTipoCarta() == TipoCarta.SKIP) ||
                    (cartaMano.getTipoCarta() == TipoCarta.REVERSA && cartaActual.getTipoCarta() == TipoCarta.REVERSA)
            || (cartaMano.getTipoCarta() == TipoCarta.MAS_DOS && cartaActual.getTipoCarta() == TipoCarta.MAS_DOS) ||
                    (cartaMano.getTipoCarta() == TipoCarta.MAS_CUATRO && cartaActual.getTipoCarta() == TipoCarta.MAS_CUATRO) ||
                    (cartaMano.getTipoCarta() == TipoCarta.CAMBIA_COLOR && cartaActual.getTipoCarta() == TipoCarta.CAMBIA_COLOR)){
                mesa.getDescarte().add(getCartaActual());
                setCartaActual(cartaMano);
                jugadores.get(turnoActual).getMano().remove(numCarta);
                if (cartaMano.getColor() != Color.NEGRO) {
                    setColorActual(cartaMano.getColor());
                }

                if(jugadores.get(turnoActual).getMano().size() == 1){
                    System.out.println(jugadores.get(turnoActual).getNombre() +": " + "UNO!!!!!!");
                }
                if(jugadores.get(turnoActual).getMano().isEmpty()){
                    ganador = jugadores.get(turnoActual);
                    System.out.println("Ganador: " + ganador.getNombre());
                    return true;
                }


                int siguiente = (turnoActual + direccion + jugadores.size()) % jugadores.size();

                switch (cartaMano.getTipoCarta()) {

                    case MAS_DOS:
                        for (int i = 0; i < 2; i++) {
                            jugadores.get(siguiente).getMano().add(mesa.getMazo().removeLast());
                        }

                        siguienteTurno(); // salta su turno
                        siguienteTurno();
                        break;

                    case MAS_CUATRO:
                        switch(mesa.getMazo().size()){
                            case 0:
                                mesa.getDescarte().removeLast();
                                mesa.getMazo().addAll(mesa.getDescarte());
                                mesa.getDescarte().clear();
                                mesa.barajarMazo();

                                for (int i = 0; i < 4; i++) {
                                    jugadores.get(siguiente).getMano().add(mesa.getMazo().removeLast());
                                }
                                ponerColor();
                                siguienteTurno();
                                siguienteTurno();
                                break;

                            case 1:
                                jugadores.get(siguiente).getMano().add(mesa.getMazo().removeLast());

                                mesa.getDescarte().removeLast();
                                mesa.getMazo().addAll(mesa.getDescarte());
                                mesa.getDescarte().clear();
                                mesa.barajarMazo();

                                for (int i = 0; i < 3; i++) {
                                    jugadores.get(siguiente).getMano().add(mesa.getMazo().removeLast());
                                }
                                ponerColor();
                                siguienteTurno();
                                siguienteTurno();
                                break;
                            case 2:
                                for (int i = 0; i < 2; i++) {
                                    jugadores.get(siguiente).getMano().add(mesa.getMazo().removeLast());
                                }

                                mesa.getDescarte().removeLast();
                                mesa.getMazo().addAll(mesa.getDescarte());
                                mesa.getDescarte().clear();
                                mesa.barajarMazo();

                                for (int i = 0; i < 2; i++) {
                                    jugadores.get(siguiente).getMano().add(mesa.getMazo().removeLast());
                                }
                                ponerColor();
                                siguienteTurno();
                                siguienteTurno();
                                break;
                            case 3:
                                for (int i = 0; i < 3; i++) {
                                    jugadores.get(siguiente).getMano().add(mesa.getMazo().removeLast());
                                }
                                mesa.getDescarte().removeLast();
                                mesa.getMazo().addAll(mesa.getDescarte());
                                mesa.getDescarte().clear();
                                mesa.barajarMazo();

                                jugadores.get(siguiente).getMano().add(mesa.getMazo().removeLast());

                                ponerColor();
                                siguienteTurno();
                                siguienteTurno();
                                break;

                            default:
                                for (int i = 0; i < 4; i++) {
                                    jugadores.get(siguiente).getMano().add(mesa.getMazo().removeLast());
                                }
                                ponerColor();
                                siguienteTurno();
                                siguienteTurno();

                        }


                        break;

                    case SKIP:
                        siguienteTurno();
                        siguienteTurno();
                        break;

                    case REVERSA:
                        setDireccion(getDireccion() * -1);
                        siguienteTurno();
                        break;

                    case CAMBIA_COLOR:
                        ponerColor();
                        siguienteTurno();
                        break;

                    default:
                        siguienteTurno();
                        break;
                }
        }
        }
        return victoria;
    }
    public void mostrarDescarte(){
        for(Carta carta : mesa.getDescarte()){
            System.out.println(carta.toString());
        }
    }

    public void empezarJuego(){
        boolean victoria =  false;
        while (!victoria){
            mostrarCantidadCartasBaraja();
            mostrarCartaActual();
            victoria = ponerCarta();

        }
    }
    public void mostrarCantidadCartasBaraja(){
        System.out.println("Cartas restantes en baraja: " + mesa.getMazo().size());
    }


}





