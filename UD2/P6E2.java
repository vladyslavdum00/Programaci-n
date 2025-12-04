import java.util.Scanner;
public class P6E2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el lado de triangulo: ");
        int lado = leer.nextInt();
        double altura = (double) Math.sqrt(3) * lado / 2;
        int perimetro = lado * 3;
        double area = lado * altura / 2; 
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);


    }
}
