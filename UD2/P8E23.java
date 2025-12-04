import java.util.Scanner;

public class P8E23 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
            System.out.print("Dime el numero positivo: ");
            int num = leer.nextInt();
            int factorial = 1;

            for (int i = 1; i  <= num; i++){
                factorial *= i;
            }
                System.out.println("Factorial de" +" " +num +" " +"es" +" " +factorial);


    }

}
