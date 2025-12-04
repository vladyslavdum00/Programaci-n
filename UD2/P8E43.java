import java.util.Scanner;

public class P8E43 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Dime la frase: ");
        String frase = leer.nextLine().toLowerCase();

        System.out.println("Dime la palabra: ");
        String palabra = leer.nextLine().toLowerCase();

        int contador = 0;
        int buscador = 0;

        while ((buscador = frase.indexOf(palabra, buscador)) != -1) {
            contador++;
            buscador += palabra.length();
        }

            System.out.println("La palabra "+ palabra +" " +"aparace " +contador + " " +"veces");

    }


}
