import java.util.Scanner;

public class U4_E14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el valor V: ");
        int V = sc.nextInt();

        System.out.print("Dime el valor I: ");
        int I = sc.nextInt();

        System.out.print("Dime el valor N: ");
        int N = sc.nextInt();

        for (int i = 0; i < secuenciaAritmetica(V, i, N).length; i++){
            System.out.println(secuenciaAritmetica(V, I, N)[i]);
        }


    }

    static int[] secuenciaAritmetica(int v, int i, int n){
        int [] nums = new int[n];
        nums[0] = v;
        for ( int j = 1; j < nums.length; j++){
            for ( int a = 1; a < n; a++){
                nums[a] = v + (a * i);
            }
        }
    return nums;
    }


}
