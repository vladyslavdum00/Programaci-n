import java.util.Scanner;
public class U4P2_E4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[3];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduzca el nombre: ");
            nombres[i] = sc.nextLine().trim();
        }

        int min = 0;
        int max = 0;

        for (int i = 0; i < nombres.length; i++) {
           if (nombres[i].length() < nombres[min].length()) {
               min = i;
           }
           if (nombres[i].length() > nombres[max].length()) {
               max = i;
           }
        }
        System.out.println("El nombre más corto es: " +nombres[min] + " y tiene " +nombres[min].length() );
        System.out.println("El nombre más corto es: " +nombres[max] + " y tiene " +nombres[max].length() );




















    }
}
