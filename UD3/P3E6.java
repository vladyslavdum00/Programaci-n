import java.util.Scanner;

public class P3E6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double precio = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Dime el precio: ");
            precio = leer.nextInt();
            System.out.println("Precio con IVA: " +precioConIVA(precio));

        }

    }


public static double precioConIVA(double precio){
    return precio * 1.21;
}


}
