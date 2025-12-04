import java.util.Scanner;

public class P3E2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Dame primera cadena de texto: ");
        String cadena1 = leer.nextLine();


        System.out.println("Dame segunda cadena de texto: ");
        String cadena2 = leer.nextLine();

        boolean comp = cadena1.equalsIgnoreCase(cadena2);
        
        
        if (comp == true){
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Las cadenas son diferentes");
        }
    }
}
