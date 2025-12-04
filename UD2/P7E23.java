import java.util.Scanner;

public class P7E23 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double cuota = 200;
        double descuento;
        double pago;

        System.out.print("Dime tu edad: ");
        int edad = leer.nextInt();
        
        
        System.out.println("¿Tus padres son socios? (s/n)");
        String socio = leer.next();


        if (edad > 65) {
            descuento = cuota * 0.5;
            pago = cuota - descuento;
            System.out.println("Descuento: 50%");
            System.out.print("Cuota a pagar: " + pago);
        }else if (edad < 18 && socio.equals("s")) {
            descuento = cuota * 0.35;
            pago = cuota - descuento;
            System.out.println("Descuento: 35%");
            System.out.print("Cuota a pagar: " + pago);
        }else if (edad < 18 && socio.equals("n")) {
            descuento = cuota * 0.25;
            pago = cuota - descuento;
            System.out.println("Descuento: 25%");
            System.out.print("Cuota a pagar: " + pago);
        }
    }
}
