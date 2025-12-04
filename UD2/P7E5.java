import java.util.Scanner;

public class P7E5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime primer numero: ");
        int num1 = leer.nextInt();

        System.out.println("Dime segundo numero: ");
        int num2 = leer.nextInt();

        if (num1 > num2) {
            System.out.println(num2);
            System.out.println(num1);
        } else {
            System.out.println(num1);
            System.out.println(num2);
        }
    }
}
