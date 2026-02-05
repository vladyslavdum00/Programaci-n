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
                                cuenta.getCliente().getApellido() + " | " + "IBAN: " + cuenta.getIBAN() +
                                " | Saldo: " +
                                cuenta.getSaldo()
                );
            }
        }else{
            System.out.println("no hay cuentas agregadas");
        }
    }

    public static void buscarCuenta(String nombre) {
        boolean encontrado = false;
        for(int i = 0; i < cuentas.size(); i++){
            String nom = cuentas.get(i).getCliente().getNombre().toLowerCase();
            if (nom.contains(nombre)){
                System.out.println("Nombre: " + cuentas.get(i).getCliente().getNombre());
                System.out.println("Apellido: " + cuentas.get(i).getCliente().getApellido());
                System.out.println("IBAN: " + cuentas.get(i).getIBAN());
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
                                    cuenta.getCliente().getApellido() + " | " + "IBAN: " + cuenta.getIBAN() +
                                    " | Saldo: " +
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

        }
    }
    public static void hacerRetirada(String nombre, double dinero, int pos){
        if (cuentas.get(pos).getCliente().getNombre().toLowerCase().equals(nombre)){
            double saldoActual = cuentas.get(pos).getSaldo();
            if ((saldoActual - dinero) < -100){
                System.out.println("No tienes saldo suficiente");
            }else{
                cuentas.get(pos).setSaldo(saldoActual - dinero);

            }
        }
    }

    public static void hacerTransferencia(String nombre1, String nombre2, double dinero, int pos1, int pos2){
        if (cuentas.get(pos1).getCliente().getNombre().toLowerCase().equals(nombre1) && cuentas.get(pos2).getCliente().getNombre().toLowerCase().equals(nombre2)) {
            double saldoActual1 = cuentas.get(pos1).getSaldo();
            if ((saldoActual1 - dinero) < -100){
                System.out.println("No tienes saldo suficiente");
            }else{
               hacerRetirada(nombre1, dinero, pos1);
               hacerIngreso(nombre2, dinero, pos2);
                System.out.println("Transferencia realizada con exito");
            }
        }
    }
    }






