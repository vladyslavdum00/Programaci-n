import java.util.Scanner;

public class P3E3 {
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    System.out.print("Dime tu nombre: ");
    String nombre = leer.nextLine();


    System.out.print("Dime tu primer apellido: ");
    String ap1 = leer.nextLine();


    System.out.print("Dime tu segundo apellido: ");
    String ap2 = leer.nextLine();

    String usercod = nombre.substring(0,3) + ap1.substring(0,3) + ap2.substring(0,3);
    System.out.println("Tu codigo es: " + usercod.toUpperCase());
   }
}
