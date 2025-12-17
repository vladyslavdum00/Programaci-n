import java.util.Scanner;


public class U4P3_E5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char jugador1 = 'X';
        char jugador2 = 'O';
        char tablero[][] = leerTablero3x3(sc);
        imprimirTablero(tablero);
        boolean ganadorX = hayGanador(tablero, jugador1);
        boolean ganadorO = hayGanador(tablero, jugador2);
        if (ganadorX) {
            System.out.println("Ganador X");
        }else if (ganadorO) {
            System.out.println("Ganador O");
        }else  {
            System.out.println("Empate");
        }

    }
    static char[][] leerTablero3x3(Scanner sc){
        char[][] tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduce el caracter a la celda "+"["+i+","+j+"]");
                tablero[i][j] = sc.next().toUpperCase().charAt(0);
            }
        }
        return tablero;
    }

    static void imprimirTablero(char[][] t){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }

    static boolean hayGanador(char[][] tablero, char jugador){
        if (tablero[0][0] == jugador && tablero[0][1] == jugador && tablero[0][2] == jugador) return true;
        if (tablero[2][0] == jugador && tablero[2][1] == jugador && tablero[2][2] == jugador) return true;
        if (tablero[1][0] == jugador && tablero[1][1] == jugador && tablero[1][2] == jugador) return true;
        if (tablero[0][0] == jugador &&  tablero[1][1] == jugador && tablero[2][2] == jugador) return true;
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) return true;
        if (tablero[0][0] == jugador && tablero[1][0] == jugador && tablero[2][0] == jugador) return true;
        if (tablero[0][1] == jugador &&  tablero[1][1] == jugador && tablero[2][1] == jugador) return true;
        if (tablero[0][2] == jugador && tablero[1][2] == jugador && tablero[2][2] == jugador) return true;
        else return false;


    }
}
