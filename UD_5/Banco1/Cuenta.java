package Banco1;

public class Cuenta {
    private Cliente cliente;
    private double saldo;

    public Cuenta(Cliente cliente) {
        setCliente(cliente);
        this.saldo = 0;
    }


//    public Cuenta(Cliente cliente, double saldo) {
//        setCliente(cliente);
//        setSaldo(saldo);
//    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < -100) {
            System.out.println("Saldo insuficiente");
        }
            this.saldo = saldo;

    }

}