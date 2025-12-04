import java.util.Scanner;

public class P8E22 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Dime el numero A: ");
        int a = leer.nextInt();

        System.out.print("Dime el numero B: ");
        int b = leer.nextInt();

        int res = 1;

        for (int i = 1; i <= b; i++){
         if (b == 0) {
            System.out.print("El resultado de A elevado B es: 1" );
         }else{
             res *= a;
         }


        }
        System.out.print("El resultado de A elevado B es: " +res);
    }
}
