
package Agenda_de_Contactos;
import java.util.Scanner;

public class Programa {
    static Scanner sc = new Scanner(System.in);
    static int option;

    public static void main(String[] args) {

        do {
            Agenda.menuAgenda();
            option = EligaOption(sc);
            funcionalidadMenuAgenda(option, sc);

        } while (option != 0);
    }


    public static Contacto pideDatosDeContacto(Scanner sc) {
        boolean nombreValido = false;
        String nombre = " ";
        do {

            System.out.println("Dime el nombre del contacto: ");
            nombre = sc.nextLine().toLowerCase();
            if (nombre.length() >= 2) {
                nombreValido = true;
            } else {
                System.out.println("Por favor ingrese un nombre valido");
            }
        } while (!nombreValido);

        boolean telefonoValido = false;
        String telefono = " ";
        do {
            System.out.println("Dime el telefono del contacto: ");
            telefono = sc.nextLine().toLowerCase();
            if (telefono.length() == 9) {
                telefonoValido = true;
            } else {
                System.out.println("Por favor ingrese un telefono valido");
            }
        } while (!telefonoValido);

        boolean emailValido = false;
        String email = " ";
        do {
            System.out.println("Dime el email del contacto: ");
            email = sc.nextLine().toLowerCase();
            if (email.contains("@") && email.contains(".")) {
                emailValido = true;
            } else {
                System.out.println("Por favor ingrese un email valido");
            }
        } while (!emailValido);

        return new Contacto(nombre, telefono, email);
    }


    static int EligaOption(Scanner sc) {
        System.out.println();
        System.out.print("Elige opcion: ");
        int opcion = Integer.parseInt(sc.nextLine());
        return opcion;
    }


    public static void funcionalidadMenuAgenda(int option, Scanner sc) {
        switch (option) {
            case 1:
                Agenda.listarContactos();

                break;
            case 2:
                Contacto contacto = pideDatosDeContacto(sc);
                Agenda.agregarContacto(contacto);


                break;
            case 3:
                eliminarContacto(sc);
                break;
            case 4:
                buscaPorNombre(sc);
                break;
            case 5:
                buscaPorTelefono(sc);
                break;
            case 6:
                buscaPorEmail(sc);
                break;
            case 7:
                buscaPorTodo(sc);
                break;
            case 0:
                break;


            default:
                System.out.println("Opcion no valida");
                break;

        }
    }

    public static void buscaPorNombre(Scanner sc) {
        System.out.println("Dime el nombre del contacto: ");
        String busquedaNombre = sc.nextLine().toLowerCase();
        Agenda.buscarPorNombre(busquedaNombre);

    }
    public static void buscaPorTelefono(Scanner sc) {
        System.out.println("Dime el telefono del contacto: ");
        String busquedaTelefono = sc.nextLine().toLowerCase();
        Agenda.buscarPorTelefono(busquedaTelefono);

    }
    public static void buscaPorEmail(Scanner sc) {
        System.out.println("Dime el email del contacto: ");
        String busquedaEmail = sc.nextLine().toLowerCase();
        Agenda.buscarPorEmail(busquedaEmail);
    }

    public static void buscaPorTodo(Scanner sc) {
        System.out.println("Dime datos de la busqueda del contacto: ");
        String busquedaGeneral = sc.nextLine().toLowerCase();
        Agenda.busquedaGeneral(busquedaGeneral);
    }



    public static void eliminarContacto(Scanner sc) {
        Agenda.listarContactos();
        System.out.println("Dime el numero de contacto que desea eliminar: ");
        int num = Integer.parseInt(sc.nextLine());
        Agenda.eliminarContacto(num);
    }


}

