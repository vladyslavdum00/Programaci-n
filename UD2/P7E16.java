import java.util.Scanner;

public class P7E16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Adivina el numer de un dado (1-6): ");
        int adivinar = leer.nextInt();


        int num = (int) (Math.random() * 6) + 1;
        System.out.println("El numero es: " + num);

        if (adivinar == num) {
            System.out.println("Has adivinado el numero!!!!");
        }

    }
}
