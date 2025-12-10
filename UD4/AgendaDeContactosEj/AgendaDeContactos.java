
package AgendaDeContactosEj;
import java.util.Arrays;
import java.util.Scanner;

public class AgendaDeContactos {
    static Scanner sc = new Scanner(System.in);
    static int MAX_SIZE = 100;
    static int position = 0;
    static int option;
    static int[] telefonos = new int[MAX_SIZE];
    static String[] nombres = new String[MAX_SIZE];
    static String[] emails = new String[MAX_SIZE];

    public static void main(String[] args) {

        do {
            MuestraMenu();
            option = EligaOption(sc);
            position = FuncionalidadMenu(option, nombres, emails, telefonos, position, sc);
            //System.out.println(Arrays.toString(nombres));
            //System.out.println(Arrays.toString(emails));
            //System.out.println(Arrays.toString(telefonos));
        } while (option != 0);

    }

    //Metodos de UI de usuario:
    static String PideNombre(Scanner sc) {
        String nombre ="";
        System.out.println("Introduce el nombre del contacto: ");
        nombre = sc.nextLine().trim();

        return nombre;
    }


    static int PideTelefono(Scanner sc) {
        int telefono;
        System.out.println("Introduce el telefono del contacto: ");
        telefono = Integer.parseInt(sc.nextLine().trim());

        return telefono;
    }

    static String PideEmail(Scanner sc) {
        String email;
        System.out.println("Introduce el email del contacto: ");
        email = sc.nextLine().trim();
        return email;
    }

    static void MuestraMenu() {
        System.out.println("======================================");
        System.out.println("      MENU / AGENDA DE CONTACTOS      ");
        System.out.println("======================================");
        System.out.println();
        System.out.println("1. Listar contactos");
        System.out.println("2. Buscar por nombre");
        System.out.println("3. Añadir contacto");
        System.out.println("4. Modificar contacto");
        System.out.println("5. Eliminar contacto");
        System.out.println("0. Salir");
    }

    static int EligaOption(Scanner sc) {
        System.out.println();
        System.out.print("Elige opcion: ");
        return Integer.parseInt(sc.nextLine());
    }

    static void AddContact(String[] nombres, String[] emails, int[] telefonos, int position, Scanner sc) {

        String nombre = "";
        int telefono;
        String email;

        System.out.println("=====================================");
        System.out.println("      REGISTRACIÓN DEL CONTACTO      ");
        System.out.println("=====================================");
        System.out.println();
        if (position < 100) {
            do {
                nombre = PideNombre(sc);
            } while (!ValidacionContact(nombres, nombre));

            do {
                telefono = PideTelefono(sc);
            } while (!ValidacionTelefono(telefonos, telefono));

            do {
                email = PideEmail(sc);
            } while (!ValidacionEmail(emails, email));

            nombres[position] = nombre.toLowerCase();
            telefonos[position] = telefono;
            emails[position] = email.toLowerCase();
            System.out.println("Contacto agregado correctamente");

        } else System.out.println("No se puede agregar contacto");
    }

    static String PideTextoParaBusquedaDeContacto(Scanner sc) {
        String busqueda = "";
        System.out.println("Introduce el nombre del contacto o cadena de texto que contiene: ");
        busqueda = sc.nextLine().trim();
        return busqueda;
    }

    static void BuscaYmuestraContacto(String[] nombres, String[] emails, int[] telefonos, Scanner sc) {

        System.out.println("====================================");
        System.out.println("      BUSQUEDA DE CONTACTOS      ");
        System.out.println("====================================");
        System.out.println();

        String busqueda = PideTextoParaBusquedaDeContacto(sc);
        int index = BuscarIndiceDeContacto(nombres, busqueda);

        if (index == -1) {
            System.out.println("El contacto no existe");
        } else {
            System.out.println("El nombre de contacto: " + nombres[index]);
            System.out.println("El telefono de contacto: " + telefonos[index]);
            System.out.println("El email de contacto: " + emails[index]);
        }
    }

    static String PideNombreDeContacto(Scanner sc) {
        String busqueda = "";
        System.out.print("Introduce el nombre del contacto: ");
        busqueda = sc.nextLine().trim();
        return busqueda;
    }

    static void MenuDeModificacionDeContacto() {
        System.out.println("============================================");
        System.out.println("      MENU / MODIFICACIÓN DEL CONTACTO      ");
        System.out.println("============================================");
        System.out.println();
        System.out.println("1. Modificar nombre del contacto");
        System.out.println("2. Modificar telefono del contacto");
        System.out.println("3. Modificar email del contacto");
        System.out.println("4. Modificar todos los datos del contacto");
        System.out.println("0. Salir");
    }


    //Metodos de logíca
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
        if (!email.contains("@") || !email.contains(".")) {
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


    static int FuncionalidadMenu(int option, String[] nombres, String[] emails, int[] telefonos, int position, Scanner sc) {
        switch (option) {
            case 1:
                ListarContactos(nombres, emails, telefonos);
                break;
            case 2:
                BuscaYmuestraContacto(nombres, emails, telefonos, sc);
                break;
            case 3:
                AddContact(nombres, emails, telefonos, position, sc);
                position++;
                break;
            case 4:
                ModificaContacto(nombres, emails, telefonos, sc);
                break;
            case 5:
                EliminarContacto(nombres, emails, telefonos, position, sc);
                break;
            case 0:
                System.out.println("Gracias por usar nuestra agenda!");
                break;
            default:
                System.out.println("Opcion no valida");
                break;

        }
        return position;
    }


    static int BuscarIndiceDeContacto(String[] nombres, String busqueda) {
        String texto = busqueda.toLowerCase();

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null) {
                String nombre = nombres[i].toLowerCase();
                if (nombre.contains(texto) || nombre.startsWith(texto)) {
                    return i;
                }
            }
        }
        return -1;
    }

    static void ModificaContacto(String[] nombres, String[] emails, int[] telefonos, Scanner sc) {
        String busqueda = PideNombreDeContacto(sc).toLowerCase();
        int index = BuscarIndiceDeContacto(nombres, busqueda);
        if (index == -1) {
            System.out.println("El contacto no existe");
            return;
        }


        MenuDeModificacionDeContacto();
        System.out.println("Elige opción: ");
        int opcion = Integer.parseInt(sc.nextLine());
        switch (opcion) {
            case 1:
                String NuevoNombre;
                do {
                    System.out.println("Introduce el nuevo nombre del contacto");
                    NuevoNombre = sc.nextLine().trim();
                } while (!ValidacionContact(nombres, NuevoNombre));

                nombres[index] = NuevoNombre;
                System.out.println("El nombre se ha modificado correctamente");
                break;

            case 2:
                int NuevoTelefono;
                do {
                    System.out.println("Introduce el nuevo telefono del contacto");
                    NuevoTelefono = Integer.parseInt(sc.nextLine().trim());
                } while (!ValidacionTelefono(telefonos, NuevoTelefono));

                telefonos[index] = NuevoTelefono;
                System.out.println("El telefono se ha modificado correctamente");
                break;

            case 3:
                String NuevoEmail;
                do {
                    System.out.println("Introduce el nuevo email del contacto");
                    NuevoEmail = sc.nextLine().trim();
                } while (!ValidacionEmail(emails, NuevoEmail));

                emails[index] = NuevoEmail;
                System.out.println("El email se ha modificado correctamente");
                break;

            case 4:
                do {
                    System.out.println("Introduce el nuevo nombre del contacto");
                    NuevoNombre = sc.nextLine().trim();
                } while (!ValidacionContact(nombres, NuevoNombre));

                do {
                    System.out.println("Introduce el nuevo telefono del contacto");
                    NuevoTelefono = Integer.parseInt(sc.nextLine().trim());
                } while (!ValidacionTelefono(telefonos, NuevoTelefono));

                do {
                    System.out.println("Introduce el nuevo email del contacto");
                    NuevoEmail = sc.nextLine().trim();
                } while (!ValidacionEmail(emails, NuevoEmail));

                nombres[index] = NuevoNombre;
                telefonos[index] = NuevoTelefono;
                emails[index] = NuevoEmail;

                System.out.println("El contacto se ha modificado correctamente");
                break;
            case 0:
                break;

            default:
                System.out.println("Opcion no valida");
        }

    }


    static void ListarContactos(String[] nombres, String[] emails, int[] telefonos) {
        System.out.println("====================================");
        System.out.println("      LISTA DE CONTACTOS      ");
        System.out.println("====================================");
        boolean hayContactos = false;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null) {
                hayContactos = true;
                System.out.println("Contacto: " + nombres[i]);
                System.out.println("Telefono del contacto: " + telefonos[i]);
                System.out.println("Email del contacto: " + emails[i]);
                System.out.println();
                System.out.println();
            }
        }

        if (!hayContactos) {
            System.out.println("No hay contactos registrados");
        }

    }

    static int EliminarContacto(String[] nombres, String[] emails, int[] telefonos, int position, Scanner sc) {
        System.out.println("====================================");
        System.out.println("      ELIMINACIÓN DEL CONTACTO      ");
        System.out.println("====================================");
        String busqueda = PideNombreDeContacto(sc);
        int index = BuscarIndiceDeContacto(nombres, busqueda);


        if (index == -1) {
            System.out.println("El contacto no existe");
            return position;
        }

        for (int i = index; i < position - 1; i++) {
            nombres[i] = nombres[i + 1];
            telefonos[i] = telefonos[i + 1];
            emails[i] = emails[i + 1];
        }


        nombres[position - 1] = null;
        telefonos[position - 1] = 0;
        emails[position - 1] = null;

        position--;

        System.out.println("Contacto eliminado correctamente");
        return position;
    }

}







