import java.util.Scanner;

public class U4_E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];
        int num;
        for (int i = 0; i < array.length; i++){
            System.out.print("Dime el numero: ");
            num = sc.nextInt();
            array[i] = num;
        }

        System.out.println(maximo(array));
        System.out.println(minimo(array));


    }

    static int maximo(int [] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++){
            if (max < a[i]){
                max = a[i];
            }
        }
    System.out.println("El maximo es: ");
    return max;
    }



    static int minimo(int[] a){
    int min = a[0];
    for (int i = 0; i < a.length; i++){
        if (a[i] < min){
            min = a[i];
        }
    }
    System.out.println("El minimo es: ");
    return min;
    }


}
