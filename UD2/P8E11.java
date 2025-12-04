import java.util.Scanner;

public class P8E11 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        
    int precio = 0;
    int suma = 0;
    do {
        System.out.print("Dime primer numero: ");
        precio = leer.nextInt();
        if (precio > 0) {
            suma += precio;
        }
    }
    while(precio >= 0);
    System.out.println(suma);
    
    
    
    }




}
