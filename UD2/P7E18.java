import java.util.Scanner;

public class P7E18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra = leer.nextLine();

        if (letra.equals(letra.toUpperCase())) {
            System.out.println("Es mayuscula");
        }else{
            System.out.println("Es minuscula");
        }


    }
}
