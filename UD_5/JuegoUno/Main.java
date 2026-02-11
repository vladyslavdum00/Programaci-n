package JuegoUno;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Juego juego = new Juego();


        juego.barajarMazo();
        System.out.println();
        Mesa.printMazo();

    }
}
