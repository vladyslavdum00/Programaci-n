import java.util.Scanner;

public class P8E14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean multiplo = false;
    
       for (int i = 1; i <= 5; i++) {
            System.out.print("Dime el numero: ");
            int num = leer.nextInt();
            if (num % 10 == 0) {
                 multiplo = true;
            }
        }
    
        if (multiplo == true){
            System.out.println(" Algun numero era multiplo de 10");
        }else{
            System.out.println("No habia ningun multiplo de 10");
        }
    
    
    
    }

        









}
