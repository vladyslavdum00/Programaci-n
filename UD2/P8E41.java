import java.util.Scanner;

public class P8E41 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el numero: ");
        int x = leer.nextInt();

        for (int num = 2; num <= x; num++) {
            boolean primo = true;

            for (int j = 2; j <= (num / 2); j++) {
                if (num % j == 0) {
                    primo = false;
                    break;

                }

            }
            if (primo == true) {
                System.out.print(num + " ");

            }

        }

        System.out.println();

    }
}
