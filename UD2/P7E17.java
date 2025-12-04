import java.util.Scanner;

public class P7E17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime el precio sin IVA: ");
        double precio = leer.nextDouble();

        System.out.println("DIme el % de IVA: ");
        double iva = leer.nextDouble() / 100;
        double pFinal = (precio * iva)+ precio;

        if (precio <= 0 || iva <= 0) {
            System.out.println("ERROR!!!!!!!");
            
        } else {
            System.out.println("El precio final es: " + pFinal);
        }
    }
}
