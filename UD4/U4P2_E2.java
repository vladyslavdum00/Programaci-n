import java.util.Scanner;

public class U4P2_E2 {
    static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduzca el nombre: ");
            nombres[i] = sc.nextLine().trim();
        }
        System.out.println("Introduzca el nombre para buscar: ");
        String nombre = sc.nextLine().trim();

        for (int i = 0; i < nombres.length; i++) {
            if (nombre.equals(nombres[i])) {
                System.out.println("El nombre SI esta en array");

            }else  {
                System.out.println("El nombre NO esta en array");

            }
            break;
        }

    }
    }


