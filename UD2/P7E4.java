import java.util.Scanner;

public class P7E4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        System.out.println("Dime el numero: ");
        int num = leer.nextInt();

        if (num >= 0) {
            System.out.println("Este numero es positivo");
        } else {
            System.out.println("Este numero es negativo");
        }
    }
}
