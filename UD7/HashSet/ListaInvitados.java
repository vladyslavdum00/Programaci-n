package HashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaInvitados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> invitados = new HashSet<>();
        String nombre;

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        while (true) {
            nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("fin")) break;

            invitados.add(nombre);
        }

        System.out.println("Hay " + invitados.size() + " invitados únicos en la lista.");
    }
}
