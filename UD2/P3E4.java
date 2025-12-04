import java.util.Scanner;

public class P3E4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Dime una frase: ");
        String frase = leer.nextLine();


        System.out.print("Dime una palabra: ");
        String palabra = leer.nextLine();


        System.out.println("La frase contiene esta palabra" + " "+ palabra + ":" + " " + frase.contains(palabra));
        System.out.println("La frase empiesza por esta palabra" + " " + palabra + ":" + " " + frase.startsWith(palabra));
        System.out.println("La frase acaba por esta palabra" + " " + palabra + ":" + " " +frase.endsWith(palabra));
    }
}
