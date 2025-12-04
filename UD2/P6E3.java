import java.util.Scanner;

public class P6E3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
       
        System.out.println("Introduce el cantidad de dinero: ");
        double dinero = leer.nextDouble();
        
        
        System.out.println("Introduce la duración del plazo: ");
        double plazo = leer.nextDouble();

        System.out.println("Introduce porcentaje anual: ");
        double interes = leer.nextDouble();

        double anual = dinero * (interes / 100) * plazo;
        double hacienda = anual * 0.18;
        double resultado = dinero + anual - hacienda;

        System.out.println("Cantidad inicial: " + dinero);
        System.out.println("Interes anual: " + anual);
        System.out.println("Retención de hacienda: " + hacienda);
        System.out.println("Cantidad final: " + resultado);

    }
}
