package Banco1;

import java.util.ArrayList;

public class Banco {
    static ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

    public static void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }
    public static void listarCuentas() {
        if (!cuentas.isEmpty()) {
            for (int i = 0; i < cuentas.size(); i++) {
                Cuenta cuenta = cuentas.get(i);
                System.out.println();
                System.out.println(
                        "Cuenta: " + "#"+(i + 1) + "\n" + "Cliente " +
                                cuenta.getCliente().getNombre() + " " +
                                cuenta.getCliente().getApellido() + " | Saldo: " +
                                cuenta.getSaldo()
                );
            }
        }
    }

    public static void buscarCuenta(String nombre) {
        boolean encontrado = false;
        for(int i = 0; i < cuentas.size(); i++){
            String nom = cuentas.get(i).getCliente().getNombre().toLowerCase();
            if (nom.contains(nombre)){
                System.out.println("Nombre: " + cuentas.get(i).getCliente().getNombre());
                System.out.println("Apellido: " + cuentas.get(i).getCliente().getApellido());
                System.out.println("Saldo: " + cuentas.get(i).getSaldo());
                encontrado = true;

            }
    }
        if(!encontrado){
        System.out.println("Cliente no encontrado");}
    }
    public static void eliminarCuenta(int numeroCuenta) {
        cuentas.remove(numeroCuenta);
    }
    public static void mostrarMorosos(){
        int contador = 0;
        if (!cuentas.isEmpty()) {
            for (int i = 0; i < cuentas.size(); i++) {
                if (cuentas.get(i).getSaldo() < 0) {
                    contador++;
                    Cuenta cuenta = cuentas.get(i);
                    System.out.println();
                    System.out.println(
                            "Cuenta: " + "#"+(i + 1) + "\n" + "Cliente " +
                                    cuenta.getCliente().getNombre() + " " +
                                    cuenta.getCliente().getApellido() + " | Saldo: " +
                                    cuenta.getSaldo()
                    );
                }


            }
            if (contador < 1) {
                System.out.println("No hay cuentas con saldo negativo");
            }
        }
    }
    public static void hacerIngreso(String nombre, double dinero, int pos){
        if (cuentas.get(pos).getCliente().getNombre().toLowerCase().equals(nombre)){
            double saldoActual = cuentas.get(pos).getSaldo();
            cuentas.get(pos).setSaldo(saldoActual + dinero);
            System.out.println("Tu saldo de la cuenta despues de ingreso: " + cuentas.get(pos).getSaldo());
        }
    }
    public static void hacerRetirada(String nombre, double dinero, int pos){
        if (cuentas.get(pos).getCliente().getNombre().toLowerCase().equals(nombre)){
            double saldoActual = cuentas.get(pos).getSaldo();
            if ((saldoActual - dinero) < -100){
                System.out.println("No tienes saldo suficiente");
            }else{
                cuentas.get(pos).setSaldo(saldoActual - dinero);
                System.out.println("Tu saldo de la cuenta despues de  retirada: " + cuentas.get(pos).getSaldo());
            }
        }
    }

    public static void hacerTransferencia(String nombre1, String nombre2, double dinero, int pos1, int pos2){

    }
    }






