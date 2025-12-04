import java.util.Scanner;

public class P8E27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cantidad en euros: ");
        int cantidad = scanner.nextInt();

        System.out.println("Desglose mínimo de billetes y monedas para " + cantidad + " 145€:");

        int billetes500 = cantidad / 500;
        cantidad = cantidad % 500;

        int billetes200 = cantidad / 200;
        cantidad = cantidad % 200;

        int billetes100 = cantidad / 100;
        cantidad = cantidad % 100;

        int billetes50 = cantidad / 50;
        cantidad = cantidad % 50;

        int billetes20 = cantidad / 20;
        cantidad = cantidad % 20;

        int billetes10 = cantidad / 10;
        cantidad = cantidad % 10;

        int billetes5 = cantidad / 5;
        cantidad = cantidad % 5;

        int monedas2 = cantidad / 2;
        cantidad = cantidad % 2;

        int monedas1 = cantidad;


        if (billetes500 > 0) System.out.println(billetes500 + " billete(s) de 500 €");
        if (billetes200 > 0) System.out.println(billetes200 + " billete(s) de 200 €");
        if (billetes100 > 0) System.out.println(billetes100 + " billete(s) de 100 €");
        if (billetes50 > 0) System.out.println(billetes50 + " billete(s) de 50 €");
        if (billetes20 > 0) System.out.println(billetes20 + " billete(s) de 20 €");
        if (billetes10 > 0) System.out.println(billetes10 + " billete(s) de 10 €");
        if (billetes5 > 0) System.out.println(billetes5 + " billete(s) de 5 €");
        if (monedas2 > 0) System.out.println(monedas2 + " moneda(s) de 2 €");
        if (monedas1 > 0) System.out.println(monedas1 + " moneda(s) de 1 €");
    }
}
