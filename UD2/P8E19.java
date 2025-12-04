import java.util.Scanner;

public class P8E19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        boolean cero = false;
        do{
            System.out.print("Dime el numero: ");
            int num = leer.nextInt();
            if (num > 0) {
                pos++;
            }
            if(num < 0){
                neg++;
            }
            if (num == 0) {
                cero = true;
            }
        } while(cero != true);
        
        
        
            System.out.println("Positivos: " +pos);
            System.out.println("Negativos: " + neg);
    
    }
}
