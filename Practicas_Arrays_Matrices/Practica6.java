import java.util.Arrays;
import java.util.Scanner;

public class Practica6 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] numeros = {10, 20, 30, 40, 50};

       System.out.print("Array inicial: ");
       System.out.println(Arrays.toString(numeros));

       System.out.print("Introduce el número de desplazamientos (D): ");
       int d = sc.nextInt();
/*
       for(int i = 0; i < d; i++){
           desplazar(numeros);
       }
       System.out.println("Desplazamientos: " + Arrays.toString(numeros));
*/
       desplazar(numeros);
       System.out.println(Arrays.toString(numeros));
       desplazar(numeros);
       System.out.println(Arrays.toString(numeros));
    }

    static void desplazar (int[] numeros){
       int ultimo = numeros[numeros.length - 1];
       for(int i = numeros.length - 1; i > 0; i--){
           numeros[i] = numeros[i - 1];
       }
    numeros[0] = ultimo;
   }

}
