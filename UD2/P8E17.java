import java.util.Scanner;

public class P8E17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el numero (1-10)");
        int num = leer.nextInt();

        for (int i = 1; i <= num; i++ ){
            System.out.println(num +" " +"*" +" " +i +" " +"="  +" " +(num * i));
        }
    }
}
