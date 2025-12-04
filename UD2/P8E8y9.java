import java.util.Scanner;

public class P8E8y9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Dime primer numero: ");
        int a = leer.nextInt();

        System.out.print("Dime segundo numero: ");
        int b = leer.nextInt();

        int producto = 1;

        for (int i = a; i < b; i++){
            
            producto*=i;
            
        }
        System.out.println(producto);
    }
}
