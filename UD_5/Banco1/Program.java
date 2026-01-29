package Banco1;
import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            mostrarMenu();
            option = eligaOption();
            iniciarFuncionamiento(option);

        } while (option != 0);
    }

    public static void mostrarMenu() {
        System.out.println("---MENU DEL BANCO---");
        System.out.println();
        System.out.println("01 Ver cuentas");
        System.out.println("02 Ingresar dinero");
        System.out.println("03 Retirar dinero");
        System.out.println("04 Transferencia");
        System.out.println("05 Agregar cuenta");
        System.out.println("06 Eliminar cuenta");
        System.out.println("07 Buscar cuenta");
        System.out.println("08 Mostrar morosos");
        System.out.println("00 Salir");
    }

    static int eligaOption() {
        System.out.println();
        System.out.print("Elige opcion: ");
        int opcion = Integer.parseInt(sc.nextLine());
        return opcion;
    }

    public static void iniciarFuncionamiento(int option) {
        switch (option) {
            case 1:
                Banco.listarCuentas();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                agregar_Cuenta_Cliente();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 0:
                break;


            default:
                System.out.println("Opcion no valida");
                break;

        }


    }


    public static void agregar_Cuenta_Cliente() {
        String nombre;
        String apellido;
        boolean clienteExiste;

        do {
            boolean nombreValido;
            do {
                System.out.println("Dime el nombre del cliente: ");
                nombre = sc.nextLine().toLowerCase();
                nombreValido = nombre.length() >= 3;

                if (!nombreValido) {
                    System.out.println("Por favor ingrese un nombre valido");
                }
            } while (!nombreValido);

            boolean apellidoValido;
            do {
                System.out.println("Dime el apellido del cliente: ");
                apellido = sc.nextLine().toLowerCase();
                apellidoValido = apellido.length() >= 3;

                if (!apellidoValido) {
                    System.out.println("Por favor ingrese un apellido valido");
                }
            } while (!apellidoValido);

            clienteExiste = false;
            for (int i = 0; i < Banco.cuentas.size(); i++) {
                Cliente cli = Banco.cuentas.get(i).getCliente();
                if (cli.getNombre().equals(nombre) && cli.getApellido().equals(apellido)) {
                    clienteExiste = true;
                    System.out.println("El cliente ya existe");
                    break;
                }
            }

        } while (clienteExiste);

        Cliente c = new Cliente(nombre, apellido);
        Cuenta cuenta = new Cuenta(c);
        Banco.cuentas.add(cuenta);

    }
}

