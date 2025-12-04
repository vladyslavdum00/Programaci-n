import java.util.Random;
import java.util.Scanner;

public class U4_E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 0;


        System.out.println("Dime el max: ");
        max = sc.nextInt();
        System.out.println("Dime el min: ");
        min = sc.nextInt();
        int n = 0;
        int[] nums = generaAleatorios(n, max, min);
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        System.out.println("Pares " +contarParesImpares(nums, true));
        System.out.println("Impares " +contarParesImpares(nums, false));
        }




    static int[] generaAleatorios(int n, int max, int min){
        int [] array = new int[10];

        for (int i = 0; i < array.length; i++){
            n =  (int) (Math.random() * max) + min;
            array[i] += n;
        }
        return array;
    }

    static int contarParesImpares(int[] a, boolean pares){
        int contadorPar = 0;
        int contadorImpar = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0) {
                contadorPar++;
            }else contadorImpar++;
        }
        if (pares){
            return contadorPar;
        }else return contadorImpar;

    }
}





