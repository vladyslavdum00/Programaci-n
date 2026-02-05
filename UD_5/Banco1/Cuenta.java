package Banco1;

public class Cuenta {
    private Cliente cliente;
    private double saldo;
    private static int contador = 0;
    private final String IBAN;

    public Cuenta(Cliente cliente) {
        setCliente(cliente);
        this.saldo = 0;
        if(contador == 0){
            this.IBAN = "ES0000";
            contador++;
        }else if(contador < 10){
            this.IBAN = "ES000" + contador;
            contador++;
        }else if(contador < 100){
            this.IBAN = "ES00" + contador;
            contador++;
        }else if(contador < 1000){
            this.IBAN = "ES0" + contador;
            contador++;
        }else if(contador >= 1000 && contador < 10000){
            this.IBAN = "ES" + contador;
            contador++;
        }else {
            this.IBAN = null;
        }
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

    public String getIBAN() {
        return IBAN;
    }


}