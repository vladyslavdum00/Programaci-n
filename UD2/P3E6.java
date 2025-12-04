import java.util.Scanner;

public class P3E6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime la frase: ");
        String frase = leer.nextLine();

        System.out.println("Dime el separador: ");
        String separador = leer.nextLine();

        System.out.println(frase);
        System.out.println(separador);
        System.out.println(" " + frase.replace(separador, "\n"));
    }
}
