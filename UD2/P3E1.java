import java.util.Scanner;

public class P3E1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Dime una frase: ");
        String frase = leer.nextLine();

        System.out.println("Tu frase es: " + frase.toUpperCase() + "," + " " + frase.toLowerCase());
    }
}
