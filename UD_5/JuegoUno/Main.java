package JuegoUno;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Juego juego = new Juego();
        juego.listarJugadores();
        juego.listarCartas();
        System.out.println(juego.getCartaActual());


    }

    public static String pedirNombreJugador(){
        System.out.println("Ingrese el nombre del jugador: ");
        String nombreJugador = sc.nextLine();
        return nombreJugador;
    }

    public static int pideCantidadJugadores(){
        System.out.println("Ingrese la cantidad de jugadores: ");
        int cantidadJugadores = Integer.parseInt(sc.nextLine());
        return cantidadJugadores;
    }


}
