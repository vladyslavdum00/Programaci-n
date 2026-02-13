package JuegoUno;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Juego juego = new Juego();
       juego.empezarJuego();

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

    public static int pideNumeroCarta(){
        System.out.println("Elige la carta (1-7): ");
        int num = Integer.parseInt(sc.nextLine()) - 1;
        return num;
    }

    public static int elegirJugada(){
        System.out.println("1: Robar carta");
        System.out.println("2: Poner carta");
        System.out.println("Elige opcion: ");
        int opt = Integer.parseInt(sc.nextLine());
        return opt;
    }

}
