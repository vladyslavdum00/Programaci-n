import java.util.Arrays;

public class Practica9 {
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

        int[] sumaFilas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaFilas[i] += matriz[i][j];
            }
        }

        int[] sumaColumnas = new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaColumnas[i] += matriz[j][i];
            }
        }
        System.out.println("Suma de filas: " + Arrays.toString(sumaFilas));
        System.out.println("Suma de columnas: " + Arrays.toString(sumaColumnas));










    }
}
