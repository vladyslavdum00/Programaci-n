import java.util.Scanner;

public class P7E1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime tu edad: ");
        int edad = leer.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de Edad");
        }
    }
}
