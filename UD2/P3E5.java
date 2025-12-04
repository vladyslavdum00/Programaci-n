import java.util.Scanner;

public class P3E5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime la frase: ");
        String frase = leer.nextLine();

        System.out.println("Dime primera palabra: ");
        String p1 = leer.nextLine();

        System.out.println("Dime segunda palabra: ");
        String p2 = leer.nextLine();

        System.out.println("La frase original es: " + frase);
        System.out.println("Palabra 1: " + p1);
        System.out.println("Palabra 2: " + p2);
        System.out.println("Sustituimos en la frase: " + frase.replace(p1, p2));
    }
}
