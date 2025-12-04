import java.util.Scanner;

public class P3E7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime el ancho del rectagulo: ");
        double ancho = leer.nextDouble();

        System.out.println("Dime la altura del rectangulo: ");
        double altura = leer.nextDouble();

        System.out.println("Perimetro: " +perimetroRectangulo(altura, ancho));
        System.out.print("Area: " +areaRectangulo(altura, ancho));


    }

public static double perimetroRectangulo(double altura, double ancho){
    return 2 * (altura + ancho);
}

public static double areaRectangulo(double altura, double ancho){
    return altura * ancho;
}
}
