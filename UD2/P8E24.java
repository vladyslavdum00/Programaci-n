import java.util.Scanner;

public class P8E24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de N (cantidad de números de Fibonacci): ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Por favor, introduce un número mayor que 0.");
        } else {
            int a = 1;
            int b = 1;

            System.out.println("Los primeros " + N + " números de la secuencia de Fibonacci son:");

            for (int i = 1; i <= N; i++) {
                if (i == 1 || i == 2) {
                    System.out.print("1 ");
                } else {
                    int c = a + b;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
            }


    }
}
}