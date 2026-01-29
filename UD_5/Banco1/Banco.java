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

                System.out.println(
                        (i + 1) + ". " + " " + "Cliente " +
                                cuenta.getCliente().getNombre() + " " +
                                cuenta.getCliente().getApellido() + " | Saldo: " +
                                cuenta.getSaldo()
                );
            }
        }
    }

    }






