import java.util.Scanner;

public class Conecta4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] Ncolumnas = {1, 2, 3, 4, 5, 6, 7};
        char tablero[][] = Tablero();
        ImprimirTablero(tablero, Ncolumnas);
        int columna = PideColumna(sc);
        boolean ColumnaLlena = ComprobarColumna(columna, tablero);
        System.out.println("Columna no esta Llena: " + ColumnaLlena);

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
}
