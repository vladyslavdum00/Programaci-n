import java.util.Scanner;

public class P3E2 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);

        System.out.println("Dime tu edad: ");
        int a = leer.nextInt();

        System.out.println("Eres mayor de edad: " +esMayorEdad(a));
    }

    public static boolean esMayorEdad(int a){


        if (a >= 18){
            return true;
        }else{
            return false;
        }
    }



}
