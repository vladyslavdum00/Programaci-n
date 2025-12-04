import java.util.Scanner;

public class P3E3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Dime el numero A: ");
        int a = leer.nextInt();

        System.out.print("Dime el numero B: ");
        int b = leer.nextInt();

        System.out.println("El numero menor es: " +minimo(a, b));
    }

    public static int minimo(int a, int b){
        if (a < b){
            return a;
        }else{
            return b;
        }
    }


}
