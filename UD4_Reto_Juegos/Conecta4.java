import java.util.Scanner;

public class Conecta4 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] Ncolumnas = {1, 2, 3, 4, 5, 6, 7};
        char jugador = 'X';
        boolean ganador = false;

        char tablero[][] = Tablero();

        while(!ganador){
            ImprimirTablero(tablero, Ncolumnas);
            System.out.println();
            System.out.print("Turno del jugador: " + jugador);
            System.out.println();

            int columna = PideColumna(sc);

            if (!ComprobarColumna(columna, tablero)) {
                System.out.println("Columna esta llena, elige otra");

                continue;
            }

            insertarFicha(columna, tablero, jugador);

            if (ComprobarGanador(tablero, jugador)) {
                ImprimirTablero(tablero, Ncolumnas);
                System.out.println("Gana el jugador: " + jugador);
                ganador = true;
            }else {
                jugador = jugador == 'X' ? 'O' : 'X';
            }
        }

    }

    static char[][] Tablero() {
        char[][] tablero = new char[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tablero[i][j] = '·';
            }
        }
        return tablero;
    }

    static void ImprimirTablero(char[][] tablero, int[] Ncolumnas) {
        System.out.println("=============================");
        System.out.println("||   TABLERO / CONECTA 4   ||");
        System.out.println("=============================");
        for (int i = 0; i < Ncolumnas.length; i++) {
            if (i == 0){
                System.out.printf("%3d",Ncolumnas[i]);
            }else {
                System.out.printf("%4d",Ncolumnas[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                switch (j) {
                    case 1:
                    case 3:
                    case 5:
                        System.out.print(" | " + tablero[i][j] + " | ");
                        break;
                    case 6:
                        System.out.print(tablero[i][j] +" |");
                        break;
                    case 0:
                        System.out.print("| " +tablero[i][j]);
                        break;
                    default:
                        System.out.print(tablero[i][j]);
                        break;
                }

            }
            System.out.println();
        }
    }
    static int PideColumna(Scanner sc) {
        int columna;
        boolean valido = true;
        do {
            System.out.println("Introduce la columna en que desea colocar ficha (1 - 7): ");
            columna = sc.nextInt();
            if (columna < 1 || columna > 7) {
                valido = false;
                System.out.println("La columna no es valida");
            }else  {
                valido = true;
            }
        }while(!valido);
        return columna;
    }
    static boolean ComprobarColumna(int columna, char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][columna - 1] == '·') {
                return true;
            }
        }
        return false;
    }

    static void insertarFicha(int columna, char[][] tablero, char jugador) {
        for (int i = tablero.length - 1; i >= 0; i--) {
            if (tablero[i][columna - 1] == '·') {
                tablero[i][columna - 1] = jugador;
                break;
            }
        }
    }

    static boolean ComprobarGanador(char[][] tablero, char jugador) {
        //Comprobación horizontal
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (tablero[i][j] == jugador &&
                        tablero[i][j + 1] == jugador &&
                        tablero[i][j + 2] == jugador &&
                        tablero[i][j + 3] == jugador) {
                    return true;
                }
            }
        }

        //Comprobación vertical
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (tablero[i][j] == jugador &&
                        tablero[i + 1][j] == jugador &&
                        tablero[i + 2][j] == jugador &&
                        tablero[i + 3][j] == jugador) {
                    return true;
                }
            }
        }

        //Comprobación diagonal /
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (tablero[i][j] == jugador &&
                        tablero[i - 1][j + 1] == jugador &&
                        tablero[i - 2][j + 2] == jugador &&
                        tablero[i - 3][j + 3] == jugador) {
                    return true;
                }
            }
        }

        //Comprobación diagonal \
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (tablero[i][j] == jugador &&
                        tablero[i + 1][j + 1] == jugador &&
                        tablero[i + 2][j + 2] == jugador &&
                        tablero[i + 3][j + 3] == jugador) {
                    return true;
                }
            }
        }

        return false;


    }
}

