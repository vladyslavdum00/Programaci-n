import java.util.Scanner;

public class P8E33y34 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime  el numero (1-10): ");
        int num = leer.nextInt();
        int res = 1;
        int suma = 0;

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= 10; j++){
                res = i * j;
                suma += res;
                System.out.println(i +" " +"x" +" " +j +" " +"=" +" " +res);

            }
            System.out.println("La suma es: " +suma);
        System.out.println();
        }


    }
}
