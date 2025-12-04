import java.util.Scanner;

public class P3E7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Dime la frase: ");
        String frase = leer.nextLine();

        System.out.println(frase.replace(",", "\n").replace(".", "\n").replace(" ", "\n"));
    }
}
