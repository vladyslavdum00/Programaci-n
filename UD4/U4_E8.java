import java.util.Scanner;

public class U4_E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos;
        int val;

        int [] nums = {1, 2, 3, 4, 5};

        System.out.println("Dime la posición (0-4): ");
        pos = sc.nextInt();
        System.out.println("Dime el valor nuevo: ");
        val = sc.nextInt();

        nums[pos] = val;

        imprimir(nums);

    }

    static void imprimir(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
