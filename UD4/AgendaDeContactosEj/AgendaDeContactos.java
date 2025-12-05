
package AgendaDeContactosEj;

import java.util.Arrays;
import java.util.Scanner;


public class AgendaDeContactos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int MAX_SIZE = 100;
        int position = 0;
        int[] telefonos = new int[MAX_SIZE];
        String[] nombres = new String[MAX_SIZE];
        String[] emails = new String[MAX_SIZE];

        do {


            //PideYguardaName(sc, nombres, position);


            //PideYguardaTelef(sc, telefonos, position);
            //PideYguardaMail(sc, emails, position);
            AddContact(nombres, emails, telefonos, position, sc);
            System.out.println(Arrays.toString(nombres));
            //System.out.println(Arrays.toString(telefonos));
            //System.out.println(Arrays.toString(emails));
            position++;
        } while (position < MAX_SIZE);


    }


    static String PideNombre(Scanner sc, String[] nombres, int position) {
        String nombre = "";
        System.out.println("Introduce el nombre de la cuenta: ");
        nombre = sc.nextLine().trim();

        return nombre;
    }


    static int PideTelefono(Scanner sc, int[] telefonos, int position) {
        int telefono;
        System.out.println("Introduce el telefono del cuenta: ");
        telefono = Integer.parseInt(sc.nextLine().trim());

        return telefono;
    }

    static String PideEmail(Scanner sc, String[] emails, int position) {
        String email = "";
        System.out.println("Introduce el email de la cuenta: ");
        email = sc.nextLine().trim();
        return email;
    }

    static void MuestraMenu() {
        System.out.println("1. Listar contactos");
        System.out.println("2. Buscar por nombre");
        System.out.println("3. Añadir contacto");
        System.out.println("4. Modificar contacto");
        System.out.println("5. Eliminar contacto");
        System.out.println("0. Salir");
    }

    static int EligaOpción(Scanner sc) {
        System.out.print("Elige opcion: ");
        int opcion = sc.nextInt();
        return opcion;
    }


    static boolean ValidacionContact(String[] nombres, String nombre) {
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio");
            return false;
        }

        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i] != null && nombres[i].equals(nombre)) {
                System.out.println("Este contacto ya existe");
                return false;
            }

        }
        return true;
    }

    static boolean ValidacionTelefono(int[] telefonos, int telefono) {
        String tel = String.valueOf(telefono);
        if (tel.length() != 9) {
            System.out.println("El telefono no puede tener menos de 9 digitos");
            return false;
        }

        for (int i = 0; i < telefonos.length; i++) {
            if (telefonos[i] != 0 && telefonos[i] == telefono) {
                System.out.println("El telefono ya existe");
                return false;
            }
        }


        return true;
    }

    static boolean ValidacionEmail(String[] emails, String email) {
        if (email.isEmpty()) {
            System.out.println("El email no puede estar vacio");
            return false;
        }
        if (!email.contains("@")) {
            System.out.println("El formato de correo no  es valido");
            return false;
        }


        for (int i = 0; i < emails.length; i++) {
            if (emails[i] != null && emails[i].equals(email)) {
                System.out.println("El email ya existe");
                return false;
            }
        }
        return true;
    }

    static void AddContact(String[] nombres, String[] emails, int[] telefonos, int position, Scanner sc ) {

        boolean valido1;
        boolean valido2;
        boolean valido3;
        do {

            String nombre = PideNombre(sc, nombres, position);
            valido1 = ValidacionContact(nombres, nombre);

            int telefono = PideTelefono(sc, telefonos, position);
            valido2 = ValidacionTelefono(telefonos, telefono);

            String email = PideEmail(sc, emails, position);
            valido3 = ValidacionEmail(emails, email);
            if (valido1 && valido2 && valido3) {
                nombres[position] = nombre;
                telefonos[position] = telefono;
                emails[position] = email;
                System.out.println("Contacto agregado correctamente");
            }else System.out.println("Volve a introducir datos");
        }while (!valido1 && !valido2 && !valido3);
    }
}









