import java.util.Scanner;

public class U4P3_E3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el cantidad de filas: ");
        int f = sc.nextInt();
        System.out.println("Dime el cantidad de columnas: ");
        int c = sc.nextInt();
        int[][] matrix = LeerMatrix(f, c, sc);
        Mostrar(matrix);
        int[] SumaFilas = SumaFilas(matrix, f, c);
        int[] SumaColumnas = SumaColumnas(matrix, f, c);
        System.out.println("Suma filas: ");
        MostrarVector(SumaFilas);
        System.out.println();
        System.out.println("Suma columnas: ");
        MostrarVector(SumaColumnas);
    }

    static int[][] LeerMatrix(int f, int c, Scanner sc) {

        int[][] matrix = new int[f][c];
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Los elementos para fila " + (i + 1) + ": ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Dime los elementos para columna " + (j + 1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }
    static void Mostrar(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

static int[] SumaFilas(int[][] matrix, int f, int c) {
    int[] sumaFilas = new int[f];
        for (int i = 0; i < f; i++) {

        for (int j = 0; j < c; j++) {
            sumaFilas[i] += matrix[i][j];
        }
    }
        return sumaFilas;
    }


    static int[] SumaColumnas(int[][] matrix, int f, int c) {
        int[] sumaColumnas = new int[c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                sumaColumnas[i] += matrix[j][i];
            }
        }
        return sumaColumnas;
    }

    static void MostrarVector(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
    }
}

