import java.util.Scanner;

public class P8E29 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime el numero: ");
        int numero = leer.nextInt();
        int suma = 0;

        while (numero > 0) {
            suma += numero % 10;
            numero = numero / 10;


        }

        System.out.println("La suma es: " +suma);
    }

}
