import java.util.Scanner;

public class P8E15 {
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        boolean neg = false;
        
        boolean mas = false;
    
       for (int i = 1; i <= 5; i++) {
            System.out.print("Dime el numero: ");
            int num = leer.nextInt();
            if (num < 0) {
                neg = true;
            }
            if (num > 99) {
                mas = true;
            }
        }
    
        if (neg == true){
            System.out.println(" Hay numero negativo");
        } 
        if (mas == true){
            System.out.println("Hay numero mayor que 99");
        } 
   }

    }
