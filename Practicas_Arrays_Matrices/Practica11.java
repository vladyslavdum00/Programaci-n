import java.util.Arrays;

public class Practica11 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int max = matriz[0][0];
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }

        System.out.println("Max: " + max + " Fila: " + fila + " Columna: " + columna);
        System.out.println();

        int[] diagonal1 = diagonalPrincipal(matriz);
        System.out.println("Diagonal 1: " + Arrays.toString(diagonal1));
        System.out.println();
        int[] diagonal2 = diagonalSecundaria(matriz);
        System.out.println("Diagonal 2: " + Arrays.toString(diagonal2));



    }

    static int[] diagonalPrincipal(int[][] matriz) {
        int[] diagonal1 = new int[matriz.length];
        int count = 0;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) diagonal1[count] = matriz[i][j];

            }
            count++;
        }
    return  diagonal1;
    }

    static int[] diagonalSecundaria(int[][] matriz) {
        int[] diagonal2 = new int[matriz.length];
        int count = 0;
        int j = matriz.length - 1;
        for (int i = 0; i < matriz.length; i++) {
            diagonal2 [count] = matriz[i][j];
            j--;

            count++;
        }
        return  diagonal2;
    }
}
