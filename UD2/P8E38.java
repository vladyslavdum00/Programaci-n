import java.util.Scanner;

public class P8E38 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime el numero: ");
        int num = leer.nextInt();



        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
