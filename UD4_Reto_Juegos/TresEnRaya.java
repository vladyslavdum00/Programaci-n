import java.util.Scanner;
import java.util.Arrays;

public class TresEnRaya {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char tablero[][] = Tablero();
        imprimirTablero(tablero);

    }

    static char[][] Tablero() {
        char[][] tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '·';
            }
        }
        return tablero;
    }

    static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (tablero[i][j]) {
                    case 2:
                    case 5:
                    case 8:
                        System.out.print(" | " + tablero[i][j] + " | ");
                        break;
                    default:
                        System.out.print(tablero[i][j]);

                }
                System.out.println();
            }

        }
    }
    }




    /*
    static int PideJugada(Scanner sc) {
        System.out.println("Ingresa la posición de la celda ");
    }
}
*/