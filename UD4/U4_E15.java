import java.util.Scanner;

public class U4_E15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int [] array = new int[10];


        for (int i = 0; i < array.length; i++){
            System.out.print("Dime el numero: ");
            num = sc.nextInt();

            array[i] = num;
        }
        int contador = 0;
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] < array[j + 1] || array[j] > array[j + 1]){
                System.out.print(array[j] + " ");

            }
            if (array[j] > array[j + 1]){
                System.out.print(",");
                contador++;
            }
        }
        System.out.println();
        System.out.println(contador);
    }
}
