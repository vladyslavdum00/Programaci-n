import java.util.Scanner;

public class P3E1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

       System.out.println("Dime el numero A: ");
        double a = leer.nextDouble();

        System.out.println("Dime el numero B: ");
        double b = leer.nextDouble();

        System.out.println(multiplica(a, b));


    }

    public static double multiplica(double a, double b){


        return a * b;
    }

}
