import java.util.Scanner;

public class P8E2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Dime primer numero: ");
        int a = leer.nextInt();

        System.out.print("Dime segundo numero: ");
        int b = leer.nextInt();

        for (int i = a; i < b; i++ ){
            System.out.println(i);
        }
    }
}
