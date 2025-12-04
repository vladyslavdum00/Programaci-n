import java.util.Scanner;

public class P3_2E9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime el  primer numero: ");
        int num1 = leer.nextInt();

        System.out.println("Dime el segundo numero: ");
        int num2 = leer.nextInt();

        System.out.println("Dime el tercer numero: ");
        int  num3 = leer.nextInt();

        if (num3 > comparaNumeros(num1, num2)) {
            System.out.println("El numero más elevado es: " +num3);
        }else{
            System.out.println("El numero más elevado es: " +comparaNumeros(num1, num2));
        }

    }

    public static int comparaNumeros(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }


}
