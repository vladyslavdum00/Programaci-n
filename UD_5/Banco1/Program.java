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
                hacerIngreso();
                break;
            case 3:
                hacerRetirada();
                break;
            case 4:
                hacerTransferencia();
                break;
            case 5:
                agregar_Cuenta_Cliente();
                break;
            case 6:
                eliminar_cuenta();
                break;
            case 7:
                buscar_cuenta();
                break;
            case 8:
                Banco.mostrarMorosos();
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

    public static void buscar_cuenta() {
        String nombre;
        System.out.println("Dime los para busqueda de la cuenta: ");
        nombre = sc.nextLine().toLowerCase();
        Banco.buscarCuenta(nombre);

    }

    public static void eliminar_cuenta() {
        boolean cuentaExiste;
        Banco.listarCuentas();
        do {
            cuentaExiste = true;
            System.out.println("Introduce el numero de la cuenta que desea eliminar: ");
            int numeroCuenta = Integer.parseInt(sc.nextLine());
            if (numeroCuenta < 1 || (numeroCuenta) > Banco.cuentas.size()) {
                System.out.println("La cuenta no existe");
                cuentaExiste = false;
            } else {
                Banco.cuentas.remove(numeroCuenta - 1);
                System.out.println("La cuenta eliminada correctamente");
            }
        } while (!cuentaExiste);
    }

    public static void hacerIngreso() {
        String nombre;
        boolean nombreValido;
        do {
            System.out.println("Dime el nombre del cliente: ");
            nombre = sc.nextLine().toLowerCase();
            nombreValido = nombre.length() >= 3;

            if (!nombreValido) {
                System.out.println("Por favor ingrese un nombre valido");
            }
        } while (!nombreValido);

        int pos = -1;
        boolean encontrado = false;
        for (int i = 0; i < Banco.cuentas.size(); i++) {
            String nom = Banco.cuentas.get(i).getCliente().getNombre().toLowerCase();
            if (nom.equals(nombre)) {
                System.out.println("Nombre: " + Banco.cuentas.get(i).getCliente().getNombre());
                System.out.println("Apellido: " + Banco.cuentas.get(i).getCliente().getApellido());
                System.out.println("Saldo: " + Banco.cuentas.get(i).getSaldo());
                encontrado = true;
                pos = i;

            }
        }
        if (!encontrado) {
            System.out.println("Cliente no encontrado");
        }
        if (encontrado) {
            double dinero;
            boolean valorValido = false;
            do {
                System.out.println("Dime el cantidad de dinero que desea ingresar: ");
                dinero = Double.parseDouble(sc.nextLine());
                if (dinero > 0) {
                    valorValido = true;
                }
            } while (!valorValido);

            Banco.hacerIngreso(nombre, dinero, pos);
            System.out.println("Ingreso realizado correctamente");

        }
    }

    public static void hacerRetirada() {
        String nombre;
        boolean nombreValido;
        do {
            System.out.println("Dime el nombre del cliente: ");
            nombre = sc.nextLine().toLowerCase();
            nombreValido = nombre.length() >= 3;

            if (!nombreValido) {
                System.out.println("Por favor ingrese un nombre valido");
            }
        } while (!nombreValido);

        int pos = -1;
        boolean encontrado = false;
        for (int i = 0; i < Banco.cuentas.size(); i++) {
            String nom = Banco.cuentas.get(i).getCliente().getNombre().toLowerCase();
            if (nom.equals(nombre)) {
                System.out.println("Nombre: " + Banco.cuentas.get(i).getCliente().getNombre());
                System.out.println("Apellido: " + Banco.cuentas.get(i).getCliente().getApellido());
                System.out.println("Saldo: " + Banco.cuentas.get(i).getSaldo());
                encontrado = true;
                pos = i;

            }
        }
        if (!encontrado) {
            System.out.println("Cliente no encontrado");
        }
        if (encontrado) {
            double dinero;
            boolean valorValido = false;
            do {
                System.out.println("Dime el cantidad de dinero que desea retirar: ");
                dinero = Double.parseDouble(sc.nextLine());
                if (dinero > 0) {
                    valorValido = true;
                }
            } while (!valorValido);

            Banco.hacerRetirada(nombre, dinero, pos);
            System.out.println("Retirada de deniro realizada con exito");

        }
    }

    public static void hacerTransferencia() {
        String nombre1;
        boolean nombreValido;
        do {
            System.out.println("Dime el nombre del Benificiario: ");
            nombre1 = sc.nextLine().toLowerCase();
            nombreValido = nombre1.length() >= 3;

            if (!nombreValido) {
                System.out.println("Por favor ingrese un nombre valido");
            }
        } while (!nombreValido);

        int pos1 = -1;
        boolean encontrado1 = false;
        for (int i = 0; i < Banco.cuentas.size(); i++) {
            String nom = Banco.cuentas.get(i).getCliente().getNombre().toLowerCase();
            if (nom.equals(nombre1)) {
                System.out.println("Nombre: " + Banco.cuentas.get(i).getCliente().getNombre());
                System.out.println("Apellido: " + Banco.cuentas.get(i).getCliente().getApellido());
                System.out.println("Saldo: " + Banco.cuentas.get(i).getSaldo());
                encontrado1 = true;
                pos1 = i;

            }
        }
        if (!encontrado1) {
            System.out.println("Cliente no encontrado");
        }
        double dinero = 0;
        if (encontrado1) {
            boolean valorValido = false;
            do {
                System.out.println("Dime el cantidad de dinero que desea transferir: ");
                dinero = Double.parseDouble(sc.nextLine());
                if (dinero > 0) {
                    valorValido = true;
                }
            } while (!valorValido);




        }

        String nombre2;
        boolean nombreValido2;
        do {
            System.out.println("Dime el nombre del Destinatario: ");
            nombre2 = sc.nextLine().toLowerCase();
            nombreValido2 = nombre2.length() >= 3;

            if (!nombreValido2) {
                System.out.println("Por favor ingrese un nombre valido");
            }
        } while (!nombreValido2);

        int pos2 = -1;
        boolean encontrado2 = false;
        for (int i = 0; i < Banco.cuentas.size(); i++) {
            String nom = Banco.cuentas.get(i).getCliente().getNombre().toLowerCase();
            if (nom.equals(nombre2)) {
                System.out.println("Nombre: " + Banco.cuentas.get(i).getCliente().getNombre());
                System.out.println("Apellido: " + Banco.cuentas.get(i).getCliente().getApellido());
                System.out.println("Saldo: " + Banco.cuentas.get(i).getSaldo());
                encontrado2 = true;
                pos2 = i;

            }
        }

        Banco.hacerTransferencia(nombre1, nombre2, dinero, pos1, pos2);
    }

}

