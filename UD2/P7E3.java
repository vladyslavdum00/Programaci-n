import java.util.Scanner;

public class P7E3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime primer numero: ");
        int num1 = leer.nextInt();


        System.out.println("Dime segundo numero: ");
        int num2 = leer.nextInt();

        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        } else {
            System.out.println("El numero mayor es: " + num2);
        }
    }
}
