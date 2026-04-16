import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double precioBase = 10.0;
        System.out.println("Dime tu edad: ");
        int edad  = sc.nextInt();

        double descuento = 0.0;
        double precioConDescuento = precioBase;
        if (edad < 1 || edad > 100) {
            System.out.println("La edad no es valido");
            while (edad < 1 || edad > 100) {
                System.out.println("Introduce la edad de nuevo: ");
                edad = sc.nextInt();
            }
        }
        System.out.println("Dime el dia de la semana: ");
        int dia = sc.nextInt();
        if (dia < 1 || dia > 7) {
            System.out.println("El dia no es valido");
            while (dia < 1 || dia > 7) {
                System.out.println("Introduce el dia de nuevo: ");
                dia = sc.nextInt();
            }
        }
        if (edad < 12) {
           descuento += 0.5;
        }else if (edad > 65) {
             descuento += 0.3;
        }
        if (dia == 3){
           descuento += 0.2;
        }
        precioConDescuento = precioBase - (precioBase * descuento);
        System.out.println("El precio es: " + precioConDescuento);
    }
}
