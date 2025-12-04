import java.util.Scanner;

public class P7E20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime tu nota (0-10): ");
        int nota = leer.nextInt();
        
        if (nota >= 0 && nota < 3) {
            System.out.println("Muy deficiente");
        }else if (nota >= 3 && nota < 5){
            System.out.println("Insuficiente");
        }else if (nota >= 5 && nota < 6){
            System.out.println("Bien");
        }else if (nota >= 6 && nota < 9){
            System.out.println("Notable");
        }else if (nota == 9 || nota == 10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("PRINGADO");
        }
}
}