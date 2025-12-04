import java.util.Scanner;

public class U4_E7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int b;
        int[] nums = new int[8];


        for (int i = 0; i < nums.length; i++){
            System.out.println("Dime el numero: ");
            num = sc.nextInt();

            nums[i] = num;
        }
    System.out.println("Dime el numero que quieres buscar: ");
    b = sc.nextInt();

    if (indiceDe(nums, b) == -1){
        System.out.println("No se ha encontrado numero :(");
    }else{
        System.out.println("Tu numero esta en la posición: " +indiceDe(nums, b));
    }
    }


    static int indiceDe(int[] a, int b){
        for (int i = 0; i < a.length; i++){
            if (a[i] == b){
                return i;
            }

        }
        return -1;
    }


}
