package Banco1;

import java.util.Scanner;


public class Programa {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            mostrarMenu();
            option = eligaOption(sc);
            iniciarFuncionamiento(option, sc);

        } while (option != 0);
    }

    public static void mostrarMenu() {
        System.out.println("---MENU DEL BANCO---");
        System.out.println();
        System.out.println("01 Ver clientes");
        System.out.println("02 Ingresar dinero");
        System.out.println("03 Retirar dinero");
        System.out.println("04 Transferencia");
        System.out.println("05 Agregar cliente");
        System.out.println("06 Eliminar cliente");
        System.out.println("07 Agregar cuenta a cliente");
        System.out.println("08 Eliminar cuenta de cliente");
        System.out.println("09 Mostrar cuenta de cliente");
        System.out.println("10 Mostrar movimientos de cuenta de cliente");
        System.out.println("11 Buscar cuenta");
        System.out.println("12 Mostrar morosos");
        System.out.println("00 Salir");
    }

    static int eligaOption(Scanner sc) {
        System.out.println();
        System.out.print("Elige opcion: ");
        int opcion = Integer.parseInt(sc.nextLine());
        return opcion;
    }

    public static void iniciarFuncionamiento(int option, Scanner sc) {
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                agregarCliente(sc);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 0:
                break;


            default:
                System.out.println("Opcion no valida");
                break;

        }


    }
}

    public static void agregarCliente(Scanner sc) {
        String nombre = "";
        String apellido = "";
        String direccion;
        String localidad;
        boolean existeNombre = false;
        boolean existeApellido = false;
        boolean validoDireccion = false;
        boolean validoLocalidad = false;
        do {
            System.out.println("Ingrese el nombre del cliente: ");
            String nom = sc.nextLine();
            System.out.println("Ingrese el apellido del cliente: ");
            String ap = sc.nextLine();

            for (int i = 0; i < Banco.clientes.size(); i++) {
                if (Banco.clientes.get(i).getNombre().equals(nom) &&  Banco.clientes.get(i).getApellido().equals(ap)) {
                    existeNombre = true;
                    existeApellido = true;
                    System.out.println("El cliente existe");
                }else{
                    nombre = nom;
                    apellido = ap;
                }
            }
        }while(existeNombre && existeApellido);

        do {
            System.out.println("Ingrese la dirección del cliente: ");
            direccion = sc.nextLine();
            if (direccion.length() > 4) {
                validoDireccion = true;
            }else{
                System.out.println("Direccion no valida");
            }
        }while(!validoDireccion);

        do {
            System.out.println("Ingrese la localidad del cliente: ");
            localidad = sc.nextLine();
            if (localidad.length() > 4) {
                validoLocalidad = true;
            }else{
                System.out.println("Localidad no valida");
            }
        }while(!validoLocalidad);

        Cliente cliente = new Cliente(nombre, apellido, direccion, localidad);
        Banco.agregarCliente(cliente);
    }
