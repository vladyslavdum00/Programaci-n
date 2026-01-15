import java.util.Scanner;

public class Main_Persona {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Dime el DNI de persona1: ");
        String dni = sc.nextLine();
        System.out.println("Dime el nombre de persona1: ");
        String nombre1 = sc.nextLine();
        System.out.println("Dime el apellido de persona1: ");
        String apellido1 = sc.nextLine();
        System.out.println("Dime el edad de persona1: ");
        int edad1 = sc.nextInt();
        sc.nextLine();

        Persona persona1 = new Persona(dni, nombre1, apellido1, edad1);

        System.out.println("Dime el DNI de persona2: ");
        String dni2 = sc.nextLine();
        System.out.println("Dime el nombre de persona2: ");
        String nombre2 = sc.nextLine();
        System.out.println("Dime el apellido de persona2: ");
        String apellido2 = sc.nextLine();
        System.out.println("Dime el edad de persona2: ");
        int edad2 = sc.nextInt();
        sc.close();

        Persona persona2 = new Persona(dni, nombre2, apellido2, edad2);

        persona1.muestraDatos();
        persona2.es_mayor_edad();
        System.out.println();
        persona1.muestraDatos();
        persona2.es_mayor_edad();
    }
}
