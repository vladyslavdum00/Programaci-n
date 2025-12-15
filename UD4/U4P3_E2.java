import java.util.Scanner;

public class U4P3_E2 {
    static void main(String[] args) {
        int[][] m = new int[10][10];
        Scanner sc = new Scanner(System.in);
        TablasMultiplicar(m);
        MostrarTablas(m);
        ValorTabla(m, sc);


    }
    static void TablasMultiplicar(int[][] m) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m[i][j] = (i + 1) * (j + 1);
            }
        }
    }
    static void MostrarTablas(int[][] m) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void ValorTabla(int[][] m, Scanner sc) {
        System.out.println("Dime el valor a: ");
        int a = sc.nextInt();
        System.out.println("Dime el valor b: ");
        int b = sc.nextInt();


                System.out.println(m[a - 1][b - 1]);


    }

}

