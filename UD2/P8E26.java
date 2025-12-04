import java.util.Scanner;

public class P8E26 {
    public static void main(String[] args) {
        boolean primo = true;
        Scanner leer = new Scanner(System.in);

        System.out.print("Dime el numero: ");
        int num = leer.nextInt();

        for (int i = 2; i <= num / 2; i++){
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo == true) {
             System.out.println("El numero " +num +" es primo");
        }else{
            System.out.println("El numero " +num +" no es primo");
        }
    }
}
